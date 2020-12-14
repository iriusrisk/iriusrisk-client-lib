


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


import com.iriusrisk.restapi.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.restapi.client.model.AssociateWeaknessThreatLibraryRequestBody;
import com.iriusrisk.restapi.client.model.ControlCommand;
import com.iriusrisk.restapi.client.model.CreateRiskPatternRequestBody;
import com.iriusrisk.restapi.client.model.CreateWeaknessLibraryRequestBody;
import com.iriusrisk.restapi.client.model.Error;
import com.iriusrisk.restapi.client.model.LibraryControl;
import com.iriusrisk.restapi.client.model.LibraryWeakness;
import com.iriusrisk.restapi.client.model.RiskPattern;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiskPatternsApi {
    private ApiClient apiClient;

    public RiskPatternsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RiskPatternsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for librariesLibraryRefRiskpatternsPost
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsPostCall(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createRiskPatternRequestBody;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsPostValidateBeforeCall(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsPost(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsPost(Async)");
        }
        
        // verify the required parameter 'createRiskPatternRequestBody' is set
        if (createRiskPatternRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createRiskPatternRequestBody' when calling librariesLibraryRefRiskpatternsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsPostCall(apiToken, libraryRef, createRiskPatternRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates new Risk Pattern
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @return RiskPattern
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskPattern librariesLibraryRefRiskpatternsPost(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody) throws ApiException {
        ApiResponse<RiskPattern> resp = librariesLibraryRefRiskpatternsPostWithHttpInfo(apiToken, libraryRef, createRiskPatternRequestBody);
        return resp.getData();
    }

    /**
     * Creates new Risk Pattern
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;RiskPattern&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskPattern> librariesLibraryRefRiskpatternsPostWithHttpInfo(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsPostValidateBeforeCall(apiToken, libraryRef, createRiskPatternRequestBody, null, null);
        Type localVarReturnType = new TypeToken<RiskPattern>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates new Risk Pattern (asynchronously)
     * Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param createRiskPatternRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsPostAsync(String apiToken, String libraryRef, CreateRiskPatternRequestBody createRiskPatternRequestBody, final ApiCallback<RiskPattern> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsPostValidateBeforeCall(apiToken, libraryRef, createRiskPatternRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskPattern>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostCall(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createCountermeasureLibraryRequestBody;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(Async)");
        }
        
        // verify the required parameter 'createCountermeasureLibraryRequestBody' is set
        if (createCountermeasureLibraryRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createCountermeasureLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostCall(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates new countermeasure in a risk pattern
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryControl
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody) throws ApiException {
        ApiResponse<LibraryControl> resp = librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody);
        return resp.getData();
    }

    /**
     * Creates new countermeasure in a risk pattern
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;LibraryControl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryControl> librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostValidateBeforeCall(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody, null, null);
        Type localVarReturnType = new TypeToken<LibraryControl>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates new countermeasure in a risk pattern (asynchronously)
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createCountermeasureLibraryRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostAsync(String apiToken, String libraryRef, String riskPatternRef, ControlCommand createCountermeasureLibraryRequestBody, final ApiCallback<LibraryControl> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostValidateBeforeCall(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryControl>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefDelete
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefDeleteCall(String apiToken, String libraryRef, String riskPatternRef, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefDeleteValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefDeleteCall(apiToken, libraryRef, riskPatternRef, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deletes a Risk Pattern
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void librariesLibraryRefRiskpatternsRiskPatternRefDelete(String apiToken, String libraryRef, String riskPatternRef) throws ApiException {
        librariesLibraryRefRiskpatternsRiskPatternRefDeleteWithHttpInfo(apiToken, libraryRef, riskPatternRef);
    }

    /**
     * Deletes a Risk Pattern
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> librariesLibraryRefRiskpatternsRiskPatternRefDeleteWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefDeleteValidateBeforeCall(apiToken, libraryRef, riskPatternRef, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Risk Pattern (asynchronously)
     * Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefDeleteAsync(String apiToken, String libraryRef, String riskPatternRef, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefDeleteValidateBeforeCall(apiToken, libraryRef, riskPatternRef, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefGet
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefGetCall(String apiToken, String libraryRef, String riskPatternRef, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefGetValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefGet(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefGetCall(apiToken, libraryRef, riskPatternRef, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets Risk Pattern details
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return RiskPattern
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RiskPattern librariesLibraryRefRiskpatternsRiskPatternRefGet(String apiToken, String libraryRef, String riskPatternRef) throws ApiException {
        ApiResponse<RiskPattern> resp = librariesLibraryRefRiskpatternsRiskPatternRefGetWithHttpInfo(apiToken, libraryRef, riskPatternRef);
        return resp.getData();
    }

    /**
     * Gets Risk Pattern details
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @return ApiResponse&lt;RiskPattern&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RiskPattern> librariesLibraryRefRiskpatternsRiskPatternRefGetWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefGetValidateBeforeCall(apiToken, libraryRef, riskPatternRef, null, null);
        Type localVarReturnType = new TypeToken<RiskPattern>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets Risk Pattern details (asynchronously)
     * Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefGetAsync(String apiToken, String libraryRef, String riskPatternRef, final ApiCallback<RiskPattern> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefGetValidateBeforeCall(apiToken, libraryRef, riskPatternRef, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RiskPattern>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutCall(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = associateWeaknessThreatLibraryRequestBody;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()))
            .replaceAll("\\{" + "useCaseRef" + "\\}", apiClient.escapeString(useCaseRef.toString()))
            .replaceAll("\\{" + "threatRef" + "\\}", apiClient.escapeString(threatRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new ApiException("Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        
        // verify the required parameter 'threatRef' is set
        if (threatRef == null) {
            throw new ApiException("Missing the required parameter 'threatRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        
        // verify the required parameter 'associateWeaknessThreatLibraryRequestBody' is set
        if (associateWeaknessThreatLibraryRequestBody == null) {
            throw new ApiException("Missing the required parameter 'associateWeaknessThreatLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateWeaknessThreatLibraryRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Associates weakness to a threat in a risk pattern.
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryWeakness
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody) throws ApiException {
        ApiResponse<LibraryWeakness> resp = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateWeaknessThreatLibraryRequestBody);
        return resp.getData();
    }

    /**
     * Associates weakness to a threat in a risk pattern.
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;LibraryWeakness&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryWeakness> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutValidateBeforeCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateWeaknessThreatLibraryRequestBody, null, null);
        Type localVarReturnType = new TypeToken<LibraryWeakness>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Associates weakness to a threat in a risk pattern. (asynchronously)
     * Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param associateWeaknessThreatLibraryRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutAsync(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, AssociateWeaknessThreatLibraryRequestBody associateWeaknessThreatLibraryRequestBody, final ApiCallback<LibraryWeakness> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPutValidateBeforeCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateWeaknessThreatLibraryRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryWeakness>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutCall(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = associateCountermeasureWeaknessLibraryRequestBody;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()))
            .replaceAll("\\{" + "useCaseRef" + "\\}", apiClient.escapeString(useCaseRef.toString()))
            .replaceAll("\\{" + "threatRef" + "\\}", apiClient.escapeString(threatRef.toString()))
            .replaceAll("\\{" + "weaknessRef" + "\\}", apiClient.escapeString(weaknessRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'useCaseRef' is set
        if (useCaseRef == null) {
            throw new ApiException("Missing the required parameter 'useCaseRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'threatRef' is set
        if (threatRef == null) {
            throw new ApiException("Missing the required parameter 'threatRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'weaknessRef' is set
        if (weaknessRef == null) {
            throw new ApiException("Missing the required parameter 'weaknessRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        
        // verify the required parameter 'associateCountermeasureWeaknessLibraryRequestBody' is set
        if (associateCountermeasureWeaknessLibraryRequestBody == null) {
            throw new ApiException("Missing the required parameter 'associateCountermeasureWeaknessLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryControl
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody) throws ApiException {
        ApiResponse<LibraryControl> resp = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutWithHttpInfo(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody);
        return resp.getData();
    }

    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;LibraryControl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryControl> librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutValidateBeforeCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody, null, null);
        Type localVarReturnType = new TypeToken<LibraryControl>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Associates a countermeasure to a weakness in a risk pattern. (asynchronously)
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param useCaseRef Reference for Use Case (required)
     * @param threatRef Reference for Threat (required)
     * @param weaknessRef Reference for Weakness (required)
     * @param associateCountermeasureWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutAsync(String apiToken, String libraryRef, String riskPatternRef, String useCaseRef, String threatRef, String weaknessRef, AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody, final ApiCallback<LibraryControl> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutValidateBeforeCall(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryControl>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostCall(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createWeaknessLibraryRequestBody;

        // create path and map variables
        String localVarPath = "/libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses"
            .replaceAll("\\{" + "libraryRef" + "\\}", apiClient.escapeString(libraryRef.toString()))
            .replaceAll("\\{" + "riskPatternRef" + "\\}", apiClient.escapeString(riskPatternRef.toString()));

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
    private com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostValidateBeforeCall(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new ApiException("Missing the required parameter 'apiToken' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(Async)");
        }
        
        // verify the required parameter 'libraryRef' is set
        if (libraryRef == null) {
            throw new ApiException("Missing the required parameter 'libraryRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(Async)");
        }
        
        // verify the required parameter 'riskPatternRef' is set
        if (riskPatternRef == null) {
            throw new ApiException("Missing the required parameter 'riskPatternRef' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(Async)");
        }
        
        // verify the required parameter 'createWeaknessLibraryRequestBody' is set
        if (createWeaknessLibraryRequestBody == null) {
            throw new ApiException("Missing the required parameter 'createWeaknessLibraryRequestBody' when calling librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(Async)");
        }
        

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostCall(apiToken, libraryRef, riskPatternRef, createWeaknessLibraryRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new weakness in a risk pattern
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return LibraryWeakness
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody) throws ApiException {
        ApiResponse<LibraryWeakness> resp = librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostWithHttpInfo(apiToken, libraryRef, riskPatternRef, createWeaknessLibraryRequestBody);
        return resp.getData();
    }

    /**
     * Creates a new weakness in a risk pattern
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @return ApiResponse&lt;LibraryWeakness&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LibraryWeakness> librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostWithHttpInfo(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody) throws ApiException {
        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostValidateBeforeCall(apiToken, libraryRef, riskPatternRef, createWeaknessLibraryRequestBody, null, null);
        Type localVarReturnType = new TypeToken<LibraryWeakness>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new weakness in a risk pattern (asynchronously)
     * Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     * @param apiToken Authentication token (required)
     * @param libraryRef Reference for library (required)
     * @param riskPatternRef Reference for Risk Pattern (required)
     * @param createWeaknessLibraryRequestBody JSON data that contains information of the fields (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostAsync(String apiToken, String libraryRef, String riskPatternRef, CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody, final ApiCallback<LibraryWeakness> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPostValidateBeforeCall(apiToken, libraryRef, riskPatternRef, createWeaknessLibraryRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LibraryWeakness>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
