// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.databricks.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString("{\"status\":\"Pending\",\"description\":\"hutje\",\"actionRequired\":\"mrldhu\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("hutje", model.description());
        Assertions.assertEquals("mrldhu", model.actionRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.PENDING)
                .withDescription("hutje")
                .withActionRequired("mrldhu");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.PENDING, model.status());
        Assertions.assertEquals("hutje", model.description());
        Assertions.assertEquals("mrldhu", model.actionRequired());
    }
}
