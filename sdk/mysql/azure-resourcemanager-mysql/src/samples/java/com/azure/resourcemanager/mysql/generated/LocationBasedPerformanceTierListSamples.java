// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for LocationBasedPerformanceTier List. */
public final class LocationBasedPerformanceTierListSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2017-12-01/examples/PerformanceTiersListByLocation.json
     */
    /**
     * Sample code: PerformanceTiersList.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void performanceTiersList(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager.locationBasedPerformanceTiers().list("WestUS", Context.NONE);
    }
}
