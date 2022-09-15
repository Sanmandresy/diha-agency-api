# AdminApi

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdminById**](AdminApi.md#getAdminById) | **GET** /admins/{admin_id} | 

<a name="getAdminById"></a>
# **getAdminById**
> Admin getAdminById(adminId)



get a specified admin details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminApi;


AdminApi apiInstance = new AdminApi();
Integer adminId = 56; // Integer | admin's id
try {
    Admin result = apiInstance.getAdminById(adminId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#getAdminById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminId** | **Integer**| admin&#x27;s id |

### Return type

[**Admin**](Admin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

