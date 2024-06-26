// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaaSvmProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class IaaSvmProtectableItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IaaSvmProtectableItem model = BinaryData.fromString(
            "{\"protectableItemType\":\"IaaSVMProtectableItem\",\"virtualMachineId\":\"gv\",\"virtualMachineVersion\":\"pcrrk\",\"resourceGroup\":\"awjmjsmw\",\"backupManagementType\":\"kcdxfzzzw\",\"workloadType\":\"afitlhguynuchlg\",\"friendlyName\":\"txd\",\"protectionState\":\"Protected\"}")
            .toObject(IaaSvmProtectableItem.class);
        Assertions.assertEquals("kcdxfzzzw", model.backupManagementType());
        Assertions.assertEquals("afitlhguynuchlg", model.workloadType());
        Assertions.assertEquals("txd", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("gv", model.virtualMachineId());
        Assertions.assertEquals("pcrrk", model.virtualMachineVersion());
        Assertions.assertEquals("awjmjsmw", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IaaSvmProtectableItem model = new IaaSvmProtectableItem().withBackupManagementType("kcdxfzzzw")
            .withWorkloadType("afitlhguynuchlg").withFriendlyName("txd").withProtectionState(ProtectionStatus.PROTECTED)
            .withVirtualMachineId("gv").withVirtualMachineVersion("pcrrk").withResourceGroup("awjmjsmw");
        model = BinaryData.fromObject(model).toObject(IaaSvmProtectableItem.class);
        Assertions.assertEquals("kcdxfzzzw", model.backupManagementType());
        Assertions.assertEquals("afitlhguynuchlg", model.workloadType());
        Assertions.assertEquals("txd", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("gv", model.virtualMachineId());
        Assertions.assertEquals("pcrrk", model.virtualMachineVersion());
        Assertions.assertEquals("awjmjsmw", model.resourceGroup());
    }
}
