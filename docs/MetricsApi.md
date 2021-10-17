# MetricsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdMetricsMetricId**](MetricsApi.md#deletePagesPageIdMetricsMetricId) | **DELETE** /pages/{page_id}/metrics/{metric_id} | Delete a metric
[**deletePagesPageIdMetricsMetricIdData**](MetricsApi.md#deletePagesPageIdMetricsMetricIdData) | **DELETE** /pages/{page_id}/metrics/{metric_id}/data | Reset data for a metric
[**getPagesPageIdMetrics**](MetricsApi.md#getPagesPageIdMetrics) | **GET** /pages/{page_id}/metrics | Get a list of metrics
[**getPagesPageIdMetricsMetricId**](MetricsApi.md#getPagesPageIdMetricsMetricId) | **GET** /pages/{page_id}/metrics/{metric_id} | Get a metric
[**getPagesPageIdMetricsProvidersMetricsProviderIdMetrics**](MetricsApi.md#getPagesPageIdMetricsProvidersMetricsProviderIdMetrics) | **GET** /pages/{page_id}/metrics_providers/{metrics_provider_id}/metrics | List metrics for a metric provider
[**patchPagesPageIdMetricsMetricId**](MetricsApi.md#patchPagesPageIdMetricsMetricId) | **PATCH** /pages/{page_id}/metrics/{metric_id} | Update a metric
[**postPagesPageIdMetricsData**](MetricsApi.md#postPagesPageIdMetricsData) | **POST** /pages/{page_id}/metrics/data | Add data points to metrics
[**postPagesPageIdMetricsMetricIdData**](MetricsApi.md#postPagesPageIdMetricsMetricIdData) | **POST** /pages/{page_id}/metrics/{metric_id}/data | Add data to a metric
[**postPagesPageIdMetricsProvidersMetricsProviderIdMetrics**](MetricsApi.md#postPagesPageIdMetricsProvidersMetricsProviderIdMetrics) | **POST** /pages/{page_id}/metrics_providers/{metrics_provider_id}/metrics | Create a metric for a metric provider
[**putPagesPageIdMetricsMetricId**](MetricsApi.md#putPagesPageIdMetricsMetricId) | **PUT** /pages/{page_id}/metrics/{metric_id} | Update a metric


<a name="deletePagesPageIdMetricsMetricId"></a>
# **deletePagesPageIdMetricsMetricId**
> Metric deletePagesPageIdMetricsMetricId(pageId, metricId)

Delete a metric

Delete a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    try {
      Metric result = apiInstance.deletePagesPageIdMetricsMetricId(pageId, metricId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#deletePagesPageIdMetricsMetricId");
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
 **metricId** | **String**| Metric Identifier |

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
**200** | Delete a metric |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdMetricsMetricIdData"></a>
# **deletePagesPageIdMetricsMetricIdData**
> Metric deletePagesPageIdMetricsMetricIdData(pageId, metricId)

Reset data for a metric

Reset data for a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    try {
      Metric result = apiInstance.deletePagesPageIdMetricsMetricIdData(pageId, metricId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#deletePagesPageIdMetricsMetricIdData");
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
 **metricId** | **String**| Metric Identifier |

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
**200** | Reset data for a metric |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdMetrics"></a>
# **getPagesPageIdMetrics**
> Metric getPagesPageIdMetrics(pageId)

Get a list of metrics

Get a list of metrics

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      Metric result = apiInstance.getPagesPageIdMetrics(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getPagesPageIdMetrics");
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

[**Metric**](Metric.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of metrics |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdMetricsMetricId"></a>
# **getPagesPageIdMetricsMetricId**
> Metric getPagesPageIdMetricsMetricId(pageId, metricId)

Get a metric

Get a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    try {
      Metric result = apiInstance.getPagesPageIdMetricsMetricId(pageId, metricId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getPagesPageIdMetricsMetricId");
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
 **metricId** | **String**| Metric Identifier |

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
**200** | Get a metric |  -  |
**401** | Could not authenticate |  -  |
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
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    try {
      Metric result = apiInstance.getPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getPagesPageIdMetricsProvidersMetricsProviderIdMetrics");
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

<a name="patchPagesPageIdMetricsMetricId"></a>
# **patchPagesPageIdMetricsMetricId**
> Metric patchPagesPageIdMetricsMetricId(pageId, metricId, patchPagesPageIdMetrics)

Update a metric

Update a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    PatchPagesPageIdMetrics patchPagesPageIdMetrics = new PatchPagesPageIdMetrics(); // PatchPagesPageIdMetrics | 
    try {
      Metric result = apiInstance.patchPagesPageIdMetricsMetricId(pageId, metricId, patchPagesPageIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#patchPagesPageIdMetricsMetricId");
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
 **metricId** | **String**| Metric Identifier |
 **patchPagesPageIdMetrics** | [**PatchPagesPageIdMetrics**](PatchPagesPageIdMetrics.md)|  |

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
**200** | Update a metric |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdMetricsData"></a>
# **postPagesPageIdMetricsData**
> MetricAddResponse postPagesPageIdMetricsData(pageId, postPagesPageIdMetricsData)

Add data points to metrics

Add data points to metrics

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdMetricsData postPagesPageIdMetricsData = new PostPagesPageIdMetricsData(); // PostPagesPageIdMetricsData | 
    try {
      MetricAddResponse result = apiInstance.postPagesPageIdMetricsData(pageId, postPagesPageIdMetricsData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#postPagesPageIdMetricsData");
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
 **postPagesPageIdMetricsData** | [**PostPagesPageIdMetricsData**](PostPagesPageIdMetricsData.md)|  |

### Return type

[**MetricAddResponse**](MetricAddResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Add data points to metrics |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**405** | Method not allowed. |  -  |

<a name="postPagesPageIdMetricsMetricIdData"></a>
# **postPagesPageIdMetricsMetricIdData**
> SingleMetricAddResponse postPagesPageIdMetricsMetricIdData(pageId, metricId, postPagesPageIdMetricsMetricIdData)

Add data to a metric

Add data to a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    PostPagesPageIdMetricsMetricIdData postPagesPageIdMetricsMetricIdData = new PostPagesPageIdMetricsMetricIdData(); // PostPagesPageIdMetricsMetricIdData | 
    try {
      SingleMetricAddResponse result = apiInstance.postPagesPageIdMetricsMetricIdData(pageId, metricId, postPagesPageIdMetricsMetricIdData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#postPagesPageIdMetricsMetricIdData");
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
 **metricId** | **String**| Metric Identifier |
 **postPagesPageIdMetricsMetricIdData** | [**PostPagesPageIdMetricsMetricIdData**](PostPagesPageIdMetricsMetricIdData.md)|  |

### Return type

[**SingleMetricAddResponse**](SingleMetricAddResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Add data to a metric |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**405** | Method not allowed. |  -  |
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
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricsProviderId = "metricsProviderId_example"; // String | Metric Provider Identifier
    PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics postPagesPageIdMetricsProvidersMetricsProviderIdMetrics = new PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics(); // PostPagesPageIdMetricsProvidersMetricsProviderIdMetrics | 
    try {
      Metric result = apiInstance.postPagesPageIdMetricsProvidersMetricsProviderIdMetrics(pageId, metricsProviderId, postPagesPageIdMetricsProvidersMetricsProviderIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#postPagesPageIdMetricsProvidersMetricsProviderIdMetrics");
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

<a name="putPagesPageIdMetricsMetricId"></a>
# **putPagesPageIdMetricsMetricId**
> Metric putPagesPageIdMetricsMetricId(pageId, metricId, putPagesPageIdMetrics)

Update a metric

Update a metric

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String metricId = "metricId_example"; // String | Metric Identifier
    PutPagesPageIdMetrics putPagesPageIdMetrics = new PutPagesPageIdMetrics(); // PutPagesPageIdMetrics | 
    try {
      Metric result = apiInstance.putPagesPageIdMetricsMetricId(pageId, metricId, putPagesPageIdMetrics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#putPagesPageIdMetricsMetricId");
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
 **metricId** | **String**| Metric Identifier |
 **putPagesPageIdMetrics** | [**PutPagesPageIdMetrics**](PutPagesPageIdMetrics.md)|  |

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
**200** | Update a metric |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

