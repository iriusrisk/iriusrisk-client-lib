/*
 * IriusRisk API
 * IriusRisk provides this featured API to allow for deeper customer integrations as well as enable very flexible automations within the many varied environments IriusRisk needs to operate.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iriusrisk.api.client;

import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for RulesApi
 */
@Ignore
public class RulesApiTest {

    private final RulesApi api = new RulesApi();

    
    /**
     * Executes rules by a product
     *
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rulesProductProductIdPutTest() {
        String productId = null;
        String deleteCountermeasures = null;
        api.rulesProductProductIdPut(productId, deleteCountermeasures);

        // TODO: test validations
    }
    
}
