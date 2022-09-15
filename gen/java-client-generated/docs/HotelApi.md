# HotelApi

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewHotel**](HotelApi.md#createNewHotel) | **POST** /hotels | 
[**deleteHotelById**](HotelApi.md#deleteHotelById) | **DELETE** /hotels/{hotel_id} | 
[**deleteRoomById**](HotelApi.md#deleteRoomById) | **DELETE** /hotels/{hotel_id}/rooms/{room_id} | 
[**getHotelById**](HotelApi.md#getHotelById) | **GET** /hotels/{hotel_id} | 
[**getHotels**](HotelApi.md#getHotels) | **GET** /hotels | 
[**getHotelsByLocation**](HotelApi.md#getHotelsByLocation) | **GET** /hotels/locations/{location} | 
[**getRoomById**](HotelApi.md#getRoomById) | **GET** /hotels/{hotel_id}/rooms/{room_id} | 
[**getRooms**](HotelApi.md#getRooms) | **GET** /hotels/{hotel_id}/rooms | 
[**updateHotelById**](HotelApi.md#updateHotelById) | **PUT** /hotels/{hotel_id} | 
[**updateRoomById**](HotelApi.md#updateRoomById) | **PUT** /hotels/{hotel_id}/rooms/{room_id} | 

<a name="createNewHotel"></a>
# **createNewHotel**
> Hotel createNewHotel(body)



add a new hotel to our list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
PreHotel body = new PreHotel(); // PreHotel | Hotel to create
try {
    Hotel result = apiInstance.createNewHotel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#createNewHotel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreHotel**](PreHotel.md)| Hotel to create |

### Return type

[**Hotel**](Hotel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHotelById"></a>
# **deleteHotelById**
> String deleteHotelById(hotelId)



delete a specified hotel

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
Integer hotelId = 56; // Integer | hotel's id
try {
    String result = apiInstance.deleteHotelById(hotelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#deleteHotelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelId** | **Integer**| hotel&#x27;s id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="deleteRoomById"></a>
# **deleteRoomById**
> String deleteRoomById(hotelId, roomId)



delete a specified room

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
Integer hotelId = 56; // Integer | hotel's id
Integer roomId = 56; // Integer | room's id
try {
    String result = apiInstance.deleteRoomById(hotelId, roomId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#deleteRoomById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelId** | **Integer**| hotel&#x27;s id |
 **roomId** | **Integer**| room&#x27;s id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="getHotelById"></a>
# **getHotelById**
> Hotel getHotelById(hotelId)



get a specified hotel with its details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
Integer hotelId = 56; // Integer | hotel's id
try {
    Hotel result = apiInstance.getHotelById(hotelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#getHotelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelId** | **Integer**| hotel&#x27;s id |

### Return type

[**Hotel**](Hotel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHotels"></a>
# **getHotels**
> List&lt;Hotel&gt; getHotels()



get all hotels available

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
try {
    List<Hotel> result = apiInstance.getHotels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#getHotels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Hotel&gt;**](Hotel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHotelsByLocation"></a>
# **getHotelsByLocation**
> List&lt;Hotel&gt; getHotelsByLocation(location)



get all hotels available in specified location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
String location = "location_example"; // String | 
try {
    List<Hotel> result = apiInstance.getHotelsByLocation(location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#getHotelsByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **String**|  |

### Return type

[**List&lt;Hotel&gt;**](Hotel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoomById"></a>
# **getRoomById**
> Room getRoomById(hotelId, roomId)



get a specified room with its details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
Integer hotelId = 56; // Integer | hotel's id
Integer roomId = 56; // Integer | room's id
try {
    Room result = apiInstance.getRoomById(hotelId, roomId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#getRoomById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelId** | **Integer**| hotel&#x27;s id |
 **roomId** | **Integer**| room&#x27;s id |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRooms"></a>
# **getRooms**
> List&lt;Room&gt; getRooms(hotelId)



get all rooms available

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
Integer hotelId = 56; // Integer | hotel's id
try {
    List<Room> result = apiInstance.getRooms(hotelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#getRooms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelId** | **Integer**| hotel&#x27;s id |

### Return type

[**List&lt;Room&gt;**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHotelById"></a>
# **updateHotelById**
> Hotel updateHotelById(body, hotelId)



modify a specified hotel&#x27;s details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
PreHotel body = new PreHotel(); // PreHotel | Hotel to update
Integer hotelId = 56; // Integer | hotel's id
try {
    Hotel result = apiInstance.updateHotelById(body, hotelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#updateHotelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreHotel**](PreHotel.md)| Hotel to update |
 **hotelId** | **Integer**| hotel&#x27;s id |

### Return type

[**Hotel**](Hotel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRoomById"></a>
# **updateRoomById**
> Room updateRoomById(body, hotelId, roomId)



modify a specified room&#x27;s details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
PreRoom body = new PreRoom(); // PreRoom | room to update
Integer hotelId = 56; // Integer | hotel's id
Integer roomId = 56; // Integer | room's id
try {
    Room result = apiInstance.updateRoomById(body, hotelId, roomId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#updateRoomById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PreRoom**](PreRoom.md)| room to update |
 **hotelId** | **Integer**| hotel&#x27;s id |
 **roomId** | **Integer**| room&#x27;s id |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

