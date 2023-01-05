// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input properties to apply recovery point. */
@Fluent
public final class ApplyRecoveryPointInputProperties {
    /*
     * The recovery point Id.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /*
     * Provider specific input for applying recovery point.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private ApplyRecoveryPointProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of ApplyRecoveryPointInputProperties class. */
    public ApplyRecoveryPointInputProperties() {
    }

    /**
     * Get the recoveryPointId property: The recovery point Id.
     *
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point Id.
     *
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the ApplyRecoveryPointInputProperties object itself.
     */
    public ApplyRecoveryPointInputProperties withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific input for applying recovery point.
     *
     * @return the providerSpecificDetails value.
     */
    public ApplyRecoveryPointProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific input for applying recovery point.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the ApplyRecoveryPointInputProperties object itself.
     */
    public ApplyRecoveryPointInputProperties withProviderSpecificDetails(
        ApplyRecoveryPointProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model"
                            + " ApplyRecoveryPointInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplyRecoveryPointInputProperties.class);
}