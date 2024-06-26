// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection of participants belong to a particular thread.
 */
@Fluent
public final class ChatParticipantsCollection {
    /*
     * Chat participants.
     */
    @JsonProperty(value = "value", required = true)
    private List<ChatParticipant> value;

    /*
     * If there are more chat participants that can be retrieved, the next link will be populated.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ChatParticipantsCollection class.
     */
    public ChatParticipantsCollection() {
    }

    /**
     * Get the value property: Chat participants.
     * 
     * @return the value value.
     */
    public List<ChatParticipant> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Chat participants.
     * 
     * @param value the value value to set.
     * @return the ChatParticipantsCollection object itself.
     */
    public ChatParticipantsCollection setValue(List<ChatParticipant> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: If there are more chat participants that can be retrieved, the next link will be
     * populated.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
