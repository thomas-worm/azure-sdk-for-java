// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonFormat;

public final class JsonFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonFormat model = BinaryData.fromString(
            "{\"type\":\"JsonFormat\",\"filePattern\":\"datasmuffiwjb\",\"nestingSeparator\":\"datavbp\",\"encodingName\":\"datajqjtotd\",\"jsonNodeReference\":\"dataosc\",\"jsonPathDefinition\":\"datahwuusiecktybh\",\"serializer\":\"dataxidhhxomil\",\"deserializer\":\"dataxj\",\"\":{\"qrslaate\":\"datagxwjwil\",\"gqwlxrhg\":\"datatwujjzgx\",\"ykbkkteozejogmk\":\"datavhvtq\",\"h\":\"datarvvmvmcofn\"}}")
            .toObject(JsonFormat.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonFormat model = new JsonFormat().withSerializer("dataxidhhxomil").withDeserializer("dataxj")
            .withFilePattern("datasmuffiwjb").withNestingSeparator("datavbp").withEncodingName("datajqjtotd")
            .withJsonNodeReference("dataosc").withJsonPathDefinition("datahwuusiecktybh");
        model = BinaryData.fromObject(model).toObject(JsonFormat.class);
    }
}
