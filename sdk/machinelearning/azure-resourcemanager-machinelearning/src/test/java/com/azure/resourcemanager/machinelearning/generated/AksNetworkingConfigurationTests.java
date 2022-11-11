// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AksNetworkingConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AksNetworkingConfigurationTests {
    @Test
    public void testDeserialize() {
        AksNetworkingConfiguration model =
            BinaryData
                .fromString(
                    "{\"subnetId\":\"pilguooqjag\",\"serviceCidr\":\"itgueiookjbs\",\"dnsServiceIP\":\"rtdtpdelq\",\"dockerBridgeCidr\":\"slmot\"}")
                .toObject(AksNetworkingConfiguration.class);
        Assertions.assertEquals("pilguooqjag", model.subnetId());
        Assertions.assertEquals("itgueiookjbs", model.serviceCidr());
        Assertions.assertEquals("rtdtpdelq", model.dnsServiceIp());
        Assertions.assertEquals("slmot", model.dockerBridgeCidr());
    }

    @Test
    public void testSerialize() {
        AksNetworkingConfiguration model =
            new AksNetworkingConfiguration()
                .withSubnetId("pilguooqjag")
                .withServiceCidr("itgueiookjbs")
                .withDnsServiceIp("rtdtpdelq")
                .withDockerBridgeCidr("slmot");
        model = BinaryData.fromObject(model).toObject(AksNetworkingConfiguration.class);
        Assertions.assertEquals("pilguooqjag", model.subnetId());
        Assertions.assertEquals("itgueiookjbs", model.serviceCidr());
        Assertions.assertEquals("rtdtpdelq", model.dnsServiceIp());
        Assertions.assertEquals("slmot", model.dockerBridgeCidr());
    }
}