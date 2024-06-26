// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata information used by account encryption. */
@Fluent
public final class KeyVaultMetaInfo {
    /*
     * The resource identifier for the user managed Key Vault being used to encrypt.
     */
    @JsonProperty(value = "keyVaultResourceId", required = true)
    private String keyVaultResourceId;

    /*
     * The name of the user managed encryption key.
     */
    @JsonProperty(value = "encryptionKeyName", required = true)
    private String encryptionKeyName;

    /*
     * The version of the user managed encryption key.
     */
    @JsonProperty(value = "encryptionKeyVersion", required = true)
    private String encryptionKeyVersion;

    /** Creates an instance of KeyVaultMetaInfo class. */
    public KeyVaultMetaInfo() {
    }

    /**
     * Get the keyVaultResourceId property: The resource identifier for the user managed Key Vault being used to
     * encrypt.
     *
     * @return the keyVaultResourceId value.
     */
    public String keyVaultResourceId() {
        return this.keyVaultResourceId;
    }

    /**
     * Set the keyVaultResourceId property: The resource identifier for the user managed Key Vault being used to
     * encrypt.
     *
     * @param keyVaultResourceId the keyVaultResourceId value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withKeyVaultResourceId(String keyVaultResourceId) {
        this.keyVaultResourceId = keyVaultResourceId;
        return this;
    }

    /**
     * Get the encryptionKeyName property: The name of the user managed encryption key.
     *
     * @return the encryptionKeyName value.
     */
    public String encryptionKeyName() {
        return this.encryptionKeyName;
    }

    /**
     * Set the encryptionKeyName property: The name of the user managed encryption key.
     *
     * @param encryptionKeyName the encryptionKeyName value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withEncryptionKeyName(String encryptionKeyName) {
        this.encryptionKeyName = encryptionKeyName;
        return this;
    }

    /**
     * Get the encryptionKeyVersion property: The version of the user managed encryption key.
     *
     * @return the encryptionKeyVersion value.
     */
    public String encryptionKeyVersion() {
        return this.encryptionKeyVersion;
    }

    /**
     * Set the encryptionKeyVersion property: The version of the user managed encryption key.
     *
     * @param encryptionKeyVersion the encryptionKeyVersion value to set.
     * @return the KeyVaultMetaInfo object itself.
     */
    public KeyVaultMetaInfo withEncryptionKeyVersion(String encryptionKeyVersion) {
        this.encryptionKeyVersion = encryptionKeyVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultResourceId in model KeyVaultMetaInfo"));
        }
        if (encryptionKeyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property encryptionKeyName in model KeyVaultMetaInfo"));
        }
        if (encryptionKeyVersion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property encryptionKeyVersion in model KeyVaultMetaInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultMetaInfo.class);
}
