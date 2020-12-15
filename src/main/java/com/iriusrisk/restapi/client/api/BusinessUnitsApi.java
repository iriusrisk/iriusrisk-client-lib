


package com.iriusrisk.restapi.client.api;

import com.squareup.okhttp.Call;
import com.google.gson.reflect.TypeToken;
import com.iriusrisk.restapi.client.ApiCallback;
import com.iriusrisk.restapi.client.ApiClient;
import com.iriusrisk.restapi.client.ApiException;
import com.iriusrisk.restapi.client.ApiResponse;
import com.iriusrisk.restapi.client.Configuration;
import com.iriusrisk.restapi.client.Pair;
import com.iriusrisk.restapi.client.ProgressRequestBody;
import com.iriusrisk.restapi.client.ProgressResponseBody;
import com.iriusrisk.restapi.client.model.AssignUserGroupRequestBody;
import com.iriusrisk.restapi.client.model.AssignUserGroupRequestBody1;
import com.iriusrisk.restapi.client.model.CreateGroupRequestBody;
import com.iriusrisk.restapi.client.model.CreateGroupRequestBody1;
import com.iriusrisk.restapi.client.model.Group;
import com.iriusrisk.restapi.client.model.InlineResponse201;
import com.iriusrisk.restapi.client.model.UnassingUsersGroupRequestBody;
import com.iriusrisk.restapi.client.model.UnassingUsersGroupRequestBody1;
import com.iriusrisk.restapi.client.model.UpdateGroupRequestBody;
import com.iriusrisk.restapi.client.model.UpdateGroupRequestBody1;
import com.iriusrisk.restapi.client.model.User;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessUnitsApi {
    private ApiClient apiClient;

    public BusinessUnitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BusinessUnitsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for businessunitsBusinessUnitIdentifierDelete
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call businessunitsBusinessUnitIdentifierDeleteCall(String apiToken, String businessUnitIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitIdentifier}"
            .replaceAll("\\{" + "businessUnitIdentifier" + "\\}", apiClient.escapeString(businessUnitIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitIdentifierDeleteValidateBeforeCall(String apiToken, String businessUnitIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierDelete(Async)");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new ApiException("Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierDelete(Async)");
        }
        

        Call call = businessunitsBusinessUnitIdentifierDeleteCall(apiToken, businessUnitIdentifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a users business unit
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void businessunitsBusinessUnitIdentifierDelete(String apiToken, String businessUnitIdentifier) throws ApiException {
        businessunitsBusinessUnitIdentifierDeleteWithHttpInfo(apiToken, businessUnitIdentifier);
    }

    /**
     * Deletes a users business unit
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> businessunitsBusinessUnitIdentifierDeleteWithHttpInfo(String apiToken, String businessUnitIdentifier) throws ApiException {
        Call call = businessunitsBusinessUnitIdentifierDeleteValidateBeforeCall(apiToken, businessUnitIdentifier, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a users business unit (asynchronously)
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call businessunitsBusinessUnitIdentifierDeleteAsync(String apiToken, String businessUnitIdentifier, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitIdentifierDeleteValidateBeforeCall(apiToken, businessUnitIdentifier, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for businessunitsBusinessUnitIdentifierGet
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call businessunitsBusinessUnitIdentifierGetCall(String apiToken, String businessUnitIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitIdentifier}"
            .replaceAll("\\{" + "businessUnitIdentifier" + "\\}", apiClient.escapeString(businessUnitIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitIdentifierGetValidateBeforeCall(String apiToken, String businessUnitIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierGet(Async)");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new ApiException("Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierGet(Async)");
        }
        

        Call call = businessunitsBusinessUnitIdentifierGetCall(apiToken, businessUnitIdentifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the business unit details.
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return List&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Group> businessunitsBusinessUnitIdentifierGet(String apiToken, String businessUnitIdentifier) throws ApiException {
        ApiResponse<List<Group>> resp = businessunitsBusinessUnitIdentifierGetWithHttpInfo(apiToken, businessUnitIdentifier);
        return resp.getData();
    }

    /**
     * Gets the business unit details.
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @return ApiResponse&lt;List&lt;Group&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Group>> businessunitsBusinessUnitIdentifierGetWithHttpInfo(String apiToken, String businessUnitIdentifier) throws ApiException {
        Call call = businessunitsBusinessUnitIdentifierGetValidateBeforeCall(apiToken, businessUnitIdentifier, null, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the business unit details. (asynchronously)
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique name of the business unit (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call businessunitsBusinessUnitIdentifierGetAsync(String apiToken, String businessUnitIdentifier, final ApiCallback<List<Group>> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitIdentifierGetValidateBeforeCall(apiToken, businessUnitIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessunitsBusinessUnitIdentifierPut
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call businessunitsBusinessUnitIdentifierPutCall(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateGroupRequestBody;

        // create path and map variables
        String localVarPath = "/businessunits/{businessUnitIdentifier}"
            .replaceAll("\\{" + "businessUnitIdentifier" + "\\}", apiClient.escapeString(businessUnitIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitIdentifierPutValidateBeforeCall(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitIdentifierPut(Async)");
        }
        
        // verify the required parameter 'businessUnitIdentifier' is set
        if (businessUnitIdentifier == null) {
            throw new ApiException("Missing the required parameter 'businessUnitIdentifier' when calling businessunitsBusinessUnitIdentifierPut(Async)");
        }
        
        // verify the required parameter 'updateGroupRequestBody' is set
        if (updateGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'updateGroupRequestBody' when calling businessunitsBusinessUnitIdentifierPut(Async)");
        }
        

        Call call = businessunitsBusinessUnitIdentifierPutCall(apiToken, businessUnitIdentifier, updateGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a users business unit
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Group businessunitsBusinessUnitIdentifierPut(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody) throws ApiException {
        ApiResponse<Group> resp = businessunitsBusinessUnitIdentifierPutWithHttpInfo(apiToken, businessUnitIdentifier, updateGroupRequestBody);
        return resp.getData();
    }

    /**
     * Update a users business unit
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Group> businessunitsBusinessUnitIdentifierPutWithHttpInfo(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody) throws ApiException {
        Call call = businessunitsBusinessUnitIdentifierPutValidateBeforeCall(apiToken, businessUnitIdentifier, updateGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a users business unit (asynchronously)
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param businessUnitIdentifier unique ref of the business unit (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call businessunitsBusinessUnitIdentifierPutAsync(String apiToken, String businessUnitIdentifier, UpdateGroupRequestBody1 updateGroupRequestBody, final ApiCallback<Group> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitIdentifierPutValidateBeforeCall(apiToken, businessUnitIdentifier, updateGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
    public Call businessunitsBusinessUnitNameUsersDeleteCall(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = businessunitsBusinessUnitNameUsersDeleteCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
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
        Call call = businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, null, null);
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
    public Call businessunitsBusinessUnitNameUsersDeleteAsync(String apiToken, String businessUnitName, UnassingUsersGroupRequestBody1 unassingUsersGroupRequestBody, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitNameUsersDeleteValidateBeforeCall(apiToken, businessUnitName, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
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
    public Call businessunitsBusinessUnitNameUsersGetCall(String apiToken, String businessUnitName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitNameUsersGetValidateBeforeCall(String apiToken, String businessUnitName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsBusinessUnitNameUsersGet(Async)");
        }
        
        // verify the required parameter 'businessUnitName' is set
        if (businessUnitName == null) {
            throw new ApiException("Missing the required parameter 'businessUnitName' when calling businessunitsBusinessUnitNameUsersGet(Async)");
        }
        

        Call call = businessunitsBusinessUnitNameUsersGetCall(apiToken, businessUnitName, progressListener, progressRequestListener);
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
        Call call = businessunitsBusinessUnitNameUsersGetValidateBeforeCall(apiToken, businessUnitName, null, null);
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
    public Call businessunitsBusinessUnitNameUsersGetAsync(String apiToken, String businessUnitName, final ApiCallback<List<User>> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitNameUsersGetValidateBeforeCall(apiToken, businessUnitName, progressListener, progressRequestListener);
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
    public Call businessunitsBusinessUnitNameUsersPutCall(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitNameUsersPutValidateBeforeCall(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = businessunitsBusinessUnitNameUsersPutCall(apiToken, businessUnitName, assignUserGroupRequestBody, progressListener, progressRequestListener);
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
        Call call = businessunitsBusinessUnitNameUsersPutValidateBeforeCall(apiToken, businessUnitName, assignUserGroupRequestBody, null, null);
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
    public Call businessunitsBusinessUnitNameUsersPutAsync(String apiToken, String businessUnitName, AssignUserGroupRequestBody1 assignUserGroupRequestBody, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitNameUsersPutValidateBeforeCall(apiToken, businessUnitName, assignUserGroupRequestBody, progressListener, progressRequestListener);
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
    public Call businessunitsBusinessUnitNameUsersUserDeleteCall(String apiToken, String businessUnitName, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(String apiToken, String businessUnitName, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = businessunitsBusinessUnitNameUsersUserDeleteCall(apiToken, businessUnitName, user, progressListener, progressRequestListener);
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
        Call call = businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(apiToken, businessUnitName, user, null, null);
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
    public Call businessunitsBusinessUnitNameUsersUserDeleteAsync(String apiToken, String businessUnitName, String user, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = businessunitsBusinessUnitNameUsersUserDeleteValidateBeforeCall(apiToken, businessUnitName, user, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for businessunitsGet
     * @param apiToken Authentication token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call businessunitsGetCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/businessunits";

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsGetValidateBeforeCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsGet(Async)");
        }
        

        Call call = businessunitsGetCall(apiToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all business units
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return List&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Group> businessunitsGet(String apiToken) throws ApiException {
        ApiResponse<List<Group>> resp = businessunitsGetWithHttpInfo(apiToken);
        return resp.getData();
    }

    /**
     * Gets a list of all business units
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return ApiResponse&lt;List&lt;Group&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Group>> businessunitsGetWithHttpInfo(String apiToken) throws ApiException {
        Call call = businessunitsGetValidateBeforeCall(apiToken, null, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all business units (asynchronously)
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call businessunitsGetAsync(String apiToken, final ApiCallback<List<Group>> callback) throws ApiException {

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

        Call call = businessunitsGetValidateBeforeCall(apiToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for businessunitsPost
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call businessunitsPostCall(String apiToken, CreateGroupRequestBody1 createGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createGroupRequestBody;

        // create path and map variables
        String localVarPath = "/businessunits";

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call businessunitsPostValidateBeforeCall(String apiToken, CreateGroupRequestBody1 createGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling businessunitsPost(Async)");
        }
        
        // verify the required parameter 'createGroupRequestBody' is set
        if (createGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createGroupRequestBody' when calling businessunitsPost(Async)");
        }
        

        Call call = businessunitsPostCall(apiToken, createGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new user business unit
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Group businessunitsPost(String apiToken, CreateGroupRequestBody1 createGroupRequestBody) throws ApiException {
        ApiResponse<Group> resp = businessunitsPostWithHttpInfo(apiToken, createGroupRequestBody);
        return resp.getData();
    }

    /**
     * Creates a new user business unit
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Group> businessunitsPostWithHttpInfo(String apiToken, CreateGroupRequestBody1 createGroupRequestBody) throws ApiException {
        Call call = businessunitsPostValidateBeforeCall(apiToken, createGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new user business unit (asynchronously)
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call businessunitsPostAsync(String apiToken, CreateGroupRequestBody1 createGroupRequestBody, final ApiCallback<Group> callback) throws ApiException {

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

        Call call = businessunitsPostValidateBeforeCall(apiToken, createGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for groupsGet
     * @param apiToken Authentication token (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGetCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups";

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGetValidateBeforeCall(String apiToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGet(Async)");
        }
        

        Call call = groupsGetCall(apiToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all Groups
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return List&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public List<Group> groupsGet(String apiToken) throws ApiException {
        ApiResponse<List<Group>> resp = groupsGetWithHttpInfo(apiToken);
        return resp.getData();
    }

    /**
     * Gets a list of all Groups
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @return ApiResponse&lt;List&lt;Group&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<Group>> groupsGetWithHttpInfo(String apiToken) throws ApiException {
        Call call = groupsGetValidateBeforeCall(apiToken, null, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all Groups (asynchronously)
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGetAsync(String apiToken, final ApiCallback<List<Group>> callback) throws ApiException {

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

        Call call = groupsGetValidateBeforeCall(apiToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for groupsGroupIdentifierDelete
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierDeleteCall(String apiToken, String groupIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups/{groupIdentifier}"
            .replaceAll("\\{" + "groupIdentifier" + "\\}", apiClient.escapeString(groupIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupIdentifierDeleteValidateBeforeCall(String apiToken, String groupIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupIdentifierDelete(Async)");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new ApiException("Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierDelete(Async)");
        }
        

        Call call = groupsGroupIdentifierDeleteCall(apiToken, groupIdentifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a users group
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public void groupsGroupIdentifierDelete(String apiToken, String groupIdentifier) throws ApiException {
        groupsGroupIdentifierDeleteWithHttpInfo(apiToken, groupIdentifier);
    }

    /**
     * Deletes a users group
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> groupsGroupIdentifierDeleteWithHttpInfo(String apiToken, String groupIdentifier) throws ApiException {
        Call call = groupsGroupIdentifierDeleteValidateBeforeCall(apiToken, groupIdentifier, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a users group (asynchronously)
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierDeleteAsync(String apiToken, String groupIdentifier, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = groupsGroupIdentifierDeleteValidateBeforeCall(apiToken, groupIdentifier, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for groupsGroupIdentifierGet
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierGetCall(String apiToken, String groupIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/groups/{groupIdentifier}"
            .replaceAll("\\{" + "groupIdentifier" + "\\}", apiClient.escapeString(groupIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupIdentifierGetValidateBeforeCall(String apiToken, String groupIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupIdentifierGet(Async)");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new ApiException("Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierGet(Async)");
        }
        

        Call call = groupsGroupIdentifierGetCall(apiToken, groupIdentifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the group details.
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return List&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public List<Group> groupsGroupIdentifierGet(String apiToken, String groupIdentifier) throws ApiException {
        ApiResponse<List<Group>> resp = groupsGroupIdentifierGetWithHttpInfo(apiToken, groupIdentifier);
        return resp.getData();
    }

    /**
     * Gets the group details.
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @return ApiResponse&lt;List&lt;Group&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<List<Group>> groupsGroupIdentifierGetWithHttpInfo(String apiToken, String groupIdentifier) throws ApiException {
        Call call = groupsGroupIdentifierGetValidateBeforeCall(apiToken, groupIdentifier, null, null);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the group details. (asynchronously)
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique name of the group (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierGetAsync(String apiToken, String groupIdentifier, final ApiCallback<List<Group>> callback) throws ApiException {

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

        Call call = groupsGroupIdentifierGetValidateBeforeCall(apiToken, groupIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Group>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for groupsGroupIdentifierPut
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierPutCall(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateGroupRequestBody;

        // create path and map variables
        String localVarPath = "/groups/{groupIdentifier}"
            .replaceAll("\\{" + "groupIdentifier" + "\\}", apiClient.escapeString(groupIdentifier.toString()));

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupIdentifierPutValidateBeforeCall(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupIdentifierPut(Async)");
        }
        
        // verify the required parameter 'groupIdentifier' is set
        if (groupIdentifier == null) {
            throw new ApiException("Missing the required parameter 'groupIdentifier' when calling groupsGroupIdentifierPut(Async)");
        }
        
        // verify the required parameter 'updateGroupRequestBody' is set
        if (updateGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'updateGroupRequestBody' when calling groupsGroupIdentifierPut(Async)");
        }
        

        Call call = groupsGroupIdentifierPutCall(apiToken, groupIdentifier, updateGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a users group
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public Group groupsGroupIdentifierPut(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody) throws ApiException {
        ApiResponse<Group> resp = groupsGroupIdentifierPutWithHttpInfo(apiToken, groupIdentifier, updateGroupRequestBody);
        return resp.getData();
    }

    /**
     * Update a users group
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Group> groupsGroupIdentifierPutWithHttpInfo(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody) throws ApiException {
        Call call = groupsGroupIdentifierPutValidateBeforeCall(apiToken, groupIdentifier, updateGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a users group (asynchronously)
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param groupIdentifier unique ref of the group (required)
     * @param updateGroupRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsGroupIdentifierPutAsync(String apiToken, String groupIdentifier, UpdateGroupRequestBody updateGroupRequestBody, final ApiCallback<Group> callback) throws ApiException {

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

        Call call = groupsGroupIdentifierPutValidateBeforeCall(apiToken, groupIdentifier, updateGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
    public Call groupsGroupUsersDeleteCall(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupUsersDeleteValidateBeforeCall(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = groupsGroupUsersDeleteCall(apiToken, group, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
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
        Call call = groupsGroupUsersDeleteValidateBeforeCall(apiToken, group, unassingUsersGroupRequestBody, null, null);
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
    public Call groupsGroupUsersDeleteAsync(String apiToken, String group, UnassingUsersGroupRequestBody unassingUsersGroupRequestBody, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = groupsGroupUsersDeleteValidateBeforeCall(apiToken, group, unassingUsersGroupRequestBody, progressListener, progressRequestListener);
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
    public Call groupsGroupUsersGetCall(String apiToken, String group, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupUsersGetValidateBeforeCall(String apiToken, String group, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsGroupUsersGet(Async)");
        }
        
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling groupsGroupUsersGet(Async)");
        }
        

        Call call = groupsGroupUsersGetCall(apiToken, group, progressListener, progressRequestListener);
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
        Call call = groupsGroupUsersGetValidateBeforeCall(apiToken, group, null, null);
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
    public Call groupsGroupUsersGetAsync(String apiToken, String group, final ApiCallback<List<User>> callback) throws ApiException {

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

        Call call = groupsGroupUsersGetValidateBeforeCall(apiToken, group, progressListener, progressRequestListener);
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
    public Call groupsGroupUsersPutCall(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupUsersPutValidateBeforeCall(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = groupsGroupUsersPutCall(apiToken, group, assignUserGroupRequestBody, progressListener, progressRequestListener);
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
        Call call = groupsGroupUsersPutValidateBeforeCall(apiToken, group, assignUserGroupRequestBody, null, null);
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
    public Call groupsGroupUsersPutAsync(String apiToken, String group, AssignUserGroupRequestBody assignUserGroupRequestBody, final ApiCallback<InlineResponse201> callback) throws ApiException {

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

        Call call = groupsGroupUsersPutValidateBeforeCall(apiToken, group, assignUserGroupRequestBody, progressListener, progressRequestListener);
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
    public Call groupsGroupUsersUserDeleteCall(String apiToken, String group, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
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
    private Call groupsGroupUsersUserDeleteValidateBeforeCall(String apiToken, String group, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        Call call = groupsGroupUsersUserDeleteCall(apiToken, group, user, progressListener, progressRequestListener);
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
        Call call = groupsGroupUsersUserDeleteValidateBeforeCall(apiToken, group, user, null, null);
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
    public Call groupsGroupUsersUserDeleteAsync(String apiToken, String group, String user, final ApiCallback<Void> callback) throws ApiException {

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

        Call call = groupsGroupUsersUserDeleteValidateBeforeCall(apiToken, group, user, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for groupsPost
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsPostCall(String apiToken, CreateGroupRequestBody createGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createGroupRequestBody;

        // create path and map variables
        String localVarPath = "/groups";

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
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private Call groupsPostValidateBeforeCall(String apiToken, CreateGroupRequestBody createGroupRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling groupsPost(Async)");
        }
        
        // verify the required parameter 'createGroupRequestBody' is set
        if (createGroupRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createGroupRequestBody' when calling groupsPost(Async)");
        }
        

        Call call = groupsPostCall(apiToken, createGroupRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new user group
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return Group
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public Group groupsPost(String apiToken, CreateGroupRequestBody createGroupRequestBody) throws ApiException {
        ApiResponse<Group> resp = groupsPostWithHttpInfo(apiToken, createGroupRequestBody);
        return resp.getData();
    }

    /**
     * Creates a new user group
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;Group&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Group> groupsPostWithHttpInfo(String apiToken, CreateGroupRequestBody createGroupRequestBody) throws ApiException {
        Call call = groupsPostValidateBeforeCall(apiToken, createGroupRequestBody, null, null);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new user group (asynchronously)
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createGroupRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @deprecated
     */
    @Deprecated
    public Call groupsPostAsync(String apiToken, CreateGroupRequestBody createGroupRequestBody, final ApiCallback<Group> callback) throws ApiException {

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

        Call call = groupsPostValidateBeforeCall(apiToken, createGroupRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Group>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
