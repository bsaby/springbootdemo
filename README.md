For java options of javase web app test

## Details
- Deployment type: JAR

## How to test custom java options for Windows Java SE app service
### For V1 javase app
1. Deploy JAR package to javase web app
2. Open the web app URL and access the context path: /test1
3. Check the JAVA_OPTS argument are added into web app start arguments like below:
![logpoint](images/javaoptions.PNG)

### For V2 javaSE app
1. Generate v2 settings using ```mvn azure-webapp:config```
2. Add the following seeting in pom file 
```
    <appSettings>
        <!--JVM OPTIONS -->
        <property> 
            <name>JAVA_OPTS</name>  
            <value>-Dtest=12345</value>
        </property> 
    </appSettings>
```
3. Do the same steps as V1
