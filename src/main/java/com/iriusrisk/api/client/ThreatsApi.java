package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssociateCountermeasureThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateWeaknessThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.ComponentUseCaseThreatShort;
import com.iriusrisk.api.client.model.CreateThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryThreat;
import com.iriusrisk.api.client.model.LibraryWeakness;

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
@Component("com.iriusrisk.api.client.ThreatsApi")
public class ThreatsApi {
    private ApiClient apiClient;

    public ThreatsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ThreatsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
