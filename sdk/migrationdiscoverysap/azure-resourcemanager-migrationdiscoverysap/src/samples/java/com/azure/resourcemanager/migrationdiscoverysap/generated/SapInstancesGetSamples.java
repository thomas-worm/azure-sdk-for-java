// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.generated;

/**
 * Samples for SapInstances Get.
 */
public final class SapInstancesGetSamples {
    /*
     * x-ms-original-file:
     * specification/workloads/resource-manager/Microsoft.Workloads/SAPDiscoverySites/preview/2023-10-01-preview/
     * examples/SAPInstances_Get.json
     */
    /**
     * Sample code: GET a SAP Instance resource.
     * 
     * @param manager Entry point to MigrationDiscoverySapManager.
     */
    public static void
        gETASAPInstanceResource(com.azure.resourcemanager.migrationdiscoverysap.MigrationDiscoverySapManager manager) {
        manager.sapInstances().getWithResponse("test-rg", "SampleSite", "MPP_MPP", com.azure.core.util.Context.NONE);
    }
}
