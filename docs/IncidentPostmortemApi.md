# IncidentPostmortemApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdIncidentsIncidentIdPostmortem**](IncidentPostmortemApi.md#deletePagesPageIdIncidentsIncidentIdPostmortem) | **DELETE** /pages/{page_id}/incidents/{incident_id}/postmortem | Delete Postmortem
[**getPagesPageIdIncidentsIncidentIdPostmortem**](IncidentPostmortemApi.md#getPagesPageIdIncidentsIncidentIdPostmortem) | **GET** /pages/{page_id}/incidents/{incident_id}/postmortem | Get Postmortem
[**putPagesPageIdIncidentsIncidentIdPostmortem**](IncidentPostmortemApi.md#putPagesPageIdIncidentsIncidentIdPostmortem) | **PUT** /pages/{page_id}/incidents/{incident_id}/postmortem | Create Postmortem
[**putPagesPageIdIncidentsIncidentIdPostmortemPublish**](IncidentPostmortemApi.md#putPagesPageIdIncidentsIncidentIdPostmortemPublish) | **PUT** /pages/{page_id}/incidents/{incident_id}/postmortem/publish | Publish Postmortem
[**putPagesPageIdIncidentsIncidentIdPostmortemRevert**](IncidentPostmortemApi.md#putPagesPageIdIncidentsIncidentIdPostmortemRevert) | **PUT** /pages/{page_id}/incidents/{incident_id}/postmortem/revert | Revert Postmortem


<a name="deletePagesPageIdIncidentsIncidentIdPostmortem"></a>
# **deletePagesPageIdIncidentsIncidentIdPostmortem**
> deletePagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId)

Delete Postmortem

Delete Postmortem

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentPostmortemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentPostmortemApi apiInstance = new IncidentPostmortemApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      apiInstance.deletePagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentPostmortemApi#deletePagesPageIdIncidentsIncidentIdPostmortem");
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

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Delete Postmortem |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsIncidentIdPostmortem"></a>
# **getPagesPageIdIncidentsIncidentIdPostmortem**
> Postmortem getPagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId)

Get Postmortem

Get Postmortem

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentPostmortemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentPostmortemApi apiInstance = new IncidentPostmortemApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      Postmortem result = apiInstance.getPagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentPostmortemApi#getPagesPageIdIncidentsIncidentIdPostmortem");
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

[**Postmortem**](Postmortem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get Postmortem |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="putPagesPageIdIncidentsIncidentIdPostmortem"></a>
# **putPagesPageIdIncidentsIncidentIdPostmortem**
> Postmortem putPagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId, putPagesPageIdIncidentsIncidentIdPostmortem)

Create Postmortem

Create Postmortem

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentPostmortemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentPostmortemApi apiInstance = new IncidentPostmortemApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    PutPagesPageIdIncidentsIncidentIdPostmortem putPagesPageIdIncidentsIncidentIdPostmortem = new PutPagesPageIdIncidentsIncidentIdPostmortem(); // PutPagesPageIdIncidentsIncidentIdPostmortem | 
    try {
      Postmortem result = apiInstance.putPagesPageIdIncidentsIncidentIdPostmortem(pageId, incidentId, putPagesPageIdIncidentsIncidentIdPostmortem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentPostmortemApi#putPagesPageIdIncidentsIncidentIdPostmortem");
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
 **putPagesPageIdIncidentsIncidentIdPostmortem** | [**PutPagesPageIdIncidentsIncidentIdPostmortem**](PutPagesPageIdIncidentsIncidentIdPostmortem.md)|  |

### Return type

[**Postmortem**](Postmortem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Create Postmortem |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |

<a name="putPagesPageIdIncidentsIncidentIdPostmortemPublish"></a>
# **putPagesPageIdIncidentsIncidentIdPostmortemPublish**
> Postmortem putPagesPageIdIncidentsIncidentIdPostmortemPublish(pageId, incidentId, putPagesPageIdIncidentsIncidentIdPostmortemPublish)

Publish Postmortem

Publish Postmortem

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentPostmortemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentPostmortemApi apiInstance = new IncidentPostmortemApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    PutPagesPageIdIncidentsIncidentIdPostmortemPublish putPagesPageIdIncidentsIncidentIdPostmortemPublish = new PutPagesPageIdIncidentsIncidentIdPostmortemPublish(); // PutPagesPageIdIncidentsIncidentIdPostmortemPublish | 
    try {
      Postmortem result = apiInstance.putPagesPageIdIncidentsIncidentIdPostmortemPublish(pageId, incidentId, putPagesPageIdIncidentsIncidentIdPostmortemPublish);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentPostmortemApi#putPagesPageIdIncidentsIncidentIdPostmortemPublish");
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
 **putPagesPageIdIncidentsIncidentIdPostmortemPublish** | [**PutPagesPageIdIncidentsIncidentIdPostmortemPublish**](PutPagesPageIdIncidentsIncidentIdPostmortemPublish.md)|  |

### Return type

[**Postmortem**](Postmortem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Publish Postmortem |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="putPagesPageIdIncidentsIncidentIdPostmortemRevert"></a>
# **putPagesPageIdIncidentsIncidentIdPostmortemRevert**
> Postmortem putPagesPageIdIncidentsIncidentIdPostmortemRevert(pageId, incidentId)

Revert Postmortem

Revert Postmortem

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentPostmortemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentPostmortemApi apiInstance = new IncidentPostmortemApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      Postmortem result = apiInstance.putPagesPageIdIncidentsIncidentIdPostmortemRevert(pageId, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentPostmortemApi#putPagesPageIdIncidentsIncidentIdPostmortemRevert");
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

[**Postmortem**](Postmortem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Revert Postmortem |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

