package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Body15;
import com.iriusrisk.api.client.model.Body16;
import com.iriusrisk.api.client.model.Body21;
import com.iriusrisk.api.client.model.ControlCommand;
import com.iriusrisk.api.client.model.LibraryControl;

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
@Component("com.iriusrisk.api.client.CountermeasuresApi")
public class CountermeasuresApi {
    private ApiClient apiClient;

    public CountermeasuresApi() {
        this(new ApiClient());
    }

    @Autowired
    public CountermeasuresApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates new countermeasure in a risk pattern
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param body Object that contains information of the fields
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryIdRiskpatternsRiskPatternIdCountermeasuresPost(String libraryId, String riskPatternId, ControlCommand body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdCountermeasuresPost");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdCountermeasuresPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdCountermeasuresPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/countermeasures").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Associates a countermeasure to a threat in a risk pattern.
     * Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
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
     * @param body Object that contains information of the fields
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut(String libraryId, String riskPatternId, String useCaseId, String threatId, Body16 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut");
        }
        
        // verify the required parameter 'useCaseId' is set
        if (useCaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut");
        }
        
        // verify the required parameter 'threatId' is set
        if (threatId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsThreatIdCountermeasuresPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        uriVariables.put("use-case-id", useCaseId);
        uriVariables.put("threat-id", threatId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/usecases/{use-case-id}/threats/{threat-id}/countermeasures").buildAndExpand(uriVariables).toUriString();
        
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
     * Sets the desired status to a countermeasure
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * <p><b>200</b> - An empty array
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param componentId ID for component
     * @param countermeasureId ID for countermeasure
     * @param body Object that contains the information to update countermeasure
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsProductIdComponentsComponentIdControlsCountermeasureIdStatusPut(String productId, String componentId, String countermeasureId, Body21 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdComponentsComponentIdControlsCountermeasureIdStatusPut");
        }
        
        // verify the required parameter 'componentId' is set
        if (componentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'componentId' when calling productsProductIdComponentsComponentIdControlsCountermeasureIdStatusPut");
        }
        
        // verify the required parameter 'countermeasureId' is set
        if (countermeasureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countermeasureId' when calling productsProductIdComponentsComponentIdControlsCountermeasureIdStatusPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling productsProductIdComponentsComponentIdControlsCountermeasureIdStatusPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        uriVariables.put("component-id", componentId);
        uriVariables.put("countermeasure-id", countermeasureId);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/components/{component-id}/controls/{countermeasure-id}/status").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
