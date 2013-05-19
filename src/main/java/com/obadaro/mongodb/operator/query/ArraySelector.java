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
 * Query Operator Array.
 * 
 * @author Roberto Badaro
 */
public class ArraySelector {

    private ArraySelector() {
    }

    /**
     * $elemMatch<br>
     * Selects documents if element in the array field matches all the specified $elemMatch
     * condition.
     */
    public static final String ELEM_MATCH = "$elemMatch";

    /**
     * $size<br>
     * Selects documents if the array field is a specified size.
     */
    public static final String SIZE = "$size";
}