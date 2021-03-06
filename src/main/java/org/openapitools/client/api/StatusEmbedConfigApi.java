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


import org.openapitools.client.model.ErrorEntity;
import org.openapitools.client.model.PatchPagesPageIdStatusEmbedConfig;
import org.openapitools.client.model.PutPagesPageIdStatusEmbedConfig;
import org.openapitools.client.model.StatusEmbedConfig;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusEmbedConfigApi {
    private ApiClient localVarApiClient;

    public StatusEmbedConfigApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatusEmbedConfigApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPagesPageIdStatusEmbedConfig
     * @param pageId Page identifier (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get status embed config settings </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPagesPageIdStatusEmbedConfigCall(String pageId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pages/{page_id}/status_embed_config"
            .replaceAll("\\{" + "page_id" + "\\}", localVarApiClient.escapeString(pageId.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPagesPageIdStatusEmbedConfigValidateBeforeCall(String pageId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling getPagesPageIdStatusEmbedConfig(Async)");
        }
        

        okhttp3.Call localVarCall = getPagesPageIdStatusEmbedConfigCall(pageId, _callback);
        return localVarCall;

    }

    /**
     * Get status embed config settings
     * Get status embed config settings
     * @param pageId Page identifier (required)
     * @return StatusEmbedConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get status embed config settings </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
     </table>
     */
    public StatusEmbedConfig getPagesPageIdStatusEmbedConfig(String pageId) throws ApiException {
        ApiResponse<StatusEmbedConfig> localVarResp = getPagesPageIdStatusEmbedConfigWithHttpInfo(pageId);
        return localVarResp.getData();
    }

    /**
     * Get status embed config settings
     * Get status embed config settings
     * @param pageId Page identifier (required)
     * @return ApiResponse&lt;StatusEmbedConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get status embed config settings </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatusEmbedConfig> getPagesPageIdStatusEmbedConfigWithHttpInfo(String pageId) throws ApiException {
        okhttp3.Call localVarCall = getPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, null);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get status embed config settings (asynchronously)
     * Get status embed config settings
     * @param pageId Page identifier (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get status embed config settings </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPagesPageIdStatusEmbedConfigAsync(String pageId, final ApiCallback<StatusEmbedConfig> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, _callback);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchPagesPageIdStatusEmbedConfig
     * @param pageId Page identifier (required)
     * @param patchPagesPageIdStatusEmbedConfig  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPagesPageIdStatusEmbedConfigCall(String pageId, PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = patchPagesPageIdStatusEmbedConfig;

        // create path and map variables
        String localVarPath = "/pages/{page_id}/status_embed_config"
            .replaceAll("\\{" + "page_id" + "\\}", localVarApiClient.escapeString(pageId.toString()));

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
    private okhttp3.Call patchPagesPageIdStatusEmbedConfigValidateBeforeCall(String pageId, PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling patchPagesPageIdStatusEmbedConfig(Async)");
        }
        
        // verify the required parameter 'patchPagesPageIdStatusEmbedConfig' is set
        if (patchPagesPageIdStatusEmbedConfig == null) {
            throw new ApiException("Missing the required parameter 'patchPagesPageIdStatusEmbedConfig' when calling patchPagesPageIdStatusEmbedConfig(Async)");
        }
        

        okhttp3.Call localVarCall = patchPagesPageIdStatusEmbedConfigCall(pageId, patchPagesPageIdStatusEmbedConfig, _callback);
        return localVarCall;

    }

    /**
     * Update status embed config settings
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param patchPagesPageIdStatusEmbedConfig  (required)
     * @return StatusEmbedConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public StatusEmbedConfig patchPagesPageIdStatusEmbedConfig(String pageId, PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig) throws ApiException {
        ApiResponse<StatusEmbedConfig> localVarResp = patchPagesPageIdStatusEmbedConfigWithHttpInfo(pageId, patchPagesPageIdStatusEmbedConfig);
        return localVarResp.getData();
    }

    /**
     * Update status embed config settings
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param patchPagesPageIdStatusEmbedConfig  (required)
     * @return ApiResponse&lt;StatusEmbedConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatusEmbedConfig> patchPagesPageIdStatusEmbedConfigWithHttpInfo(String pageId, PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig) throws ApiException {
        okhttp3.Call localVarCall = patchPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, patchPagesPageIdStatusEmbedConfig, null);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update status embed config settings (asynchronously)
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param patchPagesPageIdStatusEmbedConfig  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPagesPageIdStatusEmbedConfigAsync(String pageId, PatchPagesPageIdStatusEmbedConfig patchPagesPageIdStatusEmbedConfig, final ApiCallback<StatusEmbedConfig> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, patchPagesPageIdStatusEmbedConfig, _callback);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putPagesPageIdStatusEmbedConfig
     * @param pageId Page identifier (required)
     * @param putPagesPageIdStatusEmbedConfig  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putPagesPageIdStatusEmbedConfigCall(String pageId, PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = putPagesPageIdStatusEmbedConfig;

        // create path and map variables
        String localVarPath = "/pages/{page_id}/status_embed_config"
            .replaceAll("\\{" + "page_id" + "\\}", localVarApiClient.escapeString(pageId.toString()));

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
    private okhttp3.Call putPagesPageIdStatusEmbedConfigValidateBeforeCall(String pageId, PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pageId' is set
        if (pageId == null) {
            throw new ApiException("Missing the required parameter 'pageId' when calling putPagesPageIdStatusEmbedConfig(Async)");
        }
        
        // verify the required parameter 'putPagesPageIdStatusEmbedConfig' is set
        if (putPagesPageIdStatusEmbedConfig == null) {
            throw new ApiException("Missing the required parameter 'putPagesPageIdStatusEmbedConfig' when calling putPagesPageIdStatusEmbedConfig(Async)");
        }
        

        okhttp3.Call localVarCall = putPagesPageIdStatusEmbedConfigCall(pageId, putPagesPageIdStatusEmbedConfig, _callback);
        return localVarCall;

    }

    /**
     * Update status embed config settings
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param putPagesPageIdStatusEmbedConfig  (required)
     * @return StatusEmbedConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public StatusEmbedConfig putPagesPageIdStatusEmbedConfig(String pageId, PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig) throws ApiException {
        ApiResponse<StatusEmbedConfig> localVarResp = putPagesPageIdStatusEmbedConfigWithHttpInfo(pageId, putPagesPageIdStatusEmbedConfig);
        return localVarResp.getData();
    }

    /**
     * Update status embed config settings
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param putPagesPageIdStatusEmbedConfig  (required)
     * @return ApiResponse&lt;StatusEmbedConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StatusEmbedConfig> putPagesPageIdStatusEmbedConfigWithHttpInfo(String pageId, PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig) throws ApiException {
        okhttp3.Call localVarCall = putPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, putPagesPageIdStatusEmbedConfig, null);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update status embed config settings (asynchronously)
     * Update status embed config settings
     * @param pageId Page identifier (required)
     * @param putPagesPageIdStatusEmbedConfig  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Update status embed config settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Could not authenticate </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> You are not authorized to access this resource. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putPagesPageIdStatusEmbedConfigAsync(String pageId, PutPagesPageIdStatusEmbedConfig putPagesPageIdStatusEmbedConfig, final ApiCallback<StatusEmbedConfig> _callback) throws ApiException {

        okhttp3.Call localVarCall = putPagesPageIdStatusEmbedConfigValidateBeforeCall(pageId, putPagesPageIdStatusEmbedConfig, _callback);
        Type localVarReturnType = new TypeToken<StatusEmbedConfig>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
