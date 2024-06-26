// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Alert notification source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "sourceType")
@JsonTypeName("Alert")
@Fluent
public final class NotificationsSourceAlert extends NotificationsSource {
    /*
     * Defines the minimal alert severity which will be sent as email notifications
     */
    @JsonProperty(value = "minimalSeverity")
    private MinimalSeverity minimalSeverity;

    /**
     * Creates an instance of NotificationsSourceAlert class.
     */
    public NotificationsSourceAlert() {
    }

    /**
     * Get the minimalSeverity property: Defines the minimal alert severity which will be sent as email notifications.
     * 
     * @return the minimalSeverity value.
     */
    public MinimalSeverity minimalSeverity() {
        return this.minimalSeverity;
    }

    /**
     * Set the minimalSeverity property: Defines the minimal alert severity which will be sent as email notifications.
     * 
     * @param minimalSeverity the minimalSeverity value to set.
     * @return the NotificationsSourceAlert object itself.
     */
    public NotificationsSourceAlert withMinimalSeverity(MinimalSeverity minimalSeverity) {
        this.minimalSeverity = minimalSeverity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
