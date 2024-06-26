// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AgentPoolPropertiesUpdateParameters model.
 */
@Fluent
public final class AgentPoolPropertiesUpdateParameters {
    /*
     * The count of agent machine
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Creates an instance of AgentPoolPropertiesUpdateParameters class.
     */
    public AgentPoolPropertiesUpdateParameters() {
    }

    /**
     * Get the count property: The count of agent machine.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: The count of agent machine.
     * 
     * @param count the count value to set.
     * @return the AgentPoolPropertiesUpdateParameters object itself.
     */
    public AgentPoolPropertiesUpdateParameters withCount(Integer count) {
        this.count = count;
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
