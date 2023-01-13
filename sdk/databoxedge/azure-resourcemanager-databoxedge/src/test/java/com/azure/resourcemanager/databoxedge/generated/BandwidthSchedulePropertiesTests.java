// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.fluent.models.BandwidthScheduleProperties;
import com.azure.resourcemanager.databoxedge.models.DayOfWeek;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BandwidthSchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BandwidthScheduleProperties model =
            BinaryData
                .fromString(
                    "{\"start\":\"dxwzywqsmbsurexi\",\"stop\":\"o\",\"rateInMbps\":998039935,\"days\":[\"Saturday\"]}")
                .toObject(BandwidthScheduleProperties.class);
        Assertions.assertEquals("dxwzywqsmbsurexi", model.start());
        Assertions.assertEquals("o", model.stop());
        Assertions.assertEquals(998039935, model.rateInMbps());
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.days().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BandwidthScheduleProperties model =
            new BandwidthScheduleProperties()
                .withStart("dxwzywqsmbsurexi")
                .withStop("o")
                .withRateInMbps(998039935)
                .withDays(Arrays.asList(DayOfWeek.SATURDAY));
        model = BinaryData.fromObject(model).toObject(BandwidthScheduleProperties.class);
        Assertions.assertEquals("dxwzywqsmbsurexi", model.start());
        Assertions.assertEquals("o", model.stop());
        Assertions.assertEquals(998039935, model.rateInMbps());
        Assertions.assertEquals(DayOfWeek.SATURDAY, model.days().get(0));
    }
}