/*
 * IriusRisk API
 * IriusRisk provides this featured API to allow for deeper customer integrations as well as enable very flexible automations within the many varied environments IriusRisk needs to operate.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iriusrisk.api.client;

import com.iriusrisk.api.client.model.Body1;
import com.iriusrisk.api.client.model.Body17;
import com.iriusrisk.api.client.model.Body18;
import com.iriusrisk.api.client.model.Body2;
import com.iriusrisk.api.client.model.Body3;
import com.iriusrisk.api.client.model.Body4;
import com.iriusrisk.api.client.model.Body5;
import com.iriusrisk.api.client.model.Body6;
import com.iriusrisk.api.client.model.Body7;
import com.iriusrisk.api.client.model.Body8;
import com.iriusrisk.api.client.model.Group;
import com.iriusrisk.api.client.model.InlineResponse200;
import com.iriusrisk.api.client.model.InlineResponse201;
import com.iriusrisk.api.client.model.ProductShortGroups;
import com.iriusrisk.api.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Deletes a users business unit
     *
     * Deletes a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdDeleteTest() {
        String businessunitId = null;
        api.businessunitsBusinessunitIdDelete(businessunitId);

        // TODO: test validations
    }
    
    /**
     * Gets the business unit details.
     *
     * Returns the business unit details for the requested business unit. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all business units can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the business unit if the caller belongs to that business unit. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdGetTest() {
        String businessunitId = null;
        List<Group> response = api.businessunitsBusinessunitIdGet(businessunitId);

        // TODO: test validations
    }
    
    /**
     * Update a users business unit
     *
     * Updates a users business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdPutTest() {
        String businessunitId = null;
        Body6 body = null;
        Group response = api.businessunitsBusinessunitIdPut(businessunitId, body);

        // TODO: test validations
    }
    
    /**
     * Unassign a list of users from a business unit
     *
     * Unassign a list of users from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a business unit, **if you belong to this business unit**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdUsersDeleteTest() {
        String businessunitId = null;
        Body8 body = null;
        api.businessunitsBusinessunitIdUsersDelete(businessunitId, body);

        // TODO: test validations
    }
    
    /**
     * List users from a business unit
     *
     * List users who belongs to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a business unit, **if you belong to this business unit**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdUsersGetTest() {
        String businessunitId = null;
        List<User> response = api.businessunitsBusinessunitIdUsersGet(businessunitId);

        // TODO: test validations
    }
    
    /**
     * Assigns users to a business unit
     *
     * Assigns users to a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a business unit, **if you belong to this business unit**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitIdUsersPutTest() {
        String businessunitId = null;
        Body7 body = null;
        InlineResponse201 response = api.businessunitsBusinessunitIdUsersPut(businessunitId, body);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a business unit
     *
     * Unassign a user from a business unit. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a business unit, **if you belong to this business unit**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsBusinessunitsIdUsersUserIdDeleteTest() {
        String businessunitsId = null;
        String userId = null;
        api.businessunitsBusinessunitsIdUsersUserIdDelete(businessunitsId, userId);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all business units
     *
     * Gets a list of all user&#39;s business units. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsGetTest() {
        List<Group> response = api.businessunitsGet();

        // TODO: test validations
    }
    
    /**
     * Creates a new user business unit
     *
     * Creates a new user business unit. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessunitsPostTest() {
        Body5 body = null;
        Group response = api.businessunitsPost(body);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all groups
     *
     * Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGetTest() {
        List<Group> response = api.groupsGet();

        // TODO: test validations
    }
    
    /**
     * Deletes a users group
     *
     * Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdDeleteTest() {
        String groupId = null;
        api.groupsGroupIdDelete(groupId);

        // TODO: test validations
    }
    
    /**
     * Gets the group details.
     *
     * Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdGetTest() {
        String groupId = null;
        List<Group> response = api.groupsGroupIdGet(groupId);

        // TODO: test validations
    }
    
    /**
     * Update a users group
     *
     * Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdPutTest() {
        String groupId = null;
        Body2 body = null;
        Group response = api.groupsGroupIdPut(groupId, body);

        // TODO: test validations
    }
    
    /**
     * Unassign a list of users from a group
     *
     * Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdUsersDeleteTest() {
        String groupId = null;
        Body4 body = null;
        api.groupsGroupIdUsersDelete(groupId, body);

        // TODO: test validations
    }
    
    /**
     * List users from a group
     *
     * List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdUsersGetTest() {
        String groupId = null;
        List<User> response = api.groupsGroupIdUsersGet(groupId);

        // TODO: test validations
    }
    
    /**
     * Assigns users to a group
     *
     * Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdUsersPutTest() {
        String groupId = null;
        Body3 body = null;
        InlineResponse201 response = api.groupsGroupIdUsersPut(groupId, body);

        // TODO: test validations
    }
    
    /**
     * Removes a user from a group
     *
     * Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdUsersUserIdDeleteTest() {
        String groupId = null;
        String userId = null;
        api.groupsGroupIdUsersUserIdDelete(groupId, userId);

        // TODO: test validations
    }
    
    /**
     * Creates a new user group
     *
     * Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsPostTest() {
        Body1 body = null;
        Group response = api.groupsPost(body);

        // TODO: test validations
    }
    
    /**
     * Unassigns a list of user groups from a product.
     *
     * Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsProductIdGroupsDeleteTest() {
        String productId = null;
        Body18 body = null;
        InlineResponse200 response = api.productsProductIdGroupsDelete(productId, body);

        // TODO: test validations
    }
    
    /**
     * List all groups assigned to a product
     *
     * List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsProductIdGroupsGetTest() {
        String productId = null;
        List<String> response = api.productsProductIdGroupsGet(productId);

        // TODO: test validations
    }
    
    /**
     * Assigns groups of users to a product.
     *
     * Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsProductIdGroupsPutTest() {
        String productId = null;
        Body17 body = null;
        ProductShortGroups response = api.productsProductIdGroupsPut(productId, body);

        // TODO: test validations
    }
    
}
