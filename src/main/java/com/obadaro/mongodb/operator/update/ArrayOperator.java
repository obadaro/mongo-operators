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
 * Array Update Operators.
 * 
 * @author Roberto Badaro
 */
public class ArrayOperator {

    private ArrayOperator() {
    }

    /**
     * $<br>
     * Acts as a placeholder to update the first element that matches the query
     * condition in an update.
     */
    public static final String FIRST = "$";

    /**
     * $addToSet<br>
     * Adds elements to an existing array only if they do not already exist in the set.
     */
    public static final String ADD_TO_SET = "$addToSet";

    /**
     * $pop<br>
     * Removes the first or last item of an array.
     */
    public static final String POP = "$pop";

    /**
     * $pullAll<br>
     * Removes multiple values from an array.
     */
    public static final String PULL_ALL = "$pullAll";

    /**
     * $pull<br>
     * Removes items from an array that match a query statement.
     */
    public static final String PULL = "$pull";

    /**
     * $pushAll<br>
     * Deprecated. Adds several items to an array.
     * 
     * @deprecated
     */
    @Deprecated
    public static final String PUSH_ALL = "$pushAll";

    /**
     * $push<br>
     * Adds an item to an array.
     */
    public static final String PUSH = "$push";
}