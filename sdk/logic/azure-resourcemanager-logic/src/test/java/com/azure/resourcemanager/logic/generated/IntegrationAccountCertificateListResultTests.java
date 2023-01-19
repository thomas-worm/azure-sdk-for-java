// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountCertificateInner;
import com.azure.resourcemanager.logic.models.IntegrationAccountCertificateListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationAccountCertificateListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationAccountCertificateListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"createdTime\":\"2021-11-27T11:22:53Z\",\"changedTime\":\"2021-10-03T01:15:05Z\",\"metadata\":\"dataydvfvfcjnae\",\"publicCertificate\":\"rvhmgor\"},\"location\":\"fukiscvwmzhw\",\"tags\":{\"btgn\":\"faxvxil\",\"zqlqhyc\":\"nzeyqxtjj\",\"mieknlraria\":\"vodggxdbee\"},\"id\":\"wiuagydwqf\",\"name\":\"ylyrfgiagtco\",\"type\":\"ocqwogfnzjvus\"}],\"nextLink\":\"ld\"}")
                .toObject(IntegrationAccountCertificateListResult.class);
        Assertions.assertEquals("fukiscvwmzhw", model.value().get(0).location());
        Assertions.assertEquals("faxvxil", model.value().get(0).tags().get("btgn"));
        Assertions.assertEquals("rvhmgor", model.value().get(0).publicCertificate());
        Assertions.assertEquals("ld", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationAccountCertificateListResult model =
            new IntegrationAccountCertificateListResult()
                .withValue(
                    Arrays
                        .asList(
                            new IntegrationAccountCertificateInner()
                                .withLocation("fukiscvwmzhw")
                                .withTags(mapOf("btgn", "faxvxil", "zqlqhyc", "nzeyqxtjj", "mieknlraria", "vodggxdbee"))
                                .withMetadata("dataydvfvfcjnae")
                                .withPublicCertificate("rvhmgor")))
                .withNextLink("ld");
        model = BinaryData.fromObject(model).toObject(IntegrationAccountCertificateListResult.class);
        Assertions.assertEquals("fukiscvwmzhw", model.value().get(0).location());
        Assertions.assertEquals("faxvxil", model.value().get(0).tags().get("btgn"));
        Assertions.assertEquals("rvhmgor", model.value().get(0).publicCertificate());
        Assertions.assertEquals("ld", model.nextLink());
    }

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