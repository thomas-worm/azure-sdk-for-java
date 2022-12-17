// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailabilityStatusesListBySubscriptionIdMockTests {
    @Test
    public void testListBySubscriptionId() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"lwhijcoejctbzaq\",\"name\":\"sycbkbfk\",\"type\":\"kdkexxp\",\"location\":\"fmxa\",\"properties\":{\"availabilityState\":\"Available\",\"title\":\"gddtocj\",\"summary\":\"hvpmoue\",\"detailedStatus\":\"dzxibqeojnxqbzvd\",\"reasonType\":\"t\",\"rootCauseAttributionTime\":\"2021-05-08T12:29:29Z\",\"healthEventType\":\"icbtwnpzao\",\"healthEventCause\":\"uhrhcffcyddgl\",\"healthEventCategory\":\"t\",\"healthEventId\":\"qkwpyeicxmqc\",\"resolutionETA\":\"2021-08-11T13:08:26Z\",\"occuredTime\":\"2021-01-16T07:23:11Z\",\"reasonChronicity\":\"Transient\",\"reportedTime\":\"2021-01-03T15:56:28Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-04-28T05:58:26Z\",\"resolvedTime\":\"2021-12-07T01:46:53Z\",\"unavailableSummary\":\"pbobjo\"},\"recommendedActions\":[],\"serviceImpactingEvents\":[]}}]}";

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

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailabilityStatus> response =
            manager.availabilityStatuses().listBySubscriptionId("aajrm", "djwzrlov", Context.NONE);

        Assertions.assertEquals("lwhijcoejctbzaq", response.iterator().next().id());
        Assertions.assertEquals("sycbkbfk", response.iterator().next().name());
        Assertions.assertEquals("kdkexxp", response.iterator().next().type());
        Assertions.assertEquals("fmxa", response.iterator().next().location());
        Assertions
            .assertEquals(
                AvailabilityStateValues.AVAILABLE, response.iterator().next().properties().availabilityState());
        Assertions.assertEquals("gddtocj", response.iterator().next().properties().title());
        Assertions.assertEquals("hvpmoue", response.iterator().next().properties().summary());
        Assertions.assertEquals("dzxibqeojnxqbzvd", response.iterator().next().properties().detailedStatus());
        Assertions.assertEquals("t", response.iterator().next().properties().reasonType());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-05-08T12:29:29Z"),
                response.iterator().next().properties().rootCauseAttributionTime());
        Assertions.assertEquals("icbtwnpzao", response.iterator().next().properties().healthEventType());
        Assertions.assertEquals("uhrhcffcyddgl", response.iterator().next().properties().healthEventCause());
        Assertions.assertEquals("t", response.iterator().next().properties().healthEventCategory());
        Assertions.assertEquals("qkwpyeicxmqc", response.iterator().next().properties().healthEventId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-08-11T13:08:26Z"), response.iterator().next().properties().resolutionEta());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-16T07:23:11Z"), response.iterator().next().properties().occuredTime());
        Assertions
            .assertEquals(ReasonChronicityTypes.TRANSIENT, response.iterator().next().properties().reasonChronicity());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-03T15:56:28Z"), response.iterator().next().properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-28T05:58:26Z"),
                response.iterator().next().properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-12-07T01:46:53Z"),
                response.iterator().next().properties().recentlyResolved().resolvedTime());
        Assertions
            .assertEquals("pbobjo", response.iterator().next().properties().recentlyResolved().unavailableSummary());
    }
}