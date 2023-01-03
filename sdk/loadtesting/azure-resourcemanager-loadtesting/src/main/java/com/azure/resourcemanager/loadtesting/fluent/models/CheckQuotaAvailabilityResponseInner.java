// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Check quota availability response object. */
@Fluent
public final class CheckQuotaAvailabilityResponseInner extends ProxyResource {
    /*
     * Check quota availability response properties.
     */
    @JsonProperty(value = "properties")
    private CheckQuotaAvailabilityResponseProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CheckQuotaAvailabilityResponseInner class. */
    public CheckQuotaAvailabilityResponseInner() {
    }

    /**
     * Get the innerProperties property: Check quota availability response properties.
     *
     * @return the innerProperties value.
     */
    private CheckQuotaAvailabilityResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the isAvailable property: True/False indicating whether the quota request be granted based on availability.
     *
     * @return the isAvailable value.
     */
    public Boolean isAvailable() {
        return this.innerProperties() == null ? null : this.innerProperties().isAvailable();
    }

    /**
     * Set the isAvailable property: True/False indicating whether the quota request be granted based on availability.
     *
     * @param isAvailable the isAvailable value to set.
     * @return the CheckQuotaAvailabilityResponseInner object itself.
     */
    public CheckQuotaAvailabilityResponseInner withIsAvailable(Boolean isAvailable) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CheckQuotaAvailabilityResponseProperties();
        }
        this.innerProperties().withIsAvailable(isAvailable);
        return this;
    }

    /**
     * Get the availabilityStatus property: Message indicating additional details to add to quota support request.
     *
     * @return the availabilityStatus value.
     */
    public String availabilityStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityStatus();
    }

    /**
     * Set the availabilityStatus property: Message indicating additional details to add to quota support request.
     *
     * @param availabilityStatus the availabilityStatus value to set.
     * @return the CheckQuotaAvailabilityResponseInner object itself.
     */
    public CheckQuotaAvailabilityResponseInner withAvailabilityStatus(String availabilityStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CheckQuotaAvailabilityResponseProperties();
        }
        this.innerProperties().withAvailabilityStatus(availabilityStatus);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}