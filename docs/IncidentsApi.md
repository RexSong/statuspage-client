# IncidentsApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePagesPageIdIncidentsIncidentId**](IncidentsApi.md#deletePagesPageIdIncidentsIncidentId) | **DELETE** /pages/{page_id}/incidents/{incident_id} | Delete an incident
[**getPagesPageIdIncidents**](IncidentsApi.md#getPagesPageIdIncidents) | **GET** /pages/{page_id}/incidents | Get a list of incidents
[**getPagesPageIdIncidentsActiveMaintenance**](IncidentsApi.md#getPagesPageIdIncidentsActiveMaintenance) | **GET** /pages/{page_id}/incidents/active_maintenance | Get a list of active maintenances
[**getPagesPageIdIncidentsIncidentId**](IncidentsApi.md#getPagesPageIdIncidentsIncidentId) | **GET** /pages/{page_id}/incidents/{incident_id} | Get an incident
[**getPagesPageIdIncidentsScheduled**](IncidentsApi.md#getPagesPageIdIncidentsScheduled) | **GET** /pages/{page_id}/incidents/scheduled | Get a list of scheduled incidents
[**getPagesPageIdIncidentsUnresolved**](IncidentsApi.md#getPagesPageIdIncidentsUnresolved) | **GET** /pages/{page_id}/incidents/unresolved | Get a list of unresolved incidents
[**getPagesPageIdIncidentsUpcoming**](IncidentsApi.md#getPagesPageIdIncidentsUpcoming) | **GET** /pages/{page_id}/incidents/upcoming | Get a list of upcoming incidents
[**patchPagesPageIdIncidentsIncidentId**](IncidentsApi.md#patchPagesPageIdIncidentsIncidentId) | **PATCH** /pages/{page_id}/incidents/{incident_id} | Update an incident
[**postPagesPageIdIncidents**](IncidentsApi.md#postPagesPageIdIncidents) | **POST** /pages/{page_id}/incidents | Create an incident
[**putPagesPageIdIncidentsIncidentId**](IncidentsApi.md#putPagesPageIdIncidentsIncidentId) | **PUT** /pages/{page_id}/incidents/{incident_id} | Update an incident


<a name="deletePagesPageIdIncidentsIncidentId"></a>
# **deletePagesPageIdIncidentsIncidentId**
> Incident deletePagesPageIdIncidentsIncidentId(pageId, incidentId)

Delete an incident

Delete an incident

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      Incident result = apiInstance.deletePagesPageIdIncidentsIncidentId(pageId, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deletePagesPageIdIncidentsIncidentId");
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

[**Incident**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Delete an incident |  -  |

<a name="getPagesPageIdIncidents"></a>
# **getPagesPageIdIncidents**
> List&lt;Incident&gt; getPagesPageIdIncidents(pageId, q, limit, page)

Get a list of incidents

Get a list of incidents

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String q = "q_example"; // String | If this is specified, search for the text query string in the incidents' name, status, postmortem_body, and incident_updates fields.
    Integer limit = 56; // Integer | The maximum number of rows to return per page. The default and maximum limit is 100.
    Integer page = 56; // Integer | Page offset to fetch.
    try {
      List<Incident> result = apiInstance.getPagesPageIdIncidents(pageId, q, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidents");
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
 **q** | **String**| If this is specified, search for the text query string in the incidents&#39; name, status, postmortem_body, and incident_updates fields. | [optional]
 **limit** | **Integer**| The maximum number of rows to return per page. The default and maximum limit is 100. | [optional]
 **page** | **Integer**| Page offset to fetch. | [optional]

### Return type

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of incidents |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsActiveMaintenance"></a>
# **getPagesPageIdIncidentsActiveMaintenance**
> List&lt;Incident&gt; getPagesPageIdIncidentsActiveMaintenance(pageId, page, perPage)

Get a list of active maintenances

Get a list of active maintenances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 1; // Integer | Page offset to fetch.
    Integer perPage = 100; // Integer | Number of results to return per page.
    try {
      List<Incident> result = apiInstance.getPagesPageIdIncidentsActiveMaintenance(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidentsActiveMaintenance");
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

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of active maintenances |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsIncidentId"></a>
# **getPagesPageIdIncidentsIncidentId**
> Incident getPagesPageIdIncidentsIncidentId(pageId, incidentId)

Get an incident

Get an incident

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    try {
      Incident result = apiInstance.getPagesPageIdIncidentsIncidentId(pageId, incidentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidentsIncidentId");
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

[**Incident**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get an incident |  -  |

<a name="getPagesPageIdIncidentsScheduled"></a>
# **getPagesPageIdIncidentsScheduled**
> List&lt;Incident&gt; getPagesPageIdIncidentsScheduled(pageId, page, perPage)

Get a list of scheduled incidents

Get a list of scheduled incidents

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 1; // Integer | Page offset to fetch.
    Integer perPage = 100; // Integer | Number of results to return per page.
    try {
      List<Incident> result = apiInstance.getPagesPageIdIncidentsScheduled(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidentsScheduled");
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

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of scheduled incidents |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsUnresolved"></a>
# **getPagesPageIdIncidentsUnresolved**
> List&lt;Incident&gt; getPagesPageIdIncidentsUnresolved(pageId, page, perPage)

Get a list of unresolved incidents

Get a list of unresolved incidents

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 1; // Integer | Page offset to fetch.
    Integer perPage = 100; // Integer | Number of results to return per page.
    try {
      List<Incident> result = apiInstance.getPagesPageIdIncidentsUnresolved(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidentsUnresolved");
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

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of unresolved incidents |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="getPagesPageIdIncidentsUpcoming"></a>
# **getPagesPageIdIncidentsUpcoming**
> List&lt;Incident&gt; getPagesPageIdIncidentsUpcoming(pageId, page, perPage)

Get a list of upcoming incidents

Get a list of upcoming incidents

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    Integer page = 1; // Integer | Page offset to fetch.
    Integer perPage = 100; // Integer | Number of results to return per page.
    try {
      List<Incident> result = apiInstance.getPagesPageIdIncidentsUpcoming(pageId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getPagesPageIdIncidentsUpcoming");
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

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a list of upcoming incidents |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |

<a name="patchPagesPageIdIncidentsIncidentId"></a>
# **patchPagesPageIdIncidentsIncidentId**
> Incident patchPagesPageIdIncidentsIncidentId(pageId, incidentId, patchPagesPageIdIncidents)

Update an incident

Update an incident

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    PatchPagesPageIdIncidents patchPagesPageIdIncidents = new PatchPagesPageIdIncidents(); // PatchPagesPageIdIncidents | 
    try {
      Incident result = apiInstance.patchPagesPageIdIncidentsIncidentId(pageId, incidentId, patchPagesPageIdIncidents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#patchPagesPageIdIncidentsIncidentId");
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
 **patchPagesPageIdIncidents** | [**PatchPagesPageIdIncidents**](PatchPagesPageIdIncidents.md)|  |

### Return type

[**Incident**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update an incident |  -  |

<a name="postPagesPageIdIncidents"></a>
# **postPagesPageIdIncidents**
> Incident postPagesPageIdIncidents(pageId, postPagesPageIdIncidents)

Create an incident

Create an incident

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    PostPagesPageIdIncidents postPagesPageIdIncidents = new PostPagesPageIdIncidents(); // PostPagesPageIdIncidents | 
    try {
      Incident result = apiInstance.postPagesPageIdIncidents(pageId, postPagesPageIdIncidents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#postPagesPageIdIncidents");
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
 **postPagesPageIdIncidents** | [**PostPagesPageIdIncidents**](PostPagesPageIdIncidents.md)|  |

### Return type

[**Incident**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Create an incident |  -  |
**400** | Bad request |  -  |
**401** | Could not authenticate |  -  |
**404** | The requested resource could not be found. |  -  |
**422** | Unprocessable entity |  -  |

<a name="putPagesPageIdIncidentsIncidentId"></a>
# **putPagesPageIdIncidentsIncidentId**
> Incident putPagesPageIdIncidentsIncidentId(pageId, incidentId, putPagesPageIdIncidents)

Update an incident

Update an incident

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    PutPagesPageIdIncidents putPagesPageIdIncidents = new PutPagesPageIdIncidents(); // PutPagesPageIdIncidents | 
    try {
      Incident result = apiInstance.putPagesPageIdIncidentsIncidentId(pageId, incidentId, putPagesPageIdIncidents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#putPagesPageIdIncidentsIncidentId");
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
 **putPagesPageIdIncidents** | [**PutPagesPageIdIncidents**](PutPagesPageIdIncidents.md)|  |

### Return type

[**Incident**](Incident.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update an incident |  -  |

