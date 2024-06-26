// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceStatus;
import com.azure.resourcemanager.databoxedge.models.SkuName;
import com.azure.resourcemanager.databoxedge.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DevicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"yqtfihwh\",\"tags\":{\"ngamvpphosz\":\"z\",\"nwcvtbvkayhmtnv\":\"zudphqamvdkfw\",\"zcjaesgvvsccy\":\"qiatkzwpcnp\"},\"sku\":{\"name\":\"Gateway\",\"tier\":\"Standard\"},\"etag\":\"wygzlvdnkfxusem\",\"properties\":{\"dataBoxEdgeDeviceStatus\":\"Online\",\"serialNumber\":\"uh\",\"description\":\"fcqdpsq\",\"modelDescription\":\"vpsvuoymgcce\",\"deviceType\":\"DataBoxEdgeDevice\",\"friendlyName\":\"rypqlmfeo\",\"culture\":\"rqwky\",\"deviceModel\":\"ob\",\"deviceSoftwareVersion\":\"gxedkow\",\"deviceLocalCapacity\":3513633078690758591,\"timeZone\":\"cr\",\"deviceHcsVersion\":\"bwccsnjvcdwxlpqe\",\"configuredRoleTypes\":[\"Functions\"],\"nodeCount\":2013442569},\"id\":\"tjsyin\",\"name\":\"wfqatmtd\",\"type\":\"tmdvypgikdgs\"}";

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

        DataBoxEdgeManager manager =
            DataBoxEdgeManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DataBoxEdgeDevice response =
            manager
                .devices()
                .getByResourceGroupWithResponse("ukndxdigrjgu", "fzdm", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("yqtfihwh", response.location());
        Assertions.assertEquals("z", response.tags().get("ngamvpphosz"));
        Assertions.assertEquals(SkuName.GATEWAY, response.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, response.sku().tier());
        Assertions.assertEquals("wygzlvdnkfxusem", response.etag());
        Assertions.assertEquals(DataBoxEdgeDeviceStatus.ONLINE, response.dataBoxEdgeDeviceStatus());
        Assertions.assertEquals("fcqdpsq", response.description());
        Assertions.assertEquals("vpsvuoymgcce", response.modelDescription());
        Assertions.assertEquals("rypqlmfeo", response.friendlyName());
    }
}
