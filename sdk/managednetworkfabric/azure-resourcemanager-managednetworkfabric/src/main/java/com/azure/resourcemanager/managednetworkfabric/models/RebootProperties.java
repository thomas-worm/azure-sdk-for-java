// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reboot properties. */
@Fluent
public final class RebootProperties {
    /*
     * Type of reboot to be performed. Example: GracefulRebootWithZTP
     */
    @JsonProperty(value = "rebootType")
    private RebootType rebootType;

    /** Creates an instance of RebootProperties class. */
    public RebootProperties() {
    }

    /**
     * Get the rebootType property: Type of reboot to be performed. Example: GracefulRebootWithZTP.
     *
     * @return the rebootType value.
     */
    public RebootType rebootType() {
        return this.rebootType;
    }

    /**
     * Set the rebootType property: Type of reboot to be performed. Example: GracefulRebootWithZTP.
     *
     * @param rebootType the rebootType value to set.
     * @return the RebootProperties object itself.
     */
    public RebootProperties withRebootType(RebootType rebootType) {
        this.rebootType = rebootType;
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
