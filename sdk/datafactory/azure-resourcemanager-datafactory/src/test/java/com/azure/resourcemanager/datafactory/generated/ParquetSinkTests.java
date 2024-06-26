// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.ParquetSink;
import com.azure.resourcemanager.datafactory.models.ParquetWriteSettings;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ParquetSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ParquetSink model = BinaryData.fromString(
            "{\"type\":\"ParquetSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"maxConcurrentConnections\":\"dataajqnsrcqd\",\"disableMetricsCollection\":\"datamlqamd\",\"copyBehavior\":\"dataukdmrv\",\"metadata\":[{\"name\":\"datacclsnprdartq\",\"value\":\"databbxexacgmtpkx\"}],\"\":{\"bmujlsztpygq\":\"databovexsnmww\",\"sn\":\"datakdl\",\"mksfejzmyvlbz\":\"datamkc\"}},\"formatSettings\":{\"type\":\"ParquetWriteSettings\",\"maxRowsPerFile\":\"dataxzpdnb\",\"fileNamePrefix\":\"datavhddvtnbtv\",\"\":{\"myizdglzzaufi\":\"datajfkaoew\",\"ykng\":\"datawvyxy\"}},\"writeBatchSize\":\"datajgpyvjg\",\"writeBatchTimeout\":\"datayjnh\",\"sinkRetryCount\":\"databhwrncxwzuer\",\"sinkRetryWait\":\"datapa\",\"maxConcurrentConnections\":\"datapiniopbfkmfbru\",\"disableMetricsCollection\":\"datayl\",\"\":{\"fsol\":\"dataovnlb\",\"lnhxr\":\"datarqu\",\"l\":\"datajshicvrmwbgpc\",\"pboaevtxi\":\"databxppvpgsrfshkjg\"}}")
            .toObject(ParquetSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ParquetSink model = new ParquetSink().withWriteBatchSize("datajgpyvjg").withWriteBatchTimeout("datayjnh")
            .withSinkRetryCount("databhwrncxwzuer").withSinkRetryWait("datapa")
            .withMaxConcurrentConnections("datapiniopbfkmfbru").withDisableMetricsCollection("datayl")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataajqnsrcqd")
                .withDisableMetricsCollection("datamlqamd").withCopyBehavior("dataukdmrv")
                .withMetadata(
                    Arrays.asList(new MetadataItem().withName("datacclsnprdartq").withValue("databbxexacgmtpkx")))
                .withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
            .withFormatSettings(
                new ParquetWriteSettings().withMaxRowsPerFile("dataxzpdnb").withFileNamePrefix("datavhddvtnbtv"));
        model = BinaryData.fromObject(model).toObject(ParquetSink.class);
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
