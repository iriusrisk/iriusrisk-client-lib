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

import com.iriusrisk.api.client.model.WorkflowState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for WorkflowStatesApi
 */
@Ignore
public class WorkflowStatesApiTest {

    private final WorkflowStatesApi api = new WorkflowStatesApi();

    
    /**
     * List of all Workflow states.
     *
     * Returns a list of all the workflow states. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowstatesGetTest() {
        List<WorkflowState> response = api.workflowstatesGet();

        // TODO: test validations
    }
    
}
