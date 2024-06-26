// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VMwareToAzStackHCI NIC properties. */
@Fluent
public final class VMwareToAzStackHciProtectedNicProperties {
    /*
     * Gets or sets the NIC Id.
     */
    @JsonProperty(value = "nicId", access = JsonProperty.Access.WRITE_ONLY)
    private String nicId;

    /*
     * Gets or sets the NIC mac address.
     */
    @JsonProperty(value = "macAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String macAddress;

    /*
     * Gets or sets the NIC label.
     */
    @JsonProperty(value = "label", access = JsonProperty.Access.WRITE_ONLY)
    private String label;

    /*
     * Gets or sets a value indicating whether this is the primary NIC.
     */
    @JsonProperty(value = "isPrimaryNic")
    private Boolean isPrimaryNic;

    /*
     * Gets or sets the network name.
     */
    @JsonProperty(value = "networkName", access = JsonProperty.Access.WRITE_ONLY)
    private String networkName;

    /*
     * Gets or sets the target network Id within AzStackHCI Cluster.
     */
    @JsonProperty(value = "targetNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetNetworkId;

    /*
     * Gets or sets the target test network Id within AzStackHCI Cluster.
     */
    @JsonProperty(value = "testNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String testNetworkId;

    /*
     * Gets or sets the selection type of the NIC.
     */
    @JsonProperty(value = "selectionTypeForFailover", access = JsonProperty.Access.WRITE_ONLY)
    private VMNicSelection selectionTypeForFailover;

    /** Creates an instance of VMwareToAzStackHciProtectedNicProperties class. */
    public VMwareToAzStackHciProtectedNicProperties() {
    }

    /**
     * Get the nicId property: Gets or sets the NIC Id.
     *
     * @return the nicId value.
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Get the macAddress property: Gets or sets the NIC mac address.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Get the label property: Gets or sets the NIC label.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Get the isPrimaryNic property: Gets or sets a value indicating whether this is the primary NIC.
     *
     * @return the isPrimaryNic value.
     */
    public Boolean isPrimaryNic() {
        return this.isPrimaryNic;
    }

    /**
     * Set the isPrimaryNic property: Gets or sets a value indicating whether this is the primary NIC.
     *
     * @param isPrimaryNic the isPrimaryNic value to set.
     * @return the VMwareToAzStackHciProtectedNicProperties object itself.
     */
    public VMwareToAzStackHciProtectedNicProperties withIsPrimaryNic(Boolean isPrimaryNic) {
        this.isPrimaryNic = isPrimaryNic;
        return this;
    }

    /**
     * Get the networkName property: Gets or sets the network name.
     *
     * @return the networkName value.
     */
    public String networkName() {
        return this.networkName;
    }

    /**
     * Get the targetNetworkId property: Gets or sets the target network Id within AzStackHCI Cluster.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Get the testNetworkId property: Gets or sets the target test network Id within AzStackHCI Cluster.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Get the selectionTypeForFailover property: Gets or sets the selection type of the NIC.
     *
     * @return the selectionTypeForFailover value.
     */
    public VMNicSelection selectionTypeForFailover() {
        return this.selectionTypeForFailover;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
