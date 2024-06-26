// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.PublisherInfo;
import org.junit.jupiter.api.Assertions;

public final class PublisherInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PublisherInfo model = BinaryData.fromString(
            "{\"publisherName\":\"dqhqyhwqwemv\",\"productName\":\"abckmzeoxinhgre\",\"binaryName\":\"twhlpuzjpce\",\"version\":\"nzangprbfaxy\"}")
            .toObject(PublisherInfo.class);
        Assertions.assertEquals("dqhqyhwqwemv", model.publisherName());
        Assertions.assertEquals("abckmzeoxinhgre", model.productName());
        Assertions.assertEquals("twhlpuzjpce", model.binaryName());
        Assertions.assertEquals("nzangprbfaxy", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PublisherInfo model = new PublisherInfo().withPublisherName("dqhqyhwqwemv").withProductName("abckmzeoxinhgre")
            .withBinaryName("twhlpuzjpce").withVersion("nzangprbfaxy");
        model = BinaryData.fromObject(model).toObject(PublisherInfo.class);
        Assertions.assertEquals("dqhqyhwqwemv", model.publisherName());
        Assertions.assertEquals("abckmzeoxinhgre", model.productName());
        Assertions.assertEquals("twhlpuzjpce", model.binaryName());
        Assertions.assertEquals("nzangprbfaxy", model.version());
    }
}
