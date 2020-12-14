


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


import com.iriusrisk.restapi.client.model.ComponentControl;
import com.iriusrisk.restapi.client.model.Error;
import com.iriusrisk.restapi.client.model.UpdateStatusCountermeasureRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlsApi {
    private ApiClient apiClient;

    public ControlsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ControlsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for productsRefComponentsComponentRefControlsControlRefStatusPut
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefControlsControlRefStatusPutCall(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateStatusCountermeasureRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/components/{componentRef}/controls/{controlRef}/status"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "componentRef" + "\\}", apiClient.escapeString(componentRef.toString()))
            .replaceAll("\\{" + "controlRef" + "\\}", apiClient.escapeString(controlRef.toString()));

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
    private com.squareup.okhttp.Call productsRefComponentsComponentRefControlsControlRefStatusPutValidateBeforeCall(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefControlsControlRefStatusPut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefComponentsComponentRefControlsControlRefStatusPut(Async)");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new ApiException("Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefControlsControlRefStatusPut(Async)");
        }
        
        // verify the required parameter 'controlRef' is set
        if (controlRef == null) {
            throw new ApiException("Missing the required parameter 'controlRef' when calling productsRefComponentsComponentRefControlsControlRefStatusPut(Async)");
        }
        
        // verify the required parameter 'updateStatusCountermeasureRequestBody' is set
        if (updateStatusCountermeasureRequestBody == null) {
            throw new ApiException("Missing the required parameter 'updateStatusCountermeasureRequestBody' when calling productsRefComponentsComponentRefControlsControlRefStatusPut(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefControlsControlRefStatusPutCall(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Sets the desired status to a countermeasure
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void productsRefComponentsComponentRefControlsControlRefStatusPut(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody) throws ApiException {
        productsRefComponentsComponentRefControlsControlRefStatusPutWithHttpInfo(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody);
    }

    /**
     * Sets the desired status to a countermeasure
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> productsRefComponentsComponentRefControlsControlRefStatusPutWithHttpInfo(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefComponentsComponentRefControlsControlRefStatusPutValidateBeforeCall(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Sets the desired status to a countermeasure (asynchronously)
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param controlRef Control ref (required)
     * @param updateStatusCountermeasureRequestBody JSON data that contains the information to update countermeasure (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefControlsControlRefStatusPutAsync(String apiToken, String ref, String componentRef, String controlRef, UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefControlsControlRefStatusPutValidateBeforeCall(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for productsRefControlsGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/controls"
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
    private com.squareup.okhttp.Call productsRefControlsGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefControlsGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefControlsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefControlsGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all product countermeasures
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentControl> productsRefControlsGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<ComponentControl>> resp = productsRefControlsGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets a list of all product countermeasures
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;List&lt;ComponentControl&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentControl>> productsRefControlsGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefControlsGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all product countermeasures (asynchronously)
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsGetAsync(String apiToken, String ref, final ApiCallback<List<ComponentControl>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefControlsGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefControlsImplementedGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsImplementedGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/controls/implemented"
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
    private com.squareup.okhttp.Call productsRefControlsImplementedGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefControlsImplementedGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefControlsImplementedGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefControlsImplementedGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all implemented countermeasures of a product.
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentControl> productsRefControlsImplementedGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<ComponentControl>> resp = productsRefControlsImplementedGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets a list of all implemented countermeasures of a product.
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;List&lt;ComponentControl&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentControl>> productsRefControlsImplementedGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefControlsImplementedGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all implemented countermeasures of a product. (asynchronously)
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsImplementedGetAsync(String apiToken, String ref, final ApiCallback<List<ComponentControl>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefControlsImplementedGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefControlsRequiredGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsRequiredGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/controls/required"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefControlsRequiredGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefControlsRequiredGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefControlsRequiredGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefControlsRequiredGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all required countermeasures of a product
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentControl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentControl> productsRefControlsRequiredGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<ComponentControl>> resp = productsRefControlsRequiredGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets a list of all required countermeasures of a product
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;List&lt;ComponentControl&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentControl>> productsRefControlsRequiredGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefControlsRequiredGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all required countermeasures of a product (asynchronously)
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefControlsRequiredGetAsync(String apiToken, String ref, final ApiCallback<List<ComponentControl>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefControlsRequiredGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentControl>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
