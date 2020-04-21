/*
 * Copyright (c) 2012-2020 Continuum Security.  All rights reserved
 */

import com.squareup.okhttp.OkHttpClient;

import com.iriusrisk.ApiException;
import com.iriusrisk.api.ProductsApi;
import com.iriusrisk.model.CreateProduct;
import com.iriusrisk.model.ProductShort;

import java.io.File;
import java.util.List;
import java.net.InetSocketAddress;
import java.net.Proxy;

/**
 * This is an example of how to use IriusRisk Client Lib to perform some actions
 */
public class IriusRiskClient {
    public static void main(String[] args) {

        System.out.println("New IriusRisk instance");
        ProductsApi apiInstance = new ProductsApi();
        // You must define the scheme://host:port/api/v1 from your IriusRisk instance
        // i.e.: https://server.com:5445/api/v1
        // http://server2.com/api/v1
        
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
            List<ProductShort> rs = apiInstance.productsGet(apiToken);
            System.out.println("Product List: " + rs);

            // Create new product
            CreateProduct createProduct = new CreateProduct();
            createProduct.setName("name-prod-api-test");
            createProduct.setDesc("desc-prod-api-test");
            createProduct.setRef("ref-prod-api-test");
            ProductShort newProduct = apiInstance.productsPost(apiToken, createProduct);

            System.out.println("New Product: " + newProduct.toString());

            // Import from XML template
            // Note: import process may be slow, so this should be launched asynchronously
            File file = new File("</path/to/file.xml>");
            ProductShort p = apiInstance.productsUploadPost(apiToken, "reference", "NewProduct", file, "STANDARD");
            System.out.println("Product Imported");


        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#rolesPost");
            e.printStackTrace();
        }

    }


}
