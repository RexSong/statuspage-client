# IncidentSubscribersApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId**](IncidentSubscribersApi.md#deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId) | **DELETE** /pages/{page_id}/incidents/{incident_id}/subscribers/{subscriber_id} | Unsubscribe an incident subscriber
[**getPagesPageIdIncidentsIncidentIdSubscribers**](IncidentSubscribersApi.md#getPagesPageIdIncidentsIncidentIdSubscribers) | **GET** /pages/{page_id}/incidents/{incident_id}/subscribers | Get a list of incident subscribers
[**getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId**](IncidentSubscribersApi.md#getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId) | **GET** /pages/{page_id}/incidents/{incident_id}/subscribers/{subscriber_id} | Get an incident subscriber
[**postPagesPageIdIncidentsIncidentIdSubscribers**](IncidentSubscribersApi.md#postPagesPageIdIncidentsIncidentIdSubscribers) | **POST** /pages/{page_id}/incidents/{incident_id}/subscribers | Create an incident subscriber
[**postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation**](IncidentSubscribersApi.md#postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation) | **POST** /pages/{page_id}/incidents/{incident_id}/subscribers/{subscriber_id}/resend_confirmation | Resend confirmation to an incident subscriber


<a name="deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId"></a>
# **deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId**
> Subscriber deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId(pageId, incidentId, subscriberId)

Unsubscribe an incident subscriber

Unsubscribe an incident subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentSubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentSubscribersApi apiInstance = new IncidentSubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    try {
      Subscriber result = apiInstance.deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId(pageId, incidentId, subscriberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentSubscribersApi#deletePagesPageIdIncidentsIncidentIdSubscribersSubscriberId");
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
 **incidentId** | **String**| Incident Identifier |
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
**200** | Unsubscribe an incident subscriber |  -  |

<a name="getPagesPageIdIncidentsIncidentIdSubscribers"></a>
# **getPagesPageIdIncidentsIncidentIdSubscribers**
> List&lt;Subscriber&gt; getPagesPageIdIncidentsIncidentIdSubscribers(pageId, incidentId)

Get a list of incident subscribers

Get a list of incident subscribers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentSubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentSubscribersApi apiInstance = new IncidentSubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      List<Subscriber> result = apiInstance.getPagesPageIdIncidentsIncidentIdSubscribers(pageId, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentSubscribersApi#getPagesPageIdIncidentsIncidentIdSubscribers");
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
 **incidentId** | **String**| Incident Identifier |

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
**200** | Get a list of incident subscribers |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId"></a>
# **getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId**
> Subscriber getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId(pageId, incidentId, subscriberId)

Get an incident subscriber

Get an incident subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentSubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentSubscribersApi apiInstance = new IncidentSubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    try {
      Subscriber result = apiInstance.getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId(pageId, incidentId, subscriberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentSubscribersApi#getPagesPageIdIncidentsIncidentIdSubscribersSubscriberId");
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
 **incidentId** | **String**| Incident Identifier |
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
**200** | Get an incident subscriber |  -  |

<a name="postPagesPageIdIncidentsIncidentIdSubscribers"></a>
# **postPagesPageIdIncidentsIncidentIdSubscribers**
> Subscriber postPagesPageIdIncidentsIncidentIdSubscribers(pageId, incidentId, postPagesPageIdIncidentsIncidentIdSubscribers)

Create an incident subscriber

Create an incident subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentSubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentSubscribersApi apiInstance = new IncidentSubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    PostPagesPageIdIncidentsIncidentIdSubscribers postPagesPageIdIncidentsIncidentIdSubscribers = new PostPagesPageIdIncidentsIncidentIdSubscribers(); // PostPagesPageIdIncidentsIncidentIdSubscribers | 
    try {
      Subscriber result = apiInstance.postPagesPageIdIncidentsIncidentIdSubscribers(pageId, incidentId, postPagesPageIdIncidentsIncidentIdSubscribers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentSubscribersApi#postPagesPageIdIncidentsIncidentIdSubscribers");
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
 **incidentId** | **String**| Incident Identifier |
 **postPagesPageIdIncidentsIncidentIdSubscribers** | [**PostPagesPageIdIncidentsIncidentIdSubscribers**](PostPagesPageIdIncidentsIncidentIdSubscribers.md)|  |

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
**201** | Create an incident subscriber |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation"></a>
# **postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation**
> postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation(pageId, incidentId, subscriberId)

Resend confirmation to an incident subscriber

Resend confirmation to an incident subscriber

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentSubscribersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentSubscribersApi apiInstance = new IncidentSubscribersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    String subscriberId = "subscriberId_example"; // String | Subscriber Identifier
    try {
      apiInstance.postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation(pageId, incidentId, subscriberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentSubscribersApi#postPagesPageIdIncidentsIncidentIdSubscribersSubscriberIdResendConfirmation");
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
 **incidentId** | **String**| Incident Identifier |
 **subscriberId** | **String**| Subscriber Identifier |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Resend confirmation to an incident subscriber |  -  |

