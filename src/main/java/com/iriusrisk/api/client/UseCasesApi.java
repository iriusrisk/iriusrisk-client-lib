package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssociateCountermeasureThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateWeaknessThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.CreateUseCaseLibraryRequestBody;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.LibraryControl;
import com.iriusrisk.api.client.model.LibraryUseCase;
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
@Component("com.iriusrisk.api.client.UseCasesApi")
public class UseCasesApi {
    private ApiClient apiClient;

    public UseCasesApi() {
        this(new ApiClient());
    }

    @Autowired
    public UseCasesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
