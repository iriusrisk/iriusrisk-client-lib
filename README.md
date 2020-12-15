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
  <artifactId>api-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.iriusrisk:api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api.client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.iriusrisk.api.client.invoker.*;
import com.iriusrisk.api.client.invoker.auth.*;
import com.iriusrisk.api.client.model.*;
import com.iriusrisk.api.client.BusinessUnitsApi;

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

[API Endpoints](https://github.com/iriusrisk/iriusrisk-client-lib/wiki/ApiEndpoints)

## Documentation for Models

[Models](https://github.com/iriusrisk/iriusrisk-client-lib/wiki/Models)


## Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
