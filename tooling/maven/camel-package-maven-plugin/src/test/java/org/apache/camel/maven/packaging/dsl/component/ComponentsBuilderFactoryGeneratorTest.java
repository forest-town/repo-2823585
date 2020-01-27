package org.apache.camel.maven.packaging.dsl.component;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

import org.apache.camel.tooling.model.ComponentModel;
import org.apache.camel.tooling.model.JsonMapper;
import org.apache.camel.tooling.util.PackageHelper;
import org.junit.jupiter.api.Test;

class ComponentsBuilderFactoryGeneratorTest {

    @Test
    public void testJavaClass() throws IOException {
        final String json = PackageHelper.loadText(new File(Objects.requireNonNull(getClass().getClassLoader().getResource("json/test_component.json")).getFile()));
        final ComponentModel componentModel = JsonMapper.generateComponentModel(json);

        final ComponentsBuilderFactoryGenerator componentsBuilderFactoryGenerator = ComponentsBuilderFactoryGenerator.generateClass(new HashSet<>(Collections.singletonList(componentModel)),
                getClass().getClassLoader(),
                "org.apache.camel.builder.component");
        System.out.println(componentsBuilderFactoryGenerator.printClassAsString());
    }
}