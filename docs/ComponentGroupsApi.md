# ComponentGroupsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdComponentGroupsId**](ComponentGroupsApi.md#deletePagesPageIdComponentGroupsId) | **DELETE** /pages/{page_id}/component-groups/{id} | Delete a component group
[**getPagesPageIdComponentGroups**](ComponentGroupsApi.md#getPagesPageIdComponentGroups) | **GET** /pages/{page_id}/component-groups | Get a list of component groups
[**getPagesPageIdComponentGroupsId**](ComponentGroupsApi.md#getPagesPageIdComponentGroupsId) | **GET** /pages/{page_id}/component-groups/{id} | Get a component group
[**getPagesPageIdComponentGroupsIdUptime**](ComponentGroupsApi.md#getPagesPageIdComponentGroupsIdUptime) | **GET** /pages/{page_id}/component-groups/{id}/uptime | Get uptime data for a component group
[**patchPagesPageIdComponentGroupsId**](ComponentGroupsApi.md#patchPagesPageIdComponentGroupsId) | **PATCH** /pages/{page_id}/component-groups/{id} | Update a component group
[**postPagesPageIdComponentGroups**](ComponentGroupsApi.md#postPagesPageIdComponentGroups) | **POST** /pages/{page_id}/component-groups | Create a component group
[**putPagesPageIdComponentGroupsId**](ComponentGroupsApi.md#putPagesPageIdComponentGroupsId) | **PUT** /pages/{page_id}/component-groups/{id} | Update a component group


<a name="deletePagesPageIdComponentGroupsId"></a>
# **deletePagesPageIdComponentGroupsId**
> GroupComponent deletePagesPageIdComponentGroupsId(pageId, id)

Delete a component group

Delete a component group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String id = "id_example"; // String | Component group identifier
    try {
      GroupComponent result = apiInstance.deletePagesPageIdComponentGroupsId(pageId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#deletePagesPageIdComponentGroupsId");
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
 **id** | **String**| Component group identifier |

### Return type

[**GroupComponent**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete a component group |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdComponentGroups"></a>
# **getPagesPageIdComponentGroups**
> List&lt;GroupComponent&gt; getPagesPageIdComponentGroups(pageId)

Get a list of component groups

Get a list of component groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      List<GroupComponent> result = apiInstance.getPagesPageIdComponentGroups(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#getPagesPageIdComponentGroups");
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

[**List&lt;GroupComponent&gt;**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of component groups |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdComponentGroupsId"></a>
# **getPagesPageIdComponentGroupsId**
> GroupComponent getPagesPageIdComponentGroupsId(pageId, id)

Get a component group

Get a component group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String id = "id_example"; // String | Component group identifier
    try {
      GroupComponent result = apiInstance.getPagesPageIdComponentGroupsId(pageId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#getPagesPageIdComponentGroupsId");
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
 **id** | **String**| Component group identifier |

### Return type

[**GroupComponent**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a component group |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdComponentGroupsIdUptime"></a>
# **getPagesPageIdComponentGroupsIdUptime**
> ComponentGroupUptime getPagesPageIdComponentGroupsIdUptime(pageId, id, start, end)

Get uptime data for a component group

Get uptime data for a component group that has uptime showcase enabled for at least one component.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String id = "id_example"; // String | Component group identifier
    String start = "start_example"; // String | The start date for uptime calculation (defaults to the date of the component in the group with the earliest start_date, or 90 days ago, whichever is more recent). The maximum supported date range is six calendar months. If the year is given, the date defaults to the first day of the year. If the year and month are given, the start date defaults to the first day of that month. The earliest supported date is January 1, 1970. 
    String end = "end_example"; // String | The end date for uptime calculation (defaults to today in the page's time zone). The maximum supported date range is six calendar months. If the year is given, the date defaults to the last day of the year. If the year and month are given, the date defaults to the last day of that month. The earliest supported date is January 1, 1970. 
    try {
      ComponentGroupUptime result = apiInstance.getPagesPageIdComponentGroupsIdUptime(pageId, id, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#getPagesPageIdComponentGroupsIdUptime");
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
 **id** | **String**| Component group identifier |
 **start** | **String**| The start date for uptime calculation (defaults to the date of the component in the group with the earliest start_date, or 90 days ago, whichever is more recent). The maximum supported date range is six calendar months. If the year is given, the date defaults to the first day of the year. If the year and month are given, the start date defaults to the first day of that month. The earliest supported date is January 1, 1970.  | [optional]
 **end** | **String**| The end date for uptime calculation (defaults to today in the page&#39;s time zone). The maximum supported date range is six calendar months. If the year is given, the date defaults to the last day of the year. If the year and month are given, the date defaults to the last day of that month. The earliest supported date is January 1, 1970.  | [optional]

### Return type

[**ComponentGroupUptime**](ComponentGroupUptime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get uptime data for a component group that has uptime showcase enabled for at least one component. |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="patchPagesPageIdComponentGroupsId"></a>
# **patchPagesPageIdComponentGroupsId**
> GroupComponent patchPagesPageIdComponentGroupsId(pageId, id, patchPagesPageIdComponentGroups)

Update a component group

Update a component group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String id = "id_example"; // String | Component group identifier
    PatchPagesPageIdComponentGroups patchPagesPageIdComponentGroups = new PatchPagesPageIdComponentGroups(); // PatchPagesPageIdComponentGroups | 
    try {
      GroupComponent result = apiInstance.patchPagesPageIdComponentGroupsId(pageId, id, patchPagesPageIdComponentGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#patchPagesPageIdComponentGroupsId");
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
 **id** | **String**| Component group identifier |
 **patchPagesPageIdComponentGroups** | [**PatchPagesPageIdComponentGroups**](PatchPagesPageIdComponentGroups.md)|  |

### Return type

[**GroupComponent**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a component group |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdComponentGroups"></a>
# **postPagesPageIdComponentGroups**
> GroupComponent postPagesPageIdComponentGroups(pageId, postPagesPageIdComponentGroups)

Create a component group

Create a component group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdComponentGroups postPagesPageIdComponentGroups = new PostPagesPageIdComponentGroups(); // PostPagesPageIdComponentGroups | 
    try {
      GroupComponent result = apiInstance.postPagesPageIdComponentGroups(pageId, postPagesPageIdComponentGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#postPagesPageIdComponentGroups");
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
 **postPagesPageIdComponentGroups** | [**PostPagesPageIdComponentGroups**](PostPagesPageIdComponentGroups.md)|  |

### Return type

[**GroupComponent**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a component group |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdComponentGroupsId"></a>
# **putPagesPageIdComponentGroupsId**
> GroupComponent putPagesPageIdComponentGroupsId(pageId, id, putPagesPageIdComponentGroups)

Update a component group

Update a component group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentGroupsApi apiInstance = new ComponentGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String id = "id_example"; // String | Component group identifier
    PutPagesPageIdComponentGroups putPagesPageIdComponentGroups = new PutPagesPageIdComponentGroups(); // PutPagesPageIdComponentGroups | 
    try {
      GroupComponent result = apiInstance.putPagesPageIdComponentGroupsId(pageId, id, putPagesPageIdComponentGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentGroupsApi#putPagesPageIdComponentGroupsId");
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
 **id** | **String**| Component group identifier |
 **putPagesPageIdComponentGroups** | [**PutPagesPageIdComponentGroups**](PutPagesPageIdComponentGroups.md)|  |

### Return type

[**GroupComponent**](GroupComponent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a component group |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

