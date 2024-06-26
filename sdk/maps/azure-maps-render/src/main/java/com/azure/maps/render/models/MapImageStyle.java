// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapImageStyle. */
public final class MapImageStyle extends ExpandableStringEnum<MapImageStyle> {
    /** Static value main for MapImageStyle. */
    public static final MapImageStyle MAIN = fromString("main");

    /** Static value dark for MapImageStyle. */
    public static final MapImageStyle DARK = fromString("dark");

    /**
     * Creates or finds a MapImageStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapImageStyle.
     */
    @JsonCreator
    public static MapImageStyle fromString(String name) {
        return fromString(name, MapImageStyle.class);
    }

    /**
     * Gets known MapImageStyle values.
     *
     * @return known MapImageStyle values.
     */
    public static Collection<MapImageStyle> values() {
        return values(MapImageStyle.class);
    }
}
