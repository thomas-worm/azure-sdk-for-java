// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloads.models.ApplicationProvisioningState;
import com.azure.resourcemanager.workloads.models.WordpressVersions;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WordPress instance properties. */
@Fluent
public final class WordpressInstanceResourceProperties {
    /*
     * Application version
     */
    @JsonProperty(value = "version", required = true)
    private WordpressVersions version;

    /*
     * Database name used by the application
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * User name used by the application to connect to database
     */
    @JsonProperty(value = "databaseUser")
    private String databaseUser;

    /*
     * Site Url to access the WordPress application
     */
    @JsonProperty(value = "siteUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String siteUrl;

    /*
     * WordPress instance provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationProvisioningState provisioningState;

    /**
     * Get the version property: Application version.
     *
     * @return the version value.
     */
    public WordpressVersions version() {
        return this.version;
    }

    /**
     * Set the version property: Application version.
     *
     * @param version the version value to set.
     * @return the WordpressInstanceResourceProperties object itself.
     */
    public WordpressInstanceResourceProperties withVersion(WordpressVersions version) {
        this.version = version;
        return this;
    }

    /**
     * Get the databaseName property: Database name used by the application.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Database name used by the application.
     *
     * @param databaseName the databaseName value to set.
     * @return the WordpressInstanceResourceProperties object itself.
     */
    public WordpressInstanceResourceProperties withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the databaseUser property: User name used by the application to connect to database.
     *
     * @return the databaseUser value.
     */
    public String databaseUser() {
        return this.databaseUser;
    }

    /**
     * Set the databaseUser property: User name used by the application to connect to database.
     *
     * @param databaseUser the databaseUser value to set.
     * @return the WordpressInstanceResourceProperties object itself.
     */
    public WordpressInstanceResourceProperties withDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
        return this;
    }

    /**
     * Get the siteUrl property: Site Url to access the WordPress application.
     *
     * @return the siteUrl value.
     */
    public String siteUrl() {
        return this.siteUrl;
    }

    /**
     * Get the provisioningState property: WordPress instance provisioning state.
     *
     * @return the provisioningState value.
     */
    public ApplicationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (version() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property version in model WordpressInstanceResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WordpressInstanceResourceProperties.class);
}
