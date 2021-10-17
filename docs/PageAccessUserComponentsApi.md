# PageAccessUserComponentsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdPageAccessUsersPageAccessUserIdComponents**](PageAccessUserComponentsApi.md#deletePagesPageIdPageAccessUsersPageAccessUserIdComponents) | **DELETE** /pages/{page_id}/page_access_users/{page_access_user_id}/components | Remove components for page access user
[**deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId**](PageAccessUserComponentsApi.md#deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId) | **DELETE** /pages/{page_id}/page_access_users/{page_access_user_id}/components/{component_id} | Remove component for page access user
[**getPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PageAccessUserComponentsApi.md#getPagesPageIdPageAccessUsersPageAccessUserIdComponents) | **GET** /pages/{page_id}/page_access_users/{page_access_user_id}/components | Get components for page access user
[**patchPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PageAccessUserComponentsApi.md#patchPagesPageIdPageAccessUsersPageAccessUserIdComponents) | **PATCH** /pages/{page_id}/page_access_users/{page_access_user_id}/components | Add components for page access user
[**postPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PageAccessUserComponentsApi.md#postPagesPageIdPageAccessUsersPageAccessUserIdComponents) | **POST** /pages/{page_id}/page_access_users/{page_access_user_id}/components | Replace components for page access user
[**putPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PageAccessUserComponentsApi.md#putPagesPageIdPageAccessUsersPageAccessUserIdComponents) | **PUT** /pages/{page_id}/page_access_users/{page_access_user_id}/components | Add components for page access user


<a name="deletePagesPageIdPageAccessUsersPageAccessUserIdComponents"></a>
# **deletePagesPageIdPageAccessUsersPageAccessUserIdComponents**
> PageAccessUser deletePagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, deletePagesPageIdPageAccessUsersPageAccessUserIdComponents)

Remove components for page access user

Remove components for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    DeletePagesPageIdPageAccessUsersPageAccessUserIdComponents deletePagesPageIdPageAccessUsersPageAccessUserIdComponents = new DeletePagesPageIdPageAccessUsersPageAccessUserIdComponents(); // DeletePagesPageIdPageAccessUsersPageAccessUserIdComponents | 
    try {
      PageAccessUser result = apiInstance.deletePagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, deletePagesPageIdPageAccessUsersPageAccessUserIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#deletePagesPageIdPageAccessUsersPageAccessUserIdComponents");
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
 **deletePagesPageIdPageAccessUsersPageAccessUserIdComponents** | [**DeletePagesPageIdPageAccessUsersPageAccessUserIdComponents**](DeletePagesPageIdPageAccessUsersPageAccessUserIdComponents.md)|  |

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
**200** | Remove components for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId"></a>
# **deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId**
> PageAccessUser deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId(pageId, pageAccessUserId, componentId)

Remove component for page access user

Remove component for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    String componentId = "componentId_example"; // String | Component identifier
    try {
      PageAccessUser result = apiInstance.deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId(pageId, pageAccessUserId, componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#deletePagesPageIdPageAccessUsersPageAccessUserIdComponentsComponentId");
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
 **componentId** | **String**| Component identifier |

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
**200** | Remove component for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessUsersPageAccessUserIdComponents"></a>
# **getPagesPageIdPageAccessUsersPageAccessUserIdComponents**
> List&lt;Component&gt; getPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId)

Get components for page access user

Get components for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      List<Component> result = apiInstance.getPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#getPagesPageIdPageAccessUsersPageAccessUserIdComponents");
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

[**List&lt;Component&gt;**](Component.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get components for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdPageAccessUsersPageAccessUserIdComponents"></a>
# **patchPagesPageIdPageAccessUsersPageAccessUserIdComponents**
> PageAccessUser patchPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, patchPagesPageIdPageAccessUsersPageAccessUserIdComponents)

Add components for page access user

Add components for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PatchPagesPageIdPageAccessUsersPageAccessUserIdComponents patchPagesPageIdPageAccessUsersPageAccessUserIdComponents = new PatchPagesPageIdPageAccessUsersPageAccessUserIdComponents(); // PatchPagesPageIdPageAccessUsersPageAccessUserIdComponents | 
    try {
      PageAccessUser result = apiInstance.patchPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, patchPagesPageIdPageAccessUsersPageAccessUserIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#patchPagesPageIdPageAccessUsersPageAccessUserIdComponents");
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
 **patchPagesPageIdPageAccessUsersPageAccessUserIdComponents** | [**PatchPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PatchPagesPageIdPageAccessUsersPageAccessUserIdComponents.md)|  |

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
**200** | Add components for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdPageAccessUsersPageAccessUserIdComponents"></a>
# **postPagesPageIdPageAccessUsersPageAccessUserIdComponents**
> PageAccessUser postPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, postPagesPageIdPageAccessUsersPageAccessUserIdComponents)

Replace components for page access user

Replace components for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PostPagesPageIdPageAccessUsersPageAccessUserIdComponents postPagesPageIdPageAccessUsersPageAccessUserIdComponents = new PostPagesPageIdPageAccessUsersPageAccessUserIdComponents(); // PostPagesPageIdPageAccessUsersPageAccessUserIdComponents | 
    try {
      PageAccessUser result = apiInstance.postPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, postPagesPageIdPageAccessUsersPageAccessUserIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#postPagesPageIdPageAccessUsersPageAccessUserIdComponents");
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
 **postPagesPageIdPageAccessUsersPageAccessUserIdComponents** | [**PostPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PostPagesPageIdPageAccessUsersPageAccessUserIdComponents.md)|  |

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
**201** | Replace components for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="putPagesPageIdPageAccessUsersPageAccessUserIdComponents"></a>
# **putPagesPageIdPageAccessUsersPageAccessUserIdComponents**
> PageAccessUser putPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, putPagesPageIdPageAccessUsersPageAccessUserIdComponents)

Add components for page access user

Add components for page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUserComponentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUserComponentsApi apiInstance = new PageAccessUserComponentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    PutPagesPageIdPageAccessUsersPageAccessUserIdComponents putPagesPageIdPageAccessUsersPageAccessUserIdComponents = new PutPagesPageIdPageAccessUsersPageAccessUserIdComponents(); // PutPagesPageIdPageAccessUsersPageAccessUserIdComponents | 
    try {
      PageAccessUser result = apiInstance.putPagesPageIdPageAccessUsersPageAccessUserIdComponents(pageId, pageAccessUserId, putPagesPageIdPageAccessUsersPageAccessUserIdComponents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUserComponentsApi#putPagesPageIdPageAccessUsersPageAccessUserIdComponents");
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
 **putPagesPageIdPageAccessUsersPageAccessUserIdComponents** | [**PutPagesPageIdPageAccessUsersPageAccessUserIdComponents**](PutPagesPageIdPageAccessUsersPageAccessUserIdComponents.md)|  |

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
**200** | Add components for page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

