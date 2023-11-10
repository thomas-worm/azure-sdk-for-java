// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Formula kind. */
public final class DocumentFormulaKind extends ExpandableStringEnum<DocumentFormulaKind> {
    /** A formula embedded within the content of a paragraph. */
    @Generated public static final DocumentFormulaKind INLINE = fromString("inline");

    /** A formula in display mode that takes up an entire line. */
    @Generated public static final DocumentFormulaKind DISPLAY = fromString("display");

    /**
     * Creates a new instance of DocumentFormulaKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public DocumentFormulaKind() {}

    /**
     * Creates or finds a DocumentFormulaKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentFormulaKind.
     */
    @Generated
    @JsonCreator
    public static DocumentFormulaKind fromString(String name) {
        return fromString(name, DocumentFormulaKind.class);
    }

    /**
     * Gets known DocumentFormulaKind values.
     *
     * @return known DocumentFormulaKind values.
     */
    @Generated
    public static Collection<DocumentFormulaKind> values() {
        return values(DocumentFormulaKind.class);
    }
}
