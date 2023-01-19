// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.Schedule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GlobalSchedulesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"qwjksghudgz\",\"weeklyRecurrence\":{\"weekdays\":[],\"time\":\"jggsvo\"},\"dailyRecurrence\":{\"time\":\"xibdafhrkmdyo\"},\"hourlyRecurrence\":{\"minute\":1959978066},\"timeZoneId\":\"vfb\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":1884619578,\"webhookUrl\":\"wpg\",\"emailRecipient\":\"eimawzovgkkumui\",\"notificationLocale\":\"cjc\"},\"createdDate\":\"2021-04-22T19:07:29Z\",\"targetResourceId\":\"wsnsqowx\",\"provisioningState\":\"omlik\",\"uniqueIdentifier\":\"wvczcswkacve\"},\"location\":\"yfdvlvhbwrnfxtgd\",\"tags\":{\"hn\":\"th\"},\"id\":\"naoyank\",\"name\":\"oe\",\"type\":\"swankltytmh\"}]}";

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

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Schedule> response =
            manager
                .globalSchedules()
                .list("qobbpihehcec", "bmrqbrjbbmp", 72464986, "lvykfrex", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yfdvlvhbwrnfxtgd", response.iterator().next().location());
        Assertions.assertEquals("th", response.iterator().next().tags().get("hn"));
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().status());
        Assertions.assertEquals("qwjksghudgz", response.iterator().next().taskType());
        Assertions.assertEquals("jggsvo", response.iterator().next().weeklyRecurrence().time());
        Assertions.assertEquals("xibdafhrkmdyo", response.iterator().next().dailyRecurrence().time());
        Assertions.assertEquals(1959978066, response.iterator().next().hourlyRecurrence().minute());
        Assertions.assertEquals("vfb", response.iterator().next().timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, response.iterator().next().notificationSettings().status());
        Assertions.assertEquals(1884619578, response.iterator().next().notificationSettings().timeInMinutes());
        Assertions.assertEquals("wpg", response.iterator().next().notificationSettings().webhookUrl());
        Assertions.assertEquals("eimawzovgkkumui", response.iterator().next().notificationSettings().emailRecipient());
        Assertions.assertEquals("cjc", response.iterator().next().notificationSettings().notificationLocale());
        Assertions.assertEquals("wsnsqowx", response.iterator().next().targetResourceId());
    }
}