package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.AssignUserGroupRequestBody;
import com.iriusrisk.api.client.model.AssignUserGroupRequestBody1;
import com.iriusrisk.api.client.model.AssignUsersProductRequestBody;
import com.iriusrisk.api.client.model.CreateUserRequestBody;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.InlineResponse201;
import com.iriusrisk.api.client.model.ProductShortUsers;
import com.iriusrisk.api.client.model.UnassignUsersProductRequestBody;
import com.iriusrisk.api.client.model.UnassingUsersGroupRequestBody;
import com.iriusrisk.api.client.model.UnassingUsersGroupRequestBody1;
import com.iriusrisk.api.client.model.User;
import com.iriusrisk.api.client.model.UserDetailed;

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
@Component("com.iriusrisk.api.client.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefUsersDelete(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws RestClientException {
        productsRefUsersDeleteWithHttpInfo(apiToken, ref, unassignUsersProductRequestBody);
    }

    /**
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - All users have been unassigned
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefUsersDeleteWithHttpInfo(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws RestClientException {
        Object postBody = unassignUsersProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersDelete");
        }
        
        // verify the required parameter 'unassignUsersProductRequestBody' is set
        if (unassignUsersProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'unassignUsersProductRequestBody' when calling productsRefUsersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

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
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of users assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> productsRefUsersGet(String apiToken, String ref) throws RestClientException {
        return productsRefUsersGetWithHttpInfo(apiToken, ref).getBody();
    }

    /**
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * <p><b>200</b> - An array of users assigned to the product
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - Product not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> productsRefUsersGetWithHttpInfo(String apiToken, String ref) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersGet");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

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
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including users assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ProductShortUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShortUsers productsRefUsersPut(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws RestClientException {
        return productsRefUsersPutWithHttpInfo(apiToken, ref, assignUsersProductRequestBody).getBody();
    }

    /**
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>201</b> - Product details including users assigned
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ResponseEntity&lt;ProductShortUsers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShortUsers> productsRefUsersPutWithHttpInfo(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws RestClientException {
        Object postBody = assignUsersProductRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersPut");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersPut");
        }
        
        // verify the required parameter 'assignUsersProductRequestBody' is set
        if (assignUsersProductRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assignUsersProductRequestBody' when calling productsRefUsersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<ProductShortUsers> returnType = new ParameterizedTypeReference<ProductShortUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - User has been unassigned from the product
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void productsRefUsersUserDelete(String apiToken, String ref, String user) throws RestClientException {
        productsRefUsersUserDeleteWithHttpInfo(apiToken, ref, user);
    }

    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * <p><b>204</b> - User has been unassigned from the product
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> productsRefUsersUserDeleteWithHttpInfo(String apiToken, String ref, String user) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsRefUsersUserDelete");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsRefUsersUserDelete");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling productsRefUsersUserDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ref", ref);
        uriVariables.put("user", user);
        String path = UriComponentsBuilder.fromPath("/products/{ref}/users/{user}").buildAndExpand(uriVariables).toUriString();

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
     * List of all Users.
     * Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of users
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> usersGet(String apiToken) throws RestClientException {
        return usersGetWithHttpInfo(apiToken).getBody();
    }

    /**
     * List of all Users.
     * Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>200</b> - An array of users
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> usersGetWithHttpInfo(String apiToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling usersGet");
        }
        
        String path = UriComponentsBuilder.fromPath("/users").build().toUriString();

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
     * Creates a new user
     * Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - User has been created
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersPost(String apiToken, CreateUserRequestBody createUserRequestBody) throws RestClientException {
        usersPostWithHttpInfo(apiToken, createUserRequestBody);
    }

    /**
     * Creates a new user
     * Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * <p><b>201</b> - User has been created
     * <p><b>400</b> - Bad request
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersPostWithHttpInfo(String apiToken, CreateUserRequestBody createUserRequestBody) throws RestClientException {
        Object postBody = createUserRequestBody;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling usersPost");
        }
        
        // verify the required parameter 'createUserRequestBody' is set
        if (createUserRequestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUserRequestBody' when calling usersPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/users").build().toUriString();

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
     * Deletes a user
     * Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 
     * <p><b>204</b> - User has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - User not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersUsernameDelete(String apiToken, String username) throws RestClientException {
        usersUsernameDeleteWithHttpInfo(apiToken, username);
    }

    /**
     * Deletes a user
     * Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 
     * <p><b>204</b> - User has been deleted
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - User not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersUsernameDeleteWithHttpInfo(String apiToken, String username) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling usersUsernameDelete");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling usersUsernameDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/users/{username}").buildAndExpand(uriVariables).toUriString();

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
     * Get all the information of a user
     * Get all the relevant information of a user 
     * <p><b>200</b> - The data of the user
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return UserDetailed
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserDetailed usersUsernameGet(String apiToken, String username) throws RestClientException {
        return usersUsernameGetWithHttpInfo(apiToken, username).getBody();
    }

    /**
     * Get all the information of a user
     * Get all the relevant information of a user 
     * <p><b>200</b> - The data of the user
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ResponseEntity&lt;UserDetailed&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserDetailed> usersUsernameGetWithHttpInfo(String apiToken, String username) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling usersUsernameGet");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling usersUsernameGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/users/{username}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<UserDetailed> returnType = new ParameterizedTypeReference<UserDetailed>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Generates a user API token
     * Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 
     * <p><b>201</b> - The user API token
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - User not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String usersUsernameTokenPost(String apiToken, String username) throws RestClientException {
        return usersUsernameTokenPostWithHttpInfo(apiToken, username).getBody();
    }

    /**
     * Generates a user API token
     * Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 
     * <p><b>201</b> - The user API token
     * <p><b>401</b> - Authentication information is missing or invalid
     * <p><b>403</b> - API is not enabled
     * <p><b>404</b> - User not found
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> usersUsernameTokenPostWithHttpInfo(String apiToken, String username) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling usersUsernameTokenPost");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling usersUsernameTokenPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/users/{username}/token").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
