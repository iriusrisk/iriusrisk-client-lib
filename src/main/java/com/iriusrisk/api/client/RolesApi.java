package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.CreateRoleRequestBody;
import com.iriusrisk.api.client.model.Error;

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
@Component("com.iriusrisk.api.client.RolesApi")
public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new Role
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     * <p><b>201</b> - Created Role
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Permission not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void rolesPost(String apiToken, CreateRoleRequestBody createRoleRequestBody) throws RestClientException {
        rolesPostWithHttpInfo(apiToken, createRoleRequestBody);
    }

    /**
     * Creates a new Role
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     * <p><b>201</b> - Created Role
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Permission not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> rolesPostWithHttpInfo(String apiToken, CreateRoleRequestBody createRoleRequestBody) throws RestClientException {
        Object postBody = createRoleRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling rolesPost");
        }
        
        // verify the required parameter 'createRoleRequestBody' is set
        if (createRoleRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createRoleRequestBody' when calling rolesPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/roles").build().toUriString();

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes an existing role
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     * <p><b>204</b> - Role has been deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Role not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void rolesRoleNameDelete(String apiToken, String roleName) throws RestClientException {
        rolesRoleNameDeleteWithHttpInfo(apiToken, roleName);
    }

    /**
     * Deletes an existing role
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     * <p><b>204</b> - Role has been deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Role not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> rolesRoleNameDeleteWithHttpInfo(String apiToken, String roleName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling rolesRoleNameDelete");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleName' when calling rolesRoleNameDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("role_name", roleName);
        String path = UriComponentsBuilder.fromPath("/roles/{role_name}").buildAndExpand(uriVariables).toUriString();

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
}
