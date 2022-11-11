// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceConnectionManagedIdentity model. */
@Fluent
public class WorkspaceConnectionManagedIdentity {
    /*
     * The resourceId property.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The clientId property.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /** Creates an instance of WorkspaceConnectionManagedIdentity class. */
    public WorkspaceConnectionManagedIdentity() {
    }

    /**
     * Get the resourceId property: The resourceId property.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resourceId property.
     *
     * @param resourceId the resourceId value to set.
     * @return the WorkspaceConnectionManagedIdentity object itself.
     */
    public WorkspaceConnectionManagedIdentity withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the clientId property: The clientId property.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The clientId property.
     *
     * @param clientId the clientId value to set.
     * @return the WorkspaceConnectionManagedIdentity object itself.
     */
    public WorkspaceConnectionManagedIdentity withClientId(String clientId) {
        this.clientId = clientId;
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