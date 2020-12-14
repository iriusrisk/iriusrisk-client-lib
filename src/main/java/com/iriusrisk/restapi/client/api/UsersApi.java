


package com.iriusrisk.restapi.client.api;

import com.iriusrisk.restapi.client.ApiCallback;
import com.iriusrisk.restapi.client.ApiClient;
import com.iriusrisk.restapi.client.ApiException;
import com.iriusrisk.restapi.client.ApiResponse;
import com.iriusrisk.restapi.client.Configuration;
import com.iriusrisk.restapi.client.Pair;
import com.iriusrisk.restapi.client.ProgressRequestBody;
import com.iriusrisk.restapi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.iriusrisk.restapi.client.model.AssignUserGroupRequestBody;
import com.iriusrisk.restapi.client.model.AssignUserGroupRequestBody1;
import com.iriusrisk.restapi.client.model.AssignUsersProductRequestBody;
import com.iriusrisk.restapi.client.model.CreateUserRequestBody;
import com.iriusrisk.restapi.client.model.Error;
import com.iriusrisk.restapi.client.model.InlineResponse201;
import com.iriusrisk.restapi.client.model.ProductShortUsers;
import com.iriusrisk.restapi.client.model.UnassignUsersProductRequestBody;
import com.iriusrisk.restapi.client.model.UnassingUsersGroupRequestBody;
import com.iriusrisk.restapi.client.model.UnassingUsersGroupRequestBody1;
import com.iriusrisk.restapi.client.model.User;
import com.iriusrisk.restapi.client.model.UserDetailed;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

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
     * Build call for businessunitsBusinessUnitNameUsersDelete
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersDeleteCall(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = unassingUsersGroupRequestBody;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitName}/users"
            .replaceAll("\\{" + "businessUnitName" + "\\}", apiClient.escapeString(businessUnitName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersDelete(Async)");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new ApiException("Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersDelete(Async)");
        }
        
        // verify the required parameter 'unassingUsersGroupRequestBody' is set
        if (unassingUsersGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'unassingUsersGroupRequestBody' when calling businessunitsBusinessUnitNameUsersDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersDeleteCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unassign a list of users from a business unit
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void businessunitsBusinessUnitNameUsersDelete(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody) throws ApiException {
        businessunitsBusinessUnitNameUsersDeleteWithHttpInfo(apiToken, businessUnitName, unassingUsersGroupRequestBody);
    }

    /**
     * Unassign a list of users from a business unit
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> businessunitsBusinessUnitNameUsersDeleteWithHttpInfo(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unassign a list of users from a business unit (asynchronously)
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersDeleteAsync(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for businessunitsBusinessUnitNameUsersGet
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersGetCall(String apiToken, String businessUnitName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitName}/users"
            .replaceAll("\\{" + "businessUnitName" + "\\}", apiClient.escapeString(businessUnitName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersGetValidateBeforeCall(String apiToken, String businessUnitName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersGet(Async)");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new ApiException("Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersGet(Async)");
        }
        

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersGetCall(apiToken, businessUnitName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List users from a business unit
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @return List&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<User> businessunitsBusinessUnitNameUsersGet(String apiToken, String businessUnitName) throws ApiException {
        ApiResponse<List<User>> resp = businessunitsBusinessUnitNameUsersGetWithHttpInfo(apiToken, businessUnitName);
        return resp.getData();
    }

    /**
     * List users from a business unit
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @return ApiResponse&lt;List&lt;User&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<User>> businessunitsBusinessUnitNameUsersGetWithHttpInfo(String apiToken, String businessUnitName) throws ApiException {
        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersGetValidateBeforeCall(apiToken, businessUnitName, null, null);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List users from a business unit (asynchronously)
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersGetAsync(String apiToken, String businessUnitName, final ApiCallback<List<User>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersGetValidateBeforeCall(apiToken, businessUnitName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessunitsBusinessUnitNameUsersPut
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersPutCall(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = assignUserGroupRequestBody;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitName}/users"
            .replaceAll("\\{" + "businessUnitName" + "\\}", apiClient.escapeString(businessUnitName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersPutValidateBeforeCall(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersPut(Async)");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new ApiException("Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersPut(Async)");
        }
        
        // verify the required parameter 'assignUserGroupRequestBody' is set
        if (assignUserGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'assignUserGroupRequestBody' when calling businessunitsBusinessUnitNameUsersPut(Async)");
        }
        

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersPutCall(apiToken, businessUnitName, assignUserGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Assigns users to a business unit
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse201 businessunitsBusinessUnitNameUsersPut(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody) throws ApiException {
        ApiResponse<InlineResponse201> resp = businessunitsBusinessUnitNameUsersPutWithHttpInfo(apiToken, businessUnitName, assignUserGroupRequestBody);
        return resp.getData();
    }

    /**
     * Assigns users to a business unit
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse201> businessunitsBusinessUnitNameUsersPutWithHttpInfo(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersPutValidateBeforeCall(apiToken, businessUnitName, assignUserGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns users to a business unit (asynchronously)
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersPutAsync(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ApiCallback<InlineResponse201> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersPutValidateBeforeCall(apiToken, businessUnitName, assignUserGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessunitsBusinessUnitNameUsersUserDelete
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersUserDeleteCall(String apiToken, String businessUnitName, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitName}/users/{user}"
            .replaceAll("\\{" + "businessUnitName" + "\\}", apiClient.escapeString(businessUnitName.toString()))
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(String apiToken, String businessUnitName, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new ApiException("Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling businessunitsBusinessUnitNameUsersUserDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersUserDeleteCall(apiToken, businessUnitName, user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes a user from a business unit
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void businessunitsBusinessUnitNameUsersUserDelete(String apiToken, String businessUnitName, String user) throws ApiException {
        businessunitsBusinessUnitNameUsersUserDeleteWithHttpInfo(apiToken, businessUnitName, user);
    }

    /**
     * Removes a user from a business unit
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> businessunitsBusinessUnitNameUsersUserDeleteWithHttpInfo(String apiToken, String businessUnitName, String user) throws ApiException {
        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(apiToken, businessUnitName, user, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a user from a business unit (asynchronously)
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     * @param apiToken Authentication token (required)
     * @param businessUnitName name of the business unit (required)
     * @param user user to be removed from business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call businessunitsBusinessUnitNameUsersUserDeleteAsync(String apiToken, String businessUnitName, String user, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(apiToken, businessUnitName, user, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for groupsGroupUsersDelete
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersDeleteCall(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = unassingUsersGroupRequestBody;

        // create path and map variables
        String localVarPath = "/groups/{group}/users"
            .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call groupsGroupUsersDeleteValidateBeforeCall(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupUsersDelete(Async)");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling groupsGroupUsersDelete(Async)");
        }
        
        // verify the required parameter 'unassingUsersGroupRequestBody' is set
        if (unassingUsersGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'unassingUsersGroupRequestBody' when calling groupsGroupUsersDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = groupsGroupUsersDeleteCall(apiToken, group, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unassign a list of users from a group
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public void groupsGroupUsersDelete(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody) throws ApiException {
        groupsGroupUsersDeleteWithHttpInfo(apiToken, group, unassingUsersGroupRequestBody);
    }

    /**
     * Unassign a list of users from a group
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> groupsGroupUsersDeleteWithHttpInfo(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = groupsGroupUsersDeleteValidateBeforeCall(apiToken, group, unassingUsersGroupRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unassign a list of users from a group (asynchronously)
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param unassingUsersGroupRequestBody JSON object that contains information to unassign users from group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersDeleteAsync(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = groupsGroupUsersDeleteValidateBeforeCall(apiToken, group, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for groupsGroupUsersGet
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersGetCall(String apiToken, String group, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups/{group}/users"
            .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call groupsGroupUsersGetValidateBeforeCall(String apiToken, String group, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupUsersGet(Async)");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling groupsGroupUsersGet(Async)");
        }
        

        com.squareup.okhttp.Call call = groupsGroupUsersGetCall(apiToken, group, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List users from a group
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @return List&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public List<User> groupsGroupUsersGet(String apiToken, String group) throws ApiException {
        ApiResponse<List<User>> resp = groupsGroupUsersGetWithHttpInfo(apiToken, group);
        return resp.getData();
    }

    /**
     * List users from a group
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @return ApiResponse&lt;List&lt;User&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<User>> groupsGroupUsersGetWithHttpInfo(String apiToken, String group) throws ApiException {
        com.squareup.okhttp.Call call = groupsGroupUsersGetValidateBeforeCall(apiToken, group, null, null);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List users from a group (asynchronously)
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersGetAsync(String apiToken, String group, final ApiCallback<List<User>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = groupsGroupUsersGetValidateBeforeCall(apiToken, group, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for groupsGroupUsersPut
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersPutCall(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = assignUserGroupRequestBody;

        // create path and map variables
        String localVarPath = "/groups/{group}/users"
            .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call groupsGroupUsersPutValidateBeforeCall(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupUsersPut(Async)");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling groupsGroupUsersPut(Async)");
        }
        
        // verify the required parameter 'assignUserGroupRequestBody' is set
        if (assignUserGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'assignUserGroupRequestBody' when calling groupsGroupUsersPut(Async)");
        }
        

        com.squareup.okhttp.Call call = groupsGroupUsersPutCall(apiToken, group, assignUserGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Assigns users to a group
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @return InlineResponse201
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public InlineResponse201 groupsGroupUsersPut(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody) throws ApiException {
        ApiResponse<InlineResponse201> resp = groupsGroupUsersPutWithHttpInfo(apiToken, group, assignUserGroupRequestBody);
        return resp.getData();
    }

    /**
     * Assigns users to a group
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @return ApiResponse&lt;InlineResponse201&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<InlineResponse201> groupsGroupUsersPutWithHttpInfo(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = groupsGroupUsersPutValidateBeforeCall(apiToken, group, assignUserGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns users to a group (asynchronously)
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param assignUserGroupRequestBody JSON object that contains information to assign users to group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersPutAsync(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ApiCallback<InlineResponse201> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = groupsGroupUsersPutValidateBeforeCall(apiToken, group, assignUserGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse201>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for groupsGroupUsersUserDelete
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersUserDeleteCall(String apiToken, String group, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups/{group}/users/{user}"
            .replaceAll("\\{" + "group" + "\\}", apiClient.escapeString(group.toString()))
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call groupsGroupUsersUserDeleteValidateBeforeCall(String apiToken, String group, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling groupsGroupUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling groupsGroupUsersUserDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = groupsGroupUsersUserDeleteCall(apiToken, group, user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes a user from a group
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public void groupsGroupUsersUserDelete(String apiToken, String group, String user) throws ApiException {
        groupsGroupUsersUserDeleteWithHttpInfo(apiToken, group, user);
    }

    /**
     * Removes a user from a group
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> groupsGroupUsersUserDeleteWithHttpInfo(String apiToken, String group, String user) throws ApiException {
        com.squareup.okhttp.Call call = groupsGroupUsersUserDeleteValidateBeforeCall(apiToken, group, user, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes a user from a group (asynchronously)
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     * @param apiToken Authentication token (required)
     * @param group name of the group (required)
     * @param user user to be removed from group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public com.squareup.okhttp.Call groupsGroupUsersUserDeleteAsync(String apiToken, String group, String user, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = groupsGroupUsersUserDeleteValidateBeforeCall(apiToken, group, user, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for productsRefUsersDelete
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersDeleteCall(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = unassignUsersProductRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/users"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefUsersDeleteValidateBeforeCall(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefUsersDelete(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefUsersDelete(Async)");
        }
        
        // verify the required parameter 'unassignUsersProductRequestBody' is set
        if (unassignUsersProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'unassignUsersProductRequestBody' when calling productsRefUsersDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefUsersDeleteCall(apiToken, ref, unassignUsersProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void productsRefUsersDelete(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws ApiException {
        productsRefUsersDeleteWithHttpInfo(apiToken, ref, unassignUsersProductRequestBody);
    }

    /**
     * Unassigns a list of users from a product.
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> productsRefUsersDeleteWithHttpInfo(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefUsersDeleteValidateBeforeCall(apiToken, ref, unassignUsersProductRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unassigns a list of users from a product. (asynchronously)
     * Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignUsersProductRequestBody JSON object that contains information to unassign users from product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersDeleteAsync(String apiToken, String ref, UnassignUsersProductRequestBody unassignUsersProductRequestBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = productsRefUsersDeleteValidateBeforeCall(apiToken, ref, unassignUsersProductRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for productsRefUsersGet
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/users"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefUsersGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefUsersGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefUsersGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefUsersGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> productsRefUsersGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<String>> resp = productsRefUsersGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * List all users assigned to a product
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> productsRefUsersGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefUsersGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all users assigned to a product (asynchronously)
     * List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersGetAsync(String apiToken, String ref, final ApiCallback<List<String>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = productsRefUsersGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefUsersPut
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersPutCall(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = assignUsersProductRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/users"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefUsersPutValidateBeforeCall(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefUsersPut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefUsersPut(Async)");
        }
        
        // verify the required parameter 'assignUsersProductRequestBody' is set
        if (assignUsersProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'assignUsersProductRequestBody' when calling productsRefUsersPut(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefUsersPutCall(apiToken, ref, assignUsersProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ProductShortUsers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductShortUsers productsRefUsersPut(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws ApiException {
        ApiResponse<ProductShortUsers> resp = productsRefUsersPutWithHttpInfo(apiToken, ref, assignUsersProductRequestBody);
        return resp.getData();
    }

    /**
     * Assigns users to a product.
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @return ApiResponse&lt;ProductShortUsers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductShortUsers> productsRefUsersPutWithHttpInfo(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefUsersPutValidateBeforeCall(apiToken, ref, assignUsersProductRequestBody, null, null);
        Type localVarReturnType = new TypeToken<ProductShortUsers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns users to a product. (asynchronously)
     * Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignUsersProductRequestBody JSON data that contains the information to assign users to product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersPutAsync(String apiToken, String ref, AssignUsersProductRequestBody assignUsersProductRequestBody, final ApiCallback<ProductShortUsers> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = productsRefUsersPutValidateBeforeCall(apiToken, ref, assignUsersProductRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductShortUsers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefUsersUserDelete
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersUserDeleteCall(String apiToken, String ref, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/users/{user}"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefUsersUserDeleteValidateBeforeCall(String apiToken, String ref, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefUsersUserDelete(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new ApiException("Missing the required parameter 'user' when calling productsRefUsersUserDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefUsersUserDeleteCall(apiToken, ref, user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void productsRefUsersUserDelete(String apiToken, String ref, String user) throws ApiException {
        productsRefUsersUserDeleteWithHttpInfo(apiToken, ref, user);
    }

    /**
     * Unassigns a user from a product
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> productsRefUsersUserDeleteWithHttpInfo(String apiToken, String ref, String user) throws ApiException {
        com.squareup.okhttp.Call call = productsRefUsersUserDeleteValidateBeforeCall(apiToken, ref, user, null, null);
        return apiClient.execute(call);
    }

    /**
     * Unassigns a user from a product (asynchronously)
     * Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param user Username of the user who will be unassigned from the product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefUsersUserDeleteAsync(String apiToken, String ref, String user, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = productsRefUsersUserDeleteValidateBeforeCall(apiToken, ref, user, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for usersGet
     * @param apiToken Authentication token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersGetCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usersGetValidateBeforeCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling usersGet(Async)");
        }
        

        com.squareup.okhttp.Call call = usersGetCall(apiToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List of all Users.
     * Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return List&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<User> usersGet(String apiToken) throws ApiException {
        ApiResponse<List<User>> resp = usersGetWithHttpInfo(apiToken);
        return resp.getData();
    }

    /**
     * List of all Users.
     * Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return ApiResponse&lt;List&lt;User&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<User>> usersGetWithHttpInfo(String apiToken) throws ApiException {
        com.squareup.okhttp.Call call = usersGetValidateBeforeCall(apiToken, null, null);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List of all Users. (asynchronously)
     * Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersGetAsync(String apiToken, final ApiCallback<List<User>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usersGetValidateBeforeCall(apiToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<User>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for usersPost
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersPostCall(String apiToken, CreateUserRequestBody createUserRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createUserRequestBody;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usersPostValidateBeforeCall(String apiToken, CreateUserRequestBody createUserRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling usersPost(Async)");
        }
        
        // verify the required parameter 'createUserRequestBody' is set
        if (createUserRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createUserRequestBody' when calling usersPost(Async)");
        }
        

        com.squareup.okhttp.Call call = usersPostCall(apiToken, createUserRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new user
     * Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void usersPost(String apiToken, CreateUserRequestBody createUserRequestBody) throws ApiException {
        usersPostWithHttpInfo(apiToken, createUserRequestBody);
    }

    /**
     * Creates a new user
     * Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> usersPostWithHttpInfo(String apiToken, CreateUserRequestBody createUserRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = usersPostValidateBeforeCall(apiToken, createUserRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates a new user (asynchronously)
     * Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createUserRequestBody JSON data that contains information to creates new user (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersPostAsync(String apiToken, CreateUserRequestBody createUserRequestBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usersPostValidateBeforeCall(apiToken, createUserRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for usersUsernameDelete
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersUsernameDeleteCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{username}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usersUsernameDeleteValidateBeforeCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling usersUsernameDelete(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling usersUsernameDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = usersUsernameDeleteCall(apiToken, username, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a user
     * Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void usersUsernameDelete(String apiToken, String username) throws ApiException {
        usersUsernameDeleteWithHttpInfo(apiToken, username);
    }

    /**
     * Deletes a user
     * Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> usersUsernameDeleteWithHttpInfo(String apiToken, String username) throws ApiException {
        com.squareup.okhttp.Call call = usersUsernameDeleteValidateBeforeCall(apiToken, username, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a user (asynchronously)
     * Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersUsernameDeleteAsync(String apiToken, String username, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usersUsernameDeleteValidateBeforeCall(apiToken, username, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for usersUsernameGet
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersUsernameGetCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{username}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usersUsernameGetValidateBeforeCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling usersUsernameGet(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling usersUsernameGet(Async)");
        }
        

        com.squareup.okhttp.Call call = usersUsernameGetCall(apiToken, username, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all the information of a user
     * Get all the relevant information of a user 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return UserDetailed
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserDetailed usersUsernameGet(String apiToken, String username) throws ApiException {
        ApiResponse<UserDetailed> resp = usersUsernameGetWithHttpInfo(apiToken, username);
        return resp.getData();
    }

    /**
     * Get all the information of a user
     * Get all the relevant information of a user 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ApiResponse&lt;UserDetailed&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserDetailed> usersUsernameGetWithHttpInfo(String apiToken, String username) throws ApiException {
        com.squareup.okhttp.Call call = usersUsernameGetValidateBeforeCall(apiToken, username, null, null);
        Type localVarReturnType = new TypeToken<UserDetailed>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all the information of a user (asynchronously)
     * Get all the relevant information of a user 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersUsernameGetAsync(String apiToken, String username, final ApiCallback<UserDetailed> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usersUsernameGetValidateBeforeCall(apiToken, username, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserDetailed>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for usersUsernameTokenPost
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usersUsernameTokenPostCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{username}/token"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usersUsernameTokenPostValidateBeforeCall(String apiToken, String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling usersUsernameTokenPost(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling usersUsernameTokenPost(Async)");
        }
        

        com.squareup.okhttp.Call call = usersUsernameTokenPostCall(apiToken, username, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generates a user API token
     * Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String usersUsernameTokenPost(String apiToken, String username) throws ApiException {
        ApiResponse<String> resp = usersUsernameTokenPostWithHttpInfo(apiToken, username);
        return resp.getData();
    }

    /**
     * Generates a user API token
     * Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> usersUsernameTokenPostWithHttpInfo(String apiToken, String username) throws ApiException {
        com.squareup.okhttp.Call call = usersUsernameTokenPostValidateBeforeCall(apiToken, username, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generates a user API token (asynchronously)
     * Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 
     * @param apiToken Authentication token (required)
     * @param username User&#39;s username (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usersUsernameTokenPostAsync(String apiToken, String username, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usersUsernameTokenPostValidateBeforeCall(apiToken, username, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
