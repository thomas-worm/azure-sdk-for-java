// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkAction. */
public final class NetworkAction extends ExpandableStringEnum<NetworkAction> {
    /** Static value Allow for NetworkAction. */
    public static final NetworkAction ALLOW = fromString("Allow");

    /** Static value Deny for NetworkAction. */
    public static final NetworkAction DENY = fromString("Deny");

    /**
     * Creates or finds a NetworkAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkAction.
     */
    @JsonCreator
    public static NetworkAction fromString(String name) {
        return fromString(name, NetworkAction.class);
    }

    /** @return known NetworkAction values. */
    public static Collection<NetworkAction> values() {
        return values(NetworkAction.class);
    }
}
