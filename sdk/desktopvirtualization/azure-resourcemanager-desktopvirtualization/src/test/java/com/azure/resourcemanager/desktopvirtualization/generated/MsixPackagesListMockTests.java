// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackage;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MsixPackagesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"imagePath\":\"y\",\"packageName\":\"eseyqr\",\"packageFamilyName\":\"y\",\"displayName\":\"dotjvdk\",\"packageRelativePath\":\"swskuk\",\"isRegularRegistration\":false,\"isActive\":false,\"packageDependencies\":[{\"dependencyName\":\"spkxkdt\",\"publisher\":\"kndlqvtwknvg\",\"minVersion\":\"bugtywatmqa\"},{\"dependencyName\":\"ueatgroe\",\"publisher\":\"oygzcbyfqxkfao\",\"minVersion\":\"ehqpuvjmvqmt\"}],\"version\":\"ckygroejnndljdju\",\"lastUpdated\":\"2021-01-30T20:23Z\",\"packageApplications\":[{\"appId\":\"qyn\",\"description\":\"eysfaqegplw\",\"appUserModelID\":\"shwddkvbxgk\",\"friendlyName\":\"sybwptdaca\",\"iconImageName\":\"vlf\"}]},\"id\":\"mt\",\"name\":\"oiwenazerohzrsq\",\"type\":\"lsxkd\"}]}";

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

        DesktopVirtualizationManager manager =
            DesktopVirtualizationManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<MsixPackage> response =
            manager
                .msixPackages()
                .list("napfdqwowftpt", "uwjtks", 162312753, true, 585871352, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("y", response.iterator().next().imagePath());
        Assertions.assertEquals("eseyqr", response.iterator().next().packageName());
        Assertions.assertEquals("y", response.iterator().next().packageFamilyName());
        Assertions.assertEquals("dotjvdk", response.iterator().next().displayName());
        Assertions.assertEquals("swskuk", response.iterator().next().packageRelativePath());
        Assertions.assertEquals(false, response.iterator().next().isRegularRegistration());
        Assertions.assertEquals(false, response.iterator().next().isActive());
        Assertions.assertEquals("spkxkdt", response.iterator().next().packageDependencies().get(0).dependencyName());
        Assertions.assertEquals("kndlqvtwknvg", response.iterator().next().packageDependencies().get(0).publisher());
        Assertions.assertEquals("bugtywatmqa", response.iterator().next().packageDependencies().get(0).minVersion());
        Assertions.assertEquals("ckygroejnndljdju", response.iterator().next().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-30T20:23Z"), response.iterator().next().lastUpdated());
        Assertions.assertEquals("qyn", response.iterator().next().packageApplications().get(0).appId());
        Assertions.assertEquals("eysfaqegplw", response.iterator().next().packageApplications().get(0).description());
        Assertions
            .assertEquals("shwddkvbxgk", response.iterator().next().packageApplications().get(0).appUserModelId());
        Assertions.assertEquals("sybwptdaca", response.iterator().next().packageApplications().get(0).friendlyName());
        Assertions.assertEquals("vlf", response.iterator().next().packageApplications().get(0).iconImageName());
    }
}
