# swagger-java-client

diha-agency-api
- API version: 1.0.0
  - Build date: 2022-09-11T16:13:17.722Z[GMT]

An early version of an API for a travel Agency named \"Diha Agency\".


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

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
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        Integer adminId = 56; // Integer | admin's id
        try {
            Admin result = apiInstance.getAdminById(adminId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#getAdminById");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**getAdminById**](docs/AdminApi.md#getAdminById) | **GET** /admins/{admin_id} | 
*ClientsApi* | [**createNewClient**](docs/ClientsApi.md#createNewClient) | **POST** /clients | 
*ClientsApi* | [**deleteClientById**](docs/ClientsApi.md#deleteClientById) | **DELETE** /clients/{client_id} | 
*ClientsApi* | [**getClientById**](docs/ClientsApi.md#getClientById) | **GET** /clients/{client_id} | 
*ClientsApi* | [**getClients**](docs/ClientsApi.md#getClients) | **GET** /clients | 
*ClientsApi* | [**updateClientById**](docs/ClientsApi.md#updateClientById) | **PUT** /clients/{client_id} | 
*HotelApi* | [**createNewHotel**](docs/HotelApi.md#createNewHotel) | **POST** /hotels | 
*HotelApi* | [**deleteHotelById**](docs/HotelApi.md#deleteHotelById) | **DELETE** /hotels/{hotel_id} | 
*HotelApi* | [**deleteRoomById**](docs/HotelApi.md#deleteRoomById) | **DELETE** /hotels/{hotel_id}/{room_id} | 
*HotelApi* | [**getHotelById**](docs/HotelApi.md#getHotelById) | **GET** /hotels/{hotel_id} | 
*HotelApi* | [**getHotels**](docs/HotelApi.md#getHotels) | **GET** /hotels | 
*HotelApi* | [**getHotelsByLocation**](docs/HotelApi.md#getHotelsByLocation) | **GET** /hotels/{location} | 
*HotelApi* | [**getRoomById**](docs/HotelApi.md#getRoomById) | **GET** /hotels/{hotel_id}/{room_id} | 
*HotelApi* | [**getRooms**](docs/HotelApi.md#getRooms) | **GET** /hotels/{hotel_id}/rooms | 
*HotelApi* | [**updateHotelById**](docs/HotelApi.md#updateHotelById) | **PUT** /hotels/{hotel_id} | 
*HotelApi* | [**updateRoomById**](docs/HotelApi.md#updateRoomById) | **PUT** /hotels/{hotel_id}/{room_id} | 
*SecurityApi* | [**greet**](docs/SecurityApi.md#greet) | **GET** /hello_there | 
*TransactionApi* | [**createNewTransaction**](docs/TransactionApi.md#createNewTransaction) | **POST** /transactions | 
*TransactionApi* | [**getTransactionById**](docs/TransactionApi.md#getTransactionById) | **GET** /transactions/{transaction_id} | 
*TransactionApi* | [**getTransactions**](docs/TransactionApi.md#getTransactions) | **GET** /transactions | 

## Documentation for Models

 - [Admin](docs/Admin.md)
 - [AllOfHotelDetails](docs/AllOfHotelDetails.md)
 - [AllOfPreHotelDetails](docs/AllOfPreHotelDetails.md)
 - [AllOfPreRoomClientDetails](docs/AllOfPreRoomClientDetails.md)
 - [AllOfPreRoomRoomType](docs/AllOfPreRoomRoomType.md)
 - [AllOfPreRoomStatus](docs/AllOfPreRoomStatus.md)
 - [AllOfRoomClientDetails](docs/AllOfRoomClientDetails.md)
 - [AllOfRoomRoomType](docs/AllOfRoomRoomType.md)
 - [AllOfRoomStatus](docs/AllOfRoomStatus.md)
 - [BadRequestException](docs/BadRequestException.md)
 - [Client](docs/Client.md)
 - [Exception](docs/Exception.md)
 - [Hotel](docs/Hotel.md)
 - [HotelDetails](docs/HotelDetails.md)
 - [HotelServices](docs/HotelServices.md)
 - [InternalServerException](docs/InternalServerException.md)
 - [NotAuthorizedException](docs/NotAuthorizedException.md)
 - [PreClient](docs/PreClient.md)
 - [PreHotel](docs/PreHotel.md)
 - [PreRoom](docs/PreRoom.md)
 - [ResourceNotFoundException](docs/ResourceNotFoundException.md)
 - [Room](docs/Room.md)
 - [RoomStatus](docs/RoomStatus.md)
 - [RoomTypes](docs/RoomTypes.md)
 - [TooManyRequestsException](docs/TooManyRequestsException.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionResponse](docs/TransactionResponse.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

