package org.apache.camel.maven.packaging.dsl.component;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.camel.maven.packaging.dsl.DslHelper;
import org.apache.camel.tooling.model.ComponentModel;
import org.apache.camel.tooling.util.FileUtil;
import org.apache.camel.tooling.util.Strings;

import static org.apache.camel.tooling.util.PackageHelper.loadText;

/**
 * Metadata components registry, used to keep track of the components generated DSLs in order to sync the pom file and relevant main builder factory file
 */
public class ComponentsDslMetadataRegistry {

    private Map<String, ComponentModel> componentsCache;
    private Set<String> componentsDslFactories;
    private File metadataFile;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ComponentsDslMetadataRegistry(final File componentDslDir, final File metadataFile) {
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

    public void addComponentToMetadataAndSyncMetadataFile(final ComponentModel componentModel, final String key) {
        // put the component into the cache
        componentsCache.put(key, new ModifiedComponentModel(componentModel));

        syncMetadataFile();
    }

    private void syncMetadataFile() {
        syncMetadataFileWithGeneratedDslComponents();
        writeCacheIntoMetadataFile();
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

    private static class ModifiedComponentModel extends ComponentModel {
        public ModifiedComponentModel(final ComponentModel componentModel) {
            name = componentModel.getName();
            title = componentModel.getTitle();
            description = componentModel.getDescription();
            firstVersion = componentModel.getFirstVersion();
            javaType = componentModel.getJavaType();
            label = componentModel.getLabel();
            deprecated = componentModel.isDeprecated();
            deprecationNote = componentModel.getDeprecationNote();
            scheme = componentModel.getScheme();
            extendsScheme = componentModel.getExtendsScheme();
            alternativeSchemes = componentModel.getAlternativeSchemes();
            syntax = componentModel.getSyntax();
            alternativeSyntax = componentModel.getAlternativeSyntax();
            async = componentModel.isAsync();
            consumerOnly = componentModel.isConsumerOnly();
            producerOnly = componentModel.isProducerOnly();
            lenientProperties = componentModel.isLenientProperties();
            verifiers = componentModel.getVerifiers();
            groupId = componentModel.getGroupId();
            artifactId = componentModel.getArtifactId();
            version = componentModel.getVersion();
        }
    }

}
