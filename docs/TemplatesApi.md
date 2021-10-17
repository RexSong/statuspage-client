# TemplatesApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPagesPageIdIncidentTemplates**](TemplatesApi.md#getPagesPageIdIncidentTemplates) | **GET** /pages/{page_id}/incident_templates | Get a list of templates
[**postPagesPageIdIncidentTemplates**](TemplatesApi.md#postPagesPageIdIncidentTemplates) | **POST** /pages/{page_id}/incident_templates | Create a template


<a name="getPagesPageIdIncidentTemplates"></a>
# **getPagesPageIdIncidentTemplates**
> List&lt;IncidentTemplate&gt; getPagesPageIdIncidentTemplates(pageId, page, perPage)

Get a list of templates

Get a list of templates

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 1; // Integer | Page offset to fetch.
    Integer perPage = 100; // Integer | Number of results to return per page.
    try {
      List<IncidentTemplate> result = apiInstance.getPagesPageIdIncidentTemplates(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getPagesPageIdIncidentTemplates");
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
 **page** | **Integer**| Page offset to fetch. | [optional] [default to 1]
 **perPage** | **Integer**| Number of results to return per page. | [optional] [default to 100]

### Return type

[**List&lt;IncidentTemplate&gt;**](IncidentTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of templates |  -  |
**401** | Could not authenticate |  -  |

<a name="postPagesPageIdIncidentTemplates"></a>
# **postPagesPageIdIncidentTemplates**
> IncidentTemplate postPagesPageIdIncidentTemplates(pageId, postPagesPageIdIncidentTemplates)

Create a template

Create a template

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdIncidentTemplates postPagesPageIdIncidentTemplates = new PostPagesPageIdIncidentTemplates(); // PostPagesPageIdIncidentTemplates | 
    try {
      IncidentTemplate result = apiInstance.postPagesPageIdIncidentTemplates(pageId, postPagesPageIdIncidentTemplates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#postPagesPageIdIncidentTemplates");
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
 **postPagesPageIdIncidentTemplates** | [**PostPagesPageIdIncidentTemplates**](PostPagesPageIdIncidentTemplates.md)|  |

### Return type

[**IncidentTemplate**](IncidentTemplate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a template |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

