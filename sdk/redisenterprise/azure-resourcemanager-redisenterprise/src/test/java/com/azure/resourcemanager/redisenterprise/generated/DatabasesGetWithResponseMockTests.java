// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager;
import com.azure.resourcemanager.redisenterprise.models.AofFrequency;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DatabasesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"clientProtocol\":\"Plaintext\",\"port\":435564330,\"provisioningState\":\"Canceled\",\"resourceState\":\"Deleting\",\"clusteringPolicy\":\"OSSCluster\",\"evictionPolicy\":\"AllKeysLFU\",\"persistence\":{\"aofEnabled\":false,\"rdbEnabled\":false,\"aofFrequency\":\"1s\",\"rdbFrequency\":\"1h\"},\"modules\":[{\"name\":\"hdzhlrqj\",\"args\":\"ck\",\"version\":\"lhrxsbkyvpyc\"},{\"name\":\"n\",\"args\":\"bpzkafkuwbc\",\"version\":\"wbme\"},{\"name\":\"hseyvju\",\"args\":\"tslhspkdeem\",\"version\":\"fm\"},{\"name\":\"ag\",\"args\":\"t\",\"version\":\"lmqkrhahvlj\"}],\"geoReplication\":{\"groupNickname\":\"aquhcdhm\",\"linkedDatabases\":[{\"id\":\"aex\",\"state\":\"Unlinking\"},{\"id\":\"adm\",\"state\":\"Linking\"},{\"id\":\"r\",\"state\":\"Unlinking\"},{\"id\":\"vgomz\",\"state\":\"Linking\"}]}},\"id\":\"isgwbnbbeldawkz\",\"name\":\"ali\",\"type\":\"urqhaka\"}";

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

        RedisEnterpriseManager manager = RedisEnterpriseManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        Database response = manager.databases()
            .getWithResponse("kqujidsuyono", "glaocq", "tcc", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(Protocol.PLAINTEXT, response.clientProtocol());
        Assertions.assertEquals(435564330, response.port());
        Assertions.assertEquals(ClusteringPolicy.OSSCLUSTER, response.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.ALL_KEYS_LFU, response.evictionPolicy());
        Assertions.assertEquals(false, response.persistence().aofEnabled());
        Assertions.assertEquals(false, response.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ONES, response.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.ONEH, response.persistence().rdbFrequency());
        Assertions.assertEquals("hdzhlrqj", response.modules().get(0).name());
        Assertions.assertEquals("ck", response.modules().get(0).args());
        Assertions.assertEquals("aquhcdhm", response.geoReplication().groupNickname());
        Assertions.assertEquals("aex", response.geoReplication().linkedDatabases().get(0).id());
    }
}
