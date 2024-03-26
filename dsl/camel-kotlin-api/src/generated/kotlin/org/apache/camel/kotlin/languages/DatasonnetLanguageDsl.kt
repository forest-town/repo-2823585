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
package org.apache.camel.kotlin.languages

import java.lang.Class
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.model.language.DatasonnetExpression

/**
 * To use DataSonnet scripts for message transformations.
 */
public fun datasonnet(datasonnet: String, i: DatasonnetLanguageDsl.() -> Unit = {}):
    DatasonnetExpression {
  val def = DatasonnetExpression(datasonnet)
  DatasonnetLanguageDsl(def).apply(i)
  return def
}

@CamelDslMarker
public class DatasonnetLanguageDsl(
  def: DatasonnetExpression,
) {
  public val def: DatasonnetExpression

  init {
    this.def = def
  }

  /**
   * Sets the id of this node
   */
  public fun id(id: String) {
    def.id = id
  }

  /**
   * The String representation of the message's body MediaType
   */
  public fun bodyMediaType(bodyMediaType: String) {
    def.bodyMediaType = bodyMediaType
  }

  /**
   * The String representation of the MediaType to output
   */
  public fun outputMediaType(outputMediaType: String) {
    def.outputMediaType = outputMediaType
  }

  /**
   * Source to use, instead of message body. You can prefix with variable:, header:, or property: to
   * specify kind of source. Otherwise, the source is assumed to be a variable. Use empty or null to
   * use default source, which is the message body.
   */
  public fun source(source: String) {
    def.source = source
  }

  /**
   * Sets the class of the result type (type from output)
   */
  public fun resultType(resultType: Class<*>) {
    def.resultType = resultType
  }

  /**
   * Whether to trim the value to remove leading and trailing whitespaces and line breaks
   */
  public fun trim(trim: Boolean) {
    def.trim = trim.toString()
  }

  /**
   * Whether to trim the value to remove leading and trailing whitespaces and line breaks
   */
  public fun trim(trim: String) {
    def.trim = trim
  }
}
