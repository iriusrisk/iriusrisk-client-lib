package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Error;
import java.io.File;
import com.iriusrisk.api.client.model.InlineResponse2001;
import com.iriusrisk.api.client.model.InlineResponse2011;
import com.iriusrisk.api.client.model.UpdateStatusTestRequestBody;

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
@Component("com.iriusrisk.api.client.ComponentsApi")
public class ComponentsApi {
    private ApiClient apiClient;

    public ComponentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ComponentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Updates a single test to a component.
     * Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>200</b> - Tests updated
     * <p><b>400</b> - error in the call
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @return List&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InlineResponse2001> productsRefComponentsComponentRefTestsCwePut(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody) throws RestClientException {
        return productsRefComponentsComponentRefTestsCwePutWithHttpInfo(apiToken, ref, componentRef, cwe, updateStatusTestRequestBody).getBody();
    }

    /**
     * Updates a single test to a component.
     * Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>200</b> - Tests updated
     * <p><b>400</b> - error in the call
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @return ResponseEntity&lt;List&lt;InlineResponse2001&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InlineResponse2001>> productsRefComponentsComponentRefTestsCwePutWithHttpInfo(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody) throws RestClientException {
        Object postBody = updateStatusTestRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefTestsCwePut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefComponentsComponentRefTestsCwePut");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefTestsCwePut");
        }
        
        // verify the required parameter 'cwe' is set
        if (cwe == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cwe' when calling productsRefComponentsComponentRefTestsCwePut");
        }
        
        // verify the required parameter 'updateStatusTestRequestBody' is set
        if (updateStatusTestRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateStatusTestRequestBody' when calling productsRefComponentsComponentRefTestsCwePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("componentRef", componentRef);
        uriVariables.put("cwe", cwe);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/components/{componentRef}/tests/{cwe}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<InlineResponse2001>> returnType = new ParameterizedTypeReference<List<InlineResponse2001>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Imports test results from different sources to a component
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Error in the call. Misspelled or undefined test Type
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return InlineResponse2011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2011 productsRefComponentsComponentRefTestsTestTypeUploadPost(String apiToken, String ref, String componentRef, String testType, File fileName) throws RestClientException {
        return productsRefComponentsComponentRefTestsTestTypeUploadPostWithHttpInfo(apiToken, ref, componentRef, testType, fileName).getBody();
    }

    /**
     * Imports test results from different sources to a component
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Error in the call. Misspelled or undefined test Type
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return ResponseEntity&lt;InlineResponse2011&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2011> productsRefComponentsComponentRefTestsTestTypeUploadPostWithHttpInfo(String apiToken, String ref, String componentRef, String testType, File fileName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost");
        }
        
        // verify the required parameter 'testType' is set
        if (testType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testType' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("componentRef", componentRef);
        uriVariables.put("testType", testType);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/components/{componentRef}/tests/{testType}/upload").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        if (fileName != null)
            formParams.add("fileName", new FileSystemResource(fileName));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse2011> returnType = new ParameterizedTypeReference<InlineResponse2011>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
