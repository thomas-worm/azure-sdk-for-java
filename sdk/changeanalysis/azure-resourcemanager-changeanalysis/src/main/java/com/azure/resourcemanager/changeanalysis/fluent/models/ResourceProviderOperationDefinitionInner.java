// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.changeanalysis.models.ResourceProviderOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource provider operation definition. */
@Fluent
public final class ResourceProviderOperationDefinitionInner {
    /*
     * The resource provider operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource provider operation details.
     */
    @JsonProperty(value = "display")
    private ResourceProviderOperationDisplay display;

    /** Creates an instance of ResourceProviderOperationDefinitionInner class. */
    public ResourceProviderOperationDefinitionInner() {
    }

    /**
     * Get the name property: The resource provider operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource provider operation name.
     *
     * @param name the name value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The resource provider operation details.
     *
     * @return the display value.
     */
    public ResourceProviderOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The resource provider operation details.
     *
     * @param display the display value to set.
     * @return the ResourceProviderOperationDefinitionInner object itself.
     */
    public ResourceProviderOperationDefinitionInner withDisplay(ResourceProviderOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
