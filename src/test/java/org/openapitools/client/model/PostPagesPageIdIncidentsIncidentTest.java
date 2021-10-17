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


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PostPagesPageIdIncidentsIncident
 */
public class PostPagesPageIdIncidentsIncidentTest {
    private final PostPagesPageIdIncidentsIncident model = new PostPagesPageIdIncidentsIncident();

    /**
     * Model tests for PostPagesPageIdIncidentsIncident
     */
    @Test
    public void testPostPagesPageIdIncidentsIncident() {
        // TODO: test PostPagesPageIdIncidentsIncident
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'impactOverride'
     */
    @Test
    public void impactOverrideTest() {
        // TODO: test impactOverride
    }

    /**
     * Test the property 'scheduledFor'
     */
    @Test
    public void scheduledForTest() {
        // TODO: test scheduledFor
    }

    /**
     * Test the property 'scheduledUntil'
     */
    @Test
    public void scheduledUntilTest() {
        // TODO: test scheduledUntil
    }

    /**
     * Test the property 'scheduledRemindPrior'
     */
    @Test
    public void scheduledRemindPriorTest() {
        // TODO: test scheduledRemindPrior
    }

    /**
     * Test the property 'scheduledAutoInProgress'
     */
    @Test
    public void scheduledAutoInProgressTest() {
        // TODO: test scheduledAutoInProgress
    }

    /**
     * Test the property 'scheduledAutoCompleted'
     */
    @Test
    public void scheduledAutoCompletedTest() {
        // TODO: test scheduledAutoCompleted
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'deliverNotifications'
     */
    @Test
    public void deliverNotificationsTest() {
        // TODO: test deliverNotifications
    }

    /**
     * Test the property 'autoTransitionDeliverNotificationsAtEnd'
     */
    @Test
    public void autoTransitionDeliverNotificationsAtEndTest() {
        // TODO: test autoTransitionDeliverNotificationsAtEnd
    }

    /**
     * Test the property 'autoTransitionDeliverNotificationsAtStart'
     */
    @Test
    public void autoTransitionDeliverNotificationsAtStartTest() {
        // TODO: test autoTransitionDeliverNotificationsAtStart
    }

    /**
     * Test the property 'autoTransitionToMaintenanceState'
     */
    @Test
    public void autoTransitionToMaintenanceStateTest() {
        // TODO: test autoTransitionToMaintenanceState
    }

    /**
     * Test the property 'autoTransitionToOperationalState'
     */
    @Test
    public void autoTransitionToOperationalStateTest() {
        // TODO: test autoTransitionToOperationalState
    }

    /**
     * Test the property 'autoTweetAtBeginning'
     */
    @Test
    public void autoTweetAtBeginningTest() {
        // TODO: test autoTweetAtBeginning
    }

    /**
     * Test the property 'autoTweetOnCompletion'
     */
    @Test
    public void autoTweetOnCompletionTest() {
        // TODO: test autoTweetOnCompletion
    }

    /**
     * Test the property 'autoTweetOnCreation'
     */
    @Test
    public void autoTweetOnCreationTest() {
        // TODO: test autoTweetOnCreation
    }

    /**
     * Test the property 'autoTweetOneHourBefore'
     */
    @Test
    public void autoTweetOneHourBeforeTest() {
        // TODO: test autoTweetOneHourBefore
    }

    /**
     * Test the property 'backfillDate'
     */
    @Test
    public void backfillDateTest() {
        // TODO: test backfillDate
    }

    /**
     * Test the property 'backfilled'
     */
    @Test
    public void backfilledTest() {
        // TODO: test backfilled
    }

    /**
     * Test the property 'body'
     */
    @Test
    public void bodyTest() {
        // TODO: test body
    }

    /**
     * Test the property 'components'
     */
    @Test
    public void componentsTest() {
        // TODO: test components
    }

    /**
     * Test the property 'componentIds'
     */
    @Test
    public void componentIdsTest() {
        // TODO: test componentIds
    }

    /**
     * Test the property 'scheduledAutoTransition'
     */
    @Test
    public void scheduledAutoTransitionTest() {
        // TODO: test scheduledAutoTransition
    }

}
