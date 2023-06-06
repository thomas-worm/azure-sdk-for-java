// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.databricks.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.databricks.models.PrivateEndpointConnectionsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\"},\"id\":\"ulpkudjkrl\",\"name\":\"hbzhfepg\",\"type\":\"gqexzlocxs\"},{\"properties\":{\"provisioningState\":\"Creating\"},\"id\":\"erhhbcsglumm\",\"name\":\"jtjaodxobnbdxkq\",\"type\":\"xo\"}],\"nextLink\":\"jionpimexgstxgc\"}")
                .toObject(PrivateEndpointConnectionsList.class);
        Assertions.assertEquals("jionpimexgstxgc", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionsList model =
            new PrivateEndpointConnectionsList()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner()
                                .withProperties(new PrivateEndpointConnectionProperties()),
                            new PrivateEndpointConnectionInner()
                                .withProperties(new PrivateEndpointConnectionProperties())))
                .withNextLink("jionpimexgstxgc");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionsList.class);
        Assertions.assertEquals("jionpimexgstxgc", model.nextLink());
    }
}
