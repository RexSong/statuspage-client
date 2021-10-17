# MetricProvidersApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdMetricsProvidersMetricsProviderId**](MetricProvidersApi.md#deletePagesPageIdMetricsProvidersMetricsProviderId) | **DELETE** /pages/{page_id}/metrics_providers/{metrics_provider_id} | Delete a metric provider
[**getPagesPageIdMetricsProviders**](MetricProvidersApi.md#getPagesPageIdMetricsProviders) | **GET** /pages/{page_id}/metrics_providers | Get a list of metric providers
[**getPagesPageIdMetricsProvidersMetricsProviderId**](MetricProvidersApi.md#getPagesPageIdMetricsProvidersMetricsProviderId) | **GET** /pages/{page_id}/metrics_providers/{metrics_provider_id} | Get a metric provider
[**getPagesPageIdMetricsProvidersMetricsProviderIdMetrics**](MetricProvidersApi.md#getPagesPageIdMetricsProvidersMetricsProviderIdMetrics) | **GET** /pages/{page_id}/metrics_providers/{metrics_provider_id}/metrics | List metrics for a metric provider
[**patchPagesPageIdMetricsProvidersMetricsProviderId**](MetricProvidersApi.md#patchPagesPageIdMetricsProvidersMetricsProviderId) | **PATCH** /pages/{page_id}/metrics_providers/{metrics_provider_id} | Update a metric provider
[**postPagesPageIdMetricsProviders**](MetricProvidersApi.md#postPagesPageIdMetricsProviders) | **POST** /pages/{page_id}/metrics_providers | Create a metric provider
[**postPagesPageIdMetricsProvidersMetricsProviderIdMetrics**](MetricProvidersApi.md#postPagesPageIdMetricsProvidersMetricsProviderIdMetrics) | **POST** /pages/{page_id}/metrics_providers/{metrics_provider_id}/metrics | Create a metric for a metric provider
[**putPagesPageIdMetricsProvidersMetricsProviderId**](MetricProvidersApi.md#putPagesPageIdMetricsProvidersMetricsProviderId) | **PUT** /pages/{page_id}/metrics_providers/{metrics_provider_id} | Update a metric provider


<a name="deletePagesPageIdMetricsProvidersMetricsProviderId"></a>
# **deletePagesPageIdMetricsProvidersMetricsProviderId**
> MetricsProvider deletePagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId)

Delete a metric provider

Delete a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    try {
      MetricsProvider result = apiInstance.deletePagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#deletePagesPageIdMetricsProvidersMetricsProviderId");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |

### Return type

[**MetricsProvider**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete a metric provider |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdMetricsProviders"></a>
# **getPagesPageIdMetricsProviders**
> List&lt;MetricsProvider&gt; getPagesPageIdMetricsProviders(pageId)

Get a list of metric providers

Get a list of metric providers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      List<MetricsProvider> result = apiInstance.getPagesPageIdMetricsProviders(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#getPagesPageIdMetricsProviders");
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

[**List&lt;MetricsProvider&gt;**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of metric providers |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdMetricsProvidersMetricsProviderId"></a>
# **getPagesPageIdMetricsProvidersMetricsProviderId**
> MetricsProvider getPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId)

Get a metric provider

Get a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    try {
      MetricsProvider result = apiInstance.getPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#getPagesPageIdMetricsProvidersMetricsProviderId");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |

### Return type

[**MetricsProvider**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a metric provider |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdMetricsProvidersMetricsProviderIdMetrics"></a>
# **getPagesPageIdMetricsProvidersMetricsProviderIdMetrics**
> Metric getPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId)

List metrics for a metric provider

List metrics for a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    try {
      Metric result = apiInstance.getPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#getPagesPageIdMetricsProvidersMetricsProviderIdMetrics");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |

### Return type

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List metrics for a metric provider |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdMetricsProvidersMetricsProviderId"></a>
# **patchPagesPageIdMetricsProvidersMetricsProviderId**
> MetricsProvider patchPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId, patchPagesPageIdMetricsProviders)

Update a metric provider

Update a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    PatchPagesPageIdMetricsProviders patchPagesPageIdMetricsProviders = new PatchPagesPageIdMetricsProviders(); // PatchPagesPageIdMetricsProviders | 
    try {
      MetricsProvider result = apiInstance.patchPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId, patchPagesPageIdMetricsProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#patchPagesPageIdMetricsProvidersMetricsProviderId");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |
 **patchPagesPageIdMetricsProviders** | [**PatchPagesPageIdMetricsProviders**](PatchPagesPageIdMetricsProviders.md)|  |

### Return type

[**MetricsProvider**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a metric provider |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdMetricsProviders"></a>
# **postPagesPageIdMetricsProviders**
> MetricsProvider postPagesPageIdMetricsProviders(pageId, postPagesPageIdMetricsProviders)

Create a metric provider

Create a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdMetricsProviders postPagesPageIdMetricsProviders = new PostPagesPageIdMetricsProviders(); // PostPagesPageIdMetricsProviders | 
    try {
      MetricsProvider result = apiInstance.postPagesPageIdMetricsProviders(pageId, postPagesPageIdMetricsProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#postPagesPageIdMetricsProviders");
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
 **postPagesPageIdMetricsProviders** | [**PostPagesPageIdMetricsProviders**](PostPagesPageIdMetricsProviders.md)|  |

### Return type

[**MetricsProvider**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a metric provider |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdMetricsProvidersMetricsProviderIdMetrics"></a>
# **postPagesPageIdMetricsProvidersMetricsProviderIdMetrics**
> Metric postPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId, postPagesPageIdMetricsProvidersMetricsProviderIdMetrics)

Create a metric for a metric provider

Create a metric for a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics postPagesPageIdMetricsProvidersMetricsProviderIdMetrics = new PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics(); // PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics | 
    try {
      Metric result = apiInstance.postPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId, postPagesPageIdMetricsProvidersMetricsProviderIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#postPagesPageIdMetricsProvidersMetricsProviderIdMetrics");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |
 **postPagesPageIdMetricsProvidersMetricsProviderIdMetrics** | [**PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics**](PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics.md)|  |

### Return type

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a metric for a metric provider |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdMetricsProvidersMetricsProviderId"></a>
# **putPagesPageIdMetricsProvidersMetricsProviderId**
> MetricsProvider putPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId, putPagesPageIdMetricsProviders)

Update a metric provider

Update a metric provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricProvidersApi apiInstance = new MetricProvidersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    PutPagesPageIdMetricsProviders putPagesPageIdMetricsProviders = new PutPagesPageIdMetricsProviders(); // PutPagesPageIdMetricsProviders | 
    try {
      MetricsProvider result = apiInstance.putPagesPageIdMetricsProvidersMetricsProviderId(pageId, metricsProviderId, putPagesPageIdMetricsProviders);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricProvidersApi#putPagesPageIdMetricsProvidersMetricsProviderId");
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
 **metricsProviderId** | **String**| Metric Provider Identifier |
 **putPagesPageIdMetricsProviders** | [**PutPagesPageIdMetricsProviders**](PutPagesPageIdMetricsProviders.md)|  |

### Return type

[**MetricsProvider**](MetricsProvider.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a metric provider |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

