// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents SKU details for existing resources. */
@Fluent
public final class SkuDetailsForExistingResource {
    /*
     * The resource type
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The SKU in SKU details for existing resources.
     */
    @JsonProperty(value = "sku")
    private CapacitySku sku;

    /** Creates an instance of SkuDetailsForExistingResource class. */
    public SkuDetailsForExistingResource() {
    }

    /**
     * Get the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the SkuDetailsForExistingResource object itself.
     */
    public SkuDetailsForExistingResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: The SKU in SKU details for existing resources.
     *
     * @return the sku value.
     */
    public CapacitySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU in SKU details for existing resources.
     *
     * @param sku the sku value to set.
     * @return the SkuDetailsForExistingResource object itself.
     */
    public SkuDetailsForExistingResource withSku(CapacitySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
