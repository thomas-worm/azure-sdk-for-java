// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.ColumnDataType;
import com.azure.resourcemanager.sql.models.TableTemporalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A database column resource. */
@Fluent
public final class DatabaseColumnInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DatabaseColumnProperties innerProperties;

    /** Creates an instance of DatabaseColumnInner class. */
    public DatabaseColumnInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private DatabaseColumnProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the columnType property: The column data type.
     *
     * @return the columnType value.
     */
    public ColumnDataType columnType() {
        return this.innerProperties() == null ? null : this.innerProperties().columnType();
    }

    /**
     * Set the columnType property: The column data type.
     *
     * @param columnType the columnType value to set.
     * @return the DatabaseColumnInner object itself.
     */
    public DatabaseColumnInner withColumnType(ColumnDataType columnType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseColumnProperties();
        }
        this.innerProperties().withColumnType(columnType);
        return this;
    }

    /**
     * Get the temporalType property: The table temporal type.
     *
     * @return the temporalType value.
     */
    public TableTemporalType temporalType() {
        return this.innerProperties() == null ? null : this.innerProperties().temporalType();
    }

    /**
     * Set the temporalType property: The table temporal type.
     *
     * @param temporalType the temporalType value to set.
     * @return the DatabaseColumnInner object itself.
     */
    public DatabaseColumnInner withTemporalType(TableTemporalType temporalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseColumnProperties();
        }
        this.innerProperties().withTemporalType(temporalType);
        return this;
    }

    /**
     * Get the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     *
     * @return the memoryOptimized value.
     */
    public Boolean memoryOptimized() {
        return this.innerProperties() == null ? null : this.innerProperties().memoryOptimized();
    }

    /**
     * Set the memoryOptimized property: Whether or not the column belongs to a memory optimized table.
     *
     * @param memoryOptimized the memoryOptimized value to set.
     * @return the DatabaseColumnInner object itself.
     */
    public DatabaseColumnInner withMemoryOptimized(Boolean memoryOptimized) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseColumnProperties();
        }
        this.innerProperties().withMemoryOptimized(memoryOptimized);
        return this;
    }

    /**
     * Get the isComputed property: Whether or not the column is computed.
     *
     * @return the isComputed value.
     */
    public Boolean isComputed() {
        return this.innerProperties() == null ? null : this.innerProperties().isComputed();
    }

    /**
     * Set the isComputed property: Whether or not the column is computed.
     *
     * @param isComputed the isComputed value to set.
     * @return the DatabaseColumnInner object itself.
     */
    public DatabaseColumnInner withIsComputed(Boolean isComputed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseColumnProperties();
        }
        this.innerProperties().withIsComputed(isComputed);
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
