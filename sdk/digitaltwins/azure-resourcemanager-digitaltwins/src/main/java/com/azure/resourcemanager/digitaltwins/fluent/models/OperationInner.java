// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.digitaltwins.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** DigitalTwins service REST API operation. */
@Fluent
public final class OperationInner {
    /*
     * Operation name: {provider}/{resource}/{read | write | action | delete}
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Operation properties display
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /*
     * If the operation is a data action (for data plane rbac).
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /*
     * Operation properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> properties;

    /** Creates an instance of OperationInner class. */
    public OperationInner() {
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{read | write | action | delete}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: Operation properties display.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Operation properties display.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Get the isDataAction property: If the operation is a data action (for data plane rbac).
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Get the properties property: Operation properties.
     *
     * @return the properties value.
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
