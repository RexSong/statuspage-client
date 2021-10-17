# IncidentUpdatesApi

All URIs are relative to *https://api.statuspage.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId**](IncidentUpdatesApi.md#patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId) | **PATCH** /pages/{page_id}/incidents/{incident_id}/incident_updates/{incident_update_id} | Update a previous incident update
[**putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId**](IncidentUpdatesApi.md#putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId) | **PUT** /pages/{page_id}/incidents/{incident_id}/incident_updates/{incident_update_id} | Update a previous incident update


<a name="patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId"></a>
# **patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId**
> IncidentUpdate patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates)

Update a previous incident update

Update a previous incident update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentUpdatesApi apiInstance = new IncidentUpdatesApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    String incidentUpdateId = "incidentUpdateId_example"; // String | Incident Update Identifier
    PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates = new PatchPagesPageIdIncidentsIncidentIdIncidentUpdates(); // PatchPagesPageIdIncidentsIncidentIdIncidentUpdates | 
    try {
      IncidentUpdate result = apiInstance.patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentUpdatesApi#patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId");
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
 **incidentUpdateId** | **String**| Incident Update Identifier |
 **patchPagesPageIdIncidentsIncidentIdIncidentUpdates** | [**PatchPagesPageIdIncidentsIncidentIdIncidentUpdates**](PatchPagesPageIdIncidentsIncidentIdIncidentUpdates.md)|  |

### Return type

[**IncidentUpdate**](IncidentUpdate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a previous incident update |  -  |

<a name="putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId"></a>
# **putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId**
> IncidentUpdate putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates)

Update a previous incident update

Update a previous incident update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IncidentUpdatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.statuspage.io/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IncidentUpdatesApi apiInstance = new IncidentUpdatesApi(defaultClient);
    String pageId = "pageId_example"; // String | Page identifier
    String incidentId = "incidentId_example"; // String | Incident Identifier
    String incidentUpdateId = "incidentUpdateId_example"; // String | Incident Update Identifier
    PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates = new PutPagesPageIdIncidentsIncidentIdIncidentUpdates(); // PutPagesPageIdIncidentsIncidentIdIncidentUpdates | 
    try {
      IncidentUpdate result = apiInstance.putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentUpdatesApi#putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId");
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
 **incidentUpdateId** | **String**| Incident Update Identifier |
 **putPagesPageIdIncidentsIncidentIdIncidentUpdates** | [**PutPagesPageIdIncidentsIncidentIdIncidentUpdates**](PutPagesPageIdIncidentsIncidentIdIncidentUpdates.md)|  |

### Return type

[**IncidentUpdate**](IncidentUpdate.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Update a previous incident update |  -  |

