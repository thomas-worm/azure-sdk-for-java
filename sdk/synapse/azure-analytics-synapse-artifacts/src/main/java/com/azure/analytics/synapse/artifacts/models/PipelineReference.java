// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pipeline reference type.
 */
@Fluent
public final class PipelineReference {
    /*
     * Pipeline reference type.
     */
    @JsonProperty(value = "type", required = true)
    private PipelineReferenceType type;

    /*
     * Reference pipeline name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Reference name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of PipelineReference class.
     */
    public PipelineReference() {
    }

    /**
     * Get the type property: Pipeline reference type.
     * 
     * @return the type value.
     */
    public PipelineReferenceType getType() {
        return this.type;
    }

    /**
     * Set the type property: Pipeline reference type.
     * 
     * @param type the type value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference setType(PipelineReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference pipeline name.
     * 
     * @return the referenceName value.
     */
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference pipeline name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference setReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the name property: Reference name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Reference name.
     * 
     * @param name the name value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference setName(String name) {
        this.name = name;
        return this;
    }
}
