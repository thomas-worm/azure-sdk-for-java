// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfileUpdate;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolElasticityProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolElasticityProfileUpdate model
            = BinaryData.fromString("{\"maxReadyCapacity\":1133583588147425789}")
                .toObject(StandbyVirtualMachinePoolElasticityProfileUpdate.class);
        Assertions.assertEquals(1133583588147425789L, model.maxReadyCapacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolElasticityProfileUpdate model
            = new StandbyVirtualMachinePoolElasticityProfileUpdate().withMaxReadyCapacity(1133583588147425789L);
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolElasticityProfileUpdate.class);
        Assertions.assertEquals(1133583588147425789L, model.maxReadyCapacity());
    }
}
