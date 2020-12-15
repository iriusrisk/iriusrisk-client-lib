# IriusRisk REST API Java client
IriusRisk provides this Java client to let you integrate with IriusRisk REST API from your Java code.

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.iriusrisk</groupId>
  <artifactId>restapi.client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.iriusrisk:restapi.client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/restapi.client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BusinessUnitsApi;

import java.io.File;
import java.util.*;

public class BusinessUnitsApiExample {

    public static void main(String[] args) {
        
        BusinessUnitsApi apiInstance = new BusinessUnitsApi();
        String apiToken = "apiToken_example"; // String | Authentication token
        String businessUnitIdentifier = "businessUnitIdentifier_example"; // String | unique name of the business unit
        try {
            apiInstance.businessunitsBusinessUnitIdentifierDelete(apiToken, businessUnitIdentifier);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessUnitsApi#businessunitsBusinessUnitIdentifierDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BusinessUnitsApi* | [**businessunitsBusinessUnitIdentifierDelete**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitIdentifierDelete) | **DELETE** /businessunits/{businessUnitIdentifier} | Deletes a users business unit
*BusinessUnitsApi* | [**businessunitsBusinessUnitIdentifierGet**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitIdentifierGet) | **GET** /businessunits/{businessUnitIdentifier} | Gets the business unit details.
*BusinessUnitsApi* | [**businessunitsBusinessUnitIdentifierPut**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitIdentifierPut) | **PUT** /businessunits/{businessUnitIdentifier} | Update a users business unit
*BusinessUnitsApi* | [**businessunitsBusinessUnitNameUsersDelete**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitNameUsersDelete) | **DELETE** /businessunits/{businessUnitName}/users | Unassign a list of users from a business unit
*BusinessUnitsApi* | [**businessunitsBusinessUnitNameUsersGet**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitNameUsersGet) | **GET** /businessunits/{businessUnitName}/users | List users from a business unit
*BusinessUnitsApi* | [**businessunitsBusinessUnitNameUsersPut**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitNameUsersPut) | **PUT** /businessunits/{businessUnitName}/users | Assigns users to a business unit
*BusinessUnitsApi* | [**businessunitsBusinessUnitNameUsersUserDelete**](docs/BusinessUnitsApi.md#businessunitsBusinessUnitNameUsersUserDelete) | **DELETE** /businessunits/{businessUnitName}/users/{user} | Removes a user from a business unit
*BusinessUnitsApi* | [**businessunitsGet**](docs/BusinessUnitsApi.md#businessunitsGet) | **GET** /businessunits | Gets a list of all business units
*BusinessUnitsApi* | [**businessunitsPost**](docs/BusinessUnitsApi.md#businessunitsPost) | **POST** /businessunits | Creates a new user business unit
*BusinessUnitsApi* | [**groupsGet**](docs/BusinessUnitsApi.md#groupsGet) | **GET** /groups | Gets a list of all Groups
*BusinessUnitsApi* | [**groupsGroupIdentifierDelete**](docs/BusinessUnitsApi.md#groupsGroupIdentifierDelete) | **DELETE** /groups/{groupIdentifier} | Deletes a users group
*BusinessUnitsApi* | [**groupsGroupIdentifierGet**](docs/BusinessUnitsApi.md#groupsGroupIdentifierGet) | **GET** /groups/{groupIdentifier} | Gets the group details.
*BusinessUnitsApi* | [**groupsGroupIdentifierPut**](docs/BusinessUnitsApi.md#groupsGroupIdentifierPut) | **PUT** /groups/{groupIdentifier} | Update a users group
*BusinessUnitsApi* | [**groupsGroupUsersDelete**](docs/BusinessUnitsApi.md#groupsGroupUsersDelete) | **DELETE** /groups/{group}/users | Unassign a list of users from a group
*BusinessUnitsApi* | [**groupsGroupUsersGet**](docs/BusinessUnitsApi.md#groupsGroupUsersGet) | **GET** /groups/{group}/users | List users from a group
*BusinessUnitsApi* | [**groupsGroupUsersPut**](docs/BusinessUnitsApi.md#groupsGroupUsersPut) | **PUT** /groups/{group}/users | Assigns users to a group
*BusinessUnitsApi* | [**groupsGroupUsersUserDelete**](docs/BusinessUnitsApi.md#groupsGroupUsersUserDelete) | **DELETE** /groups/{group}/users/{user} | Removes a user from a group
*BusinessUnitsApi* | [**groupsPost**](docs/BusinessUnitsApi.md#groupsPost) | **POST** /groups | Creates a new user group
*ComponentsApi* | [**productsRefComponentsComponentRefTestsCwePut**](docs/ComponentsApi.md#productsRefComponentsComponentRefTestsCwePut) | **PUT** /products/{ref}/components/{componentRef}/tests/{cwe} | Updates a single test to a component.
*ComponentsApi* | [**productsRefComponentsComponentRefTestsTestTypeUploadPost**](docs/ComponentsApi.md#productsRefComponentsComponentRefTestsTestTypeUploadPost) | **POST** /products/{ref}/components/{componentRef}/tests/{testType}/upload | Imports test results from different sources to a component
*ControlsApi* | [**productsRefComponentsComponentRefControlsControlRefStatusPut**](docs/ControlsApi.md#productsRefComponentsComponentRefControlsControlRefStatusPut) | **PUT** /products/{ref}/components/{componentRef}/controls/{controlRef}/status | Sets the desired status to a countermeasure
*ControlsApi* | [**productsRefControlsGet**](docs/ControlsApi.md#productsRefControlsGet) | **GET** /products/{ref}/controls | Gets a list of all product countermeasures
*ControlsApi* | [**productsRefControlsImplementedGet**](docs/ControlsApi.md#productsRefControlsImplementedGet) | **GET** /products/{ref}/controls/implemented | Gets a list of all implemented countermeasures of a product.
*ControlsApi* | [**productsRefControlsRequiredGet**](docs/ControlsApi.md#productsRefControlsRequiredGet) | **GET** /products/{ref}/controls/required | Gets a list of all required countermeasures of a product
*CountermeasuresApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**](docs/CountermeasuresApi.md#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures | Creates new countermeasure in a risk pattern
*CountermeasuresApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](docs/CountermeasuresApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
*CountermeasuresApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/CountermeasuresApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*GroupsApi* | [**businessunitsBusinessUnitIdentifierDelete**](docs/GroupsApi.md#businessunitsBusinessUnitIdentifierDelete) | **DELETE** /businessunits/{businessUnitIdentifier} | Deletes a users business unit
*GroupsApi* | [**businessunitsBusinessUnitIdentifierGet**](docs/GroupsApi.md#businessunitsBusinessUnitIdentifierGet) | **GET** /businessunits/{businessUnitIdentifier} | Gets the business unit details.
*GroupsApi* | [**businessunitsBusinessUnitIdentifierPut**](docs/GroupsApi.md#businessunitsBusinessUnitIdentifierPut) | **PUT** /businessunits/{businessUnitIdentifier} | Update a users business unit
*GroupsApi* | [**businessunitsBusinessUnitNameUsersDelete**](docs/GroupsApi.md#businessunitsBusinessUnitNameUsersDelete) | **DELETE** /businessunits/{businessUnitName}/users | Unassign a list of users from a business unit
*GroupsApi* | [**businessunitsBusinessUnitNameUsersGet**](docs/GroupsApi.md#businessunitsBusinessUnitNameUsersGet) | **GET** /businessunits/{businessUnitName}/users | List users from a business unit
*GroupsApi* | [**businessunitsBusinessUnitNameUsersPut**](docs/GroupsApi.md#businessunitsBusinessUnitNameUsersPut) | **PUT** /businessunits/{businessUnitName}/users | Assigns users to a business unit
*GroupsApi* | [**businessunitsBusinessUnitNameUsersUserDelete**](docs/GroupsApi.md#businessunitsBusinessUnitNameUsersUserDelete) | **DELETE** /businessunits/{businessUnitName}/users/{user} | Removes a user from a business unit
*GroupsApi* | [**businessunitsGet**](docs/GroupsApi.md#businessunitsGet) | **GET** /businessunits | Gets a list of all business units
*GroupsApi* | [**businessunitsPost**](docs/GroupsApi.md#businessunitsPost) | **POST** /businessunits | Creates a new user business unit
*GroupsApi* | [**groupsGet**](docs/GroupsApi.md#groupsGet) | **GET** /groups | Gets a list of all Groups
*GroupsApi* | [**groupsGroupIdentifierDelete**](docs/GroupsApi.md#groupsGroupIdentifierDelete) | **DELETE** /groups/{groupIdentifier} | Deletes a users group
*GroupsApi* | [**groupsGroupIdentifierGet**](docs/GroupsApi.md#groupsGroupIdentifierGet) | **GET** /groups/{groupIdentifier} | Gets the group details.
*GroupsApi* | [**groupsGroupIdentifierPut**](docs/GroupsApi.md#groupsGroupIdentifierPut) | **PUT** /groups/{groupIdentifier} | Update a users group
*GroupsApi* | [**groupsGroupUsersDelete**](docs/GroupsApi.md#groupsGroupUsersDelete) | **DELETE** /groups/{group}/users | Unassign a list of users from a group
*GroupsApi* | [**groupsGroupUsersGet**](docs/GroupsApi.md#groupsGroupUsersGet) | **GET** /groups/{group}/users | List users from a group
*GroupsApi* | [**groupsGroupUsersPut**](docs/GroupsApi.md#groupsGroupUsersPut) | **PUT** /groups/{group}/users | Assigns users to a group
*GroupsApi* | [**groupsGroupUsersUserDelete**](docs/GroupsApi.md#groupsGroupUsersUserDelete) | **DELETE** /groups/{group}/users/{user} | Removes a user from a group
*GroupsApi* | [**groupsPost**](docs/GroupsApi.md#groupsPost) | **POST** /groups | Creates a new user group
*GroupsApi* | [**productsRefGroupsDelete**](docs/GroupsApi.md#productsRefGroupsDelete) | **DELETE** /products/{ref}/groups | Unassigns a list of user groups from a product.
*GroupsApi* | [**productsRefGroupsGet**](docs/GroupsApi.md#productsRefGroupsGet) | **GET** /products/{ref}/groups | List all groups assigned to a product
*GroupsApi* | [**productsRefGroupsPut**](docs/GroupsApi.md#productsRefGroupsPut) | **PUT** /products/{ref}/groups | Assigns groups of users to a product.
*LibrariesApi* | [**librariesLibraryRefDelete**](docs/LibrariesApi.md#librariesLibraryRefDelete) | **DELETE** /libraries/{libraryRef} | Deletes a Library
*LibrariesApi* | [**librariesLibraryRefGet**](docs/LibrariesApi.md#librariesLibraryRefGet) | **GET** /libraries/{libraryRef} | Gets library details
*LibrariesApi* | [**librariesLibraryRefRiskpatternsPost**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsPost) | **POST** /libraries/{libraryRef}/riskpatterns | Creates new Risk Pattern
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures | Creates new countermeasure in a risk pattern
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefDelete**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefDelete) | **DELETE** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Deletes a Risk Pattern
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefGet**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefGet) | **GET** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Gets Risk Pattern details
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases | Creates new use case in a library.
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats | Creates a new threat in a library.
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*LibrariesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](docs/LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern
*LibrariesApi* | [**librariesPost**](docs/LibrariesApi.md#librariesPost) | **POST** /libraries | Creates a Library
*LibrariesApi* | [**productsUploadPost**](docs/LibrariesApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.
*ProductsApi* | [**productsGet**](docs/ProductsApi.md#productsGet) | **GET** /products | Gets a list of all products.
*ProductsApi* | [**productsPost**](docs/ProductsApi.md#productsPost) | **POST** /products | Creates a new product
*ProductsApi* | [**productsRefComponentsComponentRefControlsControlRefStatusPut**](docs/ProductsApi.md#productsRefComponentsComponentRefControlsControlRefStatusPut) | **PUT** /products/{ref}/components/{componentRef}/controls/{controlRef}/status | Sets the desired status to a countermeasure
*ProductsApi* | [**productsRefComponentsComponentRefTestsCwePut**](docs/ProductsApi.md#productsRefComponentsComponentRefTestsCwePut) | **PUT** /products/{ref}/components/{componentRef}/tests/{cwe} | Updates a single test to a component.
*ProductsApi* | [**productsRefComponentsComponentRefTestsTestTypeUploadPost**](docs/ProductsApi.md#productsRefComponentsComponentRefTestsTestTypeUploadPost) | **POST** /products/{ref}/components/{componentRef}/tests/{testType}/upload | Imports test results from different sources to a component
*ProductsApi* | [**productsRefControlsGet**](docs/ProductsApi.md#productsRefControlsGet) | **GET** /products/{ref}/controls | Gets a list of all product countermeasures
*ProductsApi* | [**productsRefControlsImplementedGet**](docs/ProductsApi.md#productsRefControlsImplementedGet) | **GET** /products/{ref}/controls/implemented | Gets a list of all implemented countermeasures of a product.
*ProductsApi* | [**productsRefControlsRequiredGet**](docs/ProductsApi.md#productsRefControlsRequiredGet) | **GET** /products/{ref}/controls/required | Gets a list of all required countermeasures of a product
*ProductsApi* | [**productsRefDelete**](docs/ProductsApi.md#productsRefDelete) | **DELETE** /products/{ref} | Deletes a product
*ProductsApi* | [**productsRefDiagramImageGet**](docs/ProductsApi.md#productsRefDiagramImageGet) | **GET** /products/{ref}/diagram/image | Gets diagram image for product.
*ProductsApi* | [**productsRefGet**](docs/ProductsApi.md#productsRefGet) | **GET** /products/{ref} | Gets product details
*ProductsApi* | [**productsRefGroupsDelete**](docs/ProductsApi.md#productsRefGroupsDelete) | **DELETE** /products/{ref}/groups | Unassigns a list of user groups from a product.
*ProductsApi* | [**productsRefGroupsGet**](docs/ProductsApi.md#productsRefGroupsGet) | **GET** /products/{ref}/groups | List all groups assigned to a product
*ProductsApi* | [**productsRefGroupsPut**](docs/ProductsApi.md#productsRefGroupsPut) | **PUT** /products/{ref}/groups | Assigns groups of users to a product.
*ProductsApi* | [**productsRefPut**](docs/ProductsApi.md#productsRefPut) | **PUT** /products/{ref} | Updates a product
*ProductsApi* | [**productsRefRisksGet**](docs/ProductsApi.md#productsRefRisksGet) | **GET** /products/{ref}/risks | Gets the risks summary of a product
*ProductsApi* | [**productsRefTestsTestTypeUploadPost**](docs/ProductsApi.md#productsRefTestsTestTypeUploadPost) | **POST** /products/{ref}/tests/{testType}/upload | Imports test results from different sources to a product.
*ProductsApi* | [**productsRefThreatsGet**](docs/ProductsApi.md#productsRefThreatsGet) | **GET** /products/{ref}/threats | Gets a list of all threats of a product
*ProductsApi* | [**productsRefUsersDelete**](docs/ProductsApi.md#productsRefUsersDelete) | **DELETE** /products/{ref}/users | Unassigns a list of users from a product.
*ProductsApi* | [**productsRefUsersGet**](docs/ProductsApi.md#productsRefUsersGet) | **GET** /products/{ref}/users | List all users assigned to a product
*ProductsApi* | [**productsRefUsersPut**](docs/ProductsApi.md#productsRefUsersPut) | **PUT** /products/{ref}/users | Assigns users to a product.
*ProductsApi* | [**productsRefUsersUserDelete**](docs/ProductsApi.md#productsRefUsersUserDelete) | **DELETE** /products/{ref}/users/{user} | Unassigns a user from a product
*ProductsApi* | [**productsRefWeaknessesGet**](docs/ProductsApi.md#productsRefWeaknessesGet) | **GET** /products/{ref}/weaknesses | Gets a list of all weaknesses of a product
*ProductsApi* | [**productsRefWeaknessesTestStateGet**](docs/ProductsApi.md#productsRefWeaknessesTestStateGet) | **GET** /products/{ref}/weaknesses/{test_state} | Gets a list of all weaknesses of a product filtered by test state
*ProductsApi* | [**productsUploadPost**](docs/ProductsApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.
*ProductsApi* | [**productsUploadRefPost**](docs/ProductsApi.md#productsUploadRefPost) | **POST** /products/upload/{ref} | Updates an existing product from a XML file upload.
*ProductsApi* | [**rulesProductRefPut**](docs/ProductsApi.md#rulesProductRefPut) | **PUT** /rules/product/{ref} | Executes rules by a product
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsPost**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsPost) | **POST** /libraries/{libraryRef}/riskpatterns | Creates new Risk Pattern
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures | Creates new countermeasure in a risk pattern
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefDelete**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefDelete) | **DELETE** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Deletes a Risk Pattern
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefGet**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefGet) | **GET** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Gets Risk Pattern details
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*RiskPatternsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](docs/RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern
*RisksApi* | [**productsRefRisksGet**](docs/RisksApi.md#productsRefRisksGet) | **GET** /products/{ref}/risks | Gets the risks summary of a product
*RolesApi* | [**rolesPost**](docs/RolesApi.md#rolesPost) | **POST** /roles | Creates a new Role
*RolesApi* | [**rolesRoleNameDelete**](docs/RolesApi.md#rolesRoleNameDelete) | **DELETE** /roles/{role_name} | Deletes an existing role
*RulesApi* | [**rulesProductRefPut**](docs/RulesApi.md#rulesProductRefPut) | **PUT** /rules/product/{ref} | Executes rules by a product
*TemplatesApi* | [**productsUploadPost**](docs/TemplatesApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.
*TestsApi* | [**productsRefComponentsComponentRefTestsCwePut**](docs/TestsApi.md#productsRefComponentsComponentRefTestsCwePut) | **PUT** /products/{ref}/components/{componentRef}/tests/{cwe} | Updates a single test to a component.
*TestsApi* | [**productsRefComponentsComponentRefTestsTestTypeUploadPost**](docs/TestsApi.md#productsRefComponentsComponentRefTestsTestTypeUploadPost) | **POST** /products/{ref}/components/{componentRef}/tests/{testType}/upload | Imports test results from different sources to a component
*TestsApi* | [**productsRefTestsTestTypeUploadPost**](docs/TestsApi.md#productsRefTestsTestTypeUploadPost) | **POST** /products/{ref}/tests/{testType}/upload | Imports test results from different sources to a product.
*ThreatsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**](docs/ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats | Creates a new threat in a library.
*ThreatsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](docs/ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
*ThreatsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](docs/ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
*ThreatsApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*ThreatsApi* | [**productsRefThreatsGet**](docs/ThreatsApi.md#productsRefThreatsGet) | **GET** /products/{ref}/threats | Gets a list of all threats of a product
*TokenApi* | [**usersUsernameTokenPost**](docs/TokenApi.md#usersUsernameTokenPost) | **POST** /users/{username}/token | Generates a user API token
*UseCasesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost**](docs/UseCasesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases | Creates new use case in a library.
*UseCasesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](docs/UseCasesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
*UseCasesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](docs/UseCasesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
*UseCasesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/UseCasesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*UsersApi* | [**businessunitsBusinessUnitNameUsersDelete**](docs/UsersApi.md#businessunitsBusinessUnitNameUsersDelete) | **DELETE** /businessunits/{businessUnitName}/users | Unassign a list of users from a business unit
*UsersApi* | [**businessunitsBusinessUnitNameUsersGet**](docs/UsersApi.md#businessunitsBusinessUnitNameUsersGet) | **GET** /businessunits/{businessUnitName}/users | List users from a business unit
*UsersApi* | [**businessunitsBusinessUnitNameUsersPut**](docs/UsersApi.md#businessunitsBusinessUnitNameUsersPut) | **PUT** /businessunits/{businessUnitName}/users | Assigns users to a business unit
*UsersApi* | [**businessunitsBusinessUnitNameUsersUserDelete**](docs/UsersApi.md#businessunitsBusinessUnitNameUsersUserDelete) | **DELETE** /businessunits/{businessUnitName}/users/{user} | Removes a user from a business unit
*UsersApi* | [**groupsGroupUsersDelete**](docs/UsersApi.md#groupsGroupUsersDelete) | **DELETE** /groups/{group}/users | Unassign a list of users from a group
*UsersApi* | [**groupsGroupUsersGet**](docs/UsersApi.md#groupsGroupUsersGet) | **GET** /groups/{group}/users | List users from a group
*UsersApi* | [**groupsGroupUsersPut**](docs/UsersApi.md#groupsGroupUsersPut) | **PUT** /groups/{group}/users | Assigns users to a group
*UsersApi* | [**groupsGroupUsersUserDelete**](docs/UsersApi.md#groupsGroupUsersUserDelete) | **DELETE** /groups/{group}/users/{user} | Removes a user from a group
*UsersApi* | [**productsRefUsersDelete**](docs/UsersApi.md#productsRefUsersDelete) | **DELETE** /products/{ref}/users | Unassigns a list of users from a product.
*UsersApi* | [**productsRefUsersGet**](docs/UsersApi.md#productsRefUsersGet) | **GET** /products/{ref}/users | List all users assigned to a product
*UsersApi* | [**productsRefUsersPut**](docs/UsersApi.md#productsRefUsersPut) | **PUT** /products/{ref}/users | Assigns users to a product.
*UsersApi* | [**productsRefUsersUserDelete**](docs/UsersApi.md#productsRefUsersUserDelete) | **DELETE** /products/{ref}/users/{user} | Unassigns a user from a product
*UsersApi* | [**usersGet**](docs/UsersApi.md#usersGet) | **GET** /users | List of all Users.
*UsersApi* | [**usersPost**](docs/UsersApi.md#usersPost) | **POST** /users | Creates a new user
*UsersApi* | [**usersUsernameDelete**](docs/UsersApi.md#usersUsernameDelete) | **DELETE** /users/{username} | Deletes a user
*UsersApi* | [**usersUsernameGet**](docs/UsersApi.md#usersUsernameGet) | **GET** /users/{username} | Get all the information of a user
*UsersApi* | [**usersUsernameTokenPost**](docs/UsersApi.md#usersUsernameTokenPost) | **POST** /users/{username}/token | Generates a user API token
*WeaknessesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](docs/WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
*WeaknessesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](docs/WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
*WeaknessesApi* | [**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](docs/WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern
*WeaknessesApi* | [**productsRefWeaknessesGet**](docs/WeaknessesApi.md#productsRefWeaknessesGet) | **GET** /products/{ref}/weaknesses | Gets a list of all weaknesses of a product
*WeaknessesApi* | [**productsRefWeaknessesTestStateGet**](docs/WeaknessesApi.md#productsRefWeaknessesTestStateGet) | **GET** /products/{ref}/weaknesses/{test_state} | Gets a list of all weaknesses of a product filtered by test state


## Documentation for Models

 - [ArchitectureDiagram](docs/ArchitectureDiagram.md)
 - [AssignGroupsProductRequestBody](docs/AssignGroupsProductRequestBody.md)
 - [AssignUserGroupRequestBody](docs/AssignUserGroupRequestBody.md)
 - [AssignUserGroupRequestBody1](docs/AssignUserGroupRequestBody1.md)
 - [AssignUsersProductRequestBody](docs/AssignUsersProductRequestBody.md)
 - [AssociateCountermeasureThreatLibraryRequestBody](docs/AssociateCountermeasureThreatLibraryRequestBody.md)
 - [AssociateCountermeasureWeaknessLibraryRequestBody](docs/AssociateCountermeasureWeaknessLibraryRequestBody.md)
 - [AssociateWeaknessThreatLibraryRequestBody](docs/AssociateWeaknessThreatLibraryRequestBody.md)
 - [CategoryComponent](docs/CategoryComponent.md)
 - [Component](docs/Component.md)
 - [ComponentAsset](docs/ComponentAsset.md)
 - [ComponentControl](docs/ComponentControl.md)
 - [ComponentDefinition](docs/ComponentDefinition.md)
 - [ComponentDefinitionRiskPatterns](docs/ComponentDefinitionRiskPatterns.md)
 - [ComponentTrustZone](docs/ComponentTrustZone.md)
 - [ComponentUseCase](docs/ComponentUseCase.md)
 - [ComponentUseCaseShort](docs/ComponentUseCaseShort.md)
 - [ComponentUseCaseThreatShort](docs/ComponentUseCaseThreatShort.md)
 - [ComponentWeakness](docs/ComponentWeakness.md)
 - [ControlCommand](docs/ControlCommand.md)
 - [ControlCommandStandards](docs/ControlCommandStandards.md)
 - [CreateGroupRequestBody](docs/CreateGroupRequestBody.md)
 - [CreateGroupRequestBody1](docs/CreateGroupRequestBody1.md)
 - [CreateLibraryRequestBody](docs/CreateLibraryRequestBody.md)
 - [CreateProduct](docs/CreateProduct.md)
 - [CreateRiskPatternRequestBody](docs/CreateRiskPatternRequestBody.md)
 - [CreateRoleRequestBody](docs/CreateRoleRequestBody.md)
 - [CreateThreatLibraryRequestBody](docs/CreateThreatLibraryRequestBody.md)
 - [CreateUseCaseLibraryRequestBody](docs/CreateUseCaseLibraryRequestBody.md)
 - [CreateUserRequestBody](docs/CreateUserRequestBody.md)
 - [CreateWeaknessLibraryRequestBody](docs/CreateWeaknessLibraryRequestBody.md)
 - [DataFlow](docs/DataFlow.md)
 - [DataFlowAssets](docs/DataFlowAssets.md)
 - [Error](docs/Error.md)
 - [Group](docs/Group.md)
 - [Implementation](docs/Implementation.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating](docs/LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating.md)
 - [Library](docs/Library.md)
 - [LibraryControl](docs/LibraryControl.md)
 - [LibraryThreat](docs/LibraryThreat.md)
 - [LibraryUseCase](docs/LibraryUseCase.md)
 - [LibraryWeakness](docs/LibraryWeakness.md)
 - [Product](docs/Product.md)
 - [ProductAccessType](docs/ProductAccessType.md)
 - [ProductAsset](docs/ProductAsset.md)
 - [ProductAssetClassification](docs/ProductAssetClassification.md)
 - [ProductSetting](docs/ProductSetting.md)
 - [ProductShort](docs/ProductShort.md)
 - [ProductShortGroups](docs/ProductShortGroups.md)
 - [ProductShortUsers](docs/ProductShortUsers.md)
 - [ProductTrustZone](docs/ProductTrustZone.md)
 - [ProductsrefcomponentscomponentReftestscweControl](docs/ProductsrefcomponentscomponentReftestscweControl.md)
 - [ProductsrefcomponentscomponentReftestscweSource](docs/ProductsrefcomponentscomponentReftestscweSource.md)
 - [Question](docs/Question.md)
 - [Reference](docs/Reference.md)
 - [RiskCount](docs/RiskCount.md)
 - [RiskPattern](docs/RiskPattern.md)
 - [RiskRating](docs/RiskRating.md)
 - [RiskSummary](docs/RiskSummary.md)
 - [Standard](docs/Standard.md)
 - [SupportedStandard](docs/SupportedStandard.md)
 - [Test](docs/Test.md)
 - [TestCommand](docs/TestCommand.md)
 - [TestSource](docs/TestSource.md)
 - [Threat](docs/Threat.md)
 - [ThreatControl](docs/ThreatControl.md)
 - [ThreatNameAndRef](docs/ThreatNameAndRef.md)
 - [ThreatShort](docs/ThreatShort.md)
 - [ThreatWeakness](docs/ThreatWeakness.md)
 - [Udt](docs/Udt.md)
 - [UnassignGroupsProductRequestBody](docs/UnassignGroupsProductRequestBody.md)
 - [UnassignUsersProductRequestBody](docs/UnassignUsersProductRequestBody.md)
 - [UnassingUsersGroupRequestBody](docs/UnassingUsersGroupRequestBody.md)
 - [UnassingUsersGroupRequestBody1](docs/UnassingUsersGroupRequestBody1.md)
 - [UpdateGroupRequestBody](docs/UpdateGroupRequestBody.md)
 - [UpdateGroupRequestBody1](docs/UpdateGroupRequestBody1.md)
 - [UpdateProduct](docs/UpdateProduct.md)
 - [UpdateStatusCountermeasureRequestBody](docs/UpdateStatusCountermeasureRequestBody.md)
 - [UpdateStatusTestRequestBody](docs/UpdateStatusTestRequestBody.md)
 - [User](docs/User.md)
 - [UserDetailed](docs/UserDetailed.md)
 - [WeaknessNameAndRef](docs/WeaknessNameAndRef.md)


## Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
