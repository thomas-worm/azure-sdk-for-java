// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.SecretFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SecretFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecretFragment model =
            BinaryData.fromString("{\"tags\":{\"qgqqihedsvqwthmk\":\"tpvopvpbdb\"}}").toObject(SecretFragment.class);
        Assertions.assertEquals("tpvopvpbdb", model.tags().get("qgqqihedsvqwthmk"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecretFragment model = new SecretFragment().withTags(mapOf("qgqqihedsvqwthmk", "tpvopvpbdb"));
        model = BinaryData.fromObject(model).toObject(SecretFragment.class);
        Assertions.assertEquals("tpvopvpbdb", model.tags().get("qgqqihedsvqwthmk"));
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
