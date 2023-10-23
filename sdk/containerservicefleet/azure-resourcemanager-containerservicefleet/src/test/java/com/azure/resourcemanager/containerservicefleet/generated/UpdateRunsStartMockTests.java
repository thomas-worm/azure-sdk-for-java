// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class UpdateRunsStartMockTests {
    @Test
    public void testStart() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"updateStrategyId\":\"pcdpumnz\",\"strategy\":{\"stages\":[{\"name\":\"z\",\"groups\":[{\"name\":\"biknsorgjhxbld\"},{\"name\":\"lwwrl\"}],\"afterStageWaitInSeconds\":49969250}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"Full\",\"kubernetesVersion\":\"cvokotllxdyhg\"},\"nodeImageSelection\":{\"type\":\"Latest\"}},\"status\":{\"status\":{\"startTime\":\"2021-05-19T11:15:04Z\",\"completedTime\":\"2021-03-24T02:03:23Z\",\"state\":\"Stopping\"},\"stages\":[{\"status\":{},\"name\":\"d\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{},{}]}}},\"eTag\":\"khnvpam\",\"id\":\"x\",\"name\":\"queziky\",\"type\":\"ggxkallatmelwuip\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ContainerServiceFleetManager manager =
            ContainerServiceFleetManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response =
            manager
                .updateRuns()
                .start("yzrpzbchckqqzq", "ox", "ysuiizynkedya", "rwyhqmibzyhwitsm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pcdpumnz", response.updateStrategyId());
        Assertions.assertEquals("z", response.strategy().stages().get(0).name());
        Assertions.assertEquals("biknsorgjhxbld", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(49969250, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions.assertEquals(ManagedClusterUpgradeType.FULL, response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("cvokotllxdyhg", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(NodeImageSelectionType.LATEST, response.managedClusterUpdate().nodeImageSelection().type());
    }
}
