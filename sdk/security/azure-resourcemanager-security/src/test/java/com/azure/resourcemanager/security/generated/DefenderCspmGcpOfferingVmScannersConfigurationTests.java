// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmGcpOfferingVmScannersConfiguration;
import com.azure.resourcemanager.security.models.ScanningMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmGcpOfferingVmScannersConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmGcpOfferingVmScannersConfiguration model = BinaryData
            .fromString(
                "{\"scanningMode\":\"Default\",\"exclusionTags\":{\"mrpahuuonj\":\"wdr\",\"cjo\":\"kxukguehvvpxjoe\"}}")
            .toObject(DefenderCspmGcpOfferingVmScannersConfiguration.class);
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("wdr", model.exclusionTags().get("mrpahuuonj"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmGcpOfferingVmScannersConfiguration model
            = new DefenderCspmGcpOfferingVmScannersConfiguration().withScanningMode(ScanningMode.DEFAULT)
                .withExclusionTags(mapOf("mrpahuuonj", "wdr", "cjo", "kxukguehvvpxjoe"));
        model = BinaryData.fromObject(model).toObject(DefenderCspmGcpOfferingVmScannersConfiguration.class);
        Assertions.assertEquals(ScanningMode.DEFAULT, model.scanningMode());
        Assertions.assertEquals("wdr", model.exclusionTags().get("mrpahuuonj"));
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
