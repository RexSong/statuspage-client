# UsersApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganizationsOrganizationIdUsersUserId**](UsersApi.md#deleteOrganizationsOrganizationIdUsersUserId) | **DELETE** /organizations/{organization_id}/users/{user_id} | Delete a user
[**getOrganizationsOrganizationIdUsers**](UsersApi.md#getOrganizationsOrganizationIdUsers) | **GET** /organizations/{organization_id}/users | Get a list of users
[**postOrganizationsOrganizationIdUsers**](UsersApi.md#postOrganizationsOrganizationIdUsers) | **POST** /organizations/{organization_id}/users | Create a user


<a name="deleteOrganizationsOrganizationIdUsersUserId"></a>
# **deleteOrganizationsOrganizationIdUsersUserId**
> User deleteOrganizationsOrganizationIdUsersUserId(organizationId, userId)

Delete a user

Delete a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String organizationId = "organizationId_example"; // String | Organization Identifier
    String userId = "userId_example"; // String | User Identifier
    try {
      User result = apiInstance.deleteOrganizationsOrganizationIdUsersUserId(organizationId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteOrganizationsOrganizationIdUsersUserId");
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
 **organizationId** | **String**| Organization Identifier |
 **userId** | **String**| User Identifier |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete a user |  -  |
**401** | Could not authenticate |  -  |
**403** | You are not authorized to access this resource. |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getOrganizationsOrganizationIdUsers"></a>
# **getOrganizationsOrganizationIdUsers**
> List&lt;User&gt; getOrganizationsOrganizationIdUsers(organizationId)

Get a list of users

Get a list of users

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String organizationId = "organizationId_example"; // String | Organization Identifier
    try {
      List<User> result = apiInstance.getOrganizationsOrganizationIdUsers(organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getOrganizationsOrganizationIdUsers");
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
 **organizationId** | **String**| Organization Identifier |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of users |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="postOrganizationsOrganizationIdUsers"></a>
# **postOrganizationsOrganizationIdUsers**
> User postOrganizationsOrganizationIdUsers(organizationId, postOrganizationsOrganizationIdUsers)

Create a user

Create a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String organizationId = "organizationId_example"; // String | Organization Identifier
    PostOrganizationsOrganizationIdUsers postOrganizationsOrganizationIdUsers = new PostOrganizationsOrganizationIdUsers(); // PostOrganizationsOrganizationIdUsers | 
    try {
      User result = apiInstance.postOrganizationsOrganizationIdUsers(organizationId, postOrganizationsOrganizationIdUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#postOrganizationsOrganizationIdUsers");
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
 **organizationId** | **String**| Organization Identifier |
 **postOrganizationsOrganizationIdUsers** | [**PostOrganizationsOrganizationIdUsers**](PostOrganizationsOrganizationIdUsers.md)|  |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create a user |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

