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
package org.apache.camel.processor.idempotent.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Caching version of {@link JdbcMessageIdRepository}
 */
public class JdbcCachedMessageIdRepository extends JdbcMessageIdRepository {
    private final Map<String, Integer> cache = new HashMap<>();
    private int hitCount;
    private int missCount;
    private String queryAllString
            = "SELECT messageId, CAST(COUNT(*) AS INTEGER) AS messageCount FROM CAMEL_MESSAGEPROCESSED WHERE processorName = ? GROUP BY messageId";

    public JdbcCachedMessageIdRepository() {
    }

    public JdbcCachedMessageIdRepository(DataSource dataSource, String processorName) {
        super(dataSource, processorName);
    }

    public JdbcCachedMessageIdRepository(DataSource dataSource, TransactionTemplate transactionTemplate, String processorName) {
        super(dataSource, transactionTemplate, processorName);
    }

    public JdbcCachedMessageIdRepository(JdbcTemplate jdbcTemplate, TransactionTemplate transactionTemplate) {
        super(jdbcTemplate, transactionTemplate);
    }

    @Override
    protected void doInit() throws Exception {
        super.doInit();
        if (getTableName() != null) {
            queryAllString = queryAllString.replaceFirst(DEFAULT_TABLENAME, getTableName());
        }
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        reload();
    }

    @Override
    public boolean add(final String key) {
        Integer previousValue = cache.getOrDefault(key, 0);
        cache.put(key, previousValue + 1);
        if (previousValue != 0) {
            hitCount++;
            return false;
        }
        missCount++;
        return super.add(key);
    }

    @Override
    public boolean contains(final String key) {
        Integer previousValue = cache.getOrDefault(key, 0);
        if (previousValue != 0) {
            hitCount++;
            return true;
        }
        missCount++;
        return super.contains(key);
    }

    @Override
    public boolean remove(String key) {
        cache.remove(key);
        return super.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
        hitCount = 0;
        missCount = 0;
        super.clear();
    }

    public String getQueryAllString() {
        return queryAllString;
    }

    public void setQueryAllString(String queryAllString) {
        this.queryAllString = queryAllString;
    }

    public int getHitCount() {
        return hitCount;
    }

    public int getMissCount() {
        return missCount;
    }

    public void reload() {
        transactionTemplate.execute(new TransactionCallback<Boolean>() {
            @Override
            public Boolean doInTransaction(TransactionStatus status) {
                try {
                    List<Map<String, Object>> result = jdbcTemplate.queryForList(getQueryAllString(), getProcessorName());
                    for (Map<String, Object> messageMap : result) {
                        Integer messageCount = (Integer) messageMap.get("messageCount");
                        cache.put((String) messageMap.get("messageId"), messageCount);
                    }
                    log.info("JdbcCachedMessageIdRepository cache loaded with {} entries", result.size());
                } catch (DataAccessException dae) {
                    log.error(
                            "Unable to populate JdbcCachedMessageIdRepository cache because of: {}.",
                            dae.getMessage());
                    throw dae;
                }
                return Boolean.TRUE;
            }
        });
    }

}
