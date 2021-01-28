package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssignGroupsProductRequestBody;
import com.iriusrisk.api.client.model.AssignUsersProductRequestBody;
import com.iriusrisk.api.client.model.ComponentControl;
import com.iriusrisk.api.client.model.ComponentUseCaseThreatShort;
import com.iriusrisk.api.client.model.ComponentWeakness;
import com.iriusrisk.api.client.model.ControlsId;
import com.iriusrisk.api.client.model.CreateProduct;
import com.iriusrisk.api.client.model.Error;
import java.io.File;
import com.iriusrisk.api.client.model.InlineResponse200;
import com.iriusrisk.api.client.model.InlineResponse2001;
import com.iriusrisk.api.client.model.InlineResponse2011;
import com.iriusrisk.api.client.model.Product;
import com.iriusrisk.api.client.model.ProductShort;
import com.iriusrisk.api.client.model.ProductShortGroups;
import com.iriusrisk.api.client.model.ProductShortUsers;
import com.iriusrisk.api.client.model.RiskSummary;
import com.iriusrisk.api.client.model.UnassignGroupsProductRequestBody;
import com.iriusrisk.api.client.model.UnassignUsersProductRequestBody;
import com.iriusrisk.api.client.model.UpdateProduct;
import com.iriusrisk.api.client.model.UpdateStatusCountermeasureRequestBody;
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
@Component("com.iriusrisk.api.client.ProductsApi")
public class ProductsApi {
    private ApiClient apiClient;

    public ProductsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Gets a list of all products.
     * Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of products
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @return List&lt;ProductShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProductShort> productsGet(String apiToken, Integer max, Integer index, String workflowState) throws RestClientException {
        return productsGetWithHttpInfo(apiToken, max, index, workflowState).getBody();
    }

    /**
     * Gets a list of all products.
     * Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of products
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @return ResponseEntity&lt;List&lt;ProductShort&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProductShort>> productsGetWithHttpInfo(String apiToken, Integer max, Integer index, String workflowState) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/products").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "index", index));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "workflowState", workflowState));

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ProductShort>> returnType = new ParameterizedTypeReference<List<ProductShort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new product
     * Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 
     * <p><b>201</b> - Gets product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @return ProductShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShort productsPost(String apiToken, CreateProduct createProductRequestBody) throws RestClientException {
        return productsPostWithHttpInfo(apiToken, createProductRequestBody).getBody();
    }

    /**
     * Creates a new product
     * Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 
     * <p><b>201</b> - Gets product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @return ResponseEntity&lt;ProductShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShort> productsPostWithHttpInfo(String apiToken, CreateProduct createProductRequestBody) throws RestClientException {
        Object postBody = createProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsPost");
        }
        
        // verify the required parameter 'createProductRequestBody' is set
        if (createProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createProductRequestBody' when calling productsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/products").build().toUriString();

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

        ParameterizedTypeReference<ProductShort> returnType = new ParameterizedTypeReference<ProductShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Sets the desired status to a countermeasure
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * <p><b>200</b> - An empty array
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product, component or control not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefComponentsComponentRefControlsControlRefStatusPut(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody) throws RestClientException {
        productsRefComponentsComponentRefControlsControlRefStatusPutWithHttpInfo(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody);
    }

    /**
     * Sets the desired status to a countermeasure
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * <p><b>200</b> - An empty array
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product, component or control not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefComponentsComponentRefControlsControlRefStatusPutWithHttpInfo(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody) throws RestClientException {
        Object postBody = updateStatusCountermeasureRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefControlsControlRefStatusPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefComponentsComponentRefControlsControlRefStatusPut");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefControlsControlRefStatusPut");
        }
        
        // verify the required parameter 'controlRef' is set
        if (controlRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'controlRef' when calling productsRefComponentsComponentRefControlsControlRefStatusPut");
        }
        
        // verify the required parameter 'updateStatusCountermeasureRequestBody' is set
        if (updateStatusCountermeasureRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateStatusCountermeasureRequestBody' when calling productsRefComponentsComponentRefControlsControlRefStatusPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("componentRef", componentRef);
        uriVariables.put("controlRef", controlRef);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/components/{componentRef}/controls/{controlRef}/status").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
    /**
     * Deletes the given list of product countermeasures
     * Deletes the given list of the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>204</b> - Countermesassures have been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Countermesassures not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param controlsId List of countermeassures ids (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefControlsDelete(String apiToken, String ref, ControlsId controlsId) throws RestClientException {
        productsRefControlsDeleteWithHttpInfo(apiToken, ref, controlsId);
    }

    /**
     * Deletes the given list of product countermeasures
     * Deletes the given list of the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>204</b> - Countermesassures have been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Countermesassures not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param controlsId List of countermeassures ids (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefControlsDeleteWithHttpInfo(String apiToken, String ref, ControlsId controlsId) throws RestClientException {
        Object postBody = controlsId;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefControlsDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefControlsDelete");
        }
        
        // verify the required parameter 'controlsId' is set
        if (controlsId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'controlsId' when calling productsRefControlsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/controls").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all product countermeasures
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentControl> productsRefControlsGet(String apiToken, String ref) throws RestClientException {
        return productsRefControlsGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets a list of all product countermeasures
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;List&lt;ComponentControl&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentControl>> productsRefControlsGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefControlsGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefControlsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/controls").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentControl>> returnType = new ParameterizedTypeReference<List<ComponentControl>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all implemented countermeasures of a product.
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentControl> productsRefControlsImplementedGet(String apiToken, String ref) throws RestClientException {
        return productsRefControlsImplementedGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets a list of all implemented countermeasures of a product.
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;List&lt;ComponentControl&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentControl>> productsRefControlsImplementedGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefControlsImplementedGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefControlsImplementedGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/controls/implemented").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentControl>> returnType = new ParameterizedTypeReference<List<ComponentControl>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all required countermeasures of a product
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentControl> productsRefControlsRequiredGet(String apiToken, String ref) throws RestClientException {
        return productsRefControlsRequiredGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets a list of all required countermeasures of a product
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * <p><b>200</b> - An array of product countermeasures
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;List&lt;ComponentControl&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentControl>> productsRefControlsRequiredGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefControlsRequiredGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefControlsRequiredGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/controls/required").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<ComponentControl>> returnType = new ParameterizedTypeReference<List<ComponentControl>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a product
     * Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 
     * <p><b>204</b> - The product has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefDelete(String apiToken, String ref) throws RestClientException {
        productsRefDeleteWithHttpInfo(apiToken, ref);
    }

    /**
     * Deletes a product
     * Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 
     * <p><b>204</b> - The product has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefDeleteWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets diagram image for product.
     * Gets a an image in png format of the product diagram. Conditions to be able to perform the action:   - No special permissions are required to perform this action.   - This API call can be used only if the user who performs the call has visibility over the product. 
     * <p><b>200</b> - A Diagram Image
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product or Diagram not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] productsRefDiagramImageGet(String apiToken, String ref) throws RestClientException {
        return productsRefDiagramImageGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets diagram image for product.
     * Gets a an image in png format of the product diagram. Conditions to be able to perform the action:   - No special permissions are required to perform this action.   - This API call can be used only if the user who performs the call has visibility over the product. 
     * <p><b>200</b> - A Diagram Image
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product or Diagram not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> productsRefDiagramImageGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefDiagramImageGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefDiagramImageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/diagram/image").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets product details
     * Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return Product
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Product productsRefGet(String apiToken, String ref) throws RestClientException {
        return productsRefGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets product details
     * Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;Product&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Product> productsRefGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Product> returnType = new ParameterizedTypeReference<Product>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassigns a list of user groups from a product.
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>200</b> - An object with an array of user groups that have been unassigned and an array of user groups that have not been found in the project
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 productsRefGroupsDelete(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody) throws RestClientException {
        return productsRefGroupsDeleteWithHttpInfo(apiToken, ref, unassignGroupsProductRequestBody).getBody();
    }

    /**
     * Unassigns a list of user groups from a product.
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>200</b> - An object with an array of user groups that have been unassigned and an array of user groups that have not been found in the project
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @return ResponseEntity&lt;InlineResponse200&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse200> productsRefGroupsDeleteWithHttpInfo(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody) throws RestClientException {
        Object postBody = unassignGroupsProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefGroupsDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefGroupsDelete");
        }
        
        // verify the required parameter 'unassignGroupsProductRequestBody' is set
        if (unassignGroupsProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unassignGroupsProductRequestBody' when calling productsRefGroupsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/groups").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List all groups assigned to a product
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * <p><b>200</b> - An array of groups assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> productsRefGroupsGet(String apiToken, String ref) throws RestClientException {
        return productsRefGroupsGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * List all groups assigned to a product
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * <p><b>200</b> - An array of groups assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> productsRefGroupsGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefGroupsGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefGroupsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/groups").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns groups of users to a product.
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including groups assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @return ProductShortGroups
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShortGroups productsRefGroupsPut(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody) throws RestClientException {
        return productsRefGroupsPutWithHttpInfo(apiToken, ref, assignGroupsProductRequestBody).getBody();
    }

    /**
     * Assigns groups of users to a product.
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including groups assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @return ResponseEntity&lt;ProductShortGroups&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShortGroups> productsRefGroupsPutWithHttpInfo(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody) throws RestClientException {
        Object postBody = assignGroupsProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefGroupsPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefGroupsPut");
        }
        
        // verify the required parameter 'assignGroupsProductRequestBody' is set
        if (assignGroupsProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignGroupsProductRequestBody' when calling productsRefGroupsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/groups").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ProductShortGroups> returnType = new ParameterizedTypeReference<ProductShortGroups>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Updates a product
     * Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>200</b> - Product updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefPut(String apiToken, String ref, UpdateProduct updateProductRequestBody) throws RestClientException {
        productsRefPutWithHttpInfo(apiToken, ref, updateProductRequestBody);
    }

    /**
     * Updates a product
     * Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>200</b> - Product updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefPutWithHttpInfo(String apiToken, String ref, UpdateProduct updateProductRequestBody) throws RestClientException {
        Object postBody = updateProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefPut");
        }
        
        // verify the required parameter 'updateProductRequestBody' is set
        if (updateProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateProductRequestBody' when calling productsRefPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets the risks summary of a product
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - Product risks
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return RiskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RiskSummary productsRefRisksGet(String apiToken, String ref) throws RestClientException {
        return productsRefRisksGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets the risks summary of a product
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * <p><b>200</b> - Product risks
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;RiskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RiskSummary> productsRefRisksGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefRisksGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefRisksGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/risks").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RiskSummary> returnType = new ParameterizedTypeReference<RiskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Imports test results from different sources to a product.
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Error in the call. Misspelled or undefined test Type
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return InlineResponse2011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2011 productsRefTestsTestTypeUploadPost(String apiToken, String ref, String testType, File fileName) throws RestClientException {
        return productsRefTestsTestTypeUploadPostWithHttpInfo(apiToken, ref, testType, fileName).getBody();
    }

    /**
     * Imports test results from different sources to a product.
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * <p><b>201</b> - Tests updated. Returns the number of changed tests
     * <p><b>400</b> - Error in the call. Misspelled or undefined test Type
     * <p><b>403</b> - API is not enabled
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return ResponseEntity&lt;InlineResponse2011&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2011> productsRefTestsTestTypeUploadPostWithHttpInfo(String apiToken, String ref, String testType, File fileName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefTestsTestTypeUploadPost");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefTestsTestTypeUploadPost");
        }
        
        // verify the required parameter 'testType' is set
        if (testType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testType' when calling productsRefTestsTestTypeUploadPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("testType", testType);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/tests/{testType}/upload").buildAndExpand(uriVariables).toUriString();

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
    /**
     * Gets a list of all threats of a product
     * Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product threats
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentUseCaseThreatShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentUseCaseThreatShort> productsRefThreatsGet(String apiToken, String ref) throws RestClientException {
        return productsRefThreatsGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets a list of all threats of a product
     * Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product threats
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;List&lt;ComponentUseCaseThreatShort&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentUseCaseThreatShort>> productsRefThreatsGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefThreatsGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefThreatsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/threats").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentUseCaseThreatShort>> returnType = new ParameterizedTypeReference<List<ComponentUseCaseThreatShort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefUsersDelete(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws RestClientException {
        productsRefUsersDeleteWithHttpInfo(apiToken, ref, unassignUsersProductRequestBody);
    }

    /**
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefUsersDeleteWithHttpInfo(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws RestClientException {
        Object postBody = unassignUsersProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersDelete");
        }
        
        // verify the required parameter 'unassignUsersProductRequestBody' is set
        if (unassignUsersProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unassignUsersProductRequestBody' when calling productsRefUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of users assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> productsRefUsersGet(String apiToken, String ref) throws RestClientException {
        return productsRefUsersGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of users assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> productsRefUsersGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including users assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ProductShortUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShortUsers productsRefUsersPut(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws RestClientException {
        return productsRefUsersPutWithHttpInfo(apiToken, ref, assignUsersProductRequestBody).getBody();
    }

    /**
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including users assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ResponseEntity&lt;ProductShortUsers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShortUsers> productsRefUsersPutWithHttpInfo(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws RestClientException {
        Object postBody = assignUsersProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersPut");
        }
        
        // verify the required parameter 'assignUsersProductRequestBody' is set
        if (assignUsersProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignUsersProductRequestBody' when calling productsRefUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ProductShortUsers> returnType = new ParameterizedTypeReference<ProductShortUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - User has been unassigned from the product
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefUsersUserDelete(String apiToken, String ref, String user) throws RestClientException {
        productsRefUsersUserDeleteWithHttpInfo(apiToken, ref, user);
    }

    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - User has been unassigned from the product
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefUsersUserDeleteWithHttpInfo(String apiToken, String ref, String user) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersUserDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersUserDelete");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling productsRefUsersUserDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("user", user);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users/{user}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all weaknesses of a product
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentWeakness> productsRefWeaknessesGet(String apiToken, String ref) throws RestClientException {
        return productsRefWeaknessesGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * Gets a list of all weaknesses of a product
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ResponseEntity&lt;List&lt;ComponentWeakness&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentWeakness>> productsRefWeaknessesGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefWeaknessesGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefWeaknessesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/weaknesses").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentWeakness>> returnType = new ParameterizedTypeReference<List<ComponentWeakness>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all weaknesses of a product filtered by test state
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @return List&lt;ComponentWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentWeakness> productsRefWeaknessesTestStateGet(String apiToken, String ref, String testState) throws RestClientException {
        return productsRefWeaknessesTestStateGetWithHttpInfo(apiToken, ref, testState).getBody();
    }

    /**
     * Gets a list of all weaknesses of a product filtered by test state
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @return ResponseEntity&lt;List&lt;ComponentWeakness&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ComponentWeakness>> productsRefWeaknessesTestStateGetWithHttpInfo(String apiToken, String ref, String testState) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefWeaknessesTestStateGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefWeaknessesTestStateGet");
        }
        
        // verify the required parameter 'testState' is set
        if (testState == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testState' when calling productsRefWeaknessesTestStateGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("test_state", testState);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/weaknesses/{test_state}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<ComponentWeakness>> returnType = new ParameterizedTypeReference<List<ComponentWeakness>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * <p><b>201</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ProductShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShort productsUploadPost(String apiToken, String ref, String name, File fileName, String type) throws RestClientException {
        return productsUploadPostWithHttpInfo(apiToken, ref, name, fileName, type).getBody();
    }

    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * <p><b>201</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ResponseEntity&lt;ProductShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShort> productsUploadPostWithHttpInfo(String apiToken, String ref, String name, File fileName, String type) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsUploadPost");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsUploadPost");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling productsUploadPost");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling productsUploadPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/products/upload").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        if (ref != null)
            formParams.add("ref", ref);
        if (name != null)
            formParams.add("name", name);
        if (type != null)
            formParams.add("type", type);
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

        ParameterizedTypeReference<ProductShort> returnType = new ParameterizedTypeReference<ProductShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Updates an existing product from a XML file upload.
     * Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 
     * <p><b>200</b> - Product details
     * <p><b>400</b> - error in the call
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ProductShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShort productsUploadRefPost(String apiToken, String ref, File fileName, String deleteCountermeasures) throws RestClientException {
        return productsUploadRefPostWithHttpInfo(apiToken, ref, fileName, deleteCountermeasures).getBody();
    }

    /**
     * Updates an existing product from a XML file upload.
     * Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 
     * <p><b>200</b> - Product details
     * <p><b>400</b> - error in the call
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ResponseEntity&lt;ProductShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShort> productsUploadRefPostWithHttpInfo(String apiToken, String ref, File fileName, String deleteCountermeasures) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsUploadRefPost");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsUploadRefPost");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling productsUploadRefPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/upload/{ref}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        if (fileName != null)
            formParams.add("fileName", new FileSystemResource(fileName));
        if (deleteCountermeasures != null)
            formParams.add("deleteCountermeasures", deleteCountermeasures);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ProductShort> returnType = new ParameterizedTypeReference<ProductShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Executes rules by a product
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     * <p><b>200</b> - Rules executed properly
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void rulesProductRefPut(String apiToken, String ref, String deleteCountermeasures) throws RestClientException {
        rulesProductRefPutWithHttpInfo(apiToken, ref, deleteCountermeasures);
    }

    /**
     * Executes rules by a product
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     * <p><b>200</b> - Rules executed properly
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> rulesProductRefPutWithHttpInfo(String apiToken, String ref, String deleteCountermeasures) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling rulesProductRefPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling rulesProductRefPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/rules/product/{ref}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));
        if (deleteCountermeasures != null)
        headerParams.add("deleteCountermeasures", apiClient.parameterToString(deleteCountermeasures));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
