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
 * Logical Query Operators.
 * 
 * @author Roberto Badaro
 */
public class LogicalSelector {

    private LogicalSelector() {
    }

    /**
     * $and<br>
     * Joins query clauses with a logical AND returns all documents that match the
     * conditions of both clauses.
     */
    public static final String AND = "$and";

    /**
     * $nor<br>
     * Joins query clauses with a logical NOR returns all documents that fail to match both
     * clauses.
     */
    public static final String NOR = "$nor";

    /**
     * $not<br>
     * Inverts the effect of a query expression and returns documents that do not match the
     * query expression.
     */
    public static final String NOT = "$not";

    /**
     * $or<br>
     * Joins query clauses with a logical OR returns all documents that match the conditions
     * of either clause.
     */
    public static final String OR = "$or";

}