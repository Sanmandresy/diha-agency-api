# SecurityApi

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**greet**](SecurityApi.md#greet) | **GET** /hello_there | 

<a name="greet"></a>
# **greet**
> greet()



respond with a great quote if the server is functionnal.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
try {
    apiInstance.greet();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#greet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

