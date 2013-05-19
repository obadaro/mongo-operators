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
 * Field Update Operators.
 * 
 * @author Roberto Badaro
 */
public class FieldOperator {

    private FieldOperator() {
    }

    /**
     * $inc<br>
     * Increments the value of the field by the specified amount.
     */
    public static final String INC = "$inc";

    /**
     * $rename<br>
     * Renames a field.
     */
    public static final String RENAME = "$rename";

    /**
     * $setOnInsert<br>
     * Sets the value of a field upon documentation creation during an upsert. Has no effect
     * on update operations that modify existing documents.
     */
    public static final String SET_ON_INSERT = "$setOnInsert";

    /**
     * $set<br>
     * Sets the value of a field in an existing document.
     */
    public static final String SET = "$set";

    /**
     * $unset<br>
     * Removes the specified field from an existing document.
     */
    public static final String UNSET = "$unset";
}