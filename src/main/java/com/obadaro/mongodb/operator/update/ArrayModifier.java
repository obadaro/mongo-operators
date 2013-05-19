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
package com.obadaro.mongodb.operator.update;

/**
 * Update Operators: Array modifiers.
 * 
 * @author Roberto Badaro
 * 
 */
public class ArrayModifier {

    private ArrayModifier() {
    }

    /**
     * $each<br>
     * Modifies the $push and $addToSet operators to append multiple items for array
     * updates.
     */
    public static final String EACH = "$each";

    /**
     * $slice<br>
     * Modifies the $push operator to limit the size of updated arrays.
     */
    public static final String SLICE = "$slice";

    /**
     * $sort<br>
     * Modifies the $push operator to reorder documents stored in an array.
     */
    public static final String SORT = "$sort";
}