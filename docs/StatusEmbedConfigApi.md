# StatusEmbedConfigApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPagesPageIdStatusEmbedConfig**](StatusEmbedConfigApi.md#getPagesPageIdStatusEmbedConfig) | **GET** /pages/{page_id}/status_embed_config | Get status embed config settings
[**patchPagesPageIdStatusEmbedConfig**](StatusEmbedConfigApi.md#patchPagesPageIdStatusEmbedConfig) | **PATCH** /pages/{page_id}/status_embed_config | Update status embed config settings
[**putPagesPageIdStatusEmbedConfig**](StatusEmbedConfigApi.md#putPagesPageIdStatusEmbedConfig) | **PUT** /pages/{page_id}/status_embed_config | Update status embed config settings


<a name="getPagesPageIdStatusEmbedConfig"></a>
# **getPagesPageIdStatusEmbedConfig**
> StatusEmbedConfig getPagesPageIdStatusEmbedConfig(pageId)

Get status embed config settings

Get status embed config settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusEmbedConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    StatusEmbedConfigApi apiInstance = new StatusEmbedConfigApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      StatusEmbedConfig result = apiInstance.getPagesPageIdStatusEmbedConfig(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusEmbedConfigApi#getPagesPageIdStatusEmbedConfig");
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

[**StatusEmbedConfig**](StatusEmbedConfig.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get status embed config settings |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdStatusEmbedConfig"></a>
# **patchPagesPageIdStatusEmbedConfig**
> StatusEmbedConfig patchPagesPageIdStatusEmbedConfig(pageId, patchPagesPageIdStatusEmbedConfig)

Update status embed config settings

Update status embed config settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusEmbedConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    StatusEmbedConfigApi apiInstance = new StatusEmbedConfigApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig = new PatchPagesPageIdStatusEmbedConfig(); // PatchPagesPageIdStatusEmbedConfig | 
    try {
      StatusEmbedConfig result = apiInstance.patchPagesPageIdStatusEmbedConfig(pageId, patchPagesPageIdStatusEmbedConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusEmbedConfigApi#patchPagesPageIdStatusEmbedConfig");
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
 **patchPagesPageIdStatusEmbedConfig** | [**PatchPagesPageIdStatusEmbedConfig**](PatchPagesPageIdStatusEmbedConfig.md)|  |

### Return type

[**StatusEmbedConfig**](StatusEmbedConfig.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update status embed config settings |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdStatusEmbedConfig"></a>
# **putPagesPageIdStatusEmbedConfig**
> StatusEmbedConfig putPagesPageIdStatusEmbedConfig(pageId, putPagesPageIdStatusEmbedConfig)

Update status embed config settings

Update status embed config settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusEmbedConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    StatusEmbedConfigApi apiInstance = new StatusEmbedConfigApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig = new PutPagesPageIdStatusEmbedConfig(); // PutPagesPageIdStatusEmbedConfig | 
    try {
      StatusEmbedConfig result = apiInstance.putPagesPageIdStatusEmbedConfig(pageId, putPagesPageIdStatusEmbedConfig);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusEmbedConfigApi#putPagesPageIdStatusEmbedConfig");
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
 **putPagesPageIdStatusEmbedConfig** | [**PutPagesPageIdStatusEmbedConfig**](PutPagesPageIdStatusEmbedConfig.md)|  |

### Return type

[**StatusEmbedConfig**](StatusEmbedConfig.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update status embed config settings |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

