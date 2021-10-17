# PageAccessGroupComponentsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PageAccessGroupComponentsApi.md#deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents) | **DELETE** /pages/{page_id}/page_access_groups/{page_access_group_id}/components | Delete components for a page access group
[**deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId**](PageAccessGroupComponentsApi.md#deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId) | **DELETE** /pages/{page_id}/page_access_groups/{page_access_group_id}/components/{component_id} | Remove a component from a page access group
[**getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PageAccessGroupComponentsApi.md#getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents) | **GET** /pages/{page_id}/page_access_groups/{page_access_group_id}/components | List components for a page access group
[**patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PageAccessGroupComponentsApi.md#patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents) | **PATCH** /pages/{page_id}/page_access_groups/{page_access_group_id}/components | Add components to page access group
[**postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PageAccessGroupComponentsApi.md#postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents) | **POST** /pages/{page_id}/page_access_groups/{page_access_group_id}/components | Replace components for a page access group
[**putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PageAccessGroupComponentsApi.md#putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents) | **PUT** /pages/{page_id}/page_access_groups/{page_access_group_id}/components | Add components to page access group


<a name="deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents"></a>
# **deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents**
> PageAccessGroup deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents)

Delete components for a page access group

Delete components for a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    DeletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents = new DeletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents(); // DeletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents | 
    try {
      PageAccessGroup result = apiInstance.deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |
 **deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents** | [**DeletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](DeletePagesPageIdPageAccessGroupsPageAccessGroupIdComponents.md)|  |

### Return type

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete components for a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId"></a>
# **deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId**
> PageAccessGroup deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId(pageId, pageAccessGroupId, componentId)

Remove a component from a page access group

Remove a component from a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      PageAccessGroup result = apiInstance.deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId(pageId, pageAccessGroupId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#deletePagesPageIdPageAccessGroupsPageAccessGroupIdComponentsComponentId");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |
 **componentId** | **String**| Component identifier |

### Return type

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Remove a component from a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents"></a>
# **getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**
> List&lt;Component&gt; getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId)

List components for a page access group

List components for a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    try {
      List<Component> result = apiInstance.getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#getPagesPageIdPageAccessGroupsPageAccessGroupIdComponents");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |

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
**200** | List components for a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents"></a>
# **patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**
> PageAccessGroup patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents)

Add components to page access group

Add components to page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    PatchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents = new PatchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(); // PatchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents | 
    try {
      PageAccessGroup result = apiInstance.patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |
 **patchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents** | [**PatchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PatchPagesPageIdPageAccessGroupsPageAccessGroupIdComponents.md)|  |

### Return type

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Add components to page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents"></a>
# **postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**
> PageAccessGroup postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents)

Replace components for a page access group

Replace components for a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    PostPagesPageIdPageAccessGroupsPageAccessGroupIdComponents postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents = new PostPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(); // PostPagesPageIdPageAccessGroupsPageAccessGroupIdComponents | 
    try {
      PageAccessGroup result = apiInstance.postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |
 **postPagesPageIdPageAccessGroupsPageAccessGroupIdComponents** | [**PostPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PostPagesPageIdPageAccessGroupsPageAccessGroupIdComponents.md)|  |

### Return type

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Replace components for a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents"></a>
# **putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**
> PageAccessGroup putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents)

Add components to page access group

Add components to page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupComponentsApi apiInstance = new PageAccessGroupComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    PutPagesPageIdPageAccessGroupsPageAccessGroupIdComponents putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents = new PutPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(); // PutPagesPageIdPageAccessGroupsPageAccessGroupIdComponents | 
    try {
      PageAccessGroup result = apiInstance.putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents(pageId, pageAccessGroupId, putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupComponentsApi#putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents");
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
 **pageAccessGroupId** | **String**| Page Access Group Identifier |
 **putPagesPageIdPageAccessGroupsPageAccessGroupIdComponents** | [**PutPagesPageIdPageAccessGroupsPageAccessGroupIdComponents**](PutPagesPageIdPageAccessGroupsPageAccessGroupIdComponents.md)|  |

### Return type

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Add components to page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

