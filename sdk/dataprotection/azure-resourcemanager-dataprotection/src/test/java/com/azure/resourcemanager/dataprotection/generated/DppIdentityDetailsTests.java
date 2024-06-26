// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppIdentityDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppIdentityDetails model = BinaryData.fromString(
            "{\"principalId\":\"c\",\"tenantId\":\"ierhhbcsglummaj\",\"type\":\"aodxo\",\"userAssignedIdentities\":{\"k\":{\"principalId\":\"9ee9357f-5f86-4b09-9a16-2440282261c6\",\"clientId\":\"7e7ed872-25e0-499d-a76b-ad1816b4d61c\"},\"okaj\":{\"principalId\":\"543ba9ae-e5d2-4f58-8097-c9453e823024\",\"clientId\":\"14d1aeb7-3231-4ef5-af26-a2478b765d4a\"},\"pimexgstxgcpodg\":{\"principalId\":\"5c6fe70b-4c7a-4820-b2a7-9ddb65bcd8d7\",\"clientId\":\"22f5ed58-b035-4e9a-8b5f-2bebb70ea26a\"}}}")
            .toObject(DppIdentityDetails.class);
        Assertions.assertEquals("aodxo", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppIdentityDetails model = new DppIdentityDetails().withType("aodxo")
            .withUserAssignedIdentities(mapOf("k", new UserAssignedIdentity(), "okaj", new UserAssignedIdentity(),
                "pimexgstxgcpodg", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(DppIdentityDetails.class);
        Assertions.assertEquals("aodxo", model.type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
