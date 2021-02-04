package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Body13;
import com.iriusrisk.api.client.model.Body14;
import com.iriusrisk.api.client.model.Body15;
import com.iriusrisk.api.client.model.ComponentWeakness;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryWeakness;

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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-04T10:27:59.154+01:00")
@Component("com.iriusrisk.api.client.WeaknessesApi")
public class WeaknessesApi {
    private ApiClient apiClient;

    public WeaknessesApi() {
        this(new ApiClient());
    }

    @Autowired
    public WeaknessesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Associates weakness to a threat in a risk pattern.
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param useCaseId Unique ID of the use case
     * @param threatId Unique ID of the threat
     * @param body Object that contains information of the fields
     * @return LibraryWeakness
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryWeakness librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut(String libraryId, String riskPatternId, String useCaseId, String threatId, Body14 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut");
        }
        
        // verify the required parameter 'useCaseId' is set
        if (useCaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut");
        }
        
        // verify the required parameter 'threatId' is set
        if (threatId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        uriVariables.put("use-case-id", useCaseId);
        uriVariables.put("threat-id", threatId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/usecases/{use-case-id}/threats/{threat-id}/weaknesses").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LibraryWeakness> returnType = new ParameterizedTypeReference<LibraryWeakness>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param useCaseId Unique ID of the use case
     * @param threatId Unique ID of the threat
     * @param weaknessId Unique ID of the weakness
     * @param body Object that contains information of the fields
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut(String libraryId, String riskPatternId, String useCaseId, String threatId, String weaknessId, Body15 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // verify the required parameter 'useCaseId' is set
        if (useCaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // verify the required parameter 'threatId' is set
        if (threatId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // verify the required parameter 'weaknessId' is set
        if (weaknessId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'weaknessId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdWeaknessesWeaknessIdCountermeasuresPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        uriVariables.put("use-case-id", useCaseId);
        uriVariables.put("threat-id", threatId);
        uriVariables.put("weakness-id", weaknessId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/usecases/{use-case-id}/threats/{threat-id}/weaknesses/{weakness-id}/countermeasures").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LibraryControl> returnType = new ParameterizedTypeReference<LibraryControl>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new weakness in a risk pattern
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param body Object that contains information of the fields
     * @return LibraryWeakness
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryWeakness librariesLibraryIdRiskpatternsRiskPatternIdWeaknessesPost(String libraryId, String riskPatternId, Body13 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdWeaknessesPost");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdWeaknessesPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdWeaknessesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/weaknesses").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LibraryWeakness> returnType = new ParameterizedTypeReference<LibraryWeakness>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all weaknesses of a product
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @return List&lt;ComponentWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentWeakness> productsProductIdWeaknessesGet(String productId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdWeaknessesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/weaknesses").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<ComponentWeakness>> returnType = new ParameterizedTypeReference<List<ComponentWeakness>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all weaknesses of a product filtered by test state
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * <p><b>200</b> - An array of product weaknesses
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param testState Code for a test state
     * @return List&lt;ComponentWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ComponentWeakness> productsProductIdWeaknessesTestStateGet(String productId, String testState) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdWeaknessesTestStateGet");
        }
        
        // verify the required parameter 'testState' is set
        if (testState == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'testState' when calling productsProductIdWeaknessesTestStateGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        uriVariables.put("test-state", testState);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/weaknesses/{test-state}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<ComponentWeakness>> returnType = new ParameterizedTypeReference<List<ComponentWeakness>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
