// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.models.FrontDoorCertificateType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters required for enabling SSL with Front Door-managed certificates. */
@Fluent
public final class FrontDoorCertificateSourceParameters {
    /*
     * Defines the type of the certificate used for secure connections to a frontendEndpoint
     */
    @JsonProperty(value = "certificateType")
    private FrontDoorCertificateType certificateType;

    /** Creates an instance of FrontDoorCertificateSourceParameters class. */
    public FrontDoorCertificateSourceParameters() {
    }

    /**
     * Get the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @return the certificateType value.
     */
    public FrontDoorCertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @param certificateType the certificateType value to set.
     * @return the FrontDoorCertificateSourceParameters object itself.
     */
    public FrontDoorCertificateSourceParameters withCertificateType(FrontDoorCertificateType certificateType) {
        this.certificateType = certificateType;
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
