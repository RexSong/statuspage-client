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
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Page
 */
public class PageTest {
    private final Page model = new Page();

    /**
     * Model tests for Page
     */
    @Test
    public void testPage() {
        // TODO: test Page
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'pageDescription'
     */
    @Test
    public void pageDescriptionTest() {
        // TODO: test pageDescription
    }

    /**
     * Test the property 'headline'
     */
    @Test
    public void headlineTest() {
        // TODO: test headline
    }

    /**
     * Test the property 'branding'
     */
    @Test
    public void brandingTest() {
        // TODO: test branding
    }

    /**
     * Test the property 'subdomain'
     */
    @Test
    public void subdomainTest() {
        // TODO: test subdomain
    }

    /**
     * Test the property 'domain'
     */
    @Test
    public void domainTest() {
        // TODO: test domain
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'supportUrl'
     */
    @Test
    public void supportUrlTest() {
        // TODO: test supportUrl
    }

    /**
     * Test the property 'hiddenFromSearch'
     */
    @Test
    public void hiddenFromSearchTest() {
        // TODO: test hiddenFromSearch
    }

    /**
     * Test the property 'allowPageSubscribers'
     */
    @Test
    public void allowPageSubscribersTest() {
        // TODO: test allowPageSubscribers
    }

    /**
     * Test the property 'allowIncidentSubscribers'
     */
    @Test
    public void allowIncidentSubscribersTest() {
        // TODO: test allowIncidentSubscribers
    }

    /**
     * Test the property 'allowEmailSubscribers'
     */
    @Test
    public void allowEmailSubscribersTest() {
        // TODO: test allowEmailSubscribers
    }

    /**
     * Test the property 'allowSmsSubscribers'
     */
    @Test
    public void allowSmsSubscribersTest() {
        // TODO: test allowSmsSubscribers
    }

    /**
     * Test the property 'allowRssAtomFeeds'
     */
    @Test
    public void allowRssAtomFeedsTest() {
        // TODO: test allowRssAtomFeeds
    }

    /**
     * Test the property 'allowWebhookSubscribers'
     */
    @Test
    public void allowWebhookSubscribersTest() {
        // TODO: test allowWebhookSubscribers
    }

    /**
     * Test the property 'notificationsFromEmail'
     */
    @Test
    public void notificationsFromEmailTest() {
        // TODO: test notificationsFromEmail
    }

    /**
     * Test the property 'notificationsEmailFooter'
     */
    @Test
    public void notificationsEmailFooterTest() {
        // TODO: test notificationsEmailFooter
    }

    /**
     * Test the property 'activityScore'
     */
    @Test
    public void activityScoreTest() {
        // TODO: test activityScore
    }

    /**
     * Test the property 'twitterUsername'
     */
    @Test
    public void twitterUsernameTest() {
        // TODO: test twitterUsername
    }

    /**
     * Test the property 'viewersMustBeTeamMembers'
     */
    @Test
    public void viewersMustBeTeamMembersTest() {
        // TODO: test viewersMustBeTeamMembers
    }

    /**
     * Test the property 'ipRestrictions'
     */
    @Test
    public void ipRestrictionsTest() {
        // TODO: test ipRestrictions
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
    }

    /**
     * Test the property 'timeZone'
     */
    @Test
    public void timeZoneTest() {
        // TODO: test timeZone
    }

    /**
     * Test the property 'cssBodyBackgroundColor'
     */
    @Test
    public void cssBodyBackgroundColorTest() {
        // TODO: test cssBodyBackgroundColor
    }

    /**
     * Test the property 'cssFontColor'
     */
    @Test
    public void cssFontColorTest() {
        // TODO: test cssFontColor
    }

    /**
     * Test the property 'cssLightFontColor'
     */
    @Test
    public void cssLightFontColorTest() {
        // TODO: test cssLightFontColor
    }

    /**
     * Test the property 'cssGreens'
     */
    @Test
    public void cssGreensTest() {
        // TODO: test cssGreens
    }

    /**
     * Test the property 'cssYellows'
     */
    @Test
    public void cssYellowsTest() {
        // TODO: test cssYellows
    }

    /**
     * Test the property 'cssOranges'
     */
    @Test
    public void cssOrangesTest() {
        // TODO: test cssOranges
    }

    /**
     * Test the property 'cssBlues'
     */
    @Test
    public void cssBluesTest() {
        // TODO: test cssBlues
    }

    /**
     * Test the property 'cssReds'
     */
    @Test
    public void cssRedsTest() {
        // TODO: test cssReds
    }

    /**
     * Test the property 'cssBorderColor'
     */
    @Test
    public void cssBorderColorTest() {
        // TODO: test cssBorderColor
    }

    /**
     * Test the property 'cssGraphColor'
     */
    @Test
    public void cssGraphColorTest() {
        // TODO: test cssGraphColor
    }

    /**
     * Test the property 'cssLinkColor'
     */
    @Test
    public void cssLinkColorTest() {
        // TODO: test cssLinkColor
    }

    /**
     * Test the property 'cssNoData'
     */
    @Test
    public void cssNoDataTest() {
        // TODO: test cssNoData
    }

    /**
     * Test the property 'faviconLogo'
     */
    @Test
    public void faviconLogoTest() {
        // TODO: test faviconLogo
    }

    /**
     * Test the property 'transactionalLogo'
     */
    @Test
    public void transactionalLogoTest() {
        // TODO: test transactionalLogo
    }

    /**
     * Test the property 'heroCover'
     */
    @Test
    public void heroCoverTest() {
        // TODO: test heroCover
    }

    /**
     * Test the property 'emailLogo'
     */
    @Test
    public void emailLogoTest() {
        // TODO: test emailLogo
    }

    /**
     * Test the property 'twitterLogo'
     */
    @Test
    public void twitterLogoTest() {
        // TODO: test twitterLogo
    }

}
