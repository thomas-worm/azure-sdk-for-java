// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TrafficRegions model. */
@Fluent
public class TrafficRegions {
    /*
     * The regions property.
     */
    @JsonProperty(value = "regions")
    private List<String> regions;

    /** Creates an instance of TrafficRegions class. */
    public TrafficRegions() {
    }

    /**
     * Get the regions property: The regions property.
     *
     * @return the regions value.
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The regions property.
     *
     * @param regions the regions value to set.
     * @return the TrafficRegions object itself.
     */
    public TrafficRegions withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
