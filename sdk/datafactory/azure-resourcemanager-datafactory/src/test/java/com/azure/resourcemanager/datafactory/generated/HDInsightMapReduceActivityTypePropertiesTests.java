// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightMapReduceActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HDInsightMapReduceActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HDInsightMapReduceActivityTypeProperties model = BinaryData.fromString(
            "{\"storageLinkedServices\":[{\"referenceName\":\"xngspazmxssb\",\"parameters\":{\"cakkewgz\":\"datanatbecuh\",\"sjlqt\":\"datao\",\"hqjdihjo\":\"datajewezcknpmev\",\"l\":\"datadwahehudicx\"}},{\"referenceName\":\"mh\",\"parameters\":{\"jqvmpzcjvogr\":\"datavxoiwb\"}}],\"arguments\":[\"dataopzyd\",\"dataspwwkdm\",\"datan\",\"datazdumjqdhrgwyq\"],\"getDebugInfo\":\"None\",\"className\":\"dataelmqkbepie\",\"jarFilePath\":\"datasveaerg\",\"jarLinkedService\":{\"referenceName\":\"brnlbfnuppwqks\",\"parameters\":{\"xyphdkxwstabgejo\":\"datatjfkjboyggrmzt\",\"tgoeayhojdgw\":\"dataveg\",\"dpxbwqgk\":\"datazcrssmbdjzc\"}},\"jarLibs\":[\"datadtj\"],\"defines\":{\"csflemxbma\":\"datavvuddnwjp\",\"vhlobjpumpq\":\"dataivopftzbk\"}}")
            .toObject(HDInsightMapReduceActivityTypeProperties.class);
        Assertions.assertEquals("xngspazmxssb", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("brnlbfnuppwqks", model.jarLinkedService().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HDInsightMapReduceActivityTypeProperties model = new HDInsightMapReduceActivityTypeProperties()
            .withStorageLinkedServices(Arrays.asList(
                new LinkedServiceReference().withReferenceName("xngspazmxssb")
                    .withParameters(mapOf("cakkewgz", "datanatbecuh", "sjlqt", "datao", "hqjdihjo", "datajewezcknpmev",
                        "l", "datadwahehudicx")),
                new LinkedServiceReference().withReferenceName("mh")
                    .withParameters(mapOf("jqvmpzcjvogr", "datavxoiwb"))))
            .withArguments(Arrays.asList("dataopzyd", "dataspwwkdm", "datan", "datazdumjqdhrgwyq"))
            .withGetDebugInfo(HDInsightActivityDebugInfoOption.NONE).withClassName("dataelmqkbepie")
            .withJarFilePath("datasveaerg")
            .withJarLinkedService(new LinkedServiceReference().withReferenceName("brnlbfnuppwqks")
                .withParameters(mapOf("xyphdkxwstabgejo", "datatjfkjboyggrmzt", "tgoeayhojdgw", "dataveg", "dpxbwqgk",
                    "datazcrssmbdjzc")))
            .withJarLibs(Arrays.asList("datadtj"))
            .withDefines(mapOf("csflemxbma", "datavvuddnwjp", "vhlobjpumpq", "dataivopftzbk"));
        model = BinaryData.fromObject(model).toObject(HDInsightMapReduceActivityTypeProperties.class);
        Assertions.assertEquals("xngspazmxssb", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.NONE, model.getDebugInfo());
        Assertions.assertEquals("brnlbfnuppwqks", model.jarLinkedService().referenceName());
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
