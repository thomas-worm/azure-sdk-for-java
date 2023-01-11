// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationProtectionContainerMappings ListByReplicationProtectionContainers. */
public final class ReplicationProtectionContainerMappingsListByRep {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectionContainerMappings_ListByReplicationProtectionContainers.json
     */
    /**
     * Sample code: Gets the list of protection container mappings for a protection container.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfProtectionContainerMappingsForAProtectionContainer(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainerMappings()
            .listByReplicationProtectionContainers(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                com.azure.core.util.Context.NONE);
    }
}
