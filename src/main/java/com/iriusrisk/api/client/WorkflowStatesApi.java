package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.WorkflowState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")
@Component("com.iriusrisk.api.client.WorkflowStatesApi")
public class WorkflowStatesApi {
    private ApiClient apiClient;

    public WorkflowStatesApi() {
        this(new ApiClient());
    }

    @Autowired
    public WorkflowStatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List of all Workflow states.
     * Returns a list of all the workflow states. 
     * <p><b>200</b> - An array of workflow states
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return List&lt;WorkflowState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<WorkflowState> workflowstatesGet(String apiToken) throws RestClientException {
        return workflowstatesGetWithHttpInfo(apiToken).getBody();
    }

    /**
     * List of all Workflow states.
     * Returns a list of all the workflow states. 
     * <p><b>200</b> - An array of workflow states
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return ResponseEntity&lt;List&lt;WorkflowState&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<WorkflowState>> workflowstatesGetWithHttpInfo(String apiToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling workflowstatesGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/workflowstates").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<WorkflowState>> returnType = new ParameterizedTypeReference<List<WorkflowState>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
