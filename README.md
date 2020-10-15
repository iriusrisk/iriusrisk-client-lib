# iriusrisk-client-lib
IriusRisk client Java library

To generate a jar file:

	mvn package

A library called iriusrisk-client-lib-0.3-SNAPSHOT-jar-with-dependencies.jar will be ready to be used. 

To use the library in a Maven project add the following dependency after execute "mvn install" instead of "mvn package":

        <dependency>
            <groupId>com.iriusrisk</groupId>
            <artifactId>iriusrisk-client-lib</artifactId>
            <version>0.3-SNAPSHOT</version>
        </dependency>