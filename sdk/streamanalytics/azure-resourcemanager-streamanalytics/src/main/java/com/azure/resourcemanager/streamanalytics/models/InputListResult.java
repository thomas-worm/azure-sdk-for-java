// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Object containing a list of inputs under a streaming job.
 */
@Immutable
public final class InputListResult {
    /*
     * A list of inputs under a streaming job. Populated by a 'List' operation.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<InputInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of InputListResult class.
     */
    public InputListResult() {
    }

    /**
     * Get the value property: A list of inputs under a streaming job. Populated by a 'List' operation.
     * 
     * @return the value value.
     */
    public List<InputInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
