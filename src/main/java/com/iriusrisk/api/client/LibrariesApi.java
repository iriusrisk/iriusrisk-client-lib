package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssociateCountermeasureThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateWeaknessThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.ControlCommand;
import com.iriusrisk.api.client.model.CreateLibraryRequestBody;
import com.iriusrisk.api.client.model.CreateRiskPatternRequestBody;
import com.iriusrisk.api.client.model.CreateThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.CreateUseCaseLibraryRequestBody;
import com.iriusrisk.api.client.model.CreateWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.Error;
import java.io.File;
import com.iriusrisk.api.client.model.Library;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryThreat;
import com.iriusrisk.api.client.model.LibraryUseCase;
import com.iriusrisk.api.client.model.LibraryWeakness;
import com.iriusrisk.api.client.model.ProductShort;
import com.iriusrisk.api.client.model.RiskPattern;

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
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void librariesLibraryRefDelete(String apiToken, String libraryRef) throws RestClientException {
        librariesLibraryRefDeleteWithHttpInfo(apiToken, libraryRef);
    }

    /**
     * Deletes a Library
     * Deletes a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>204</b> - The library has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> librariesLibraryRefDeleteWithHttpInfo(String apiToken, String libraryRef) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefDelete");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}").buildAndExpand(uriVariables).toUriString();

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
     * Gets library details
     * Gets the library details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - Library details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @return Library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Library librariesLibraryRefGet(String apiToken, String libraryRef) throws RestClientException {
        return librariesLibraryRefGetWithHttpInfo(apiToken, libraryRef).getBody();
    }

    /**
     * Gets library details
     * Gets the library details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - Library details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @return ResponseEntity&lt;Library&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Library> librariesLibraryRefGetWithHttpInfo(String apiToken, String libraryRef) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefGet");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Library> returnType = new ParameterizedTypeReference<Library>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates new Risk Pattern
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Risk Pattern details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @return RiskPattern
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RiskPattern librariesLibraryRefRiskpatternsPost(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsPostWithHttpInfo(apiToken, libraryRef, createRiskPatternRequestBody).getBody();
    }

    /**
     * Creates new Risk Pattern
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Risk Pattern details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;RiskPattern&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RiskPattern> librariesLibraryRefRiskpatternsPostWithHttpInfo(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody) throws RestClientException {
        Object postBody = createRiskPatternRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsPost");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsPost");
        }
        
        // verify the required parameter 'createRiskPatternRequestBody' is set
        if (createRiskPatternRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createRiskPatternRequestBody' when calling librariesLibraryRefRiskpatternsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<RiskPattern> returnType = new ParameterizedTypeReference<RiskPattern>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates new countermeasure in a risk pattern
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody).getBody();
    }

    /**
     * Creates new countermeasure in a risk pattern
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryControl> librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody) throws RestClientException {
        Object postBody = createCountermeasureLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
        }
        
        // verify the required parameter 'createCountermeasureLibraryRequestBody' is set
        if (createCountermeasureLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCountermeasureLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryControl> returnType = new ParameterizedTypeReference<LibraryControl>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a Risk Pattern
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>204</b> - The risk pattern has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void librariesLibraryRefRiskpatternsRiskPatternRefDelete(String apiToken, String libraryRef, String riskPatternRef) throws RestClientException {
        librariesLibraryRefRiskpatternsRiskPatternRefDeleteWithHttpInfo(apiToken, libraryRef, riskPatternRef);
    }

    /**
     * Deletes a Risk Pattern
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>204</b> - The risk pattern has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> librariesLibraryRefRiskpatternsRiskPatternRefDeleteWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}").buildAndExpand(uriVariables).toUriString();

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
     * Gets Risk Pattern details
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - RiskPattern details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return RiskPattern
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RiskPattern librariesLibraryRefRiskpatternsRiskPatternRefGet(String apiToken, String libraryRef, String riskPatternRef) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefGetWithHttpInfo(apiToken, libraryRef, riskPatternRef).getBody();
    }

    /**
     * Gets Risk Pattern details
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>200</b> - RiskPattern details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return ResponseEntity&lt;RiskPattern&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RiskPattern> librariesLibraryRefRiskpatternsRiskPatternRefGetWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<RiskPattern> returnType = new ParameterizedTypeReference<RiskPattern>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates new use case in a library.
     * Creates new use case in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - UseCase details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createUseCaseLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryUseCase
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryUseCase librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost(String apiToken, String libraryRef, String riskPatternRef, CreateUseCaseLibraryRequestBody createUseCaseLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, createUseCaseLibraryRequestBody).getBody();
    }

    /**
     * Creates new use case in a library.
     * Creates new use case in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - UseCase details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createUseCaseLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryUseCase&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryUseCase> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, CreateUseCaseLibraryRequestBody createUseCaseLibraryRequestBody) throws RestClientException {
        Object postBody = createUseCaseLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost");
        }
        
        // verify the required parameter 'createUseCaseLibraryRequestBody' is set
        if (createUseCaseLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUseCaseLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryUseCase> returnType = new ParameterizedTypeReference<LibraryUseCase>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new threat in a library.
     * Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Threat details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param createThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryThreat
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryThreat librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, CreateThreatLibraryRequestBody createThreatLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, createThreatLibraryRequestBody).getBody();
    }

    /**
     * Creates a new threat in a library.
     * Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Threat details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param createThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryThreat&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryThreat> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, CreateThreatLibraryRequestBody createThreatLibraryRequestBody) throws RestClientException {
        Object postBody = createThreatLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
        }
        
        // verify the required parameter 'createThreatLibraryRequestBody' is set
        if (createThreatLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createThreatLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        uriVariables.put("useCaseRef", useCaseRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryThreat> returnType = new ParameterizedTypeReference<LibraryThreat>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Associates a countermeasure to a threat in a risk pattern.
     * Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateCountermeasureThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateCountermeasureThreatLibraryRequestBody associateCountermeasureThreatLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPutWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateCountermeasureThreatLibraryRequestBody).getBody();
    }

    /**
     * Associates a countermeasure to a threat in a risk pattern.
     * Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateCountermeasureThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryControl> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPutWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateCountermeasureThreatLibraryRequestBody associateCountermeasureThreatLibraryRequestBody) throws RestClientException {
        Object postBody = associateCountermeasureThreatLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // verify the required parameter 'threatRef' is set
        if (threatRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // verify the required parameter 'associateCountermeasureThreatLibraryRequestBody' is set
        if (associateCountermeasureThreatLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'associateCountermeasureThreatLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        uriVariables.put("useCaseRef", useCaseRef);
        uriVariables.put("threatRef", threatRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryControl> returnType = new ParameterizedTypeReference<LibraryControl>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Associates weakness to a threat in a risk pattern.
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryWeakness
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateWeaknessThreatLibraryRequestBody).getBody();
    }

    /**
     * Associates weakness to a threat in a risk pattern.
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryWeakness> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody) throws RestClientException {
        Object postBody = associateWeaknessThreatLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // verify the required parameter 'threatRef' is set
        if (threatRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // verify the required parameter 'associateWeaknessThreatLibraryRequestBody' is set
        if (associateWeaknessThreatLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'associateWeaknessThreatLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        uriVariables.put("useCaseRef", useCaseRef);
        uriVariables.put("threatRef", threatRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryWeakness> returnType = new ParameterizedTypeReference<LibraryWeakness>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryControl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody).getBody();
    }

    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Countermeasure details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryControl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryControl> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody) throws RestClientException {
        Object postBody = associateCountermeasureWeaknessLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'threatRef' is set
        if (threatRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threatRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'weaknessRef' is set
        if (weaknessRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'weaknessRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // verify the required parameter 'associateCountermeasureWeaknessLibraryRequestBody' is set
        if (associateCountermeasureWeaknessLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'associateCountermeasureWeaknessLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        uriVariables.put("useCaseRef", useCaseRef);
        uriVariables.put("threatRef", threatRef);
        uriVariables.put("weaknessRef", weaknessRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryControl> returnType = new ParameterizedTypeReference<LibraryControl>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new weakness in a risk pattern
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryWeakness
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody) throws RestClientException {
        return librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, createWeaknessLibraryRequestBody).getBody();
    }

    /**
     * Creates a new weakness in a risk pattern
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Weakness details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;LibraryWeakness&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LibraryWeakness> librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody) throws RestClientException {
        Object postBody = createWeaknessLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
        }
        
        // verify the required parameter 'createWeaknessLibraryRequestBody' is set
        if (createWeaknessLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createWeaknessLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("libraryRef", libraryRef);
        uriVariables.put("riskPatternRef", riskPatternRef);
        String path = UriComponentsBuilder.fromPath("/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<LibraryWeakness> returnType = new ParameterizedTypeReference<LibraryWeakness>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a Library
     * Creates a new empty Library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Empty Library created
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createLibraryRequestBody JSON data that contains information of the fields (required)
     * @return Library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Library librariesPost(String apiToken, CreateLibraryRequestBody createLibraryRequestBody) throws RestClientException {
        return librariesPostWithHttpInfo(apiToken, createLibraryRequestBody).getBody();
    }

    /**
     * Creates a Library
     * Creates a new empty Library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * <p><b>201</b> - Empty Library created
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Library&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Library> librariesPostWithHttpInfo(String apiToken, CreateLibraryRequestBody createLibraryRequestBody) throws RestClientException {
        Object postBody = createLibraryRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling librariesPost");
        }
        
        // verify the required parameter 'createLibraryRequestBody' is set
        if (createLibraryRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createLibraryRequestBody' when calling librariesPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/libraries").build().toUriString();

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

        ParameterizedTypeReference<Library> returnType = new ParameterizedTypeReference<Library>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
}
