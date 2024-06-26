// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthcareapis.models.Workspace;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkspacesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Suspended\",\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"ffgcvizqz\",\"name\":\"wlvwlyoupf\",\"type\":\"fbkjubdyhgkfmi\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Succeeded\"},\"id\":\"zfttsttktlahb\",\"name\":\"actxtgzukxitm\",\"type\":\"qtgqqqxhrnxr\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"isavok\",\"name\":\"dzf\",\"type\":\"azivjlfrqttbajl\"},{\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"xyiopidkqqfku\",\"name\":\"s\",\"type\":\"xkdmligo\"}],\"publicNetworkAccess\":\"Enabled\"},\"tags\":{\"goorbteo\":\"pmloazuruoc\",\"r\":\"bfhjxakvvjgsl\"},\"location\":\"lmywwtkgkxnyed\",\"etag\":\"gyvudtjuewbc\",\"id\":\"hxuuwhcjyxccybvp\",\"name\":\"yakk\",\"type\":\"dzpxgwjpl\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        HealthcareApisManager manager = HealthcareApisManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Workspace response = manager.workspaces()
            .getByResourceGroupWithResponse("pi", "lqol", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("gyvudtjuewbc", response.etag());
        Assertions.assertEquals("lmywwtkgkxnyed", response.location());
        Assertions.assertEquals("pmloazuruoc", response.tags().get("goorbteo"));
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.properties().publicNetworkAccess());
    }
}
