// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Who created the route. */
public final class EffectiveRouteSource extends ExpandableStringEnum<EffectiveRouteSource> {
    /** Static value Unknown for EffectiveRouteSource. */
    public static final EffectiveRouteSource UNKNOWN = fromString("Unknown");

    /** Static value User for EffectiveRouteSource. */
    public static final EffectiveRouteSource USER = fromString("User");

    /** Static value VirtualNetworkGateway for EffectiveRouteSource. */
    public static final EffectiveRouteSource VIRTUAL_NETWORK_GATEWAY = fromString("VirtualNetworkGateway");

    /** Static value Default for EffectiveRouteSource. */
    public static final EffectiveRouteSource DEFAULT = fromString("Default");

    /**
     * Creates or finds a EffectiveRouteSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EffectiveRouteSource.
     */
    @JsonCreator
    public static EffectiveRouteSource fromString(String name) {
        return fromString(name, EffectiveRouteSource.class);
    }

    /**
     * Gets known EffectiveRouteSource values.
     *
     * @return known EffectiveRouteSource values.
     */
    public static Collection<EffectiveRouteSource> values() {
        return values(EffectiveRouteSource.class);
    }
}
