// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.iothub.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkServiceConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Disconnected\",\"description\":\"mfdatscmdvpj\",\"actionsRequired\":\"lsuuvmkjozkrwfnd\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("mfdatscmdvpj", model.description());
        Assertions.assertEquals("lsuuvmkjozkrwfnd", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateLinkServiceConnectionStatus.DISCONNECTED)
                .withDescription("mfdatscmdvpj")
                .withActionsRequired("lsuuvmkjozkrwfnd");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateLinkServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("mfdatscmdvpj", model.description());
        Assertions.assertEquals("lsuuvmkjozkrwfnd", model.actionsRequired());
    }
}
