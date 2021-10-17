# ComponentsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdComponentsComponentId**](ComponentsApi.md#deletePagesPageIdComponentsComponentId) | **DELETE** /pages/{page_id}/components/{component_id} | Delete a component
[**deletePagesPageIdComponentsComponentIdPageAccessGroups**](ComponentsApi.md#deletePagesPageIdComponentsComponentIdPageAccessGroups) | **DELETE** /pages/{page_id}/components/{component_id}/page_access_groups | Remove page access groups from a component
[**deletePagesPageIdComponentsComponentIdPageAccessUsers**](ComponentsApi.md#deletePagesPageIdComponentsComponentIdPageAccessUsers) | **DELETE** /pages/{page_id}/components/{component_id}/page_access_users | Remove page access users from component
[**getPagesPageIdComponents**](ComponentsApi.md#getPagesPageIdComponents) | **GET** /pages/{page_id}/components | Get a list of components
[**getPagesPageIdComponentsComponentId**](ComponentsApi.md#getPagesPageIdComponentsComponentId) | **GET** /pages/{page_id}/components/{component_id} | Get a component
[**getPagesPageIdComponentsComponentIdUptime**](ComponentsApi.md#getPagesPageIdComponentsComponentIdUptime) | **GET** /pages/{page_id}/components/{component_id}/uptime | Get uptime data for a component
[**patchPagesPageIdComponentsComponentId**](ComponentsApi.md#patchPagesPageIdComponentsComponentId) | **PATCH** /pages/{page_id}/components/{component_id} | Update a component
[**postPagesPageIdComponents**](ComponentsApi.md#postPagesPageIdComponents) | **POST** /pages/{page_id}/components | Create a component
[**postPagesPageIdComponentsComponentIdPageAccessGroups**](ComponentsApi.md#postPagesPageIdComponentsComponentIdPageAccessGroups) | **POST** /pages/{page_id}/components/{component_id}/page_access_groups | Add page access groups to a component
[**postPagesPageIdComponentsComponentIdPageAccessUsers**](ComponentsApi.md#postPagesPageIdComponentsComponentIdPageAccessUsers) | **POST** /pages/{page_id}/components/{component_id}/page_access_users | Add page access users to a component
[**putPagesPageIdComponentsComponentId**](ComponentsApi.md#putPagesPageIdComponentsComponentId) | **PUT** /pages/{page_id}/components/{component_id} | Update a component


<a name="deletePagesPageIdComponentsComponentId"></a>
# **deletePagesPageIdComponentsComponentId**
> deletePagesPageIdComponentsComponentId(pageId, componentId)

Delete a component

Delete a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      apiInstance.deletePagesPageIdComponentsComponentId(pageId, componentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#deletePagesPageIdComponentsComponentId");
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
 **componentId** | **String**| Component identifier |

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
**204** | Delete a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdComponentsComponentIdPageAccessGroups"></a>
# **deletePagesPageIdComponentsComponentIdPageAccessGroups**
> Component deletePagesPageIdComponentsComponentIdPageAccessGroups(pageId, componentId)

Remove page access groups from a component

Remove page access groups from a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      Component result = apiInstance.deletePagesPageIdComponentsComponentIdPageAccessGroups(pageId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#deletePagesPageIdComponentsComponentIdPageAccessGroups");
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
 **componentId** | **String**| Component identifier |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Remove page access groups from a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdComponentsComponentIdPageAccessUsers"></a>
# **deletePagesPageIdComponentsComponentIdPageAccessUsers**
> Component deletePagesPageIdComponentsComponentIdPageAccessUsers(pageId, componentId)

Remove page access users from component

Remove page access users from component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      Component result = apiInstance.deletePagesPageIdComponentsComponentIdPageAccessUsers(pageId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#deletePagesPageIdComponentsComponentIdPageAccessUsers");
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
 **componentId** | **String**| Component identifier |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Remove page access users from component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdComponents"></a>
# **getPagesPageIdComponents**
> List&lt;Component&gt; getPagesPageIdComponents(pageId, page, perPage)

Get a list of components

Get a list of components

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 56; // Integer | Page offset to fetch.
    Integer perPage = 56; // Integer | Number of results to return per page.
    try {
      List<Component> result = apiInstance.getPagesPageIdComponents(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#getPagesPageIdComponents");
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
 **page** | **Integer**| Page offset to fetch. | [optional]
 **perPage** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;Component&gt;**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of components |  -  |
**401** | Could not authenticate |  -  |

<a name="getPagesPageIdComponentsComponentId"></a>
# **getPagesPageIdComponentsComponentId**
> Component getPagesPageIdComponentsComponentId(pageId, componentId)

Get a component

Get a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      Component result = apiInstance.getPagesPageIdComponentsComponentId(pageId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#getPagesPageIdComponentsComponentId");
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
 **componentId** | **String**| Component identifier |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdComponentsComponentIdUptime"></a>
# **getPagesPageIdComponentsComponentIdUptime**
> ComponentUptime getPagesPageIdComponentsComponentIdUptime(pageId, componentId, start, end)

Get uptime data for a component

Get uptime data for a component that has uptime showcase enabled

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    String start = "start_example"; // String | The start date for uptime calculation (defaults to the component's start_date field or 90 days ago, whichever is more recent). The maximum supported date range is six calendar months. If the year is given, the date defaults to the first day of the year. If the year and month are given, the start date defaults to the first day of that month. The earliest supported date is January 1, 1970. 
    String end = "end_example"; // String | The end date for uptime calculation (defaults to today in the page's time zone). The maximum supported date range is six calendar months. If the year is given, the date defaults to the last day of the year. If the year and month are given, the date defaults to the last day of that month. The earliest supported date is January 1, 1970. 
    try {
      ComponentUptime result = apiInstance.getPagesPageIdComponentsComponentIdUptime(pageId, componentId, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#getPagesPageIdComponentsComponentIdUptime");
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
 **componentId** | **String**| Component identifier |
 **start** | **String**| The start date for uptime calculation (defaults to the component&#39;s start_date field or 90 days ago, whichever is more recent). The maximum supported date range is six calendar months. If the year is given, the date defaults to the first day of the year. If the year and month are given, the start date defaults to the first day of that month. The earliest supported date is January 1, 1970.  | [optional]
 **end** | **String**| The end date for uptime calculation (defaults to today in the page&#39;s time zone). The maximum supported date range is six calendar months. If the year is given, the date defaults to the last day of the year. If the year and month are given, the date defaults to the last day of that month. The earliest supported date is January 1, 1970.  | [optional]

### Return type

[**ComponentUptime**](ComponentUptime.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get uptime data for a component that has uptime showcase enabled |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="patchPagesPageIdComponentsComponentId"></a>
# **patchPagesPageIdComponentsComponentId**
> Component patchPagesPageIdComponentsComponentId(pageId, componentId, patchPagesPageIdComponents)

Update a component

Update a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    PatchPagesPageIdComponents patchPagesPageIdComponents = new PatchPagesPageIdComponents(); // PatchPagesPageIdComponents | 
    try {
      Component result = apiInstance.patchPagesPageIdComponentsComponentId(pageId, componentId, patchPagesPageIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#patchPagesPageIdComponentsComponentId");
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
 **componentId** | **String**| Component identifier |
 **patchPagesPageIdComponents** | [**PatchPagesPageIdComponents**](PatchPagesPageIdComponents.md)|  |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdComponents"></a>
# **postPagesPageIdComponents**
> Component postPagesPageIdComponents(pageId, postPagesPageIdComponents)

Create a component

Create a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdComponents postPagesPageIdComponents = new PostPagesPageIdComponents(); // PostPagesPageIdComponents | 
    try {
      Component result = apiInstance.postPagesPageIdComponents(pageId, postPagesPageIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#postPagesPageIdComponents");
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
 **postPagesPageIdComponents** | [**PostPagesPageIdComponents**](PostPagesPageIdComponents.md)|  |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a component |  -  |
**401** | Could not authenticate |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdComponentsComponentIdPageAccessGroups"></a>
# **postPagesPageIdComponentsComponentIdPageAccessGroups**
> Component postPagesPageIdComponentsComponentIdPageAccessGroups(pageId, componentId)

Add page access groups to a component

Add page access groups to a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      Component result = apiInstance.postPagesPageIdComponentsComponentIdPageAccessGroups(pageId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#postPagesPageIdComponentsComponentIdPageAccessGroups");
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
 **componentId** | **String**| Component identifier |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Add page access groups to a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="postPagesPageIdComponentsComponentIdPageAccessUsers"></a>
# **postPagesPageIdComponentsComponentIdPageAccessUsers**
> Component postPagesPageIdComponentsComponentIdPageAccessUsers(pageId, componentId, pageAccessUserIds)

Add page access users to a component

Add page access users to a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    List<String> pageAccessUserIds = "pageAccessUserIds_example"; // List<String> | List of page access users to add to component
    try {
      Component result = apiInstance.postPagesPageIdComponentsComponentIdPageAccessUsers(pageId, componentId, pageAccessUserIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#postPagesPageIdComponentsComponentIdPageAccessUsers");
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
 **componentId** | **String**| Component identifier |
 **pageAccessUserIds** | [**List&lt;String&gt;**](String.md)| List of page access users to add to component |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Add page access users to a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdComponentsComponentId"></a>
# **putPagesPageIdComponentsComponentId**
> Component putPagesPageIdComponentsComponentId(pageId, componentId, putPagesPageIdComponents)

Update a component

Update a component

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    ComponentsApi apiInstance = new ComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String componentId = "componentId_example"; // String | Component identifier
    PutPagesPageIdComponents putPagesPageIdComponents = new PutPagesPageIdComponents(); // PutPagesPageIdComponents | 
    try {
      Component result = apiInstance.putPagesPageIdComponentsComponentId(pageId, componentId, putPagesPageIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComponentsApi#putPagesPageIdComponentsComponentId");
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
 **componentId** | **String**| Component identifier |
 **putPagesPageIdComponents** | [**PutPagesPageIdComponents**](PutPagesPageIdComponents.md)|  |

### Return type

[**Component**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a component |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

