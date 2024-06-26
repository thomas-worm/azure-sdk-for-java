// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure query for the update configuration. */
@Fluent
public final class AzureQueryProperties {
    /*
     * List of Subscription or Resource Group ARM Ids.
     */
    @JsonProperty(value = "scope")
    private List<String> scope;

    /*
     * List of locations to scope the query to.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Tag settings for the VM.
     */
    @JsonProperty(value = "tagSettings")
    private TagSettingsProperties tagSettings;

    /**
     * Get the scope property: List of Subscription or Resource Group ARM Ids.
     *
     * @return the scope value.
     */
    public List<String> scope() {
        return this.scope;
    }

    /**
     * Set the scope property: List of Subscription or Resource Group ARM Ids.
     *
     * @param scope the scope value to set.
     * @return the AzureQueryProperties object itself.
     */
    public AzureQueryProperties withScope(List<String> scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the locations property: List of locations to scope the query to.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: List of locations to scope the query to.
     *
     * @param locations the locations value to set.
     * @return the AzureQueryProperties object itself.
     */
    public AzureQueryProperties withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the tagSettings property: Tag settings for the VM.
     *
     * @return the tagSettings value.
     */
    public TagSettingsProperties tagSettings() {
        return this.tagSettings;
    }

    /**
     * Set the tagSettings property: Tag settings for the VM.
     *
     * @param tagSettings the tagSettings value to set.
     * @return the AzureQueryProperties object itself.
     */
    public AzureQueryProperties withTagSettings(TagSettingsProperties tagSettings) {
        this.tagSettings = tagSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tagSettings() != null) {
            tagSettings().validate();
        }
    }
}
