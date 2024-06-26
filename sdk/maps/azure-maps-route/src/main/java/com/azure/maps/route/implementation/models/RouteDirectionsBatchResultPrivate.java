// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.route.models.RouteDirectionsBatchItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Route Directions Batch service call. */
@Immutable
public final class RouteDirectionsBatchResultPrivate extends BatchResult {
    /*
     * Array containing the batch results.
     */
    @JsonProperty(value = "batchItems", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouteDirectionsBatchItem> batchItems;

    /**
     * Get the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    public List<RouteDirectionsBatchItem> getBatchItems() {
        return this.batchItems;
    }
}
