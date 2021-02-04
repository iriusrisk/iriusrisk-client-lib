package com.iriusrisk.api;

import com.iriusrisk.api.client.invoker.ApiClient;

public abstract class ApiTestBase {

    private final String API_KEY_PARAMETER = "api.key";
    private final String API_BASE_PATH_PARAMETER = "api.base.path";

    protected final ApiClient API_CLIENT;

    public ApiTestBase() {
        String apiKey = (String) System.getProperties().get(API_KEY_PARAMETER);
        String basePath = (String) System.getProperties().get(API_BASE_PATH_PARAMETER);
        if (apiKey == null) {
            throw new IllegalArgumentException("An API key must be provided for text execution. Launch the tests including the parameter:" +
                    "\n\t-D"+API_KEY_PARAMETER+"=API_KEY_VALUE\n\t\tExample: -D"+API_KEY_PARAMETER+"=0000000-00000-00000-0000000 ");
        } else if(basePath == null) {
            throw new IllegalArgumentException("A base path for the destination server must be provided. Launch the tests including the parameter: " +
                    "\n\t-D"+API_BASE_PATH_PARAMETER+"=API_KEY_VALUE\n\t\tExample: -D"+API_BASE_PATH_PARAMETER+"=https://your.iriusrisk.instance:port/api/v1 ");
        }

        API_CLIENT = new ApiClient();
        API_CLIENT.setBasePath(basePath);
        API_CLIENT.setApiKey(apiKey);
    }
}
