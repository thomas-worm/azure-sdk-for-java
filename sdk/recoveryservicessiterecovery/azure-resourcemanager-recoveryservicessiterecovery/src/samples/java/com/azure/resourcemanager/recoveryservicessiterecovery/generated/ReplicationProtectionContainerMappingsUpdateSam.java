// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AUpdateContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AgentAutoUpdateStatus;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainerMapping;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateProtectionContainerMappingInputProperties;

/** Samples for ReplicationProtectionContainerMappings Update. */
public final class ReplicationProtectionContainerMappingsUpdateSam {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationProtectionContainerMappings_Update.json
     */
    /**
     * Sample code: Update protection container mapping.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void updateProtectionContainerMapping(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        ProtectionContainerMapping resource =
            manager
                .replicationProtectionContainerMappings()
                .getWithResponse(
                    "vault1",
                    "resourceGroupPS1",
                    "cloud1",
                    "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                    "cloud1protectionprofile1",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new UpdateProtectionContainerMappingInputProperties()
                    .withProviderSpecificInput(
                        new A2AUpdateContainerMappingInput()
                            .withAgentAutoUpdateStatus(AgentAutoUpdateStatus.ENABLED)
                            .withAutomationAccountArmId(
                                "/subscriptions/c183865e-6077-46f2-a3b1-deb0f4f4650a/resourceGroups/automationrg1/providers/Microsoft.Automation/automationAccounts/automationaccount1")))
            .apply();
    }
}
