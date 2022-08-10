// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PrivateLink Resource of an application gateway. */
@Fluent
public final class ApplicationGatewayPrivateLinkResourceInner extends SubResource {
    /*
     * Properties of the application gateway private link resource.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayPrivateLinkResourceProperties innerProperties;

    /*
     * Name of the private link resource that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway private link resource.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayPrivateLinkResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the private link resource that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the private link resource that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayPrivateLinkResourceInner object itself.
     */
    public ApplicationGatewayPrivateLinkResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayPrivateLinkResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the groupId property: Group identifier of private link resource.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Get the requiredMembers property: Required member names of private link resource.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Get the requiredZoneNames property: Required DNS zone names of the the private link resource.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: Required DNS zone names of the the private link resource.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the ApplicationGatewayPrivateLinkResourceInner object itself.
     */
    public ApplicationGatewayPrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
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
