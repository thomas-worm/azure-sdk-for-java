// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.networkanalytics.fluent.models.DataProductsCatalogInner;
import com.azure.resourcemanager.networkanalytics.models.DataProductsCatalog;
import com.azure.resourcemanager.networkanalytics.models.DataProductsCatalogProperties;

public final class DataProductsCatalogImpl implements DataProductsCatalog {
    private DataProductsCatalogInner innerObject;

    private final com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager;

    DataProductsCatalogImpl(DataProductsCatalogInner innerObject,
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DataProductsCatalogProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DataProductsCatalogInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager() {
        return this.serviceManager;
    }
}
