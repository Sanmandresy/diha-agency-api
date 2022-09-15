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
PreTransaction body = new PreTransaction(); // PreTransaction | Transaction going on.
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
 **body** | [**PreTransaction**](PreTransaction.md)| Transaction going on. |

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
> List&lt;Transaction&gt; getTransactions()



get a list of all transactions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionApi;


TransactionApi apiInstance = new TransactionApi();
try {
    List<Transaction> result = apiInstance.getTransactions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

