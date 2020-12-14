


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


import com.iriusrisk.restapi.client.model.AssignGroupsProductRequestBody;
import com.iriusrisk.restapi.client.model.AssignUsersProductRequestBody;
import com.iriusrisk.restapi.client.model.ComponentControl;
import com.iriusrisk.restapi.client.model.ComponentUseCaseThreatShort;
import com.iriusrisk.restapi.client.model.ComponentWeakness;
import com.iriusrisk.restapi.client.model.CreateProduct;
import com.iriusrisk.restapi.client.model.Error;
import java.io.File;
import com.iriusrisk.restapi.client.model.InlineResponse200;
import com.iriusrisk.restapi.client.model.InlineResponse2001;
import com.iriusrisk.restapi.client.model.InlineResponse2011;
import com.iriusrisk.restapi.client.model.Product;
import com.iriusrisk.restapi.client.model.ProductShort;
import com.iriusrisk.restapi.client.model.ProductShortGroups;
import com.iriusrisk.restapi.client.model.ProductShortUsers;
import com.iriusrisk.restapi.client.model.RiskSummary;
import com.iriusrisk.restapi.client.model.UnassignGroupsProductRequestBody;
import com.iriusrisk.restapi.client.model.UnassignUsersProductRequestBody;
import com.iriusrisk.restapi.client.model.UpdateProduct;
import com.iriusrisk.restapi.client.model.UpdateStatusCountermeasureRequestBody;
import com.iriusrisk.restapi.client.model.UpdateStatusTestRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsApi {
    private ApiClient apiClient;

    public ProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for productsGet
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsGetCall(String apiToken, Integer max, Integer index, String workflowState, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (max != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max", max));
        if (index != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("index", index));
        if (workflowState != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("workflowState", workflowState));

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
    private com.squareup.okhttp.Call productsGetValidateBeforeCall(String apiToken, Integer max, Integer index, String workflowState, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsGetCall(apiToken, max, index, workflowState, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all products.
     * Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @return List&lt;ProductShort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ProductShort> productsGet(String apiToken, Integer max, Integer index, String workflowState) throws ApiException {
        ApiResponse<List<ProductShort>> resp = productsGetWithHttpInfo(apiToken, max, index, workflowState);
        return resp.getData();
    }

    /**
     * Gets a list of all products.
     * Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @return ApiResponse&lt;List&lt;ProductShort&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ProductShort>> productsGetWithHttpInfo(String apiToken, Integer max, Integer index, String workflowState) throws ApiException {
        com.squareup.okhttp.Call call = productsGetValidateBeforeCall(apiToken, max, index, workflowState, null, null);
        Type localVarReturnType = new TypeToken<List<ProductShort>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all products. (asynchronously)
     * Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param max maximun number of items returned (optional, default to 1)
     * @param index index of the first element to return (optional, default to 1)
     * @param workflowState filter for products by workflow state ref (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsGetAsync(String apiToken, Integer max, Integer index, String workflowState, final ApiCallback<List<ProductShort>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsGetValidateBeforeCall(apiToken, max, index, workflowState, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ProductShort>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsPost
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsPostCall(String apiToken, CreateProduct createProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createProductRequestBody;

        // create path and map variables
        String localVarPath = "/products";

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
    private com.squareup.okhttp.Call productsPostValidateBeforeCall(String apiToken, CreateProduct createProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsPost(Async)");
        }
        
        // verify the required parameter 'createProductRequestBody' is set
        if (createProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createProductRequestBody' when calling productsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = productsPostCall(apiToken, createProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new product
     * Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @return ProductShort
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductShort productsPost(String apiToken, CreateProduct createProductRequestBody) throws ApiException {
        ApiResponse<ProductShort> resp = productsPostWithHttpInfo(apiToken, createProductRequestBody);
        return resp.getData();
    }

    /**
     * Creates a new product
     * Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @return ApiResponse&lt;ProductShort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductShort> productsPostWithHttpInfo(String apiToken, CreateProduct createProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsPostValidateBeforeCall(apiToken, createProductRequestBody, null, null);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new product (asynchronously)
     * Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 
     * @param apiToken Authentication token (required)
     * @param createProductRequestBody JSON data that contains information to create new product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsPostAsync(String apiToken, CreateProduct createProductRequestBody, final ApiCallback<ProductShort> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsPostValidateBeforeCall(apiToken, createProductRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
     * Build call for productsRefComponentsComponentRefTestsCwePut
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefTestsCwePutCall(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateStatusTestRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/components/{componentRef}/tests/{cwe}"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "componentRef" + "\\}", apiClient.escapeString(componentRef.toString()))
            .replaceAll("\\{" + "cwe" + "\\}", apiClient.escapeString(cwe.toString()));

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
    private com.squareup.okhttp.Call productsRefComponentsComponentRefTestsCwePutValidateBeforeCall(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefTestsCwePut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefComponentsComponentRefTestsCwePut(Async)");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new ApiException("Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefTestsCwePut(Async)");
        }
        
        // verify the required parameter 'cwe' is set
        if (cwe == null) {
            throw new ApiException("Missing the required parameter 'cwe' when calling productsRefComponentsComponentRefTestsCwePut(Async)");
        }
        
        // verify the required parameter 'updateStatusTestRequestBody' is set
        if (updateStatusTestRequestBody == null) {
            throw new ApiException("Missing the required parameter 'updateStatusTestRequestBody' when calling productsRefComponentsComponentRefTestsCwePut(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsCwePutCall(apiToken, ref, componentRef, cwe, updateStatusTestRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a single test to a component.
     * Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @return List&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InlineResponse2001> productsRefComponentsComponentRefTestsCwePut(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody) throws ApiException {
        ApiResponse<List<InlineResponse2001>> resp = productsRefComponentsComponentRefTestsCwePutWithHttpInfo(apiToken, ref, componentRef, cwe, updateStatusTestRequestBody);
        return resp.getData();
    }

    /**
     * Updates a single test to a component.
     * Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @return ApiResponse&lt;List&lt;InlineResponse2001&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InlineResponse2001>> productsRefComponentsComponentRefTestsCwePutWithHttpInfo(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsCwePutValidateBeforeCall(apiToken, ref, componentRef, cwe, updateStatusTestRequestBody, null, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a single test to a component. (asynchronously)
     * Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param cwe countermeasure or weakness CWE (required)
     * @param updateStatusTestRequestBody JSON data that contains the information to update test (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefTestsCwePutAsync(String apiToken, String ref, String componentRef, String cwe, UpdateStatusTestRequestBody updateStatusTestRequestBody, final ApiCallback<List<InlineResponse2001>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsCwePutValidateBeforeCall(apiToken, ref, componentRef, cwe, updateStatusTestRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefComponentsComponentRefTestsTestTypeUploadPost
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefTestsTestTypeUploadPostCall(String apiToken, String ref, String componentRef, String testType, File fileName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/components/{componentRef}/tests/{testType}/upload"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "componentRef" + "\\}", apiClient.escapeString(componentRef.toString()))
            .replaceAll("\\{" + "testType" + "\\}", apiClient.escapeString(testType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (fileName != null)
        localVarFormParams.put("fileName", fileName);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call productsRefComponentsComponentRefTestsTestTypeUploadPostValidateBeforeCall(String apiToken, String ref, String componentRef, String testType, File fileName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost(Async)");
        }
        
        // verify the required parameter 'componentRef' is set
        if (componentRef == null) {
            throw new ApiException("Missing the required parameter 'componentRef' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost(Async)");
        }
        
        // verify the required parameter 'testType' is set
        if (testType == null) {
            throw new ApiException("Missing the required parameter 'testType' when calling productsRefComponentsComponentRefTestsTestTypeUploadPost(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsTestTypeUploadPostCall(apiToken, ref, componentRef, testType, fileName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Imports test results from different sources to a component
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return InlineResponse2011
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2011 productsRefComponentsComponentRefTestsTestTypeUploadPost(String apiToken, String ref, String componentRef, String testType, File fileName) throws ApiException {
        ApiResponse<InlineResponse2011> resp = productsRefComponentsComponentRefTestsTestTypeUploadPostWithHttpInfo(apiToken, ref, componentRef, testType, fileName);
        return resp.getData();
    }

    /**
     * Imports test results from different sources to a component
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return ApiResponse&lt;InlineResponse2011&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2011> productsRefComponentsComponentRefTestsTestTypeUploadPostWithHttpInfo(String apiToken, String ref, String componentRef, String testType, File fileName) throws ApiException {
        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsTestTypeUploadPostValidateBeforeCall(apiToken, ref, componentRef, testType, fileName, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Imports test results from different sources to a component (asynchronously)
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param componentRef ID for component (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefComponentsComponentRefTestsTestTypeUploadPostAsync(String apiToken, String ref, String componentRef, String testType, File fileName, final ApiCallback<InlineResponse2011> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefComponentsComponentRefTestsTestTypeUploadPostValidateBeforeCall(apiToken, ref, componentRef, testType, fileName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
    /**
     * Build call for productsRefDelete
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefDeleteCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call productsRefDeleteValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefDelete(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefDeleteCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a product
     * Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void productsRefDelete(String apiToken, String ref) throws ApiException {
        productsRefDeleteWithHttpInfo(apiToken, ref);
    }

    /**
     * Deletes a product
     * Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> productsRefDeleteWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefDeleteValidateBeforeCall(apiToken, ref, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a product (asynchronously)
     * Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefDeleteAsync(String apiToken, String ref, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefDeleteValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for productsRefDiagramImageGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefDiagramImageGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/diagram/image"
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
    private com.squareup.okhttp.Call productsRefDiagramImageGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefDiagramImageGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefDiagramImageGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefDiagramImageGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets diagram image for product.
     * Gets a an image in png format of the product diagram. Conditions to be able to perform the action:   - No special permissions are required to perform this action.   - This API call can be used only if the user who performs the call has visibility over the product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String productsRefDiagramImageGet(String apiToken, String ref) throws ApiException {
        ApiResponse<String> resp = productsRefDiagramImageGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets diagram image for product.
     * Gets a an image in png format of the product diagram. Conditions to be able to perform the action:   - No special permissions are required to perform this action.   - This API call can be used only if the user who performs the call has visibility over the product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> productsRefDiagramImageGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefDiagramImageGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets diagram image for product. (asynchronously)
     * Gets a an image in png format of the product diagram. Conditions to be able to perform the action:   - No special permissions are required to perform this action.   - This API call can be used only if the user who performs the call has visibility over the product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefDiagramImageGetAsync(String apiToken, String ref, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefDiagramImageGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}"
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
    private com.squareup.okhttp.Call productsRefGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets product details
     * Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return Product
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Product productsRefGet(String apiToken, String ref) throws ApiException {
        ApiResponse<Product> resp = productsRefGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets product details
     * Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;Product&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Product> productsRefGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets product details (asynchronously)
     * Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefGetAsync(String apiToken, String ref, final ApiCallback<Product> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Product>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefGroupsDelete
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsDeleteCall(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = unassignGroupsProductRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/groups"
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
    private com.squareup.okhttp.Call productsRefGroupsDeleteValidateBeforeCall(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefGroupsDelete(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefGroupsDelete(Async)");
        }
        
        // verify the required parameter 'unassignGroupsProductRequestBody' is set
        if (unassignGroupsProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'unassignGroupsProductRequestBody' when calling productsRefGroupsDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefGroupsDeleteCall(apiToken, ref, unassignGroupsProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Unassigns a list of user groups from a product.
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 productsRefGroupsDelete(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody) throws ApiException {
        ApiResponse<InlineResponse200> resp = productsRefGroupsDeleteWithHttpInfo(apiToken, ref, unassignGroupsProductRequestBody);
        return resp.getData();
    }

    /**
     * Unassigns a list of user groups from a product.
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> productsRefGroupsDeleteWithHttpInfo(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefGroupsDeleteValidateBeforeCall(apiToken, ref, unassignGroupsProductRequestBody, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Unassigns a list of user groups from a product. (asynchronously)
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param unassignGroupsProductRequestBody JSON object that contains information to unassign groups from a product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsDeleteAsync(String apiToken, String ref, UnassignGroupsProductRequestBody unassignGroupsProductRequestBody, final ApiCallback<InlineResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefGroupsDeleteValidateBeforeCall(apiToken, ref, unassignGroupsProductRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefGroupsGet
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/groups"
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
    private com.squareup.okhttp.Call productsRefGroupsGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefGroupsGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefGroupsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefGroupsGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all groups assigned to a product
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<String> productsRefGroupsGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<String>> resp = productsRefGroupsGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * List all groups assigned to a product
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<String>> productsRefGroupsGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefGroupsGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all groups assigned to a product (asynchronously)
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     * @param apiToken Authentication token (required)
     * @param ref Reference to product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsGetAsync(String apiToken, String ref, final ApiCallback<List<String>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefGroupsGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefGroupsPut
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsPutCall(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = assignGroupsProductRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}/groups"
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
    private com.squareup.okhttp.Call productsRefGroupsPutValidateBeforeCall(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefGroupsPut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefGroupsPut(Async)");
        }
        
        // verify the required parameter 'assignGroupsProductRequestBody' is set
        if (assignGroupsProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'assignGroupsProductRequestBody' when calling productsRefGroupsPut(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefGroupsPutCall(apiToken, ref, assignGroupsProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Assigns groups of users to a product.
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @return ProductShortGroups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductShortGroups productsRefGroupsPut(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody) throws ApiException {
        ApiResponse<ProductShortGroups> resp = productsRefGroupsPutWithHttpInfo(apiToken, ref, assignGroupsProductRequestBody);
        return resp.getData();
    }

    /**
     * Assigns groups of users to a product.
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @return ApiResponse&lt;ProductShortGroups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductShortGroups> productsRefGroupsPutWithHttpInfo(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefGroupsPutValidateBeforeCall(apiToken, ref, assignGroupsProductRequestBody, null, null);
        Type localVarReturnType = new TypeToken<ProductShortGroups>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns groups of users to a product. (asynchronously)
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref Reference for product (required)
     * @param assignGroupsProductRequestBody JSON object that contains information to assign groups to product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefGroupsPutAsync(String apiToken, String ref, AssignGroupsProductRequestBody assignGroupsProductRequestBody, final ApiCallback<ProductShortGroups> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefGroupsPutValidateBeforeCall(apiToken, ref, assignGroupsProductRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductShortGroups>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefPut
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefPutCall(String apiToken, String ref, UpdateProduct updateProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateProductRequestBody;

        // create path and map variables
        String localVarPath = "/products/{ref}"
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
    private com.squareup.okhttp.Call productsRefPutValidateBeforeCall(String apiToken, String ref, UpdateProduct updateProductRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefPut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefPut(Async)");
        }
        
        // verify the required parameter 'updateProductRequestBody' is set
        if (updateProductRequestBody == null) {
            throw new ApiException("Missing the required parameter 'updateProductRequestBody' when calling productsRefPut(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefPutCall(apiToken, ref, updateProductRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates a product
     * Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void productsRefPut(String apiToken, String ref, UpdateProduct updateProductRequestBody) throws ApiException {
        productsRefPutWithHttpInfo(apiToken, ref, updateProductRequestBody);
    }

    /**
     * Updates a product
     * Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> productsRefPutWithHttpInfo(String apiToken, String ref, UpdateProduct updateProductRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = productsRefPutValidateBeforeCall(apiToken, ref, updateProductRequestBody, null, null);
        return apiClient.execute(call);
    }

    /**
     * Updates a product (asynchronously)
     * Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param updateProductRequestBody JSON data that contains product details to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefPutAsync(String apiToken, String ref, UpdateProduct updateProductRequestBody, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefPutValidateBeforeCall(apiToken, ref, updateProductRequestBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for productsRefRisksGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefRisksGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/risks"
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
    private com.squareup.okhttp.Call productsRefRisksGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefRisksGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefRisksGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefRisksGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the risks summary of a product
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return RiskSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskSummary productsRefRisksGet(String apiToken, String ref) throws ApiException {
        ApiResponse<RiskSummary> resp = productsRefRisksGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets the risks summary of a product
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;RiskSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskSummary> productsRefRisksGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefRisksGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<RiskSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the risks summary of a product (asynchronously)
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefRisksGetAsync(String apiToken, String ref, final ApiCallback<RiskSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefRisksGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefTestsTestTypeUploadPost
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefTestsTestTypeUploadPostCall(String apiToken, String ref, String testType, File fileName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/tests/{testType}/upload"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "testType" + "\\}", apiClient.escapeString(testType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (fileName != null)
        localVarFormParams.put("fileName", fileName);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call productsRefTestsTestTypeUploadPostValidateBeforeCall(String apiToken, String ref, String testType, File fileName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefTestsTestTypeUploadPost(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefTestsTestTypeUploadPost(Async)");
        }
        
        // verify the required parameter 'testType' is set
        if (testType == null) {
            throw new ApiException("Missing the required parameter 'testType' when calling productsRefTestsTestTypeUploadPost(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefTestsTestTypeUploadPostCall(apiToken, ref, testType, fileName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Imports test results from different sources to a product.
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return InlineResponse2011
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2011 productsRefTestsTestTypeUploadPost(String apiToken, String ref, String testType, File fileName) throws ApiException {
        ApiResponse<InlineResponse2011> resp = productsRefTestsTestTypeUploadPostWithHttpInfo(apiToken, ref, testType, fileName);
        return resp.getData();
    }

    /**
     * Imports test results from different sources to a product.
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @return ApiResponse&lt;InlineResponse2011&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2011> productsRefTestsTestTypeUploadPostWithHttpInfo(String apiToken, String ref, String testType, File fileName) throws ApiException {
        com.squareup.okhttp.Call call = productsRefTestsTestTypeUploadPostValidateBeforeCall(apiToken, ref, testType, fileName, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Imports test results from different sources to a product. (asynchronously)
     * Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testType Type of test to be imported (zap|cucumber|junit|hp-fortify) (required)
     * @param fileName File to upload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefTestsTestTypeUploadPostAsync(String apiToken, String ref, String testType, File fileName, final ApiCallback<InlineResponse2011> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefTestsTestTypeUploadPostValidateBeforeCall(apiToken, ref, testType, fileName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2011>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefThreatsGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefThreatsGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/threats"
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
    private com.squareup.okhttp.Call productsRefThreatsGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefThreatsGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefThreatsGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefThreatsGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all threats of a product
     * Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentUseCaseThreatShort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentUseCaseThreatShort> productsRefThreatsGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<ComponentUseCaseThreatShort>> resp = productsRefThreatsGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets a list of all threats of a product
     * Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;List&lt;ComponentUseCaseThreatShort&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentUseCaseThreatShort>> productsRefThreatsGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefThreatsGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentUseCaseThreatShort>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all threats of a product (asynchronously)
     * Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefThreatsGetAsync(String apiToken, String ref, final ApiCallback<List<ComponentUseCaseThreatShort>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefThreatsGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentUseCaseThreatShort>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
     * Build call for productsRefWeaknessesGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefWeaknessesGetCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/weaknesses"
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
    private com.squareup.okhttp.Call productsRefWeaknessesGetValidateBeforeCall(String apiToken, String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefWeaknessesGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefWeaknessesGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefWeaknessesGetCall(apiToken, ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all weaknesses of a product
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return List&lt;ComponentWeakness&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentWeakness> productsRefWeaknessesGet(String apiToken, String ref) throws ApiException {
        ApiResponse<List<ComponentWeakness>> resp = productsRefWeaknessesGetWithHttpInfo(apiToken, ref);
        return resp.getData();
    }

    /**
     * Gets a list of all weaknesses of a product
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @return ApiResponse&lt;List&lt;ComponentWeakness&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentWeakness>> productsRefWeaknessesGetWithHttpInfo(String apiToken, String ref) throws ApiException {
        com.squareup.okhttp.Call call = productsRefWeaknessesGetValidateBeforeCall(apiToken, ref, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentWeakness>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all weaknesses of a product (asynchronously)
     * Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefWeaknessesGetAsync(String apiToken, String ref, final ApiCallback<List<ComponentWeakness>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefWeaknessesGetValidateBeforeCall(apiToken, ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentWeakness>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsRefWeaknessesTestStateGet
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsRefWeaknessesTestStateGetCall(String apiToken, String ref, String testState, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/{ref}/weaknesses/{test_state}"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()))
            .replaceAll("\\{" + "test_state" + "\\}", apiClient.escapeString(testState.toString()));

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
    private com.squareup.okhttp.Call productsRefWeaknessesTestStateGetValidateBeforeCall(String apiToken, String ref, String testState, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsRefWeaknessesTestStateGet(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsRefWeaknessesTestStateGet(Async)");
        }
        
        // verify the required parameter 'testState' is set
        if (testState == null) {
            throw new ApiException("Missing the required parameter 'testState' when calling productsRefWeaknessesTestStateGet(Async)");
        }
        

        com.squareup.okhttp.Call call = productsRefWeaknessesTestStateGetCall(apiToken, ref, testState, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets a list of all weaknesses of a product filtered by test state
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @return List&lt;ComponentWeakness&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentWeakness> productsRefWeaknessesTestStateGet(String apiToken, String ref, String testState) throws ApiException {
        ApiResponse<List<ComponentWeakness>> resp = productsRefWeaknessesTestStateGetWithHttpInfo(apiToken, ref, testState);
        return resp.getData();
    }

    /**
     * Gets a list of all weaknesses of a product filtered by test state
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @return ApiResponse&lt;List&lt;ComponentWeakness&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentWeakness>> productsRefWeaknessesTestStateGetWithHttpInfo(String apiToken, String ref, String testState) throws ApiException {
        com.squareup.okhttp.Call call = productsRefWeaknessesTestStateGetValidateBeforeCall(apiToken, ref, testState, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentWeakness>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of all weaknesses of a product filtered by test state (asynchronously)
     * Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param testState Code for a test state (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsRefWeaknessesTestStateGetAsync(String apiToken, String ref, String testState, final ApiCallback<List<ComponentWeakness>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsRefWeaknessesTestStateGetValidateBeforeCall(apiToken, ref, testState, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentWeakness>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsUploadPost
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsUploadPostCall(String apiToken, String ref, String name, File fileName, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/upload";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (ref != null)
        localVarFormParams.put("ref", ref);
        if (name != null)
        localVarFormParams.put("name", name);
        if (type != null)
        localVarFormParams.put("type", type);
        if (fileName != null)
        localVarFormParams.put("fileName", fileName);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call productsUploadPostValidateBeforeCall(String apiToken, String ref, String name, File fileName, String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsUploadPost(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsUploadPost(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling productsUploadPost(Async)");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling productsUploadPost(Async)");
        }
        

        com.squareup.okhttp.Call call = productsUploadPostCall(apiToken, ref, name, fileName, type, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ProductShort
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductShort productsUploadPost(String apiToken, String ref, String name, File fileName, String type) throws ApiException {
        ApiResponse<ProductShort> resp = productsUploadPostWithHttpInfo(apiToken, ref, name, fileName, type);
        return resp.getData();
    }

    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ApiResponse&lt;ProductShort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductShort> productsUploadPostWithHttpInfo(String apiToken, String ref, String name, File fileName, String type) throws ApiException {
        com.squareup.okhttp.Call call = productsUploadPostValidateBeforeCall(apiToken, ref, name, fileName, type, null, null);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new product, library or template from a XML file upload. (asynchronously)
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsUploadPostAsync(String apiToken, String ref, String name, File fileName, String type, final ApiCallback<ProductShort> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsUploadPostValidateBeforeCall(apiToken, ref, name, fileName, type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsUploadRefPost
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsUploadRefPostCall(String apiToken, String ref, File fileName, String deleteCountermeasures, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/upload/{ref}"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (fileName != null)
        localVarFormParams.put("fileName", fileName);
        if (deleteCountermeasures != null)
        localVarFormParams.put("deleteCountermeasures", deleteCountermeasures);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call productsUploadRefPostValidateBeforeCall(String apiToken, String ref, File fileName, String deleteCountermeasures, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling productsUploadRefPost(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling productsUploadRefPost(Async)");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling productsUploadRefPost(Async)");
        }
        

        com.squareup.okhttp.Call call = productsUploadRefPostCall(apiToken, ref, fileName, deleteCountermeasures, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Updates an existing product from a XML file upload.
     * Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ProductShort
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductShort productsUploadRefPost(String apiToken, String ref, File fileName, String deleteCountermeasures) throws ApiException {
        ApiResponse<ProductShort> resp = productsUploadRefPostWithHttpInfo(apiToken, ref, fileName, deleteCountermeasures);
        return resp.getData();
    }

    /**
     * Updates an existing product from a XML file upload.
     * Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ApiResponse&lt;ProductShort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductShort> productsUploadRefPostWithHttpInfo(String apiToken, String ref, File fileName, String deleteCountermeasures) throws ApiException {
        com.squareup.okhttp.Call call = productsUploadRefPostValidateBeforeCall(apiToken, ref, fileName, deleteCountermeasures, null, null);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an existing product from a XML file upload. (asynchronously)
     * Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 
     * @param apiToken Authentication token (required)
     * @param ref ID for product (required)
     * @param fileName File to upload in XML format (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsUploadRefPostAsync(String apiToken, String ref, File fileName, String deleteCountermeasures, final ApiCallback<ProductShort> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsUploadRefPostValidateBeforeCall(apiToken, ref, fileName, deleteCountermeasures, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductShort>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rulesProductRefPut
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rulesProductRefPutCall(String apiToken, String ref, String deleteCountermeasures, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rules/product/{ref}"
            .replaceAll("\\{" + "ref" + "\\}", apiClient.escapeString(ref.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiToken != null)
        localVarHeaderParams.put("api-token", apiClient.parameterToString(apiToken));
        if (deleteCountermeasures != null)
        localVarHeaderParams.put("deleteCountermeasures", apiClient.parameterToString(deleteCountermeasures));

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
    private com.squareup.okhttp.Call rulesProductRefPutValidateBeforeCall(String apiToken, String ref, String deleteCountermeasures, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling rulesProductRefPut(Async)");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling rulesProductRefPut(Async)");
        }
        

        com.squareup.okhttp.Call call = rulesProductRefPutCall(apiToken, ref, deleteCountermeasures, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Executes rules by a product
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void rulesProductRefPut(String apiToken, String ref, String deleteCountermeasures) throws ApiException {
        rulesProductRefPutWithHttpInfo(apiToken, ref, deleteCountermeasures);
    }

    /**
     * Executes rules by a product
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> rulesProductRefPutWithHttpInfo(String apiToken, String ref, String deleteCountermeasures) throws ApiException {
        com.squareup.okhttp.Call call = rulesProductRefPutValidateBeforeCall(apiToken, ref, deleteCountermeasures, null, null);
        return apiClient.execute(call);
    }

    /**
     * Executes rules by a product (asynchronously)
     * Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param ref ID for Product (required)
     * @param deleteCountermeasures This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rulesProductRefPutAsync(String apiToken, String ref, String deleteCountermeasures, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rulesProductRefPutValidateBeforeCall(apiToken, ref, deleteCountermeasures, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
