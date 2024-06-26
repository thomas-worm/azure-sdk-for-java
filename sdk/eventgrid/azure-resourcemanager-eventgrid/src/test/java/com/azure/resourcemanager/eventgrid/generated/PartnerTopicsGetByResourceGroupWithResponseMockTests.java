// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopic;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PartnerTopicsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"partnerRegistrationImmutableId\":\"14348f14-a4cb-4c1e-ad0e-85f8f0c74604\",\"source\":\"iuorinikc\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"nupoyryefqmwovyz\":{\"description\":\"wmmtmqrxrzq\",\"displayName\":\"yczyayubtgm\",\"documentationUrl\":\"iqahragpx\",\"dataSchemaUrl\":\"bp\"},\"dui\":{\"description\":\"lnomfpb\",\"displayName\":\"eegvyieztkutnj\",\"documentationUrl\":\"l\",\"dataSchemaUrl\":\"krehyhtmj\"},\"oqbmdqrx\":{\"description\":\"ulxfaryrvjl\",\"displayName\":\"ezvjq\",\"documentationUrl\":\"hoyiyaxqvjweiw\",\"dataSchemaUrl\":\"zkddnvovb\"},\"omehx\":{\"description\":\"laetscflwtjdtlr\",\"displayName\":\"fooy\",\"documentationUrl\":\"uxdtzcq\",\"dataSchemaUrl\":\"sdudgcoz\"}}},\"expirationTimeIfNotActivatedUtc\":\"2021-08-28T06:18:18Z\",\"provisioningState\":\"Creating\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"lbij\",\"messageForActivation\":\"kqllczipvwdt\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"iqdlratrkw\",\"tenantId\":\"auwxsuykznhrfgsl\",\"userAssignedIdentities\":{\"pajtfeyvkbd\":{\"principalId\":\"ry\",\"clientId\":\"zihuioaeo\"},\"ijcxfno\":{\"principalId\":\"dkrhdccxbe\",\"clientId\":\"qutkzwtjwwguzy\"},\"a\":{\"principalId\":\"egjdydhqkk\",\"clientId\":\"juck\"},\"idtoakat\":{\"principalId\":\"qbhpowcnx\",\"clientId\":\"zdlys\"}}},\"location\":\"rytgrhzbqfdpfawr\",\"tags\":{\"d\":\"cshtkutzcttbqgdi\",\"jf\":\"mmtzjgc\"},\"id\":\"tbwjjirmuydgftt\",\"name\":\"dofgeoagfuoftnx\",\"type\":\"dwxmda\"}";

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

        EventGridManager manager = EventGridManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PartnerTopic response = manager.partnerTopics()
            .getByResourceGroupWithResponse("cboe", "rgttw", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("rytgrhzbqfdpfawr", response.location());
        Assertions.assertEquals("cshtkutzcttbqgdi", response.tags().get("d"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals("iqdlratrkw", response.identity().principalId());
        Assertions.assertEquals("auwxsuykznhrfgsl", response.identity().tenantId());
        Assertions.assertEquals("ry", response.identity().userAssignedIdentities().get("pajtfeyvkbd").principalId());
        Assertions.assertEquals("zihuioaeo",
            response.identity().userAssignedIdentities().get("pajtfeyvkbd").clientId());
        Assertions.assertEquals(UUID.fromString("14348f14-a4cb-4c1e-ad0e-85f8f0c74604"),
            response.partnerRegistrationImmutableId());
        Assertions.assertEquals("iuorinikc", response.source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, response.eventTypeInfo().kind());
        Assertions.assertEquals("wmmtmqrxrzq",
            response.eventTypeInfo().inlineEventTypes().get("nupoyryefqmwovyz").description());
        Assertions.assertEquals("yczyayubtgm",
            response.eventTypeInfo().inlineEventTypes().get("nupoyryefqmwovyz").displayName());
        Assertions.assertEquals("iqahragpx",
            response.eventTypeInfo().inlineEventTypes().get("nupoyryefqmwovyz").documentationUrl());
        Assertions.assertEquals("bp",
            response.eventTypeInfo().inlineEventTypes().get("nupoyryefqmwovyz").dataSchemaUrl());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-28T06:18:18Z"),
            response.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, response.activationState());
        Assertions.assertEquals("lbij", response.partnerTopicFriendlyDescription());
        Assertions.assertEquals("kqllczipvwdt", response.messageForActivation());
    }
}
