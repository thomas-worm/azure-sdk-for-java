// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroupStatus;

public final class UpdateGroupStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateGroupStatus model =
            BinaryData
                .fromString(
                    "{\"status\":{\"startTime\":\"2021-09-28T09:51:37Z\",\"completedTime\":\"2021-11-19T23:57:57Z\",\"state\":\"Completed\"},\"name\":\"xerf\",\"members\":[{\"status\":{\"startTime\":\"2021-12-09T09:08:05Z\",\"completedTime\":\"2021-04-15T13:49:51Z\",\"state\":\"Stopped\"},\"name\":\"i\",\"clusterResourceId\":\"hxepcyvahfnlj\",\"operationId\":\"qxj\",\"message\":\"ujqgidok\"},{\"status\":{\"startTime\":\"2021-01-15T06:23:03Z\",\"completedTime\":\"2021-09-19T17:18:46Z\",\"state\":\"Completed\"},\"name\":\"ltbgsncghkj\",\"clusterResourceId\":\"zz\",\"operationId\":\"ijhtxf\",\"message\":\"xbf\"},{\"status\":{\"startTime\":\"2021-05-15T12:37:03Z\",\"completedTime\":\"2021-08-21T00:43:46Z\",\"state\":\"Running\"},\"name\":\"cxgod\",\"clusterResourceId\":\"fqkkr\",\"operationId\":\"pukgriwflzlfb\",\"message\":\"puz\"},{\"status\":{\"startTime\":\"2021-03-03T14:03:42Z\",\"completedTime\":\"2021-10-06T10:59:11Z\",\"state\":\"Stopped\"},\"name\":\"mgkbrpyydhibn\",\"clusterResourceId\":\"qkpikadrgvtqagnb\",\"operationId\":\"nhijggmebfsi\",\"message\":\"butr\"}]}")
                .toObject(UpdateGroupStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateGroupStatus model = new UpdateGroupStatus();
        model = BinaryData.fromObject(model).toObject(UpdateGroupStatus.class);
    }
}
