// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Defines the Sql ElasticPool resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Sql/servers/elasticPools")
@Fluent
public final class SqlElasticPoolResourceSettings extends ResourceSettings {
    /*
     * Gets or sets the Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Defines the zone redundant resource setting.
     */
    @JsonProperty(value = "zoneRedundant")
    private ZoneRedundant zoneRedundant;

    /** Creates an instance of SqlElasticPoolResourceSettings class. */
    public SqlElasticPoolResourceSettings() {
    }

    /**
     * Get the tags property: Gets or sets the Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SqlElasticPoolResourceSettings object itself.
     */
    public SqlElasticPoolResourceSettings withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the zoneRedundant property: Defines the zone redundant resource setting.
     *
     * @return the zoneRedundant value.
     */
    public ZoneRedundant zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Defines the zone redundant resource setting.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the SqlElasticPoolResourceSettings object itself.
     */
    public SqlElasticPoolResourceSettings withZoneRedundant(ZoneRedundant zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlElasticPoolResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlElasticPoolResourceSettings withTargetResourceGroupName(String targetResourceGroupName) {
        super.withTargetResourceGroupName(targetResourceGroupName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
