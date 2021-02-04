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

import com.iriusrisk.api.client.model.Body;

import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * Creates a new role
     *
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rolesPostTest() {
        Body body = null;
        api.rolesPost(body);

        // TODO: test validations
    }
    
    /**
     * Deletes an existing role
     *
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rolesRoleIdDeleteTest() {
        String roleId = null;
        api.rolesRoleIdDelete(roleId);

        // TODO: test validations
    }
    
}
