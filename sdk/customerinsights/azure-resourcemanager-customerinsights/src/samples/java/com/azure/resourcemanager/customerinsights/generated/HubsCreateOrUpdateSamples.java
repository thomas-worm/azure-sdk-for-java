// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.resourcemanager.customerinsights.models.HubBillingInfoFormat;

/** Samples for Hubs CreateOrUpdate. */
public final class HubsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/HubsCreateOrUpdate.json
     */
    /**
     * Sample code: Hubs_CreateOrUpdate.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void hubsCreateOrUpdate(com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager
            .hubs()
            .define("sdkTestHub")
            .withRegion("West US")
            .withExistingResourceGroup("TestHubRG")
            .withHubBillingInfo(new HubBillingInfoFormat().withSkuName("B0").withMinUnits(1).withMaxUnits(5))
            .create();
    }
}