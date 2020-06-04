// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.indexes.models.AnalyzeTextOptions;
import com.azure.search.documents.indexes.models.CharFilterName;
import com.azure.search.documents.indexes.models.LexicalAnalyzerName;
import com.azure.search.documents.indexes.models.LexicalTokenizerName;
import com.azure.search.documents.indexes.models.TokenFilterName;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.indexes.implementation.models.AnalyzeRequest} and
 * {@link AnalyzeTextOptions}.
 */
public final class AnalyzeRequestConverter {
    /**
     * Maps from {@link com.azure.search.documents.indexes.implementation.models.AnalyzeRequest} to {@link AnalyzeTextOptions}.
     */
    public static AnalyzeTextOptions map(com.azure.search.documents.indexes.implementation.models.AnalyzeRequest obj) {
        if (obj == null) {
            return null;
        }
        AnalyzeTextOptions analyzeTextOptions = new AnalyzeTextOptions();

        if (obj.getCharFilters() != null) {
            List<CharFilterName> charFilters =
                obj.getCharFilters().stream().map(CharFilterNameConverter::map).collect(Collectors.toList());
            analyzeTextOptions.setCharFilters(charFilters);
        }

        if (obj.getAnalyzer() != null) {
            LexicalAnalyzerName analyzer = LexicalAnalyzerNameConverter.map(obj.getAnalyzer());
            analyzeTextOptions.setAnalyzer(analyzer);
        }

        if (obj.getTokenFilters() != null) {
            List<TokenFilterName> tokenFilters =
                obj.getTokenFilters().stream().map(TokenFilterNameConverter::map).collect(Collectors.toList());
            analyzeTextOptions.setTokenFilters(tokenFilters);
        }

        String text = obj.getText();
        analyzeTextOptions.setText(text);

        if (obj.getTokenizer() != null) {
            LexicalTokenizerName tokenizer = LexicalTokenizerNameConverter.map(obj.getTokenizer());
            analyzeTextOptions.setTokenizer(tokenizer);
        }
        return analyzeTextOptions;
    }

    /**
     * Maps from {@link AnalyzeTextOptions} to {@link com.azure.search.documents.indexes.implementation.models.AnalyzeRequest}.
     */
    public static com.azure.search.documents.indexes.implementation.models.AnalyzeRequest map(AnalyzeTextOptions obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.indexes.implementation.models.AnalyzeRequest analyzeRequest =
            new com.azure.search.documents.indexes.implementation.models.AnalyzeRequest();

        if (obj.getCharFilters() != null) {
            List<com.azure.search.documents.indexes.implementation.models.CharFilterName> charFilters =
                obj.getCharFilters().stream().map(CharFilterNameConverter::map).collect(Collectors.toList());
            analyzeRequest.setCharFilters(charFilters);
        }

        if (obj.getAnalyzer() != null) {
            com.azure.search.documents.indexes.implementation.models.LexicalAnalyzerName analyzer =
                LexicalAnalyzerNameConverter.map(obj.getAnalyzer());
            analyzeRequest.setAnalyzer(analyzer);
        }

        if (obj.getTokenFilters() != null) {
            List<com.azure.search.documents.indexes.implementation.models.TokenFilterName> tokenFilters =
                obj.getTokenFilters().stream().map(TokenFilterNameConverter::map).collect(Collectors.toList());
            analyzeRequest.setTokenFilters(tokenFilters);
        }

        String text = obj.getText();
        analyzeRequest.setText(text);

        if (obj.getTokenizer() != null) {
            com.azure.search.documents.indexes.implementation.models.LexicalTokenizerName tokenizer =
                LexicalTokenizerNameConverter.map(obj.getTokenizer());
            analyzeRequest.setTokenizer(tokenizer);
        }
        return analyzeRequest;
    }

    private AnalyzeRequestConverter() {
    }
}
