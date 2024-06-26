// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ProfileList;
import org.junit.jupiter.api.Assertions;

public final class ProfileListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProfileList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"resourceState\":\"Disabling\",\"enabledState\":\"Enabled\"},\"etag\":\"zi\",\"location\":\"fjawneaivxwczel\",\"tags\":{\"lsfeaenwabfatkld\":\"r\",\"oulpjrv\":\"xbjhwuaanozjosph\"},\"id\":\"ag\",\"name\":\"rvimjwosytxitcsk\",\"type\":\"cktqumiekkezzi\"},{\"properties\":{\"resourceState\":\"Disabling\",\"enabledState\":\"Disabled\"},\"etag\":\"dgqggebdu\",\"location\":\"ygaeqidbqfatpxl\",\"tags\":{\"dmjsjqb\":\"cyjmoadsuvarmy\",\"yc\":\"hhyxxrw\",\"kgymareqnajxqug\":\"duhpk\",\"ubeddg\":\"hky\"},\"id\":\"sofwqmzqalkrmnji\",\"name\":\"pxacqqudfn\",\"type\":\"yxbaaabjyvayf\"},{\"properties\":{\"resourceState\":\"Enabled\",\"enabledState\":\"Enabled\"},\"etag\":\"uzqogsexnevf\",\"location\":\"nwnwme\",\"tags\":{\"judpfrxt\":\"yyceuzsoi\",\"paxh\":\"thzvaytdwkqbrqu\",\"qoaxoruzfgs\":\"xiilivpdtiirqt\",\"zwl\":\"uyfxrxxleptramxj\"},\"id\":\"nwxuqlcvydyp\",\"name\":\"tdooaoj\",\"type\":\"niodkooeb\"},{\"properties\":{\"resourceState\":\"Disabled\",\"enabledState\":\"Disabled\"},\"etag\":\"msbvdkcrodtjinf\",\"location\":\"jlfltkacjvefkdlf\",\"tags\":{\"qblylsyxkqj\":\"ggkfpagaowpul\",\"gxsds\":\"sjervti\"},\"id\":\"uem\",\"name\":\"sbzkf\",\"type\":\"beyvpnqicvinvkjj\"}],\"nextLink\":\"xrbuukzclew\"}")
                .toObject(ProfileList.class);
        Assertions.assertEquals("xrbuukzclew", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProfileList model = new ProfileList().withNextLink("xrbuukzclew");
        model = BinaryData.fromObject(model).toObject(ProfileList.class);
        Assertions.assertEquals("xrbuukzclew", model.nextLink());
    }
}
