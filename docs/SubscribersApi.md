# SubscribersApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdSubscribersSubscriberId**](SubscribersApi.md#deletePagesPageIdSubscribersSubscriberId) | **DELETE** /pages/{page_id}/subscribers/{subscriber_id} | Unsubscribe a subscriber
[**getPagesPageIdSubscribers**](SubscribersApi.md#getPagesPageIdSubscribers) | **GET** /pages/{page_id}/subscribers | Get a list of subscribers
[**getPagesPageIdSubscribersCount**](SubscribersApi.md#getPagesPageIdSubscribersCount) | **GET** /pages/{page_id}/subscribers/count | Get a count of subscribers by type
[**getPagesPageIdSubscribersHistogramByState**](SubscribersApi.md#getPagesPageIdSubscribersHistogramByState) | **GET** /pages/{page_id}/subscribers/histogram_by_state | Get a histogram of subscribers by type and then state
[**getPagesPageIdSubscribersSubscriberId**](SubscribersApi.md#getPagesPageIdSubscribersSubscriberId) | **GET** /pages/{page_id}/subscribers/{subscriber_id} | Get a subscriber
[**getPagesPageIdSubscribersUnsubscribed**](SubscribersApi.md#getPagesPageIdSubscribersUnsubscribed) | **GET** /pages/{page_id}/subscribers/unsubscribed | Get a list of unsubscribed subscribers
[**patchPagesPageIdSubscribersSubscriberId**](SubscribersApi.md#patchPagesPageIdSubscribersSubscriberId) | **PATCH** /pages/{page_id}/subscribers/{subscriber_id} | Update a subscriber
[**postPagesPageIdSubscribers**](SubscribersApi.md#postPagesPageIdSubscribers) | **POST** /pages/{page_id}/subscribers | Create a subscriber
[**postPagesPageIdSubscribersReactivate**](SubscribersApi.md#postPagesPageIdSubscribersReactivate) | **POST** /pages/{page_id}/subscribers/reactivate | Reactivate a list of subscribers
[**postPagesPageIdSubscribersResendConfirmation**](SubscribersApi.md#postPagesPageIdSubscribersResendConfirmation) | **POST** /pages/{page_id}/subscribers/resend_confirmation | Resend confirmations to a list of subscribers
[**postPagesPageIdSubscribersSubscriberIdResendConfirmation**](SubscribersApi.md#postPagesPageIdSubscribersSubscriberIdResendConfirmation) | **POST** /pages/{page_id}/subscribers/{subscriber_id}/resend_confirmation | Resend confirmation to a subscriber
[**postPagesPageIdSubscribersUnsubscribe**](SubscribersApi.md#postPagesPageIdSubscribersUnsubscribe) | **POST** /pages/{page_id}/subscribers/unsubscribe | Unsubscribe a list of subscribers


<a name="deletePagesPageIdSubscribersSubscriberId"></a>
# **deletePagesPageIdSubscribersSubscriberId**
> Subscriber deletePagesPageIdSubscribersSubscriberId(pageId, subscriberId, skipUnsubscriptionNotification)

Unsubscribe a subscriber

Unsubscribe a subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    Boolean skipUnsubscriptionNotification = true; // Boolean | If skip_unsubscription_notification is true, the subscriber does not receive any notifications when they are unsubscribed.
    try {
      Subscriber result = apiInstance.deletePagesPageIdSubscribersSubscriberId(pageId, subscriberId, skipUnsubscriptionNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#deletePagesPageIdSubscribersSubscriberId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **subscriberId** | **String**| Subscriber Identifier |
 **skipUnsubscriptionNotification** | **Boolean**| If skip_unsubscription_notification is true, the subscriber does not receive any notifications when they are unsubscribed. | [optional]

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unsubscribe a subscriber |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdSubscribers"></a>
# **getPagesPageIdSubscribers**
> List&lt;Subscriber&gt; getPagesPageIdSubscribers(pageId, q, type, state, limit, page, sortField, sortDirection)

Get a list of subscribers

Get a list of subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String q = "q_example"; // String | If this is specified, search the contact information (email, endpoint, or phone number) for the provided value. This parameter doesn’t support searching for Slack subscribers.
    String type = "type_example"; // String | If specified, only return subscribers of the indicated type.
    String state = "active"; // String | If this is present, only return subscribers in this state. Specify state \"all\" to find subscribers in any states.
    Integer limit = 56; // Integer | The maximum number of rows to return. If a text query string is specified (q=), the default and maximum limit is 100. If the text query string is not specified, the default and maximum limit are not set, and not providing a limit will return all the subscribers.
    Integer page = 0; // Integer | The page offset of subscribers. The first page is page 0, the second page 1, etc. This skips page * limit subscribers.
    String sortField = "primary"; // String | The field on which to sort: 'primary' to indicate sorting by the identifying field, 'created_at' for sorting by creation timestamp, 'quarantined_at' for sorting by quarantine timestamp, and 'relevance' which sorts by the relevancy of the search text. 'relevance' is not a valid parameter if no search text is supplied.
    String sortDirection = "asc"; // String | The sort direction of the listing.
    try {
      List<Subscriber> result = apiInstance.getPagesPageIdSubscribers(pageId, q, type, state, limit, page, sortField, sortDirection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#getPagesPageIdSubscribers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **q** | **String**| If this is specified, search the contact information (email, endpoint, or phone number) for the provided value. This parameter doesn’t support searching for Slack subscribers. | [optional]
 **type** | **String**| If specified, only return subscribers of the indicated type. | [optional] [enum: email, sms, webhook, slack, integration_partner]
 **state** | **String**| If this is present, only return subscribers in this state. Specify state \&quot;all\&quot; to find subscribers in any states. | [optional] [default to active] [enum: active, unconfirmed, quarantined, all]
 **limit** | **Integer**| The maximum number of rows to return. If a text query string is specified (q&#x3D;), the default and maximum limit is 100. If the text query string is not specified, the default and maximum limit are not set, and not providing a limit will return all the subscribers. | [optional]
 **page** | **Integer**| The page offset of subscribers. The first page is page 0, the second page 1, etc. This skips page * limit subscribers. | [optional] [default to 0]
 **sortField** | **String**| The field on which to sort: &#39;primary&#39; to indicate sorting by the identifying field, &#39;created_at&#39; for sorting by creation timestamp, &#39;quarantined_at&#39; for sorting by quarantine timestamp, and &#39;relevance&#39; which sorts by the relevancy of the search text. &#39;relevance&#39; is not a valid parameter if no search text is supplied. | [optional] [default to primary] [enum: primary, created_at, quarantined_at, relevance]
 **sortDirection** | **String**| The sort direction of the listing. | [optional] [default to asc] [enum: asc, desc]

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of subscribers |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="getPagesPageIdSubscribersCount"></a>
# **getPagesPageIdSubscribersCount**
> SubscriberCountByType getPagesPageIdSubscribersCount(pageId, type, state)

Get a count of subscribers by type

Get a count of subscribers by type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String type = "type_example"; // String | If this is present, only count subscribers of this type.
    String state = "active"; // String | If this is present, only count subscribers in this state. Specify state \"all\" to count subscribers in any states.
    try {
      SubscriberCountByType result = apiInstance.getPagesPageIdSubscribersCount(pageId, type, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#getPagesPageIdSubscribersCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **type** | **String**| If this is present, only count subscribers of this type. | [optional] [enum: email, sms, slack, webhook, integration_partner]
 **state** | **String**| If this is present, only count subscribers in this state. Specify state \&quot;all\&quot; to count subscribers in any states. | [optional] [default to active] [enum: active, unconfirmed, quarantined, all]

### Return type

[**SubscriberCountByType**](SubscriberCountByType.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a count of subscribers by type |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdSubscribersHistogramByState"></a>
# **getPagesPageIdSubscribersHistogramByState**
> SubscriberCountByTypeAndState getPagesPageIdSubscribersHistogramByState(pageId)

Get a histogram of subscribers by type and then state

Get a histogram of subscribers by type and then state

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      SubscriberCountByTypeAndState result = apiInstance.getPagesPageIdSubscribersHistogramByState(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#getPagesPageIdSubscribersHistogramByState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |

### Return type

[**SubscriberCountByTypeAndState**](SubscriberCountByTypeAndState.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a histogram of subscribers by type and then state |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="getPagesPageIdSubscribersSubscriberId"></a>
# **getPagesPageIdSubscribersSubscriberId**
> Subscriber getPagesPageIdSubscribersSubscriberId(pageId, subscriberId)

Get a subscriber

Get a subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    try {
      Subscriber result = apiInstance.getPagesPageIdSubscribersSubscriberId(pageId, subscriberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#getPagesPageIdSubscribersSubscriberId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **subscriberId** | **String**| Subscriber Identifier |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a subscriber |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdSubscribersUnsubscribed"></a>
# **getPagesPageIdSubscribersUnsubscribed**
> List&lt;Subscriber&gt; getPagesPageIdSubscribersUnsubscribed(pageId)

Get a list of unsubscribed subscribers

Get a list of unsubscribed subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      List<Subscriber> result = apiInstance.getPagesPageIdSubscribersUnsubscribed(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#getPagesPageIdSubscribersUnsubscribed");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of unsubscribed subscribers |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdSubscribersSubscriberId"></a>
# **patchPagesPageIdSubscribersSubscriberId**
> Subscriber patchPagesPageIdSubscribersSubscriberId(pageId, subscriberId, patchPagesPageIdSubscribers)

Update a subscriber

Update a subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    PatchPagesPageIdSubscribers patchPagesPageIdSubscribers = new PatchPagesPageIdSubscribers(); // PatchPagesPageIdSubscribers | 
    try {
      Subscriber result = apiInstance.patchPagesPageIdSubscribersSubscriberId(pageId, subscriberId, patchPagesPageIdSubscribers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#patchPagesPageIdSubscribersSubscriberId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **subscriberId** | **String**| Subscriber Identifier |
 **patchPagesPageIdSubscribers** | [**PatchPagesPageIdSubscribers**](PatchPagesPageIdSubscribers.md)|  |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a subscriber |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdSubscribers"></a>
# **postPagesPageIdSubscribers**
> Subscriber postPagesPageIdSubscribers(pageId, postPagesPageIdSubscribers)

Create a subscriber

Create a subscriber. Not applicable for Slack subscribers.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdSubscribers postPagesPageIdSubscribers = new PostPagesPageIdSubscribers(); // PostPagesPageIdSubscribers | 
    try {
      Subscriber result = apiInstance.postPagesPageIdSubscribers(pageId, postPagesPageIdSubscribers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#postPagesPageIdSubscribers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **postPagesPageIdSubscribers** | [**PostPagesPageIdSubscribers**](PostPagesPageIdSubscribers.md)|  |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a subscriber. Not applicable for Slack subscribers. |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdSubscribersReactivate"></a>
# **postPagesPageIdSubscribersReactivate**
> postPagesPageIdSubscribersReactivate(pageId, postPagesPageIdSubscribersReactivate)

Reactivate a list of subscribers

Reactivate a list of quarantined subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdSubscribersReactivate postPagesPageIdSubscribersReactivate = new PostPagesPageIdSubscribersReactivate(); // PostPagesPageIdSubscribersReactivate | 
    try {
      apiInstance.postPagesPageIdSubscribersReactivate(pageId, postPagesPageIdSubscribersReactivate);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#postPagesPageIdSubscribersReactivate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **postPagesPageIdSubscribersReactivate** | [**PostPagesPageIdSubscribersReactivate**](PostPagesPageIdSubscribersReactivate.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Reactivate a list of quarantined subscribers |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdSubscribersResendConfirmation"></a>
# **postPagesPageIdSubscribersResendConfirmation**
> postPagesPageIdSubscribersResendConfirmation(pageId, postPagesPageIdSubscribersResendConfirmation)

Resend confirmations to a list of subscribers

Resend confirmations to a list of subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdSubscribersResendConfirmation postPagesPageIdSubscribersResendConfirmation = new PostPagesPageIdSubscribersResendConfirmation(); // PostPagesPageIdSubscribersResendConfirmation | 
    try {
      apiInstance.postPagesPageIdSubscribersResendConfirmation(pageId, postPagesPageIdSubscribersResendConfirmation);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#postPagesPageIdSubscribersResendConfirmation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **postPagesPageIdSubscribersResendConfirmation** | [**PostPagesPageIdSubscribersResendConfirmation**](PostPagesPageIdSubscribersResendConfirmation.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Resend confirmations to a list of subscribers |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdSubscribersSubscriberIdResendConfirmation"></a>
# **postPagesPageIdSubscribersSubscriberIdResendConfirmation**
> postPagesPageIdSubscribersSubscriberIdResendConfirmation(pageId, subscriberId)

Resend confirmation to a subscriber

Resend confirmation to a subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    try {
      apiInstance.postPagesPageIdSubscribersSubscriberIdResendConfirmation(pageId, subscriberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#postPagesPageIdSubscribersSubscriberIdResendConfirmation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **subscriberId** | **String**| Subscriber Identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Resend confirmation to a subscriber |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdSubscribersUnsubscribe"></a>
# **postPagesPageIdSubscribersUnsubscribe**
> postPagesPageIdSubscribersUnsubscribe(pageId, postPagesPageIdSubscribersUnsubscribe)

Unsubscribe a list of subscribers

Unsubscribe a list of subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubscribersApi apiInstance = new SubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdSubscribersUnsubscribe postPagesPageIdSubscribersUnsubscribe = new PostPagesPageIdSubscribersUnsubscribe(); // PostPagesPageIdSubscribersUnsubscribe | 
    try {
      apiInstance.postPagesPageIdSubscribersUnsubscribe(pageId, postPagesPageIdSubscribersUnsubscribe);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscribersApi#postPagesPageIdSubscribersUnsubscribe");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **String**| Page identifier |
 **postPagesPageIdSubscribersUnsubscribe** | [**PostPagesPageIdSubscribersUnsubscribe**](PostPagesPageIdSubscribersUnsubscribe.md)|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Unsubscribe a list of subscribers |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

