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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ComponentGroupUptime;
import org.openapitools.client.model.ErrorEntity;
import org.openapitools.client.model.GroupComponent;
import org.openapitools.client.model.PatchPagesPageIdComponentGroups;
import org.openapitools.client.model.PostPagesPageIdComponentGroups;
import org.openapitools.client.model.PutPagesPageIdComponentGroups;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComponentGroupsApi
 */
@Ignore
public class ComponentGroupsApiTest {

    private final ComponentGroupsApi api = new ComponentGroupsApi();

    
    /**
     * Delete a component group
     *
     * Delete a component group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePagesPageIdComponentGroupsIdTest() throws ApiException {
        String pageId = null;
        String id = null;
        GroupComponent response = api.deletePagesPageIdComponentGroupsId(pageId, id);

        // TODO: test validations
    }
    
    /**
     * Get a list of component groups
     *
     * Get a list of component groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdComponentGroupsTest() throws ApiException {
        String pageId = null;
        List<GroupComponent> response = api.getPagesPageIdComponentGroups(pageId);

        // TODO: test validations
    }
    
    /**
     * Get a component group
     *
     * Get a component group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdComponentGroupsIdTest() throws ApiException {
        String pageId = null;
        String id = null;
        GroupComponent response = api.getPagesPageIdComponentGroupsId(pageId, id);

        // TODO: test validations
    }
    
    /**
     * Get uptime data for a component group
     *
     * Get uptime data for a component group that has uptime showcase enabled for at least one component.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdComponentGroupsIdUptimeTest() throws ApiException {
        String pageId = null;
        String id = null;
        String start = null;
        String end = null;
        ComponentGroupUptime response = api.getPagesPageIdComponentGroupsIdUptime(pageId, id, start, end);

        // TODO: test validations
    }
    
    /**
     * Update a component group
     *
     * Update a component group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPagesPageIdComponentGroupsIdTest() throws ApiException {
        String pageId = null;
        String id = null;
        PatchPagesPageIdComponentGroups patchPagesPageIdComponentGroups = null;
        GroupComponent response = api.patchPagesPageIdComponentGroupsId(pageId, id, patchPagesPageIdComponentGroups);

        // TODO: test validations
    }
    
    /**
     * Create a component group
     *
     * Create a component group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdComponentGroupsTest() throws ApiException {
        String pageId = null;
        PostPagesPageIdComponentGroups postPagesPageIdComponentGroups = null;
        GroupComponent response = api.postPagesPageIdComponentGroups(pageId, postPagesPageIdComponentGroups);

        // TODO: test validations
    }
    
    /**
     * Update a component group
     *
     * Update a component group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPagesPageIdComponentGroupsIdTest() throws ApiException {
        String pageId = null;
        String id = null;
        PutPagesPageIdComponentGroups putPagesPageIdComponentGroups = null;
        GroupComponent response = api.putPagesPageIdComponentGroupsId(pageId, id, putPagesPageIdComponentGroups);

        // TODO: test validations
    }
    
}
