/*
 * Statuspage API
 * # Code of Conduct Please don't abuse the API, and please report all feature requests and issues to https://support.atlassian.com/contact  # Rate Limiting Each API token is limited to 1 request / second as measured on a 60 second rolling window. To get this limit increased, please contact us at https://support.atlassian.com/contact  # Basics  ## HTTPS It's required  ## URL Prefix In order to maintain version integrity into the future, the API is versioned. All calls currently begin with the following prefix:    https://api.statuspage.io/v1/  ## RESTful Interface Wherever possible, the API seeks to implement repeatable patterns with logical, representative URLs and descriptive HTTP verbs. Below are some examples and conventions you will see throughout the documentation.  * Collections are buckets: https://api.statuspage.io/v1/pages/asdf123/incidents.json * Elements have unique IDs: https://api.statuspage.io/v1/pages/asdf123/incidents/jklm456.json * GET will retrieve information about a collection/element * POST will create an element in a collection * PATCH will update a single element * PUT will replace a single element in a collection (rarely used) * DELETE will destroy a single element  ## Sending Data Information can be sent in the body as form urlencoded or JSON, but make sure the Content-Type header matches the body structure or the server gremlins will be angry.  All examples are provided in JSON format, however they can easily be converted to form encoding if required.  Some examples of how to convert things are below:      // JSON     {       \"incident\": {         \"name\": \"test incident\",         \"components\": [\"8kbf7d35c070\", \"vtnh60py4yd7\"]       }     }      // Form Encoded (using curl as an example):     curl -X POST https://api.statuspage.io/v1/example \\       -d \"incident[name]=test incident\" \\       -d \"incident[components][]=8kbf7d35c070\" \\       -d \"incident[components][]=vtnh60py4yd7\"  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.IncidentUpdate;
import org.openapitools.client.model.PatchPagesPageIdIncidentsIncidentIdIncidentUpdates;
import org.openapitools.client.model.PutPagesPageIdIncidentsIncidentIdIncidentUpdates;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncidentUpdatesApi {
    private ApiClient localVarApiClient;

    public IncidentUpdatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IncidentUpdatesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param patchPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdCall(String pageId, String incidentId, String incidentUpdateId, PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = patchPagesPageIdIncidentsIncidentIdIncidentUpdates;

        // create path and map variables
        String localVarPath = "/pages/{page_id}/incidents/{incident_id}/incident_updates/{incident_update_id}"
            .replaceAll("\\{" + "page_id" + "\\}", localVarApiClient.escapeString(pageId.toString()))
            .replaceAll("\\{" + "incident_id" + "\\}", localVarApiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "incident_update_id" + "\\}", localVarApiClient.escapeString(incidentUpdateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(String pageId, String incidentId, String incidentUpdateId, PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'incidentId' is set
        if (incidentId == null) {
            throw new ApiException("Missing the required parameter 'incidentId' when calling patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'incidentUpdateId' is set
        if (incidentUpdateId == null) {
            throw new ApiException("Missing the required parameter 'incidentUpdateId' when calling patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'patchPagesPageIdIncidentsIncidentIdIncidentUpdates' is set
        if (patchPagesPageIdIncidentsIncidentIdIncidentUpdates == null) {
            throw new ApiException("Missing the required parameter 'patchPagesPageIdIncidentsIncidentIdIncidentUpdates' when calling patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        

        okhttp3.Call localVarCall = patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdCall(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates, _callback);
        return localVarCall;

    }

    /**
     * Update a previous incident update
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param patchPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @return IncidentUpdate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public IncidentUpdate patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(String pageId, String incidentId, String incidentUpdateId, PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates) throws ApiException {
        ApiResponse<IncidentUpdate> localVarResp = patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdWithHttpInfo(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates);
        return localVarResp.getData();
    }

    /**
     * Update a previous incident update
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param patchPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @return ApiResponse&lt;IncidentUpdate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IncidentUpdate> patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdWithHttpInfo(String pageId, String incidentId, String incidentUpdateId, PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates) throws ApiException {
        okhttp3.Call localVarCall = patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates, null);
        Type localVarReturnType = new TypeToken<IncidentUpdate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a previous incident update (asynchronously)
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param patchPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdAsync(String pageId, String incidentId, String incidentUpdateId, PatchPagesPageIdIncidentsIncidentIdIncidentUpdates patchPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback<IncidentUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(pageId, incidentId, incidentUpdateId, patchPagesPageIdIncidentsIncidentIdIncidentUpdates, _callback);
        Type localVarReturnType = new TypeToken<IncidentUpdate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param putPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdCall(String pageId, String incidentId, String incidentUpdateId, PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = putPagesPageIdIncidentsIncidentIdIncidentUpdates;

        // create path and map variables
        String localVarPath = "/pages/{page_id}/incidents/{incident_id}/incident_updates/{incident_update_id}"
            .replaceAll("\\{" + "page_id" + "\\}", localVarApiClient.escapeString(pageId.toString()))
            .replaceAll("\\{" + "incident_id" + "\\}", localVarApiClient.escapeString(incidentId.toString()))
            .replaceAll("\\{" + "incident_update_id" + "\\}", localVarApiClient.escapeString(incidentUpdateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(String pageId, String incidentId, String incidentUpdateId, PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'incidentId' is set
        if (incidentId == null) {
            throw new ApiException("Missing the required parameter 'incidentId' when calling putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'incidentUpdateId' is set
        if (incidentUpdateId == null) {
            throw new ApiException("Missing the required parameter 'incidentUpdateId' when calling putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        
        // verify the required parameter 'putPagesPageIdIncidentsIncidentIdIncidentUpdates' is set
        if (putPagesPageIdIncidentsIncidentIdIncidentUpdates == null) {
            throw new ApiException("Missing the required parameter 'putPagesPageIdIncidentsIncidentIdIncidentUpdates' when calling putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(Async)");
        }
        

        okhttp3.Call localVarCall = putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdCall(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates, _callback);
        return localVarCall;

    }

    /**
     * Update a previous incident update
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param putPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @return IncidentUpdate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public IncidentUpdate putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateId(String pageId, String incidentId, String incidentUpdateId, PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates) throws ApiException {
        ApiResponse<IncidentUpdate> localVarResp = putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdWithHttpInfo(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates);
        return localVarResp.getData();
    }

    /**
     * Update a previous incident update
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param putPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @return ApiResponse&lt;IncidentUpdate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IncidentUpdate> putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdWithHttpInfo(String pageId, String incidentId, String incidentUpdateId, PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates) throws ApiException {
        okhttp3.Call localVarCall = putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates, null);
        Type localVarReturnType = new TypeToken<IncidentUpdate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a previous incident update (asynchronously)
     * Update a previous incident update
     * @param pageId Page identifier (required)
     * @param incidentId Incident Identifier (required)
     * @param incidentUpdateId Incident Update Identifier (required)
     * @param putPagesPageIdIncidentsIncidentIdIncidentUpdates  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update a previous incident update </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdAsync(String pageId, String incidentId, String incidentUpdateId, PutPagesPageIdIncidentsIncidentIdIncidentUpdates putPagesPageIdIncidentsIncidentIdIncidentUpdates, final ApiCallback<IncidentUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = putPagesPageIdIncidentsIncidentIdIncidentUpdatesIncidentUpdateIdValidateBeforeCall(pageId, incidentId, incidentUpdateId, putPagesPageIdIncidentsIncidentIdIncidentUpdates, _callback);
        Type localVarReturnType = new TypeToken<IncidentUpdate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
