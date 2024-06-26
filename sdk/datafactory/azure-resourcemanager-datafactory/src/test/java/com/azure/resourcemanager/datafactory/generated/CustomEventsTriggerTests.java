// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CustomEventsTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomEventsTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEventsTrigger model = BinaryData.fromString(
            "{\"type\":\"CustomEventsTrigger\",\"typeProperties\":{\"subjectBeginsWith\":\"lmytaeallsx\",\"subjectEndsWith\":\"antssbzmo\",\"events\":[\"dataj\"],\"scope\":\"nhmxkgxrf\"},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"wpzuxoynxlkloqp\",\"name\":\"aqcrefk\"},\"parameters\":{\"wecrvkiaognm\":\"datanzowpv\",\"prlqwjwpejtszj\":\"datanrz\",\"vwvycvnow\":\"datavj\"}},{\"pipelineReference\":{\"referenceName\":\"lij\",\"name\":\"lhxwwhusro\"},\"parameters\":{\"wkwmq\":\"datamozafwqmo\",\"aqassukv\":\"dataoqldacxo\"}}],\"description\":\"kzxznc\",\"runtimeState\":\"Disabled\",\"annotations\":[\"datanszmjzsjfc\"],\"\":{\"diirvx\":\"datakp\",\"miychdufla\":\"datahxyslhxokfoma\",\"yqp\":\"datasgutgzcbv\"}}")
            .toObject(CustomEventsTrigger.class);
        Assertions.assertEquals("kzxznc", model.description());
        Assertions.assertEquals("wpzuxoynxlkloqp", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("aqcrefk", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("lmytaeallsx", model.subjectBeginsWith());
        Assertions.assertEquals("antssbzmo", model.subjectEndsWith());
        Assertions.assertEquals("nhmxkgxrf", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEventsTrigger model
            = new CustomEventsTrigger().withDescription("kzxznc").withAnnotations(Arrays.asList("datanszmjzsjfc"))
                .withPipelines(Arrays.asList(
                    new TriggerPipelineReference()
                        .withPipelineReference(
                            new PipelineReference().withReferenceName("wpzuxoynxlkloqp").withName("aqcrefk"))
                        .withParameters(
                            mapOf("wecrvkiaognm", "datanzowpv", "prlqwjwpejtszj", "datanrz", "vwvycvnow", "datavj")),
                    new TriggerPipelineReference()
                        .withPipelineReference(new PipelineReference().withReferenceName("lij").withName("lhxwwhusro"))
                        .withParameters(mapOf("wkwmq", "datamozafwqmo", "aqassukv", "dataoqldacxo"))))
                .withSubjectBeginsWith("lmytaeallsx").withSubjectEndsWith("antssbzmo")
                .withEvents(Arrays.asList("dataj")).withScope("nhmxkgxrf");
        model = BinaryData.fromObject(model).toObject(CustomEventsTrigger.class);
        Assertions.assertEquals("kzxznc", model.description());
        Assertions.assertEquals("wpzuxoynxlkloqp", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("aqcrefk", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("lmytaeallsx", model.subjectBeginsWith());
        Assertions.assertEquals("antssbzmo", model.subjectEndsWith());
        Assertions.assertEquals("nhmxkgxrf", model.scope());
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
