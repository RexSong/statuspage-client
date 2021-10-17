# PageAccessUserMetricsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PageAccessUserMetricsApi.md#deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics) | **DELETE** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics | Delete metrics for page access user
[**deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId**](PageAccessUserMetricsApi.md#deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId) | **DELETE** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics/{metric_id} | Delete metric for page access user
[**getPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PageAccessUserMetricsApi.md#getPagesPageIdPageAccessUsersPageAccessUserIdMetrics) | **GET** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics | Get metrics for page access user
[**patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PageAccessUserMetricsApi.md#patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics) | **PATCH** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics | Add metrics for page access user
[**postPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PageAccessUserMetricsApi.md#postPagesPageIdPageAccessUsersPageAccessUserIdMetrics) | **POST** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics | Replace metrics for page access user
[**putPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PageAccessUserMetricsApi.md#putPagesPageIdPageAccessUsersPageAccessUserIdMetrics) | **PUT** /pages/{page_id}/page_access_users/{page_access_user_id}/metrics | Add metrics for page access user


<a name="deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics"></a>
# **deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics**
> PageAccessUser deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics)

Delete metrics for page access user

Delete metrics for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    DeletePagesPageIdPageAccessUsersPageAccessUserIdMetrics deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics = new DeletePagesPageIdPageAccessUsersPageAccessUserIdMetrics(); // DeletePagesPageIdPageAccessUsersPageAccessUserIdMetrics | 
    try {
      PageAccessUser result = apiInstance.deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |
 **deletePagesPageIdPageAccessUsersPageAccessUserIdMetrics** | [**DeletePagesPageIdPageAccessUsersPageAccessUserIdMetrics**](DeletePagesPageIdPageAccessUsersPageAccessUserIdMetrics.md)|  |

### Return type

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete metrics for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId"></a>
# **deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId**
> PageAccessUser deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId(pageId, pageAccessUserId, metricId)

Delete metric for page access user

Delete metric for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    String metricId = "metricId_example"; // String | Identifier of metric requested
    try {
      PageAccessUser result = apiInstance.deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId(pageId, pageAccessUserId, metricId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#deletePagesPageIdPageAccessUsersPageAccessUserIdMetricsMetricId");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |
 **metricId** | **String**| Identifier of metric requested |

### Return type

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete metric for page access user |  -  |

<a name="getPagesPageIdPageAccessUsersPageAccessUserIdMetrics"></a>
# **getPagesPageIdPageAccessUsersPageAccessUserIdMetrics**
> List&lt;Metric&gt; getPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId)

Get metrics for page access user

Get metrics for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      List<Metric> result = apiInstance.getPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#getPagesPageIdPageAccessUsersPageAccessUserIdMetrics");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |

### Return type

[**List&lt;Metric&gt;**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get metrics for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics"></a>
# **patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics**
> PageAccessUser patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics)

Add metrics for page access user

Add metrics for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PatchPagesPageIdPageAccessUsersPageAccessUserIdMetrics patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics = new PatchPagesPageIdPageAccessUsersPageAccessUserIdMetrics(); // PatchPagesPageIdPageAccessUsersPageAccessUserIdMetrics | 
    try {
      PageAccessUser result = apiInstance.patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |
 **patchPagesPageIdPageAccessUsersPageAccessUserIdMetrics** | [**PatchPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PatchPagesPageIdPageAccessUsersPageAccessUserIdMetrics.md)|  |

### Return type

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Add metrics for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdPageAccessUsersPageAccessUserIdMetrics"></a>
# **postPagesPageIdPageAccessUsersPageAccessUserIdMetrics**
> PageAccessUser postPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, postPagesPageIdPageAccessUsersPageAccessUserIdMetrics)

Replace metrics for page access user

Replace metrics for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PostPagesPageIdPageAccessUsersPageAccessUserIdMetrics postPagesPageIdPageAccessUsersPageAccessUserIdMetrics = new PostPagesPageIdPageAccessUsersPageAccessUserIdMetrics(); // PostPagesPageIdPageAccessUsersPageAccessUserIdMetrics | 
    try {
      PageAccessUser result = apiInstance.postPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, postPagesPageIdPageAccessUsersPageAccessUserIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#postPagesPageIdPageAccessUsersPageAccessUserIdMetrics");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |
 **postPagesPageIdPageAccessUsersPageAccessUserIdMetrics** | [**PostPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PostPagesPageIdPageAccessUsersPageAccessUserIdMetrics.md)|  |

### Return type

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Replace metrics for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="putPagesPageIdPageAccessUsersPageAccessUserIdMetrics"></a>
# **putPagesPageIdPageAccessUsersPageAccessUserIdMetrics**
> PageAccessUser putPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, putPagesPageIdPageAccessUsersPageAccessUserIdMetrics)

Add metrics for page access user

Add metrics for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserMetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserMetricsApi apiInstance = new PageAccessUserMetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PutPagesPageIdPageAccessUsersPageAccessUserIdMetrics putPagesPageIdPageAccessUsersPageAccessUserIdMetrics = new PutPagesPageIdPageAccessUsersPageAccessUserIdMetrics(); // PutPagesPageIdPageAccessUsersPageAccessUserIdMetrics | 
    try {
      PageAccessUser result = apiInstance.putPagesPageIdPageAccessUsersPageAccessUserIdMetrics(pageId, pageAccessUserId, putPagesPageIdPageAccessUsersPageAccessUserIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserMetricsApi#putPagesPageIdPageAccessUsersPageAccessUserIdMetrics");
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
 **pageAccessUserId** | **String**| Page Access User Identifier |
 **putPagesPageIdPageAccessUsersPageAccessUserIdMetrics** | [**PutPagesPageIdPageAccessUsersPageAccessUserIdMetrics**](PutPagesPageIdPageAccessUsersPageAccessUserIdMetrics.md)|  |

### Return type

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Add metrics for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

