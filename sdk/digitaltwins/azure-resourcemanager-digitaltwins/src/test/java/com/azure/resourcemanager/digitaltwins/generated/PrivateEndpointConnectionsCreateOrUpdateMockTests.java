// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.models.ConnectionProperties;
import com.azure.resourcemanager.digitaltwins.models.ConnectionPropertiesPrivateLinkServiceConnectionState;
import com.azure.resourcemanager.digitaltwins.models.PrivateEndpoint;
import com.azure.resourcemanager.digitaltwins.models.PrivateEndpointConnection;
import com.azure.resourcemanager.digitaltwins.models.PrivateLinkServiceConnectionStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{\"id\":\"gtdsslswt\"},\"groupIds\":[\"riofzpyqse\",\"wab\",\"ets\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"zhedplvwiw\",\"actionsRequired\":\"mwmbes\"}},\"id\":\"nkww\",\"name\":\"pp\",\"type\":\"flcxoga\"}";

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

        AzureDigitalTwinsManager manager =
            AzureDigitalTwinsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .privateEndpointConnections()
                .define("bgycduiertgccym")
                .withExistingDigitalTwinsInstance("ynduha", "hqlkthumaqo")
                .withProperties(
                    new ConnectionProperties()
                        .withPrivateEndpoint(new PrivateEndpoint())
                        .withGroupIds(Arrays.asList("mmdnbbglzps", "iydmcwyhzdxs"))
                        .withPrivateLinkServiceConnectionState(
                            new ConnectionPropertiesPrivateLinkServiceConnectionState()
                                .withStatus(PrivateLinkServiceConnectionStatus.PENDING)
                                .withDescription("bzmnvdfznud")
                                .withActionsRequired("dvxzbncblylpst")))
                .create();

        Assertions.assertEquals("riofzpyqse", response.properties().groupIds().get(0));
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED,
                response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("zhedplvwiw", response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mwmbes", response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
