// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.ResourceReference;
import com.azure.resourcemanager.logic.models.Sku;
import com.azure.resourcemanager.logic.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model =
            BinaryData
                .fromString(
                    "{\"name\":\"NotSpecified\",\"plan\":{\"id\":\"kexxppof\",\"name\":\"axcfjpgddtocjjx\",\"type\":\"pmouexhdz\"}}")
                .toObject(Sku.class);
        Assertions.assertEquals(SkuName.NOT_SPECIFIED, model.name());
        Assertions.assertEquals("kexxppof", model.plan().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku().withName(SkuName.NOT_SPECIFIED).withPlan(new ResourceReference().withId("kexxppof"));
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals(SkuName.NOT_SPECIFIED, model.name());
        Assertions.assertEquals("kexxppof", model.plan().id());
    }
}
