# PageAccessUsersApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdPageAccessUsersPageAccessUserId**](PageAccessUsersApi.md#deletePagesPageIdPageAccessUsersPageAccessUserId) | **DELETE** /pages/{page_id}/page_access_users/{page_access_user_id} | Delete page access user
[**getPagesPageIdPageAccessUsers**](PageAccessUsersApi.md#getPagesPageIdPageAccessUsers) | **GET** /pages/{page_id}/page_access_users | Get a list of page access users
[**getPagesPageIdPageAccessUsersPageAccessUserId**](PageAccessUsersApi.md#getPagesPageIdPageAccessUsersPageAccessUserId) | **GET** /pages/{page_id}/page_access_users/{page_access_user_id} | Get page access user
[**patchPagesPageIdPageAccessUsersPageAccessUserId**](PageAccessUsersApi.md#patchPagesPageIdPageAccessUsersPageAccessUserId) | **PATCH** /pages/{page_id}/page_access_users/{page_access_user_id} | Update page access user
[**postPagesPageIdPageAccessUsers**](PageAccessUsersApi.md#postPagesPageIdPageAccessUsers) | **POST** /pages/{page_id}/page_access_users | Add a page access user
[**putPagesPageIdPageAccessUsersPageAccessUserId**](PageAccessUsersApi.md#putPagesPageIdPageAccessUsersPageAccessUserId) | **PUT** /pages/{page_id}/page_access_users/{page_access_user_id} | Update page access user


<a name="deletePagesPageIdPageAccessUsersPageAccessUserId"></a>
# **deletePagesPageIdPageAccessUsersPageAccessUserId**
> deletePagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId)

Delete page access user

Delete page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      apiInstance.deletePagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#deletePagesPageIdPageAccessUsersPageAccessUserId");
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

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Delete page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessUsers"></a>
# **getPagesPageIdPageAccessUsers**
> List&lt;PageAccessUser&gt; getPagesPageIdPageAccessUsers(pageId, email, page, perPage)

Get a list of page access users

Get a list of page access users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String email = "email_example"; // String | Email address to search for
    Integer page = 56; // Integer | Page offset to fetch.
    Integer perPage = 56; // Integer | Number of results to return per page.
    try {
      List<PageAccessUser> result = apiInstance.getPagesPageIdPageAccessUsers(pageId, email, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#getPagesPageIdPageAccessUsers");
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
 **email** | **String**| Email address to search for | [optional]
 **page** | **Integer**| Page offset to fetch. | [optional]
 **perPage** | **Integer**| Number of results to return per page. | [optional]

### Return type

[**List&lt;PageAccessUser&gt;**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of page access users |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdPageAccessUsersPageAccessUserId"></a>
# **getPagesPageIdPageAccessUsersPageAccessUserId**
> PageAccessUser getPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId)

Get page access user

Get page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      PageAccessUser result = apiInstance.getPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#getPagesPageIdPageAccessUsersPageAccessUserId");
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

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdPageAccessUsersPageAccessUserId"></a>
# **patchPagesPageIdPageAccessUsersPageAccessUserId**
> PageAccessUser patchPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId)

Update page access user

Update page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      PageAccessUser result = apiInstance.patchPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#patchPagesPageIdPageAccessUsersPageAccessUserId");
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

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postPagesPageIdPageAccessUsers"></a>
# **postPagesPageIdPageAccessUsers**
> PageAccessUser postPagesPageIdPageAccessUsers(pageId, postPagesPageIdPageAccessUsers)

Add a page access user

Add a page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdPageAccessUsers postPagesPageIdPageAccessUsers = new PostPagesPageIdPageAccessUsers(); // PostPagesPageIdPageAccessUsers | 
    try {
      PageAccessUser result = apiInstance.postPagesPageIdPageAccessUsers(pageId, postPagesPageIdPageAccessUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#postPagesPageIdPageAccessUsers");
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
 **postPagesPageIdPageAccessUsers** | [**PostPagesPageIdPageAccessUsers**](PostPagesPageIdPageAccessUsers.md)|  |

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
**200** | Add a page access user |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |
**409** | The request could not be processed due to a conflict in resource state. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdPageAccessUsersPageAccessUserId"></a>
# **putPagesPageIdPageAccessUsersPageAccessUserId**
> PageAccessUser putPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId)

Update page access user

Update page access user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PageAccessUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PageAccessUsersApi apiInstance = new PageAccessUsersApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String pageAccessUserId = "pageAccessUserId_example"; // String | Page Access User Identifier
    try {
      PageAccessUser result = apiInstance.putPagesPageIdPageAccessUsersPageAccessUserId(pageId, pageAccessUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PageAccessUsersApi#putPagesPageIdPageAccessUsersPageAccessUserId");
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

[**PageAccessUser**](PageAccessUser.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update page access user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

