// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.SkuRestrictionInfo;

public final class SkuRestrictionInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuRestrictionInfo model =
            BinaryData
                .fromString(
                    "{\"locations\":[\"uukzclewyhmlw\",\"aztz\",\"ofncckwyfzqwhxxb\",\"yq\"],\"zones\":[\"feqztppriol\",\"or\",\"altol\"]}")
                .toObject(SkuRestrictionInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuRestrictionInfo model = new SkuRestrictionInfo();
        model = BinaryData.fromObject(model).toObject(SkuRestrictionInfo.class);
    }
}