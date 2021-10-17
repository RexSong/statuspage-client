# PageAccessGroupsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdPageAccessGroupsPageAccessGroupId**](PageAccessGroupsApi.md#deletePagesPageIdPageAccessGroupsPageAccessGroupId) | **DELETE** /pages/{page_id}/page_access_groups/{page_access_group_id} | Remove a page access group
[**getPagesPageIdPageAccessGroups**](PageAccessGroupsApi.md#getPagesPageIdPageAccessGroups) | **GET** /pages/{page_id}/page_access_groups | Get a list of page access groups
[**getPagesPageIdPageAccessGroupsPageAccessGroupId**](PageAccessGroupsApi.md#getPagesPageIdPageAccessGroupsPageAccessGroupId) | **GET** /pages/{page_id}/page_access_groups/{page_access_group_id} | Get a page access group
[**patchPagesPageIdPageAccessGroupsPageAccessGroupId**](PageAccessGroupsApi.md#patchPagesPageIdPageAccessGroupsPageAccessGroupId) | **PATCH** /pages/{page_id}/page_access_groups/{page_access_group_id} | Update a page access group
[**postPagesPageIdPageAccessGroups**](PageAccessGroupsApi.md#postPagesPageIdPageAccessGroups) | **POST** /pages/{page_id}/page_access_groups | Create a page access group
[**putPagesPageIdPageAccessGroupsPageAccessGroupId**](PageAccessGroupsApi.md#putPagesPageIdPageAccessGroupsPageAccessGroupId) | **PUT** /pages/{page_id}/page_access_groups/{page_access_group_id} | Update a page access group


<a name="deletePagesPageIdPageAccessGroupsPageAccessGroupId"></a>
# **deletePagesPageIdPageAccessGroupsPageAccessGroupId**
> PageAccessGroup deletePagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId)

Remove a page access group

Remove a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    try {
      PageAccessGroup result = apiInstance.deletePagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#deletePagesPageIdPageAccessGroupsPageAccessGroupId");
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

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Remove a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessGroups"></a>
# **getPagesPageIdPageAccessGroups**
> List&lt;PageAccessGroup&gt; getPagesPageIdPageAccessGroups(pageId)

Get a list of page access groups

Get a list of page access groups

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    try {
      List<PageAccessGroup> result = apiInstance.getPagesPageIdPageAccessGroups(pageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#getPagesPageIdPageAccessGroups");
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

[**List&lt;PageAccessGroup&gt;**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of page access groups |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessGroupsPageAccessGroupId"></a>
# **getPagesPageIdPageAccessGroupsPageAccessGroupId**
> PageAccessGroup getPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId)

Get a page access group

Get a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    try {
      PageAccessGroup result = apiInstance.getPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#getPagesPageIdPageAccessGroupsPageAccessGroupId");
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

[**PageAccessGroup**](PageAccessGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdPageAccessGroupsPageAccessGroupId"></a>
# **patchPagesPageIdPageAccessGroupsPageAccessGroupId**
> PageAccessGroup patchPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId, patchPagesPageIdPageAccessGroups)

Update a page access group

Update a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    PatchPagesPageIdPageAccessGroups patchPagesPageIdPageAccessGroups = new PatchPagesPageIdPageAccessGroups(); // PatchPagesPageIdPageAccessGroups | 
    try {
      PageAccessGroup result = apiInstance.patchPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId, patchPagesPageIdPageAccessGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#patchPagesPageIdPageAccessGroupsPageAccessGroupId");
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
 **patchPagesPageIdPageAccessGroups** | [**PatchPagesPageIdPageAccessGroups**](PatchPagesPageIdPageAccessGroups.md)|  |

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
**200** | Update a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdPageAccessGroups"></a>
# **postPagesPageIdPageAccessGroups**
> PageAccessGroup postPagesPageIdPageAccessGroups(pageId, postPagesPageIdPageAccessGroups)

Create a page access group

Create a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdPageAccessGroups postPagesPageIdPageAccessGroups = new PostPagesPageIdPageAccessGroups(); // PostPagesPageIdPageAccessGroups | 
    try {
      PageAccessGroup result = apiInstance.postPagesPageIdPageAccessGroups(pageId, postPagesPageIdPageAccessGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#postPagesPageIdPageAccessGroups");
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
 **postPagesPageIdPageAccessGroups** | [**PostPagesPageIdPageAccessGroups**](PostPagesPageIdPageAccessGroups.md)|  |

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
**201** | Create a page access group |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdPageAccessGroupsPageAccessGroupId"></a>
# **putPagesPageIdPageAccessGroupsPageAccessGroupId**
> PageAccessGroup putPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId, putPagesPageIdPageAccessGroups)

Update a page access group

Update a page access group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessGroupsApi apiInstance = new PageAccessGroupsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessGroupId = "pageAccessGroupId_example"; // String | Page Access Group Identifier
    PutPagesPageIdPageAccessGroups putPagesPageIdPageAccessGroups = new PutPagesPageIdPageAccessGroups(); // PutPagesPageIdPageAccessGroups | 
    try {
      PageAccessGroup result = apiInstance.putPagesPageIdPageAccessGroupsPageAccessGroupId(pageId, pageAccessGroupId, putPagesPageIdPageAccessGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessGroupsApi#putPagesPageIdPageAccessGroupsPageAccessGroupId");
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
 **putPagesPageIdPageAccessGroups** | [**PutPagesPageIdPageAccessGroups**](PutPagesPageIdPageAccessGroups.md)|  |

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
**200** | Update a page access group |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

