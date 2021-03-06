/* 
 * Mongo Operators
 * https://github.com/obadaro/mongo-operators
 *
 * Copyright 2013 Roberto Badaro 
 * and individual contributors by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.obadaro.mongodb.operator.query;

/**
 * Element Query Operators.
 * 
 * @author Roberto Badaro
 */
public class ElementSelector {

    private ElementSelector() {
    }

    /**
     * $exists<br>
     * Matches documents that have the specified field.
     */
    public static final String EXISTS = "$exists";

    /**
     * $mod<br>
     * Performs a modulo operation on the value of a field and selects documents with a
     * specified result.
     */
    public static final String MOD = "$mod";

    /**
     * $type<br>
     * Selects documents if a field is of the specified type.
     */
    public static final String TYPE = "$type";

}