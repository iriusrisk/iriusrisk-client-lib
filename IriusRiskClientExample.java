/*
 * Copyright (c) 2012-2020 Continuum Security.  All rights reserved
 */
package com.iriusrisk.client;

import com.iriusrisk.ApiException;
import com.iriusrisk.api.ProductsApi;
import com.iriusrisk.model.CreateProduct;
import com.iriusrisk.model.ProductShort;

import java.io.File;
import java.util.List;

/**
 * This is an example of how to use IriusRisk Client Lib to perform some actions
 */
public class IriusRiskClient {
    public static void main(String[] args) {

        System.out.println("New IriusRisk instance");
        ProductsApi apiInstance = new ProductsApi();
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
