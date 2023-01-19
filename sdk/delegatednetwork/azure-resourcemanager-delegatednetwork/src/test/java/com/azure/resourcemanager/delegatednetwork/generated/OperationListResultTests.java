// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.delegatednetwork.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"esnzwde\",\"isDataAction\":false,\"display\":{\"provider\":\"rxzdmohctbqvudwx\",\"resource\":\"dnvowg\",\"operation\":\"jugwdkcglhsl\",\"description\":\"jdyggdtji\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"},{\"name\":\"fqweykhmene\",\"isDataAction\":false,\"display\":{\"provider\":\"fwhybcibvy\",\"resource\":\"c\",\"operation\":\"tynnaamdectehfi\",\"description\":\"cj\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}],\"nextLink\":\"zrkgqhcjrefovg\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}