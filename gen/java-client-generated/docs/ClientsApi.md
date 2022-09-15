# ClientsApi

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewClient**](ClientsApi.md#createNewClient) | **POST** /clients | 
[**deleteClientById**](ClientsApi.md#deleteClientById) | **DELETE** /clients/{client_id} | 
[**getClientById**](ClientsApi.md#getClientById) | **GET** /clients/{client_id} | 
[**getClients**](ClientsApi.md#getClients) | **GET** /clients | 
[**updateClientById**](ClientsApi.md#updateClientById) | **PUT** /clients/{client_id} | 

<a name="createNewClient"></a>
# **createNewClient**
> List&lt;Client&gt; createNewClient(body)



add a new client to our list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
PreClient body = new PreClient(); // PreClient | Client to add in our list
try {
    List<Client> result = apiInstance.createNewClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#createNewClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreClient**](PreClient.md)| Client to add in our list |

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientById"></a>
# **deleteClientById**
> String deleteClientById(clientId)



delete a specified client

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | client's id
try {
    String result = apiInstance.deleteClientById(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#deleteClientById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| client&#x27;s id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="getClientById"></a>
# **getClientById**
> Client getClientById(clientId)



get a specified client

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
Integer clientId = 56; // Integer | client's id
try {
    Client result = apiInstance.getClientById(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClientById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| client&#x27;s id |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClients"></a>
# **getClients**
> List&lt;Client&gt; getClients(ordered)



get all registered clients

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
String ordered = "ordered_example"; // String | ref for sort
try {
    List<Client> result = apiInstance.getClients(ordered);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ordered** | **String**| ref for sort |

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClientById"></a>
# **updateClientById**
> Client updateClientById(body, clientId)



modify a specified client&#x27;s details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientsApi;


ClientsApi apiInstance = new ClientsApi();
PreClient body = new PreClient(); // PreClient | Client to update
Integer clientId = 56; // Integer | client's id
try {
    Client result = apiInstance.updateClientById(body, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#updateClientById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreClient**](PreClient.md)| Client to update |
 **clientId** | **Integer**| client&#x27;s id |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

