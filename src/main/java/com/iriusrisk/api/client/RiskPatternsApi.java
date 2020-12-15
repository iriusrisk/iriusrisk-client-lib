package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateWeaknessThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.ControlCommand;
import com.iriusrisk.api.client.model.CreateRiskPatternRequestBody;
import com.iriusrisk.api.client.model.CreateWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryWeakness;
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
@Component("com.iriusrisk.api.client.RiskPatternsApi")
public class RiskPatternsApi {
    private ApiClient apiClient;

    public RiskPatternsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RiskPatternsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
