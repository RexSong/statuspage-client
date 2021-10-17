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
import org.openapitools.client.model.ErrorEntity;
import org.openapitools.client.model.PatchPagesPageIdSubscribers;
import org.openapitools.client.model.PostPagesPageIdSubscribers;
import org.openapitools.client.model.PostPagesPageIdSubscribersReactivate;
import org.openapitools.client.model.PostPagesPageIdSubscribersResendConfirmation;
import org.openapitools.client.model.PostPagesPageIdSubscribersUnsubscribe;
import org.openapitools.client.model.Subscriber;
import org.openapitools.client.model.SubscriberCountByType;
import org.openapitools.client.model.SubscriberCountByTypeAndState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscribersApi
 */
@Ignore
public class SubscribersApiTest {

    private final SubscribersApi api = new SubscribersApi();

    
    /**
     * Unsubscribe a subscriber
     *
     * Unsubscribe a subscriber
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePagesPageIdSubscribersSubscriberIdTest() throws ApiException {
        String pageId = null;
        String subscriberId = null;
        Boolean skipUnsubscriptionNotification = null;
        Subscriber response = api.deletePagesPageIdSubscribersSubscriberId(pageId, subscriberId, skipUnsubscriptionNotification);

        // TODO: test validations
    }
    
    /**
     * Get a list of subscribers
     *
     * Get a list of subscribers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdSubscribersTest() throws ApiException {
        String pageId = null;
        String q = null;
        String type = null;
        String state = null;
        Integer limit = null;
        Integer page = null;
        String sortField = null;
        String sortDirection = null;
        List<Subscriber> response = api.getPagesPageIdSubscribers(pageId, q, type, state, limit, page, sortField, sortDirection);

        // TODO: test validations
    }
    
    /**
     * Get a count of subscribers by type
     *
     * Get a count of subscribers by type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdSubscribersCountTest() throws ApiException {
        String pageId = null;
        String type = null;
        String state = null;
        SubscriberCountByType response = api.getPagesPageIdSubscribersCount(pageId, type, state);

        // TODO: test validations
    }
    
    /**
     * Get a histogram of subscribers by type and then state
     *
     * Get a histogram of subscribers by type and then state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdSubscribersHistogramByStateTest() throws ApiException {
        String pageId = null;
        SubscriberCountByTypeAndState response = api.getPagesPageIdSubscribersHistogramByState(pageId);

        // TODO: test validations
    }
    
    /**
     * Get a subscriber
     *
     * Get a subscriber
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdSubscribersSubscriberIdTest() throws ApiException {
        String pageId = null;
        String subscriberId = null;
        Subscriber response = api.getPagesPageIdSubscribersSubscriberId(pageId, subscriberId);

        // TODO: test validations
    }
    
    /**
     * Get a list of unsubscribed subscribers
     *
     * Get a list of unsubscribed subscribers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPagesPageIdSubscribersUnsubscribedTest() throws ApiException {
        String pageId = null;
        List<Subscriber> response = api.getPagesPageIdSubscribersUnsubscribed(pageId);

        // TODO: test validations
    }
    
    /**
     * Update a subscriber
     *
     * Update a subscriber
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPagesPageIdSubscribersSubscriberIdTest() throws ApiException {
        String pageId = null;
        String subscriberId = null;
        PatchPagesPageIdSubscribers patchPagesPageIdSubscribers = null;
        Subscriber response = api.patchPagesPageIdSubscribersSubscriberId(pageId, subscriberId, patchPagesPageIdSubscribers);

        // TODO: test validations
    }
    
    /**
     * Create a subscriber
     *
     * Create a subscriber. Not applicable for Slack subscribers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdSubscribersTest() throws ApiException {
        String pageId = null;
        PostPagesPageIdSubscribers postPagesPageIdSubscribers = null;
        Subscriber response = api.postPagesPageIdSubscribers(pageId, postPagesPageIdSubscribers);

        // TODO: test validations
    }
    
    /**
     * Reactivate a list of subscribers
     *
     * Reactivate a list of quarantined subscribers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdSubscribersReactivateTest() throws ApiException {
        String pageId = null;
        PostPagesPageIdSubscribersReactivate postPagesPageIdSubscribersReactivate = null;
        api.postPagesPageIdSubscribersReactivate(pageId, postPagesPageIdSubscribersReactivate);

        // TODO: test validations
    }
    
    /**
     * Resend confirmations to a list of subscribers
     *
     * Resend confirmations to a list of subscribers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdSubscribersResendConfirmationTest() throws ApiException {
        String pageId = null;
        PostPagesPageIdSubscribersResendConfirmation postPagesPageIdSubscribersResendConfirmation = null;
        api.postPagesPageIdSubscribersResendConfirmation(pageId, postPagesPageIdSubscribersResendConfirmation);

        // TODO: test validations
    }
    
    /**
     * Resend confirmation to a subscriber
     *
     * Resend confirmation to a subscriber
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdSubscribersSubscriberIdResendConfirmationTest() throws ApiException {
        String pageId = null;
        String subscriberId = null;
        api.postPagesPageIdSubscribersSubscriberIdResendConfirmation(pageId, subscriberId);

        // TODO: test validations
    }
    
    /**
     * Unsubscribe a list of subscribers
     *
     * Unsubscribe a list of subscribers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPagesPageIdSubscribersUnsubscribeTest() throws ApiException {
        String pageId = null;
        PostPagesPageIdSubscribersUnsubscribe postPagesPageIdSubscribersUnsubscribe = null;
        api.postPagesPageIdSubscribersUnsubscribe(pageId, postPagesPageIdSubscribersUnsubscribe);

        // TODO: test validations
    }
    
}
