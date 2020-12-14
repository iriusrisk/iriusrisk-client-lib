


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


import com.iriusrisk.restapi.client.model.Error;
import com.iriusrisk.restapi.client.model.RiskSummary;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RisksApi {
    private ApiClient apiClient;

    public RisksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RisksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
