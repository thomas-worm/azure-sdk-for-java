// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.LocalizedName;
import org.junit.jupiter.api.Assertions;

public final class LocalizedNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LocalizedName model =
            BinaryData
                .fromString("{\"value\":\"wtl\",\"localizedValue\":\"guxawqaldsyuuxi\"}")
                .toObject(LocalizedName.class);
        Assertions.assertEquals("wtl", model.value());
        Assertions.assertEquals("guxawqaldsyuuxi", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LocalizedName model = new LocalizedName().withValue("wtl").withLocalizedValue("guxawqaldsyuuxi");
        model = BinaryData.fromObject(model).toObject(LocalizedName.class);
        Assertions.assertEquals("wtl", model.value());
        Assertions.assertEquals("guxawqaldsyuuxi", model.localizedValue());
    }
}
