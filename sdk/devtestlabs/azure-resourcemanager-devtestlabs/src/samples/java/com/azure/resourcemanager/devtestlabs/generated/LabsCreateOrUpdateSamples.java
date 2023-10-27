// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.resourcemanager.devtestlabs.models.StorageType;
import java.util.HashMap;
import java.util.Map;

/** Samples for Labs CreateOrUpdate. */
public final class LabsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/Labs_CreateOrUpdate.json
     */
    /**
     * Sample code: Labs_CreateOrUpdate.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void labsCreateOrUpdate(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .labs()
            .define("{labName}")
            .withRegion("{location}")
            .withExistingResourceGroup("resourceGroupName")
            .withTags(mapOf("tagName1", "tagValue1"))
            .withLabStorageType(StorageType.fromString("{Standard|Premium}"))
            .create();
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
