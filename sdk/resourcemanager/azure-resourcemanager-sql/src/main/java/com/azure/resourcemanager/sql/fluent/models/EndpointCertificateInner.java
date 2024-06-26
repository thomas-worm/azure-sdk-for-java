// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Certificate used on an endpoint on the Managed Instance. */
@Fluent
public final class EndpointCertificateInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private EndpointCertificateProperties innerProperties;

    /** Creates an instance of EndpointCertificateInner class. */
    public EndpointCertificateInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private EndpointCertificateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the publicBlob property: The certificate public blob.
     *
     * @return the publicBlob value.
     */
    public String publicBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().publicBlob();
    }

    /**
     * Set the publicBlob property: The certificate public blob.
     *
     * @param publicBlob the publicBlob value to set.
     * @return the EndpointCertificateInner object itself.
     */
    public EndpointCertificateInner withPublicBlob(String publicBlob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EndpointCertificateProperties();
        }
        this.innerProperties().withPublicBlob(publicBlob);
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
