// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of operation.
 */
public final class OperationKind extends ExpandableStringEnum<OperationKind> {
    /**
     * Build a new custom document model.
     */
    public static final OperationKind DOCUMENT_MODEL_BUILD = fromString("documentModelBuild");

    /**
     * Compose a new custom document model from existing models.
     */
    public static final OperationKind DOCUMENT_MODEL_COMPOSE = fromString("documentModelCompose");

    /**
     * Copy an existing document model to potentially a different resource, region, or subscription.
     */
    public static final OperationKind DOCUMENT_MODEL_COPY_TO = fromString("documentModelCopyTo");

    /**
     * Build a new custom classifier model.
     */
    public static final OperationKind DOCUMENT_CLASSIFIER_BUILD = fromString("documentClassifierBuild");

    /**
     * Creates a new instance of OperationKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OperationKind() {
    }

    /**
     * Creates or finds a OperationKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OperationKind.
     */
    public static OperationKind fromString(String name) {
        return fromString(name, OperationKind.class);
    }

    /**
     * Gets known OperationKind values.
     * 
     * @return known OperationKind values.
     */
    public static Collection<OperationKind> values() {
        return values(OperationKind.class);
    }
}
