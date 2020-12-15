package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.ComponentControl;
import com.iriusrisk.api.client.model.ControlsId;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.UpdateStatusCountermeasureRequestBody;

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
@Component("com.iriusrisk.api.client.ControlsApi")
public class ControlsApi {
    private ApiClient apiClient;

    public ControlsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ControlsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
