// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the ContainerGroupProfile.
 */
@Fluent
public final class ContainerGroupProfileUpdate {
    /*
     * Specifies container group profile id of standby container groups.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Specifies revision of container group profile.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /**
     * Creates an instance of ContainerGroupProfileUpdate class.
     */
    public ContainerGroupProfileUpdate() {
    }

    /**
     * Get the id property: Specifies container group profile id of standby container groups.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies container group profile id of standby container groups.
     * 
     * @param id the id value to set.
     * @return the ContainerGroupProfileUpdate object itself.
     */
    public ContainerGroupProfileUpdate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the revision property: Specifies revision of container group profile.
     * 
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: Specifies revision of container group profile.
     * 
     * @param revision the revision value to set.
     * @return the ContainerGroupProfileUpdate object itself.
     */
    public ContainerGroupProfileUpdate withRevision(Long revision) {
        this.revision = revision;
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
