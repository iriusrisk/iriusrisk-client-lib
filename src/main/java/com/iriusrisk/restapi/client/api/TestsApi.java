


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
import java.io.File;
import com.iriusrisk.restapi.client.model.InlineResponse2001;
import com.iriusrisk.restapi.client.model.InlineResponse2011;
import com.iriusrisk.restapi.client.model.UpdateStatusTestRequestBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestsApi {
    private ApiClient apiClient;

    public TestsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TestsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
