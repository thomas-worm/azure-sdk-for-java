// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import org.junit.jupiter.api.Assertions;

public final class QuotaChangeRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaChangeRequest model = BinaryData.fromString("{\"region\":\"nayqi\",\"payload\":\"nduhavhqlkthum\"}")
            .toObject(QuotaChangeRequest.class);
        Assertions.assertEquals("nayqi", model.region());
        Assertions.assertEquals("nduhavhqlkthum", model.payload());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaChangeRequest model = new QuotaChangeRequest().withRegion("nayqi").withPayload("nduhavhqlkthum");
        model = BinaryData.fromObject(model).toObject(QuotaChangeRequest.class);
        Assertions.assertEquals("nayqi", model.region());
        Assertions.assertEquals("nduhavhqlkthum", model.payload());
    }
}
