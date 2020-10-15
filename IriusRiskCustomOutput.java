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
import com.iriusrisk.model.ThreatWeakness;
import com.squareup.okhttp.OkHttpClient;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an example of how to use IriusRisk Client Lib to create a custom output from a countermeasure list
 */
public class IriusRiskCustomOutput {
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
            // Get list of products
            List<ProductShort> rs = apiInstance.productsGet(apiToken, null, null, null);
            for (ProductShort r : rs) {
                Product product = apiInstance.productsRefGet(apiToken, r.getRef());

                for(Component component : product.getComponents()){
                    List<ComponentControl> controls = component.getControls();
                    for(ComponentUseCase usecase : component.getUsecases()){
                        for(Threat threat : usecase.getThreats()){
                            for(ThreatWeakness weakness : threat.getWeaknesses()){
                                for(ThreatControl control : weakness.getControls()){
                                    ComponentControl componentControl = controls.stream().filter(x -> x.getRef().equals(control.getRef())).findFirst().get();
                                    String output = String.join("|",
                                            r.getRef(),
                                            r.getName(),
                                            threat.getRef(),
                                            "["+threat.getRiskRating().getConfidentiality()+"+"+threat.getRiskRating().getIntegrity()+"+"+threat.getRiskRating().getAvailability()+"]",
                                            weakness.getRef(),
                                            control.getRef(),
                                            // This is to prevent writing "null" if the Issue Id is not set
                                            // If you want "null" to appear just change the following line to "control.getIssueId(),"
                                            (componentControl.getIssueId() != null ? componentControl.getIssueId() : ""),
                                            componentControl.getState()
                                    );

                                    System.out.println(output);
                                }
                            }
                        }
                    }
                }
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling API");
            e.printStackTrace();
        }

    }

}
