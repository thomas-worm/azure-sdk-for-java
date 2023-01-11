// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VMwareCbtTestMigrateInput;

/** Samples for ReplicationMigrationItems TestMigrate. */
public final class ReplicationMigrationItemsTestMigrateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationMigrationItems_TestMigrate.json
     */
    /**
     * Sample code: Test migrate item.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void testMigrateItem(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationMigrationItems()
            .testMigrate(
                "migrationvault",
                "resourcegroup1",
                "vmwarefabric1",
                "vmwareContainer1",
                "virtualmachine1",
                new TestMigrateInput()
                    .withProperties(
                        new TestMigrateInputProperties()
                            .withProviderSpecificDetails(
                                new VMwareCbtTestMigrateInput()
                                    .withRecoveryPointId(
                                        "/Subscriptions/cb53d0c3-bd59-4721-89bc-06916a9147ef/resourceGroups/resourcegroup1/providers/Microsoft.RecoveryServices/vaults/migrationvault/replicationFabrics/vmwarefabric1/replicationProtectionContainers/vmwareContainer1/replicationMigrationItems/virtualmachine1/migrationRecoveryPoints/9e737191-317e-43d0-8c83-e32ac3b34686")
                                    .withNetworkId(
                                        "/Subscriptions/cb53d0c3-bd59-4721-89bc-06916a9147ef/resourceGroups/resourcegroup1/providers/Microsoft.Network/virtualNetworks/virtualNetwork1"))),
                com.azure.core.util.Context.NONE);
    }
}
