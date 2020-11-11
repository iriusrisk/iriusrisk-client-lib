/*
 * Copyright (c) 2012-2020 Continuum Security.  All rights reserved
 */

import com.iriusrisk.ApiException;
import com.iriusrisk.api.ProductsApi;
import com.iriusrisk.model.Component;
import com.iriusrisk.model.ComponentControl;
import com.iriusrisk.model.ComponentUseCase;
import com.iriusrisk.model.ComponentUseCaseThreatShort;
import com.iriusrisk.model.Product;
import com.iriusrisk.model.ProductShort;
import com.iriusrisk.model.RiskSummary;
import com.iriusrisk.model.Threat;
import com.iriusrisk.model.ThreatControl;
import com.iriusrisk.model.ThreatShort;
import com.iriusrisk.model.ThreatWeakness;
import com.squareup.okhttp.OkHttpClient;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an example of how to use IriusRisk Client Lib to create a custom output from a countermeasure list
 */
public class IriusRiskGetUDTs {
    public static void main(String[] args) {

        System.out.println("New IriusRisk instance");
        ProductsApi apiInstance = new ProductsApi();
        // You must define the scheme://host:port/api/v1 from your IriusRisk instance
        // i.e.: https://server.com:5445/api/v1

        OkHttpClient httpClient = new OkHttpClient();
        String proxyHost = System.getProperty("proxy.host");
        if (proxyHost != null) {
            int proxyPort = Integer.parseInt(System.getProperty("proxy.port"));
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
            httpClient.setProxy(proxy);
        }

        apiInstance.getApiClient().setBasePath("<scheme://host:port>/api/v1");
        apiInstance.getApiClient().setHttpClient(httpClient);
        apiInstance.getApiClient().setVerifyingSsl(false);
        String apiToken = "<api-token>";

        System.out.println("UDTs for product");
        getUDTsForProduct(apiInstance, apiToken);
        System.out.println("UDTs for threats");
        getUDTsForThreats(apiInstance, apiToken);
        System.out.println("UDTs for controls");
        getUDTsForControls(apiInstance, apiToken);
        System.out.println("UDTs for control tests");
        getUDTsForControlTests(apiInstance, apiToken);

    }

    private static void getUDTsForControlTests(ProductsApi apiInstance, String apiToken) {
        try {
            // Given a product
            String productRef = "test";
            List<ComponentControl> s = apiInstance.productsRefControlsGet(apiToken, productRef);

            for(ComponentControl c : s){
                System.out.println(c.getTest().getUdts());
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }
    }

    private static void getUDTsForControls(ProductsApi apiInstance, String apiToken) {
        try {
            // Given a product
            String productRef = "test";
            List<ComponentControl> s = apiInstance.productsRefControlsGet(apiToken, productRef);

            for(ComponentControl c : s){
                System.out.println(c.getUdts());
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }
    }

    private static void getUDTsForThreats(ProductsApi apiInstance, String apiToken) {
        try {
            // Given a product
            String productRef = "test";

            List<ComponentUseCaseThreatShort> productsThreats = apiInstance.productsRefThreatsGet(apiToken, productRef);
            for(ComponentUseCaseThreatShort c : productsThreats){
                for(ThreatShort s : c.getUseCase().getThreats()){
                    System.out.println(s.getUdts());
                }
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }
    }

    private static void getUDTsForProduct(ProductsApi apiInstance, String apiToken) {
        try {
            // Given a product
            String productRef = "test";

            Product product = apiInstance.productsRefGet(apiToken, productRef);

            System.out.println(product.getUdts());



        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }
    }

}
