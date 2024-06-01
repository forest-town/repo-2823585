/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl.engine;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.StreamCache;
import org.apache.camel.spi.StreamCachingStrategy;
import org.apache.camel.support.jsse.SecureRandomParameters;
import org.apache.camel.support.service.ServiceSupport;
import org.apache.camel.util.FilePathResolver;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of {@link StreamCachingStrategy}
 */
public class DefaultStreamCachingStrategy extends ServiceSupport implements CamelContextAware, StreamCachingStrategy {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultStreamCachingStrategy.class);

    private CamelContext camelContext;
    private boolean enabled;
    private String allowClassNames;
    private String denyClassNames;
    private Collection<Class<?>> allowClasses;
    private Collection<Class<?>> denyClasses;
    private boolean spoolEnabled;
    private File spoolDirectory;
    private transient String spoolDirectoryName = "${java.io.tmpdir}/camel/camel-tmp-#uuid#";
    private long spoolThreshold = StreamCache.DEFAULT_SPOOL_THRESHOLD;
    private int spoolUsedHeapMemoryThreshold;
    private SpoolUsedHeapMemoryLimit spoolUsedHeapMemoryLimit;
    private String spoolCipher;
    private SecureRandomParameters secureRandomParameters;
    private int bufferSize = IOHelper.DEFAULT_BUFFER_SIZE;
    private boolean removeSpoolDirectoryWhenStopping = true;
    private final UtilizationStatistics statistics = new UtilizationStatistics();
    private final Set<SpoolRule> spoolRules = new LinkedHashSet<>();
    private boolean anySpoolRules;

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public Collection<Class<?>> getAllowClasses() {
        return allowClasses;
    }

    public void setAllowClasses(Class<?>... allowClasses) {
        this.allowClasses = List.of(allowClasses);
    }

    @Override
    public void setAllowClasses(String names) {
        this.allowClassNames = names;
    }

    @Override
    public Collection<Class<?>> getDenyClasses() {
        return denyClasses;
    }

    public void setDenyClasses(Class<?>... denyClasses) {
        this.denyClasses = List.of(denyClasses);
    }

    @Override
    public void setDenyClasses(String names) {
        this.denyClassNames = names;
    }

    @Override
    public boolean isSpoolEnabled() {
        return spoolEnabled;
    }

    @Override
    public void setSpoolEnabled(boolean spoolEnabled) {
        this.spoolEnabled = spoolEnabled;
    }

    @Override
    public void setSpoolDirectory(String path) {
        this.spoolDirectoryName = path;
    }

    @Override
    public void setSpoolDirectory(File path) {
        this.spoolDirectory = path;
    }

    @Override
    public File getSpoolDirectory() {
        return spoolDirectory;
    }

    @Override
    public long getSpoolThreshold() {
        return spoolThreshold;
    }

    @Override
    public int getSpoolUsedHeapMemoryThreshold() {
        return spoolUsedHeapMemoryThreshold;
    }

    @Override
    public void setSpoolUsedHeapMemoryThreshold(int spoolHeapMemoryWatermarkThreshold) {
        this.spoolUsedHeapMemoryThreshold = spoolHeapMemoryWatermarkThreshold;
    }

    @Override
    public SpoolUsedHeapMemoryLimit getSpoolUsedHeapMemoryLimit() {
        return spoolUsedHeapMemoryLimit;
    }

    @Override
    public void setSpoolUsedHeapMemoryLimit(SpoolUsedHeapMemoryLimit spoolUsedHeapMemoryLimit) {
        this.spoolUsedHeapMemoryLimit = spoolUsedHeapMemoryLimit;
    }

    @Override
    public void setSpoolThreshold(long spoolThreshold) {
        this.spoolThreshold = spoolThreshold;
    }

    @Override
    public String getSpoolCipher() {
        return spoolCipher;
    }

    @Override
    public void setSpoolCipher(String spoolCipher) {
        this.spoolCipher = spoolCipher;
    }

    @Override
    public SecureRandomParameters getSecureRandomParameters() {
        return secureRandomParameters;
    }

    @Override
    public void setSecureRandomParameters(SecureRandomParameters secureRandomParameters) {
        this.secureRandomParameters = secureRandomParameters;
    }

    @Override
    public int getBufferSize() {
        return bufferSize;
    }

    @Override
    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public boolean isRemoveSpoolDirectoryWhenStopping() {
        return removeSpoolDirectoryWhenStopping;
    }

    @Override
    public void setRemoveSpoolDirectoryWhenStopping(boolean removeSpoolDirectoryWhenStopping) {
        this.removeSpoolDirectoryWhenStopping = removeSpoolDirectoryWhenStopping;
    }

    @Override
    public boolean isAnySpoolRules() {
        return anySpoolRules;
    }

    @Override
    public void setAnySpoolRules(boolean anySpoolTasks) {
        this.anySpoolRules = anySpoolTasks;
    }

    @Override
    public Statistics getStatistics() {
        return statistics;
    }

    @Override
    public boolean shouldSpoolCache(long length) {
        if (!enabled || spoolRules.isEmpty()) {
            return false;
        }

        boolean all = true;
        boolean any = false;
        for (SpoolRule rule : spoolRules) {
            boolean result = rule.shouldSpoolCache(length);
            if (!result) {
                all = false;
                if (!anySpoolRules) {
                    // no need to check anymore
                    break;
                }
            } else {
                any = true;
                if (anySpoolRules) {
                    // no need to check anymore
                    break;
                }
            }
        }

        boolean answer = anySpoolRules ? any : all;
        LOG.debug("Should spool cache {} -> {}", length, answer);
        return answer;
    }

    @Override
    public void addSpoolRule(SpoolRule rule) {
        spoolRules.add(rule);
    }

    @Override
    public StreamCache cache(Exchange exchange) {
        return doCache(exchange.getMessage().getBody(), exchange);
    }

    @Override
    public StreamCache cache(Message message) {
        return doCache(message.getBody(), message.getExchange());
    }

    @Override
    public StreamCache cache(Object body) {
        return doCache(body, null);
    }

    private StreamCache doCache(Object body, Exchange exchange) {
        StreamCache cache = null;
        // try convert to stream cache
        if (body != null) {
            boolean allowed = allowClasses == null && denyClasses == null;
            if (!allowed) {
                allowed = checkAllowDenyList(body);
            }
            if (allowed) {
                if (exchange != null) {
                    cache = camelContext.getTypeConverter().convertTo(StreamCache.class, exchange, body);
                } else {
                    cache = camelContext.getTypeConverter().convertTo(StreamCache.class, body);
                }
            }
        }
        if (cache != null) {
            if (LOG.isTraceEnabled()) {
                LOG.trace("Cached stream to {} -> {}", cache.inMemory() ? "memory" : "spool", cache);
            }
            if (statistics.isStatisticsEnabled()) {
                computeStatistics(cache);
            }
        }
        return cache;
    }

    private boolean checkAllowDenyList(Object body) {
        boolean allowed;
        Class<?> source = body.getClass();
        if (denyClasses != null && allowClasses != null) {
            // deny takes precedence
            allowed = !isAssignableFrom(source, denyClasses);
            if (allowed) {
                allowed = isAssignableFrom(source, allowClasses);
            }
        } else if (denyClasses != null) {
            allowed = !isAssignableFrom(source, denyClasses);
        } else {
            allowed = isAssignableFrom(source, allowClasses);
        }
        if (LOG.isTraceEnabled()) {
            LOG.trace("Cache stream from class: {} is {}", source, allowed ? "allowed" : "denied");
        }
        return allowed;
    }

    private void computeStatistics(StreamCache cache) {
        try {
            if (cache.inMemory()) {
                statistics.updateMemory(cache.length());
            } else {
                statistics.updateSpool(cache.length());
            }
        } catch (Exception e) {
            LOG.debug("Error updating cache statistics. This exception is ignored.", e);
        }
    }

    protected static boolean isAssignableFrom(Class<?> source, Collection<Class<?>> targets) {
        for (Class<?> target : targets) {
            if (target.isAssignableFrom(source)) {
                return true;
            }
        }
        return false;
    }

    protected String resolveSpoolDirectory(String path) {
        if (camelContext.getManagementNameStrategy() != null) {
            String name = camelContext.getManagementNameStrategy().resolveManagementName(path, camelContext.getName(), false);
            if (name != null) {
                name = customResolveManagementName(name);
            }
            // and then check again with invalid check to ensure all ## is resolved
            if (name != null) {
                name = camelContext.getManagementNameStrategy().resolveManagementName(name, camelContext.getName(), true);
            }
            return name;
        } else {
            return defaultManagementName(path);
        }
    }

    protected String defaultManagementName(String path) {
        // must quote the names to have it work as literal replacement
        String name = camelContext.getName();

        // replace tokens
        String answer = path;
        answer = answer.replace("#camelId#", name);
        answer = answer.replace("#name#", name);
        // replace custom
        answer = customResolveManagementName(answer);
        return answer;
    }

    protected String customResolveManagementName(String pattern) {
        if (pattern.contains("#uuid#")) {
            String uuid = camelContext.getUuidGenerator().generateUuid();
            pattern = pattern.replace("#uuid#", uuid);
        }
        return FilePathResolver.resolvePath(pattern);
    }

    @Override
    protected void doStart() throws Exception {
        if (!enabled) {
            LOG.debug("StreamCaching is not enabled");
            return;
        }

        if (allowClassNames != null) {
            if (allowClasses == null) {
                allowClasses = new ArrayList<>();
            }
            for (String name : allowClassNames.split(",")) {
                name = name.trim();
                Class<?> clazz = camelContext.getClassResolver().resolveMandatoryClass(name);
                allowClasses.add(clazz);
            }
        }
        if (denyClassNames != null) {
            if (denyClasses == null) {
                denyClasses = new ArrayList<>();
            }
            for (String name : denyClassNames.split(",")) {
                name = name.trim();
                Class<?> clazz = camelContext.getClassResolver().resolveMandatoryClass(name);
                denyClasses.add(clazz);
            }
        }

        if (spoolUsedHeapMemoryThreshold > 99) {
            throw new IllegalArgumentException(
                    "SpoolHeapMemoryWatermarkThreshold must not be higher than 99, was: " + spoolUsedHeapMemoryThreshold);
        }

        // if we can overflow to disk then make sure directory exists / is created
        if (spoolEnabled && (spoolThreshold > 0 || spoolUsedHeapMemoryThreshold > 0)) {
            if (spoolDirectory == null && spoolDirectoryName == null) {
                throw new IllegalArgumentException("SpoolDirectory must be configured when using SpoolThreshold > 0");
            }
            if (spoolDirectory == null) {
                String name = resolveSpoolDirectory(spoolDirectoryName);
                if (name != null) {
                    spoolDirectory = new File(name);
                    spoolDirectoryName = null;
                } else {
                    throw new IllegalStateException("Cannot resolve spool directory from pattern: " + spoolDirectoryName);
                }
            }
            if (spoolDirectory.exists()) {
                if (spoolDirectory.isDirectory()) {
                    LOG.debug("Using spool directory: {}", spoolDirectory);
                } else {
                    LOG.warn(
                            "Spool directory: {} is not a directory. This may cause problems spooling to disk for the stream caching!",
                            spoolDirectory);
                }
            } else {
                boolean created = spoolDirectory.mkdirs();
                if (!created) {
                    LOG.warn(
                            "Cannot create spool directory: {}. This may cause problems spooling to disk for the stream caching!",
                            spoolDirectory);
                } else {
                    LOG.debug("Created spool directory: {}", spoolDirectory);
                }
            }
            if (spoolThreshold > 0) {
                spoolRules.add(new FixedThresholdSpoolRule());
            }
            if (spoolUsedHeapMemoryThreshold > 0) {
                if (spoolUsedHeapMemoryLimit == null) {
                    // use max by default
                    spoolUsedHeapMemoryLimit = SpoolUsedHeapMemoryLimit.Max;
                }
                spoolRules.add(new UsedHeapMemorySpoolRule(spoolUsedHeapMemoryLimit));
            }
        }

        LOG.debug("StreamCaching configuration {}", this);

        if (spoolDirectory != null) {
            LOG.info("StreamCaching in use with spool directory: {} and rules: {}", spoolDirectory.getPath(), spoolRules);
        } else if (!spoolRules.isEmpty()) {
            LOG.info("StreamCaching in use with rules: {}", spoolRules);
        } else {
            // reduce logging noise when its in-memory stream caching
            LOG.debug("StreamCaching in use");
        }
    }

    @Override
    protected void doStop() throws Exception {
        if (spoolEnabled && isSpoolRemovable()) {
            LOG.debug("Removing spool directory: {}", spoolDirectory);
            FileUtil.removeDir(spoolDirectory);
        }

        if (LOG.isDebugEnabled() && statistics.isStatisticsEnabled()) {
            LOG.debug("Stopping StreamCachingStrategy with statistics: {}", statistics);
        }

        statistics.reset();
    }

    private boolean isSpoolRemovable() {
        return spoolThreshold > 0 & spoolDirectory != null && isRemoveSpoolDirectoryWhenStopping();
    }

    @Override
    public String toString() {
        return "DefaultStreamCachingStrategy["
               + "spoolDirectoryEnabled=" + spoolEnabled
               + ", spoolDirectory=" + spoolDirectory
               + ", spoolCipher=" + spoolCipher
               + ", spoolThreshold=" + spoolThreshold
               + ", spoolUsedHeapMemoryThreshold=" + spoolUsedHeapMemoryThreshold
               + ", bufferSize=" + bufferSize
               + ", anySpoolRules=" + anySpoolRules + "]";
    }

    private final class FixedThresholdSpoolRule implements SpoolRule {

        @Override
        public boolean shouldSpoolCache(long length) {
            if (spoolThreshold > 0 && length > spoolThreshold) {
                LOG.trace("Should spool cache fixed threshold {} > {} -> true", length, spoolThreshold);
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            if (spoolThreshold < 1024) {
                return "Spool > " + spoolThreshold + " bytes body size";
            } else {
                return "Spool > " + (spoolThreshold >> 10) + "K body size";
            }
        }
    }

    private final class UsedHeapMemorySpoolRule implements SpoolRule {

        private final MemoryMXBean heapUsage;
        private final SpoolUsedHeapMemoryLimit limit;

        private UsedHeapMemorySpoolRule(SpoolUsedHeapMemoryLimit limit) {
            this.limit = limit;
            this.heapUsage = ManagementFactory.getMemoryMXBean();
        }

        @Override
        public boolean shouldSpoolCache(long length) {
            if (spoolUsedHeapMemoryThreshold > 0) {
                // must use double to calculate with decimals for the percentage
                double used = heapUsage.getHeapMemoryUsage().getUsed();
                double upper = limit == SpoolUsedHeapMemoryLimit.Committed
                        ? heapUsage.getHeapMemoryUsage().getCommitted() : heapUsage.getHeapMemoryUsage().getMax();
                double calc = (used / upper) * 100;
                int percentage = (int) calc;

                if (LOG.isTraceEnabled()) {
                    long u = heapUsage.getHeapMemoryUsage().getUsed();
                    long c = heapUsage.getHeapMemoryUsage().getCommitted();
                    long m = heapUsage.getHeapMemoryUsage().getMax();
                    LOG.trace("Heap memory: [used={}M ({}%), committed={}M, max={}M]", u >> 20, percentage, c >> 20, m >> 20);
                }

                if (percentage > spoolUsedHeapMemoryThreshold) {
                    LOG.trace("Should spool cache heap memory threshold {} > {} -> true", percentage,
                            spoolUsedHeapMemoryThreshold);
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return "Spool > " + spoolUsedHeapMemoryThreshold + "% used of " + limit + " heap memory";
        }
    }

    /**
     * Represents utilization statistics.
     */
    private static final class UtilizationStatistics implements Statistics {

        private boolean statisticsEnabled;
        private volatile long memoryCounter;
        private volatile long memorySize;
        private volatile long memoryAverageSize;
        private volatile long spoolCounter;
        private volatile long spoolSize;
        private volatile long spoolAverageSize;

        synchronized void updateMemory(long size) {
            memoryCounter++;
            memorySize += size;
            memoryAverageSize = memorySize / memoryCounter;
        }

        synchronized void updateSpool(long size) {
            spoolCounter++;
            spoolSize += size;
            spoolAverageSize = spoolSize / spoolCounter;
        }

        @Override
        public long getCacheMemoryCounter() {
            return memoryCounter;
        }

        @Override
        public long getCacheMemorySize() {
            return memorySize;
        }

        @Override
        public long getCacheMemoryAverageSize() {
            return memoryAverageSize;
        }

        @Override
        public long getCacheSpoolCounter() {
            return spoolCounter;
        }

        @Override
        public long getCacheSpoolSize() {
            return spoolSize;
        }

        @Override
        public long getCacheSpoolAverageSize() {
            return spoolAverageSize;
        }

        @Override
        public synchronized void reset() {
            memoryCounter = 0;
            memorySize = 0;
            memoryAverageSize = 0;
            spoolCounter = 0;
            spoolSize = 0;
            spoolAverageSize = 0;
        }

        @Override
        public boolean isStatisticsEnabled() {
            return statisticsEnabled;
        }

        @Override
        public void setStatisticsEnabled(boolean statisticsEnabled) {
            this.statisticsEnabled = statisticsEnabled;
        }

        @Override
        public String toString() {
            return String.format(
                    "[memoryCounter=%s, memorySize=%s, memoryAverageSize=%s, spoolCounter=%s, spoolSize=%s, spoolAverageSize=%s]",
                    memoryCounter, memorySize, memoryAverageSize, spoolCounter, spoolSize, spoolAverageSize);
        }
    }

}
