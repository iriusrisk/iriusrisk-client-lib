


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


import com.iriusrisk.restapi.client.model.CreateRoleRequestBody;
import com.iriusrisk.restapi.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(Configuration.getDefaultApiClient());
    }

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
     * Build call for rolesPost
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rolesPostCall(String apiToken, CreateRoleRequestBody createRoleRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createRoleRequestBody;

        // create path and map variables
        String localVarPath = "/roles";

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
    private com.squareup.okhttp.Call rolesPostValidateBeforeCall(String apiToken, CreateRoleRequestBody createRoleRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling rolesPost(Async)");
        }
        
        // verify the required parameter 'createRoleRequestBody' is set
        if (createRoleRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createRoleRequestBody' when calling rolesPost(Async)");
        }
        

        com.squareup.okhttp.Call call = rolesPostCall(apiToken, createRoleRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new Role
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void rolesPost(String apiToken, CreateRoleRequestBody createRoleRequestBody) throws ApiException {
        rolesPostWithHttpInfo(apiToken, createRoleRequestBody);
    }

    /**
     * Creates a new Role
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> rolesPostWithHttpInfo(String apiToken, CreateRoleRequestBody createRoleRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = rolesPostValidateBeforeCall(apiToken, createRoleRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Creates a new Role (asynchronously)
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createRoleRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rolesPostAsync(String apiToken, CreateRoleRequestBody createRoleRequestBody, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rolesPostValidateBeforeCall(apiToken, createRoleRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for rolesRoleNameDelete
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rolesRoleNameDeleteCall(String apiToken, String roleName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/roles/{role_name}"
            .replaceAll("\\{" + "role_name" + "\\}", apiClient.escapeString(roleName.toString()));

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
    private com.squareup.okhttp.Call rolesRoleNameDeleteValidateBeforeCall(String apiToken, String roleName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling rolesRoleNameDelete(Async)");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new ApiException("Missing the required parameter 'roleName' when calling rolesRoleNameDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = rolesRoleNameDeleteCall(apiToken, roleName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes an existing role
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void rolesRoleNameDelete(String apiToken, String roleName) throws ApiException {
        rolesRoleNameDeleteWithHttpInfo(apiToken, roleName);
    }

    /**
     * Deletes an existing role
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> rolesRoleNameDeleteWithHttpInfo(String apiToken, String roleName) throws ApiException {
        com.squareup.okhttp.Call call = rolesRoleNameDeleteValidateBeforeCall(apiToken, roleName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an existing role (asynchronously)
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param roleName Role name to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rolesRoleNameDeleteAsync(String apiToken, String roleName, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rolesRoleNameDeleteValidateBeforeCall(apiToken, roleName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
