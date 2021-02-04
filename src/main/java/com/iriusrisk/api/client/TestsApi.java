package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Body22;

import java.io.File;
import com.iriusrisk.api.client.model.InlineResponse2001;
import com.iriusrisk.api.client.model.InlineResponse2011;

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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-04T10:27:59.154+01:00")
@Component("com.iriusrisk.api.client.TestsApi")
public class TestsApi {
    private ApiClient apiClient;

    public TestsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TestsApi(ApiClient apiClient) {
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
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param componentId ID for component
     * @param cwe CWE for countermeasure or weakness
     * @param body Object that contains the information to update test
     * @return List&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InlineResponse2001> productsProductIdComponentsComponentIdTestsCwePut(String productId, String componentId, String cwe, Body22 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdComponentsComponentIdTestsCwePut");
        }
        
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentId' when calling productsProductIdComponentsComponentIdTestsCwePut");
        }
        
        // verify the required parameter 'cwe' is set
        if (cwe == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cwe' when calling productsProductIdComponentsComponentIdTestsCwePut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling productsProductIdComponentsComponentIdTestsCwePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        uriVariables.put("component-id", componentId);
        uriVariables.put("cwe", cwe);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/components/{component-id}/tests/{cwe}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "api_token" };

        ParameterizedTypeReference<List<InlineResponse2001>> returnType = new ParameterizedTypeReference<List<InlineResponse2001>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Imports test results from different sources to a component
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param componentId ID for component
     * @param type Type of test to be imported
     * @param fileName File to upload
     * @return InlineResponse2011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2011 productsProductIdComponentsComponentIdTestsTypeUploadPost(String productId, String componentId, String type, File fileName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdComponentsComponentIdTestsTypeUploadPost");
        }
        
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentId' when calling productsProductIdComponentsComponentIdTestsTypeUploadPost");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling productsProductIdComponentsComponentIdTestsTypeUploadPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        uriVariables.put("component-id", componentId);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/components/{component-id}/tests/{type}/upload").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        String[] authNames = new String[] { "api_token" };

        ParameterizedTypeReference<InlineResponse2011> returnType = new ParameterizedTypeReference<InlineResponse2011>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Imports test results from different sources to a product.
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param type Type of test to be imported
     * @param fileName File to upload
     * @return InlineResponse2011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2011 productsProductIdTestsTypeUploadPost(String productId, String type, File fileName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdTestsTypeUploadPost");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling productsProductIdTestsTypeUploadPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        uriVariables.put("type", type);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/tests/{type}/upload").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
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

        String[] authNames = new String[] { "api_token" };

        ParameterizedTypeReference<InlineResponse2011> returnType = new ParameterizedTypeReference<InlineResponse2011>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
