package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Body1;
import com.iriusrisk.api.client.model.Body17;
import com.iriusrisk.api.client.model.Body18;
import com.iriusrisk.api.client.model.Body2;
import com.iriusrisk.api.client.model.Body3;
import com.iriusrisk.api.client.model.Body4;
import com.iriusrisk.api.client.model.Body5;
import com.iriusrisk.api.client.model.Body6;
import com.iriusrisk.api.client.model.Body7;
import com.iriusrisk.api.client.model.Body8;
import com.iriusrisk.api.client.model.Group;
import com.iriusrisk.api.client.model.InlineResponse200;
import com.iriusrisk.api.client.model.InlineResponse201;
import com.iriusrisk.api.client.model.ProductShortGroups;
import com.iriusrisk.api.client.model.User;

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
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Name of the business unit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessunitIdDelete(String businessunitId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Gets the business unit details.
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * <p><b>200</b> - Business unit details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Name of the business unit
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> businessunitsBusinessunitIdGet(String businessunitId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a users business unit
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Business unit has been updated
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Unique ID of the business unit
     * @param body Object that contains information of the fields
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group businessunitsBusinessunitIdPut(String businessunitId, Body6 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling businessunitsBusinessunitIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassign a list of users from a business unit
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Name of the business unit
     * @param body Object that contains information to unassign users from business unit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessunitIdUsersDelete(String businessunitId, Body8 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdUsersDelete");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling businessunitsBusinessunitIdUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}/users").buildAndExpand(uriVariables).toUriString();
        
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
     * List users from a business unit
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * <p><b>200</b> - An array of users who belongs to the business unit
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Name of the business unit
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> businessunitsBusinessunitIdUsersGet(String businessunitId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<User>> returnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns users to a business unit
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * <p><b>201</b> - An array of users that have been assigned to business unit
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitId Name of the business unit
     * @param body Object that contains information to assign users to business unit
     * @return InlineResponse201
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse201 businessunitsBusinessunitIdUsersPut(String businessunitId, Body7 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'businessunitId' is set
        if (businessunitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitId' when calling businessunitsBusinessunitIdUsersPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling businessunitsBusinessunitIdUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunit-id", businessunitId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunit-id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse201> returnType = new ParameterizedTypeReference<InlineResponse201>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a user from a business unit
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * <p><b>204</b> - User has been removed from business unit
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param businessunitsId Name of the business unit
     * @param userId Username of the user to be removed from business unit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessunitsBusinessunitsIdUsersUserIdDelete(String businessunitsId, String userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'businessunitsId' is set
        if (businessunitsId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessunitsId' when calling businessunitsBusinessunitsIdUsersUserIdDelete");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling businessunitsBusinessunitsIdUsersUserIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessunits-id", businessunitsId);
        uriVariables.put("user-id", userId);
        String path = UriComponentsBuilder.fromPath("/businessunits/{businessunits-id}/users/{user-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Gets a list of all business units
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of business units
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> businessunitsGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/businessunits").build().toUriString();
        
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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Creates a new user business unit
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Business Unit details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param body Object that contains information of the fields
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group businessunitsPost(Body5 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling businessunitsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/businessunits").build().toUriString();
        
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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets a list of all groups
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of groups
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> groupsGet() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/groups").build().toUriString();
        
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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Deletes a users group
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been deleted
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void groupsGroupIdDelete(String groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Gets the group details.
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * <p><b>200</b> - Group details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> groupsGroupIdGet(String groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<Group>> returnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a users group
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>204</b> - Group has been updated
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Unique ID of the group
     * @param body Object that contains information of the fields
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group groupsGroupIdPut(String groupId, Body2 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling groupsGroupIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassign a list of users from a group
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @param body Object that contains information to unassign users from group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void groupsGroupIdUsersDelete(String groupId, Body4 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdUsersDelete");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling groupsGroupIdUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}/users").buildAndExpand(uriVariables).toUriString();
        
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
     * List users from a group
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * <p><b>200</b> - An array of users who belongs to the group
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> groupsGroupIdUsersGet(String groupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<User>> returnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns users to a group
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * <p><b>201</b> - An array of users that have been assigned to group
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @param body Object that contains information to assign users to group
     * @return InlineResponse201
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse201 groupsGroupIdUsersPut(String groupId, Body3 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdUsersPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling groupsGroupIdUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}/users").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse201> returnType = new ParameterizedTypeReference<InlineResponse201>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Removes a user from a group
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * <p><b>204</b> - User has been removed from group
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param groupId Name of the group
     * @param userId Username of the user to be removed from group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void groupsGroupIdUsersUserIdDelete(String groupId, String userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling groupsGroupIdUsersUserIdDelete");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling groupsGroupIdUsersUserIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("group-id", groupId);
        uriVariables.put("user-id", userId);
        String path = UriComponentsBuilder.fromPath("/groups/{group-id}/users/{user-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Creates a new user group
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - Group details
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param body Object that contains information of the fields
     * @return Group
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Group groupsPost(Body1 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling groupsPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/groups").build().toUriString();
        
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

        ParameterizedTypeReference<Group> returnType = new ParameterizedTypeReference<Group>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassigns a list of user groups from a product.
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>200</b> - An object with an array of user groups that have been unassigned and an array of user groups that have not been found in the project
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param body Object that contains information to unassign groups from a product
     * @return InlineResponse200
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse200 productsProductIdGroupsDelete(String productId, Body18 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdGroupsDelete");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling productsProductIdGroupsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/groups").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse200> returnType = new ParameterizedTypeReference<InlineResponse200>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List all groups assigned to a product
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * <p><b>200</b> - An array of groups assigned to the product
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> productsProductIdGroupsGet(String productId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdGroupsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/groups").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Assigns groups of users to a product.
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including groups assigned
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid or not granted to perform this action.
     * <p><b>403</b> - Forbidden operation
     * <p><b>404</b> - Item/s not found
     * <p><b>0</b> - Unexpected error
     * @param productId ID for product
     * @param body Object that contains information to assign groups to product
     * @return ProductShortGroups
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShortGroups productsProductIdGroupsPut(String productId, Body17 body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling productsProductIdGroupsPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling productsProductIdGroupsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product-id", productId);
        String path = UriComponentsBuilder.fromPath("/products/{product-id}/groups").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProductShortGroups> returnType = new ParameterizedTypeReference<ProductShortGroups>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
