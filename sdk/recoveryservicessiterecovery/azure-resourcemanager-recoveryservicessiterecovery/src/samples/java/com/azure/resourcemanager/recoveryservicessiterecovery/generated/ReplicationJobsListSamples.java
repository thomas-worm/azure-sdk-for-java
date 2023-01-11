// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationJobs List. */
public final class ReplicationJobsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationJobs_List.json
     */
    /**
     * Sample code: Gets the list of jobs.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfJobs(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationJobs().list("vault1", "resourceGroupPS1", null, com.azure.core.util.Context.NONE);
    }
}
