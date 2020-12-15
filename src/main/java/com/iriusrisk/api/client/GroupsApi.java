package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssignGroupsProductRequestBody;
import com.iriusrisk.api.client.model.AssignUserGroupRequestBody;
import com.iriusrisk.api.client.model.AssignUserGroupRequestBody1;
import com.iriusrisk.api.client.model.CreateGroupRequestBody;
import com.iriusrisk.api.client.model.CreateGroupRequestBody1;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.Group;
import com.iriusrisk.api.client.model.InlineResponse200;
import com.iriusrisk.api.client.model.InlineResponse201;
import com.iriusrisk.api.client.model.ProductShortGroups;
import com.iriusrisk.api.client.model.UnassignGroupsProductRequestBody;
import com.iriusrisk.api.client.model.UnassingUsersGroupRequestBody;
import com.iriusrisk.api.client.model.UnassingUsersGroupRequestBody1;
import com.iriusrisk.api.client.model.UpdateGroupRequestBody;
import com.iriusrisk.api.client.model.UpdateGroupRequestBody1;
import com.iriusrisk.api.client.model.User;

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
@Component("com.iriusrisk.api.client.GroupsApi")
public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a users business unit
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Business unit has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Business unit not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessUnitIdentifierDelete(String apiToken, String businessUnitIdentifier) throws RestClientException {
        businessunitsBusinessUnitIdentifierDeleteWithHttpInfo(apiToken, businessUnitIdentifier);
    }

    /**
     * Deletes a users business unit
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Business unit has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Business unit not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> businessunitsBusinessUnitIdentifierDeleteWithHttpInfo(String apiToken, String businessUnitIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierDelete");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitIdentifier", businessUnitIdentifier);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitIdentifier}").buildAndExpand(uriVariables).toUriString();

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
     * Gets the business unit details.
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * <p><b>200</b> - Business unit details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> businessunitsBusinessUnitIdentifierGet(String apiToken, String businessUnitIdentifier) throws RestClientException {
        return businessunitsBusinessUnitIdentifierGetWithHttpInfo(apiToken, businessUnitIdentifier).getBody();
    }

    /**
     * Gets the business unit details.
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * <p><b>200</b> - Business unit details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> businessunitsBusinessUnitIdentifierGetWithHttpInfo(String apiToken, String businessUnitIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierGet");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitIdentifier", businessUnitIdentifier);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitIdentifier}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a users business unit
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Business unit has been updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Business unit not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group businessunitsBusinessUnitIdentifierPut(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody) throws RestClientException {
        return businessunitsBusinessUnitIdentifierPutWithHttpInfo(apiToken, businessUnitIdentifier, updateGroupRequestBody).getBody();
    }

    /**
     * Update a users business unit
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Business unit has been updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Business unit not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Group> businessunitsBusinessUnitIdentifierPutWithHttpInfo(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody) throws RestClientException {
        Object postBody = updateGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierPut");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierPut");
        }
        
        // verify the required parameter 'updateGroupRequestBody' is set
        if (updateGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateGroupRequestBody' when calling businessunitsBusinessUnitIdentifierPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitIdentifier", businessUnitIdentifier);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitIdentifier}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassign a list of users from a business unit
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessUnitNameUsersDelete(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody) throws RestClientException {
        businessunitsBusinessUnitNameUsersDeleteWithHttpInfo(apiToken, businessUnitName, unassingUsersGroupRequestBody);
    }

    /**
     * Unassign a list of users from a business unit
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> businessunitsBusinessUnitNameUsersDeleteWithHttpInfo(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody) throws RestClientException {
        Object postBody = unassingUsersGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersDelete");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersDelete");
        }
        
        // verify the required parameter 'unassingUsersGroupRequestBody' is set
        if (unassingUsersGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unassingUsersGroupRequestBody' when calling businessunitsBusinessUnitNameUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitName", businessUnitName);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitName}/users").buildAndExpand(uriVariables).toUriString();

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
     * List users from a business unit
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * <p><b>200</b> - An array of users who belongs to the business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> businessunitsBusinessUnitNameUsersGet(String apiToken, String businessUnitName) throws RestClientException {
        return businessunitsBusinessUnitNameUsersGetWithHttpInfo(apiToken, businessUnitName).getBody();
    }

    /**
     * List users from a business unit
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * <p><b>200</b> - An array of users who belongs to the business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> businessunitsBusinessUnitNameUsersGetWithHttpInfo(String apiToken, String businessUnitName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersGet");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitName", businessUnitName);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitName}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<User>> returnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns users to a business unit
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * <p><b>201</b> - An array of users that have been assigned to business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @return InlineResponse201
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse201 businessunitsBusinessUnitNameUsersPut(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody) throws RestClientException {
        return businessunitsBusinessUnitNameUsersPutWithHttpInfo(apiToken, businessUnitName, assignUserGroupRequestBody).getBody();
    }

    /**
     * Assigns users to a business unit
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * <p><b>201</b> - An array of users that have been assigned to business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @return ResponseEntity&lt;InlineResponse201&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse201> businessunitsBusinessUnitNameUsersPutWithHttpInfo(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody) throws RestClientException {
        Object postBody = assignUserGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersPut");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersPut");
        }
        
        // verify the required parameter 'assignUserGroupRequestBody' is set
        if (assignUserGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignUserGroupRequestBody' when calling businessunitsBusinessUnitNameUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitName", businessUnitName);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitName}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<InlineResponse201> returnType = new ParameterizedTypeReference<InlineResponse201>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a user from a business unit
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - User has been removed from business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessUnitNameUsersUserDelete(String apiToken, String businessUnitName, String user) throws RestClientException {
        businessunitsBusinessUnitNameUsersUserDeleteWithHttpInfo(apiToken, businessUnitName, user);
    }

    /**
     * Removes a user from a business unit
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - User has been removed from business unit
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> businessunitsBusinessUnitNameUsersUserDeleteWithHttpInfo(String apiToken, String businessUnitName, String user) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersUserDelete");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersUserDelete");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling businessunitsBusinessUnitNameUsersUserDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessUnitName", businessUnitName);
        uriVariables.put("user", user);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessUnitName}/users/{user}").buildAndExpand(uriVariables).toUriString();

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
     * Gets a list of all business units
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of business units
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> businessunitsGet(String apiToken) throws RestClientException {
        return businessunitsGetWithHttpInfo(apiToken).getBody();
    }

    /**
     * Gets a list of all business units
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of business units
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> businessunitsGetWithHttpInfo(String apiToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/businessunits").build().toUriString();

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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new user business unit
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Business Unit details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group businessunitsPost(String apiToken, CreateGroupRequestBody1 createGroupRequestBody) throws RestClientException {
        return businessunitsPostWithHttpInfo(apiToken, createGroupRequestBody).getBody();
    }

    /**
     * Creates a new user business unit
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Business Unit details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Group> businessunitsPostWithHttpInfo(String apiToken, CreateGroupRequestBody1 createGroupRequestBody) throws RestClientException {
        Object postBody = createGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling businessunitsPost");
        }
        
        // verify the required parameter 'createGroupRequestBody' is set
        if (createGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createGroupRequestBody' when calling businessunitsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/businessunits").build().toUriString();

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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all Groups
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of groups
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<Group> groupsGet(String apiToken) throws RestClientException {
        return groupsGetWithHttpInfo(apiToken).getBody();
    }

    /**
     * Gets a list of all Groups
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of groups
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<Group>> groupsGetWithHttpInfo(String apiToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/groups").build().toUriString();

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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a users group
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Group not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void groupsGroupIdentifierDelete(String apiToken, String groupIdentifier) throws RestClientException {
        groupsGroupIdentifierDeleteWithHttpInfo(apiToken, groupIdentifier);
    }

    /**
     * Deletes a users group
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Group not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> groupsGroupIdentifierDeleteWithHttpInfo(String apiToken, String groupIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupIdentifierDelete");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupIdentifier", groupIdentifier);
        String path = UriComponentsBuilder.fromPath("/groups/{groupIdentifier}").buildAndExpand(uriVariables).toUriString();

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
     * Gets the group details.
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * <p><b>200</b> - Group details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<Group> groupsGroupIdentifierGet(String apiToken, String groupIdentifier) throws RestClientException {
        return groupsGroupIdentifierGetWithHttpInfo(apiToken, groupIdentifier).getBody();
    }

    /**
     * Gets the group details.
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * <p><b>200</b> - Group details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<Group>> groupsGroupIdentifierGetWithHttpInfo(String apiToken, String groupIdentifier) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupIdentifierGet");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupIdentifier", groupIdentifier);
        String path = UriComponentsBuilder.fromPath("/groups/{groupIdentifier}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a users group
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Group not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public Group groupsGroupIdentifierPut(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody) throws RestClientException {
        return groupsGroupIdentifierPutWithHttpInfo(apiToken, groupIdentifier, updateGroupRequestBody).getBody();
    }

    /**
     * Update a users group
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been updated
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Group not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Group> groupsGroupIdentifierPutWithHttpInfo(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody) throws RestClientException {
        Object postBody = updateGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupIdentifierPut");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierPut");
        }
        
        // verify the required parameter 'updateGroupRequestBody' is set
        if (updateGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateGroupRequestBody' when calling groupsGroupIdentifierPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("groupIdentifier", groupIdentifier);
        String path = UriComponentsBuilder.fromPath("/groups/{groupIdentifier}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassign a list of users from a group
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void groupsGroupUsersDelete(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody) throws RestClientException {
        groupsGroupUsersDeleteWithHttpInfo(apiToken, group, unassingUsersGroupRequestBody);
    }

    /**
     * Unassign a list of users from a group
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> groupsGroupUsersDeleteWithHttpInfo(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody) throws RestClientException {
        Object postBody = unassingUsersGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupUsersDelete");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'group' when calling groupsGroupUsersDelete");
        }
        
        // verify the required parameter 'unassingUsersGroupRequestBody' is set
        if (unassingUsersGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unassingUsersGroupRequestBody' when calling groupsGroupUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group", group);
        String path = UriComponentsBuilder.fromPath("/groups/{group}/users").buildAndExpand(uriVariables).toUriString();

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
     * List users from a group
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * <p><b>200</b> - An array of users who belongs to the group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public List<User> groupsGroupUsersGet(String apiToken, String group) throws RestClientException {
        return groupsGroupUsersGetWithHttpInfo(apiToken, group).getBody();
    }

    /**
     * List users from a group
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * <p><b>200</b> - An array of users who belongs to the group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<List<User>> groupsGroupUsersGetWithHttpInfo(String apiToken, String group) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupUsersGet");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'group' when calling groupsGroupUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group", group);
        String path = UriComponentsBuilder.fromPath("/groups/{group}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<User>> returnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns users to a group
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * <p><b>201</b> - An array of users that have been assigned to group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @return InlineResponse201
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public InlineResponse201 groupsGroupUsersPut(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody) throws RestClientException {
        return groupsGroupUsersPutWithHttpInfo(apiToken, group, assignUserGroupRequestBody).getBody();
    }

    /**
     * Assigns users to a group
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * <p><b>201</b> - An array of users that have been assigned to group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @return ResponseEntity&lt;InlineResponse201&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<InlineResponse201> groupsGroupUsersPutWithHttpInfo(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody) throws RestClientException {
        Object postBody = assignUserGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupUsersPut");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'group' when calling groupsGroupUsersPut");
        }
        
        // verify the required parameter 'assignUserGroupRequestBody' is set
        if (assignUserGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignUserGroupRequestBody' when calling groupsGroupUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group", group);
        String path = UriComponentsBuilder.fromPath("/groups/{group}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<InlineResponse201> returnType = new ParameterizedTypeReference<InlineResponse201>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a user from a group
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * <p><b>204</b> - User has been removed from group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public void groupsGroupUsersUserDelete(String apiToken, String group, String user) throws RestClientException {
        groupsGroupUsersUserDeleteWithHttpInfo(apiToken, group, user);
    }

    /**
     * Removes a user from a group
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * <p><b>204</b> - User has been removed from group
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Void> groupsGroupUsersUserDeleteWithHttpInfo(String apiToken, String group, String user) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsGroupUsersUserDelete");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'group' when calling groupsGroupUsersUserDelete");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling groupsGroupUsersUserDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group", group);
        uriVariables.put("user", user);
        String path = UriComponentsBuilder.fromPath("/groups/{group}/users/{user}").buildAndExpand(uriVariables).toUriString();

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
     * Creates a new user group
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Group details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public Group groupsPost(String apiToken, CreateGroupRequestBody createGroupRequestBody) throws RestClientException {
        return groupsPostWithHttpInfo(apiToken, createGroupRequestBody).getBody();
    }

    /**
     * Creates a new user group
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Group details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return ResponseEntity&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    @Deprecated
    public ResponseEntity<Group> groupsPostWithHttpInfo(String apiToken, CreateGroupRequestBody createGroupRequestBody) throws RestClientException {
        Object postBody = createGroupRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling groupsPost");
        }
        
        // verify the required parameter 'createGroupRequestBody' is set
        if (createGroupRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createGroupRequestBody' when calling groupsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/groups").build().toUriString();

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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
}
