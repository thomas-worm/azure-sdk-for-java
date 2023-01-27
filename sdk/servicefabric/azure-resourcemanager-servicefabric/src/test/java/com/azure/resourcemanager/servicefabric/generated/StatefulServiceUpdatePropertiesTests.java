// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.MoveCost;
import com.azure.resourcemanager.servicefabric.models.ServiceCorrelationDescription;
import com.azure.resourcemanager.servicefabric.models.ServiceCorrelationScheme;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabric.models.ServicePlacementPolicyDescription;
import com.azure.resourcemanager.servicefabric.models.StatefulServiceUpdateProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StatefulServiceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StatefulServiceUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"serviceKind\":\"Stateful\",\"targetReplicaSetSize\":895181053,\"minReplicaSetSize\":1756222146,\"replicaRestartWaitDuration\":\"2021-04-30T02:05:54Z\",\"quorumLossWaitDuration\":\"2021-11-07T07:11:51Z\",\"standByReplicaKeepDuration\":\"2021-02-27T05:40:13Z\",\"placementConstraints\":\"infwjlfltkacjve\",\"correlationScheme\":[{\"scheme\":\"Affinity\",\"serviceName\":\"foakgg\"},{\"scheme\":\"AlignedAffinity\",\"serviceName\":\"pagao\"},{\"scheme\":\"NonAlignedAffinity\",\"serviceName\":\"ulpqblylsyxkqjn\"}],\"serviceLoadMetrics\":[{\"name\":\"r\",\"weight\":\"High\",\"primaryDefaultLoad\":1109301596,\"secondaryDefaultLoad\":1353667842,\"defaultLoad\":424844999},{\"name\":\"zuempsbzkf\",\"weight\":\"High\",\"primaryDefaultLoad\":160788729,\"secondaryDefaultLoad\":1897106699,\"defaultLoad\":881779477},{\"name\":\"cvinvkjjxdxrbuuk\",\"weight\":\"Medium\",\"primaryDefaultLoad\":1398026456,\"secondaryDefaultLoad\":737609208,\"defaultLoad\":332964812}],\"servicePlacementPolicies\":[{\"type\":\"ServicePlacementPolicyDescription\"},{\"type\":\"ServicePlacementPolicyDescription\"},{\"type\":\"ServicePlacementPolicyDescription\"}],\"defaultMoveCost\":\"Zero\"}")
                .toObject(StatefulServiceUpdateProperties.class);
        Assertions.assertEquals("infwjlfltkacjve", model.placementConstraints());
        Assertions.assertEquals(ServiceCorrelationScheme.AFFINITY, model.correlationScheme().get(0).scheme());
        Assertions.assertEquals("foakgg", model.correlationScheme().get(0).serviceName());
        Assertions.assertEquals("r", model.serviceLoadMetrics().get(0).name());
        Assertions.assertEquals(ServiceLoadMetricWeight.HIGH, model.serviceLoadMetrics().get(0).weight());
        Assertions.assertEquals(1109301596, model.serviceLoadMetrics().get(0).primaryDefaultLoad());
        Assertions.assertEquals(1353667842, model.serviceLoadMetrics().get(0).secondaryDefaultLoad());
        Assertions.assertEquals(424844999, model.serviceLoadMetrics().get(0).defaultLoad());
        Assertions.assertEquals(MoveCost.ZERO, model.defaultMoveCost());
        Assertions.assertEquals(895181053, model.targetReplicaSetSize());
        Assertions.assertEquals(1756222146, model.minReplicaSetSize());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T02:05:54Z"), model.replicaRestartWaitDuration());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-07T07:11:51Z"), model.quorumLossWaitDuration());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-27T05:40:13Z"), model.standByReplicaKeepDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StatefulServiceUpdateProperties model =
            new StatefulServiceUpdateProperties()
                .withPlacementConstraints("infwjlfltkacjve")
                .withCorrelationScheme(
                    Arrays
                        .asList(
                            new ServiceCorrelationDescription()
                                .withScheme(ServiceCorrelationScheme.AFFINITY)
                                .withServiceName("foakgg"),
                            new ServiceCorrelationDescription()
                                .withScheme(ServiceCorrelationScheme.ALIGNED_AFFINITY)
                                .withServiceName("pagao"),
                            new ServiceCorrelationDescription()
                                .withScheme(ServiceCorrelationScheme.NON_ALIGNED_AFFINITY)
                                .withServiceName("ulpqblylsyxkqjn")))
                .withServiceLoadMetrics(
                    Arrays
                        .asList(
                            new ServiceLoadMetricDescription()
                                .withName("r")
                                .withWeight(ServiceLoadMetricWeight.HIGH)
                                .withPrimaryDefaultLoad(1109301596)
                                .withSecondaryDefaultLoad(1353667842)
                                .withDefaultLoad(424844999),
                            new ServiceLoadMetricDescription()
                                .withName("zuempsbzkf")
                                .withWeight(ServiceLoadMetricWeight.HIGH)
                                .withPrimaryDefaultLoad(160788729)
                                .withSecondaryDefaultLoad(1897106699)
                                .withDefaultLoad(881779477),
                            new ServiceLoadMetricDescription()
                                .withName("cvinvkjjxdxrbuuk")
                                .withWeight(ServiceLoadMetricWeight.MEDIUM)
                                .withPrimaryDefaultLoad(1398026456)
                                .withSecondaryDefaultLoad(737609208)
                                .withDefaultLoad(332964812)))
                .withServicePlacementPolicies(
                    Arrays
                        .asList(
                            new ServicePlacementPolicyDescription(),
                            new ServicePlacementPolicyDescription(),
                            new ServicePlacementPolicyDescription()))
                .withDefaultMoveCost(MoveCost.ZERO)
                .withTargetReplicaSetSize(895181053)
                .withMinReplicaSetSize(1756222146)
                .withReplicaRestartWaitDuration(OffsetDateTime.parse("2021-04-30T02:05:54Z"))
                .withQuorumLossWaitDuration(OffsetDateTime.parse("2021-11-07T07:11:51Z"))
                .withStandByReplicaKeepDuration(OffsetDateTime.parse("2021-02-27T05:40:13Z"));
        model = BinaryData.fromObject(model).toObject(StatefulServiceUpdateProperties.class);
        Assertions.assertEquals("infwjlfltkacjve", model.placementConstraints());
        Assertions.assertEquals(ServiceCorrelationScheme.AFFINITY, model.correlationScheme().get(0).scheme());
        Assertions.assertEquals("foakgg", model.correlationScheme().get(0).serviceName());
        Assertions.assertEquals("r", model.serviceLoadMetrics().get(0).name());
        Assertions.assertEquals(ServiceLoadMetricWeight.HIGH, model.serviceLoadMetrics().get(0).weight());
        Assertions.assertEquals(1109301596, model.serviceLoadMetrics().get(0).primaryDefaultLoad());
        Assertions.assertEquals(1353667842, model.serviceLoadMetrics().get(0).secondaryDefaultLoad());
        Assertions.assertEquals(424844999, model.serviceLoadMetrics().get(0).defaultLoad());
        Assertions.assertEquals(MoveCost.ZERO, model.defaultMoveCost());
        Assertions.assertEquals(895181053, model.targetReplicaSetSize());
        Assertions.assertEquals(1756222146, model.minReplicaSetSize());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T02:05:54Z"), model.replicaRestartWaitDuration());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-07T07:11:51Z"), model.quorumLossWaitDuration());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-27T05:40:13Z"), model.standByReplicaKeepDuration());
    }
}