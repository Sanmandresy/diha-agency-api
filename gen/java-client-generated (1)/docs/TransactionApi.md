# TransactionApi

All URIs are relative to *https://virtserver.swaggerhub.com/sanmandresy/diha_agency_api/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewTransaction**](TransactionApi.md#createNewTransaction) | **POST** /transactions | 
[**getTransactionById**](TransactionApi.md#getTransactionById) | **GET** /transactions/{transaction_id} | 
[**getTransactions**](TransactionApi.md#getTransactions) | **GET** /transactions | 

<a name="createNewTransaction"></a>
# **createNewTransaction**
> TransactionResponse createNewTransaction(body)



add a new transaction to our list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Transaction body = new Transaction(); // Transaction | Transaction going on.
try {
    TransactionResponse result = apiInstance.createNewTransaction(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#createNewTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Transaction**](Transaction.md)| Transaction going on. |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionById"></a>
# **getTransactionById**
> Transaction getTransactionById(transactionId)



get a specified transaction.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Integer transactionId = 56; // Integer | transaction's id
try {
    Transaction result = apiInstance.getTransactionById(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **Integer**| transaction&#x27;s id |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> List&lt;Transaction&gt; getTransactions(page, pageSize)



get a list of all transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
Integer page = 56; // Integer | number of page
Integer pageSize = 56; // Integer | max number of rows in a page
try {
    List<Transaction> result = apiInstance.getTransactions(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| number of page |
 **pageSize** | **Integer**| max number of rows in a page |

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

