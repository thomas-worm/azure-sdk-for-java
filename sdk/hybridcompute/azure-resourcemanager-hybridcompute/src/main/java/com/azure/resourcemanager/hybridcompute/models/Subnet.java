// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the subnet. */
@Fluent
public final class Subnet {
    /*
     * Represents address prefix.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /** Creates an instance of Subnet class. */
    public Subnet() {
    }

    /**
     * Get the addressPrefix property: Represents address prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Represents address prefix.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the Subnet object itself.
     */
    public Subnet withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
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
