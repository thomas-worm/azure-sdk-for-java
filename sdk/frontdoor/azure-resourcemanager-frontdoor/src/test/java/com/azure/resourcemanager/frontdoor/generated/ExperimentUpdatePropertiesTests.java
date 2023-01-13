// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.ExperimentUpdateProperties;
import com.azure.resourcemanager.frontdoor.models.State;
import org.junit.jupiter.api.Assertions;

public final class ExperimentUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentUpdateProperties model =
            BinaryData
                .fromString("{\"description\":\"u\",\"enabledState\":\"Enabled\"}")
                .toObject(ExperimentUpdateProperties.class);
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals(State.ENABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentUpdateProperties model =
            new ExperimentUpdateProperties().withDescription("u").withEnabledState(State.ENABLED);
        model = BinaryData.fromObject(model).toObject(ExperimentUpdateProperties.class);
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals(State.ENABLED, model.enabledState());
    }
}