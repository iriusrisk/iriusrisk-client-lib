/*
 * Copyright (c) 2012-2020 Continuum Security.  All rights reserved
 */

import com.iriusrisk.ApiException;
import com.iriusrisk.api.ProductsApi;
import com.iriusrisk.model.Component;
import com.iriusrisk.model.ComponentControl;
import com.iriusrisk.model.ComponentUseCase;
import com.iriusrisk.model.ComponentUseCaseThreatShort;
import com.iriusrisk.model.ComponentWeakness;
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
public class IriusRiskWeaknessInfo {
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

        try {
            // Given the product and the threat ref
            String productRef = "test";
            String threatRef = "UNAUTHORIZED-CONNECTION";

            // We get the weakness refs corresponding to a threat
            List<ComponentWeakness> weaknesses = apiInstance.productsRefGet(apiToken, productRef).getComponents().get(0).getWeaknesses();
            Product product = apiInstance.productsRefGet(apiToken, productRef);
            List<String> weaknessRefs = new ArrayList<String>();
            for (Component component : product.getComponents()) {
                for (ComponentUseCase usecase : component.getUsecases()) {
                    for (Threat threat : usecase.getThreats()) {
                        if (threat.getRef().equals(threatRef)) {
                            for (ThreatWeakness weakness : threat.getWeaknesses()) {
                                weaknessRefs.add(weakness.getRef());
                            }
                        }
                    }
                }
            }

            for (Component component : product.getComponents()) {
                for(ComponentWeakness s : component.getWeaknesses()) {
                    if(weaknessRefs.contains(s.getRef())){
                        System.out.println(s);
                    }
                }
            }


        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }

    }

}
