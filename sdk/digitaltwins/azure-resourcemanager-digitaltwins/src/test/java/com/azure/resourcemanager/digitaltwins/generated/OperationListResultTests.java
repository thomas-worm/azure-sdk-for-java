// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.OperationListResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationListResultTests {
    @Test
    public void testDeserialize() {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"m\",\"value\":[{\"name\":\"z\",\"display\":{\"provider\":\"vtpgvdfgiotkf\",\"resource\":\"tqxln\",\"operation\":\"lefgugnxk\",\"description\":\"dqmidtt\"},\"origin\":\"rvqdra\",\"isDataAction\":false,\"properties\":{\"fbowskanyk\":\"dataigeho\"}},{\"name\":\"lcuiywgqywgndr\",\"display\":{\"provider\":\"hzgpphrcgyncocpe\",\"resource\":\"vmmcoofs\",\"operation\":\"zevgb\",\"description\":\"jqabcypmivkwlzuv\"},\"origin\":\"fwnfnb\",\"isDataAction\":false,\"properties\":{\"nqbqqwxr\":\"datanlebxetqgtzxd\",\"isnjampmngnz\":\"datafeallnwsu\",\"aqw\":\"datac\",\"xnj\":\"dataochcbonqvpkvl\"}},{\"name\":\"seiphe\",\"display\":{\"provider\":\"okeyyienj\",\"resource\":\"lwtgrhpdj\",\"operation\":\"umasxazjpq\",\"description\":\"gual\"},\"origin\":\"xxhejjzzvd\",\"isDataAction\":true,\"properties\":{\"ynpwlbj\":\"dataslfhotwm\",\"sop\":\"datapgacftadehxnlty\",\"nzwdejba\":\"datausue\"}},{\"name\":\"rxzdmohctbqvudwx\",\"display\":{\"provider\":\"nvowgujju\",\"resource\":\"dkcglhsl\",\"operation\":\"jdyggdtji\",\"description\":\"b\"},\"origin\":\"ofqweykhmenevfye\",\"isDataAction\":false,\"properties\":{\"amdecte\":\"databcibvyvdcsitynn\",\"qsc\":\"dataf\",\"hcjrefovgmk\":\"dataeypvhezrkg\",\"yvxyqjp\":\"datasle\"}}]}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals("m", model.nextLink());
    }

    @Test
    public void testSerialize() {
        OperationListResult model = new OperationListResult().withNextLink("m");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("m", model.nextLink());
    }
}
