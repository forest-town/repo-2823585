package org.apache.camel.maven.packaging.dsl.component;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.camel.maven.packaging.dsl.DslHelper;
import org.apache.camel.maven.packaging.model.ComponentModel;
import org.apache.camel.tooling.util.FileUtil;
import org.apache.camel.tooling.util.Strings;

import static org.apache.camel.tooling.util.PackageHelper.loadText;

public class ComponentDslMetadataGenerator {

    private Map<String, ComponentModel> componentsCache;
    private Set<String> componentsDslFactories;
    private File metadataFile;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ComponentDslMetadataGenerator(final File componentDslDir, final File metadataFile) {
        // First: Load the content of the metadata file into memory
        componentsCache = loadMetadataFileIntoMap(metadataFile);
        componentsDslFactories = loadComponentsFactoriesFromDir(componentDslDir);
        this.metadataFile = metadataFile;
    }

    private Map<String, ComponentModel> loadMetadataFileIntoMap(final File metadataFile) {
        return gson.fromJson(loadJson(metadataFile), new TypeToken<Map<String, ComponentModel>>() {}.getType());
    }

    private Set<String> loadComponentsFactoriesFromDir(final File componentDir) {
        return DslHelper.loadAllJavaFiles(componentDir).stream()
                .map(file -> Strings.before(file.getName(), "."))
                .collect(Collectors.toSet());
    }

    public void syncMetadataFile() {
        syncMetadataFileWithGeneratedDslComponents();
        writeCacheIntoMetadataFile();
    }

    public void addComponentToMetadataAndSyncMetadataFile(final ComponentModel componentModel, final String key) {
        // first we remove unwanted endpoints options and component options
        componentModel.setComponentOptions(Collections.emptyList());
        componentModel.setEndpointOptions(Collections.emptyList());
        componentModel.setEndpointPathOptions(Collections.emptyList());

        // put the component into the cache
        componentsCache.put(key, componentModel);

        syncMetadataFile();
    }

    private void syncMetadataFileWithGeneratedDslComponents() {
        // First: We check if there is a component in the memory but not in the dir, then we shall delete it from the memory
        final Set<String> componentsNamesToRemoveFromCache = new HashSet<>();
        componentsCache.forEach((componentFactoryName, value) -> {
            if (!componentsDslFactories.contains(componentFactoryName)) {
                // remove the component from the metadata
                componentsNamesToRemoveFromCache.add(componentFactoryName);
            }
        });

        componentsNamesToRemoveFromCache.forEach(componentFactoryName -> componentsCache.remove(componentFactoryName));
    }

    private Map<String, Object> convertComponentModelToMap(final ComponentModel componentModel) {
        final Map<java.lang.String, java.lang.Object> componentMap = new HashMap<>();

        componentMap.put("schema", componentModel.getScheme());
        componentMap.put("title", componentModel.getTitle());
        componentMap.put("description", componentModel.getDescription());
        componentMap.put("label", componentModel.getLabel());
        componentMap.put("deprecated", componentModel.getDeprecated());
        componentMap.put("deprecationNote", componentModel.getDeprecationNote());
        componentMap.put("consumerOnly", componentModel.getConsumerOnly());
        componentMap.put("producerOnly", componentModel.getConsumerOnly());
        componentMap.put("javaType", componentModel.getJavaType());
        componentMap.put("firstVersion", componentModel.getFirstVersion());
        componentMap.put("groupId", componentModel.getGroupId());
        componentMap.put("artifactId", componentModel.getArtifactId());
        componentMap.put("version", componentModel.getVersion());

        return componentMap;
    }

    private void writeCacheIntoMetadataFile() {
        final String jsonText = gson.toJson(componentsCache);
        try {
            FileUtil.updateFile(metadataFile.toPath(), jsonText);
        } catch (IOException ex) {
            throw new IOError(ex);
        }
    }

    public Map<String, ComponentModel> getComponentCacheFromMemory() {
        return componentsCache;
    }

    private static String loadJson(File file) {
        try {
            return loadText(file);
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

}
