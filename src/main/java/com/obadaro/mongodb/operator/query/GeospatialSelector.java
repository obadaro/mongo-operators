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
 * Geospatial Query Operators.
 * 
 * @author Roberto Badaro
 */
public class GeospatialSelector {

    private GeospatialSelector() {
    }

    /**
     * $geoIntersects<br>
     * Selects geometries that intersect with a GeoJSON geometry.
     */
    public static final String GEO_INTERSECTS = "$geoIntersects";

    /**
     * $geoWithin<br>
     * Selects geometries within a bounding GeoJSON geometry.
     */
    public static final String GEO_WITHIN = "$geoWithin";

    /**
     * $nearSphere<br>
     * Returns geospatial objects in proximity to a point on a sphere.
     */
    public static final String NEAR_SPHERE = "$nearSphere";

    /**
     * $near<br>
     * Returns geospatial objects in proximity to a point.
     */
    public static final String NEAR = "$near";
}