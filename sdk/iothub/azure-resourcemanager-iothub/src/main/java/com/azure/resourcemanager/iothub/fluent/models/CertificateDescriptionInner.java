// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.iothub.models.CertificateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The X509 Certificate. */
@Fluent
public final class CertificateDescriptionInner extends ProxyResource {
    /*
     * The description of an X509 CA Certificate.
     */
    @JsonProperty(value = "properties")
    private CertificateProperties properties;

    /*
     * The entity tag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /** Creates an instance of CertificateDescriptionInner class. */
    public CertificateDescriptionInner() {
    }

    /**
     * Get the properties property: The description of an X509 CA Certificate.
     *
     * @return the properties value.
     */
    public CertificateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The description of an X509 CA Certificate.
     *
     * @param properties the properties value to set.
     * @return the CertificateDescriptionInner object itself.
     */
    public CertificateDescriptionInner withProperties(CertificateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: The entity tag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
