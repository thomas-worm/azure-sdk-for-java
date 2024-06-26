// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CopyActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CopyActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyActivityTypeProperties model = BinaryData.fromString(
            "{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datajmtdnymbeeysk\",\"sourceRetryWait\":\"datalcaklesjgxdhgezy\",\"maxConcurrentConnections\":\"datahaokhbqmxgglkq\",\"disableMetricsCollection\":\"datapbynetyxuxopoc\",\"\":{\"sbouhmng\":\"datafggggl\",\"vswcpspaoxigpdi\":\"datacnkgius\"}},\"sink\":{\"type\":\"CopySink\",\"writeBatchSize\":\"datappgpqsm\",\"writeBatchTimeout\":\"datautnlynplxx\",\"sinkRetryCount\":\"dataogxk\",\"sinkRetryWait\":\"databcxbgfwwcfwlwnjg\",\"maxConcurrentConnections\":\"datamopcmetd\",\"disableMetricsCollection\":\"dataugimvief\",\"\":{\"n\":\"datasmiyjkhjuuepnjuq\",\"pxqs\":\"datajb\",\"isdwtug\":\"dataaxvq\"}},\"translator\":\"dataxup\",\"enableStaging\":\"datagcbwiw\",\"stagingSettings\":{\"linkedServiceName\":{\"referenceName\":\"joxxllhkzunnw\",\"parameters\":{\"evhyuuih\":\"dataxyawxkd\",\"qmcvu\":\"datap\",\"fiiif\":\"dataekubljnizwztlcr\"}},\"path\":\"datanfarmficqrd\",\"enableCompression\":\"datavtrulzlrm\",\"\":{\"xcgcdfel\":\"datasmpmhlcxb\",\"ygosuhroicjt\":\"dataapbdbicjzntiblx\"}},\"parallelCopies\":\"datadymoanpkcmdixiux\",\"dataIntegrationUnits\":\"datacalgspz\",\"enableSkipIncompatibleRow\":\"datafprzlvhohzkcsjd\",\"redirectIncompatibleRowSettings\":{\"linkedServiceName\":\"dataposmnmkypeqm\",\"path\":\"dataeox\",\"\":{\"hw\":\"dataulavxeaymfl\",\"a\":\"datafunptsryp\",\"tbxcj\":\"datakbwbxvs\"}},\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"ad\",\"parameters\":{\"nthluze\":\"datajquliovrc\",\"reasuwe\":\"datavalezkyfykm\",\"gtyt\":\"dataq\"}},\"path\":\"datacc\",\"logLevel\":\"datafutfqffwvnjgjry\",\"enableReliableLogging\":\"datahizwdswikyewv\",\"\":{\"ip\":\"datawqzwsg\",\"gjrfkqf\":\"dataqemeft\",\"kxk\":\"datadrel\"}},\"logSettings\":{\"enableCopyActivityLog\":\"datauaregjoybnoisbm\",\"copyActivityLogSettings\":{\"logLevel\":\"dataenrcqickhvps\",\"enableReliableLogging\":\"datauiuvingmonq\"},\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"ntyuq\",\"parameters\":{\"kydqy\":\"datayojzvaykfjgakays\"}},\"path\":\"datawmfwr\"}},\"preserveRules\":[\"datazg\",\"datavmuot\",\"datasea\"],\"preserve\":[\"datajampvwxlkhprlt\"],\"validateDataConsistency\":\"datap\",\"skipErrorFile\":{\"fileMissing\":\"datarbyqh\",\"dataInconsistency\":\"dataxbo\"}}")
            .toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("joxxllhkzunnw", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ad", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ntyuq", model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyActivityTypeProperties model = new CopyActivityTypeProperties()
            .withSource(new CopySource().withSourceRetryCount("datajmtdnymbeeysk")
                .withSourceRetryWait("datalcaklesjgxdhgezy").withMaxConcurrentConnections("datahaokhbqmxgglkq")
                .withDisableMetricsCollection("datapbynetyxuxopoc")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withSink(new CopySink().withWriteBatchSize("datappgpqsm").withWriteBatchTimeout("datautnlynplxx")
                .withSinkRetryCount("dataogxk").withSinkRetryWait("databcxbgfwwcfwlwnjg")
                .withMaxConcurrentConnections("datamopcmetd").withDisableMetricsCollection("dataugimvief")
                .withAdditionalProperties(mapOf("type", "CopySink")))
            .withTranslator("dataxup").withEnableStaging("datagcbwiw")
            .withStagingSettings(new StagingSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("joxxllhkzunnw")
                    .withParameters(mapOf("evhyuuih", "dataxyawxkd", "qmcvu", "datap", "fiiif", "dataekubljnizwztlcr")))
                .withPath("datanfarmficqrd").withEnableCompression("datavtrulzlrm").withAdditionalProperties(mapOf()))
            .withParallelCopies("datadymoanpkcmdixiux").withDataIntegrationUnits("datacalgspz")
            .withEnableSkipIncompatibleRow(
                "datafprzlvhohzkcsjd")
            .withRedirectIncompatibleRowSettings(
                new RedirectIncompatibleRowSettings().withLinkedServiceName("dataposmnmkypeqm").withPath(
                    "dataeox").withAdditionalProperties(
                        mapOf()))
            .withLogStorageSettings(new LogStorageSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ad")
                    .withParameters(mapOf("nthluze", "datajquliovrc", "reasuwe", "datavalezkyfykm", "gtyt", "dataq")))
                .withPath("datacc").withLogLevel("datafutfqffwvnjgjry").withEnableReliableLogging(
                    "datahizwdswikyewv")
                .withAdditionalProperties(mapOf()))
            .withLogSettings(new LogSettings().withEnableCopyActivityLog("datauaregjoybnoisbm")
                .withCopyActivityLogSettings(new CopyActivityLogSettings().withLogLevel("dataenrcqickhvps")
                    .withEnableReliableLogging("datauiuvingmonq"))
                .withLogLocationSettings(new LogLocationSettings().withLinkedServiceName(new LinkedServiceReference()
                    .withReferenceName("ntyuq").withParameters(mapOf("kydqy", "datayojzvaykfjgakays")))
                    .withPath("datawmfwr")))
            .withPreserveRules(Arrays.asList("datazg", "datavmuot", "datasea"))
            .withPreserve(Arrays.asList("datajampvwxlkhprlt")).withValidateDataConsistency("datap")
            .withSkipErrorFile(new SkipErrorFile().withFileMissing("datarbyqh").withDataInconsistency("dataxbo"));
        model = BinaryData.fromObject(model).toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("joxxllhkzunnw", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ad", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("ntyuq", model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
