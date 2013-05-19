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
 * Comparison Query Operators.
 * 
 * @author Roberto Badaro
 */
public class ComparisonSelector {

    private ComparisonSelector() {
    }

    /**
     * $all<br>
     * Matches arrays that contain all elements specified in the query.
     */
    public static final String ALL = "$all";

    /**
     * $gt<br>
     * Matches values that are greater than the value specified in the query.
     */
    public static final String GT = "$gt";

    /**
     * $gte<br>
     * Matches values that are equal to or greater than the value specified in the query.
     */
    public static final String GTE = "$gte";

    /**
     * $in<br>
     * Matches any of the values that exist in an array specified in the query.
     */
    public static final String IN = "$in";

    /**
     * $lt<br>
     * Matches vales that are less than the value specified in the query.
     */
    public static final String LT = "$lt";

    /**
     * $lte<br>
     * Matches values that are less than or equal to the value specified in the query.
     */
    public static final String LTE = "$lte";

    /**
     * $ne<br>
     * Matches all values that are not equal to the value specified in the query.
     */
    public static final String NE = "$ne";

    /**
     * $nin<br>
     * Matches values that do not exist in an array specified to the query.
     */
    public static final String NIN = "$nin";

}