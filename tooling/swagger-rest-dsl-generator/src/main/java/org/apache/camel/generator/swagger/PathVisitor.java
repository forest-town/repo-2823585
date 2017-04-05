/**
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
package org.apache.camel.generator.swagger;

import io.swagger.models.Path;

class PathVisitor<T> {

    private final DestinationGenerator destinationGenerator;

    private final CodeEmitter<T> emitter;

    PathVisitor(final CodeEmitter<T> emitter, final DestinationGenerator destinationGenerator) {
        this.emitter = emitter;
        this.destinationGenerator = destinationGenerator;

        emitter.emit("rest");
    }

    void visit(final String path, final Path definition) {
        final OperationVisitor<T> restDslOperation = new OperationVisitor<>(emitter, path, destinationGenerator);

        definition.getOperationMap().forEach(restDslOperation::visit);
    }

}