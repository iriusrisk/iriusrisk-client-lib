package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Body10;
import com.iriusrisk.api.client.model.Body11;
import com.iriusrisk.api.client.model.Body12;
import com.iriusrisk.api.client.model.Body13;
import com.iriusrisk.api.client.model.Body14;
import com.iriusrisk.api.client.model.Body15;
import com.iriusrisk.api.client.model.Body16;
import com.iriusrisk.api.client.model.Body9;
import com.iriusrisk.api.client.model.ControlCommand;

import java.io.File;
import com.iriusrisk.api.client.model.Library;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryThreat;
import com.iriusrisk.api.client.model.LibraryUseCase;
import com.iriusrisk.api.client.model.LibraryWeakness;
import com.iriusrisk.api.client.model.ProductShort;
import com.iriusrisk.api.client.model.RiskPattern;

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
@Component("com.iriusrisk.api.client.LibrariesApi")
public class LibrariesApi {
    private ApiClient apiClient;

    public LibrariesApi() {
        this(new ApiClient());
    }

    @Autowired
    public LibrariesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a Library
     * Deletes a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>204</b> - The library has been deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void librariesLibraryIdDelete(String libraryId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets library details
     * Gets the library details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - Library details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @return Library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Library librariesLibraryIdGet(String libraryId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Library> returnType = new ParameterizedTypeReference<Library>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates new Risk Pattern
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Risk Pattern details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param body Object that contains information of the fields
     * @return RiskPattern
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RiskPattern librariesLibraryIdRiskpatternsPost(String libraryId, Body10 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RiskPattern> returnType = new ParameterizedTypeReference<RiskPattern>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * Deletes a Risk Pattern
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>204</b> - The risk pattern has been deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void librariesLibraryIdRiskpatternsRiskPatternIdDelete(String libraryId, String riskPatternId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdDelete");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets Risk Pattern details
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - RiskPattern details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @return RiskPattern
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RiskPattern librariesLibraryIdRiskpatternsRiskPatternIdGet(String libraryId, String riskPatternId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdGet");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<RiskPattern> returnType = new ParameterizedTypeReference<RiskPattern>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates new use case in a library.
     * Creates new use case in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - UseCase details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param body Object that contains information of the fields
     * @return LibraryUseCase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryUseCase librariesLibraryIdRiskpatternsRiskPatternIdUsecasesPost(String libraryId, String riskPatternId, Body11 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesPost");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/usecases").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LibraryUseCase> returnType = new ParameterizedTypeReference<LibraryUseCase>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new threat in a library.
     * Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Threat details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param libraryId Unique ID of the library
     * @param riskPatternId Unique ID of the risk pattern
     * @param useCaseId Unique ID of the use case
     * @param body Object that contains information of the fields
     * @return LibraryThreat
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryThreat librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsPost(String libraryId, String riskPatternId, String useCaseId, Body12 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'libraryId' is set
        if (libraryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsPost");
        }
        
        // verify the required parameter 'riskPatternId' is set
        if (riskPatternId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsPost");
        }
        
        // verify the required parameter 'useCaseId' is set
        if (useCaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseId' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesLibraryIdRiskpatternsRiskPatternIdUsecasesUseCaseIdThreatsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("library-id", libraryId);
        uriVariables.put("risk-pattern-id", riskPatternId);
        uriVariables.put("use-case-id", useCaseId);
        String path = UriComponentsBuilder.fromPath("/libraries/{library-id}/riskpatterns/{risk-pattern-id}/usecases/{use-case-id}/threats").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LibraryThreat> returnType = new ParameterizedTypeReference<LibraryThreat>() {};
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
     * Creates a Library
     * Creates a new empty Library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Empty Library created
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param body Object that contains information of the fields
     * @return Library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Library librariesPost(Body9 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling librariesPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/libraries").build().toUriString();
        
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

        ParameterizedTypeReference<Library> returnType = new ParameterizedTypeReference<Library>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * <p><b>201</b> - Product details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param ref Product ref
     * @param name Product name
     * @param fileName File to upload in XML format
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY
     * @return ProductShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShort productsUploadPost(String ref, String name, File fileName, String type) throws RestClientException {
        Object postBody = null;
        
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

        String[] authNames = new String[] { "api_token" };

        ParameterizedTypeReference<ProductShort> returnType = new ParameterizedTypeReference<ProductShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
