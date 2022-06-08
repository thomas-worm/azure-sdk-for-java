// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureFrontDoorEnabled. */
public final class AzureFrontDoorEnabled extends ExpandableStringEnum<AzureFrontDoorEnabled> {
    /** Static value Enabled for AzureFrontDoorEnabled. */
    public static final AzureFrontDoorEnabled ENABLED = fromString("Enabled");

    /** Static value Disabled for AzureFrontDoorEnabled. */
    public static final AzureFrontDoorEnabled DISABLED = fromString("Disabled");

    /**
     * Creates or finds a AzureFrontDoorEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureFrontDoorEnabled.
     */
    @JsonCreator
    public static AzureFrontDoorEnabled fromString(String name) {
        return fromString(name, AzureFrontDoorEnabled.class);
    }

    /**
     * Gets known AzureFrontDoorEnabled values.
     *
     * @return known AzureFrontDoorEnabled values.
     */
    public static Collection<AzureFrontDoorEnabled> values() {
        return values(AzureFrontDoorEnabled.class);
    }
}
