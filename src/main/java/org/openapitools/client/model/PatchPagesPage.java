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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PatchPagesPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PatchPagesPage {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_SUBDOMAIN = "subdomain";
  @SerializedName(SERIALIZED_NAME_SUBDOMAIN)
  private String subdomain;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * The main template your statuspage will use
   */
  @JsonAdapter(BrandingEnum.Adapter.class)
  public enum BrandingEnum {
    BASIC("basic"),
    
    PREMIUM("premium");

    private String value;

    BrandingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BrandingEnum fromValue(String value) {
      for (BrandingEnum b : BrandingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BrandingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BrandingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BrandingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BrandingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BRANDING = "branding";
  @SerializedName(SERIALIZED_NAME_BRANDING)
  private BrandingEnum branding;

  public static final String SERIALIZED_NAME_CSS_BODY_BACKGROUND_COLOR = "css_body_background_color";
  @SerializedName(SERIALIZED_NAME_CSS_BODY_BACKGROUND_COLOR)
  private String cssBodyBackgroundColor;

  public static final String SERIALIZED_NAME_CSS_FONT_COLOR = "css_font_color";
  @SerializedName(SERIALIZED_NAME_CSS_FONT_COLOR)
  private String cssFontColor;

  public static final String SERIALIZED_NAME_CSS_LIGHT_FONT_COLOR = "css_light_font_color";
  @SerializedName(SERIALIZED_NAME_CSS_LIGHT_FONT_COLOR)
  private String cssLightFontColor;

  public static final String SERIALIZED_NAME_CSS_GREENS = "css_greens";
  @SerializedName(SERIALIZED_NAME_CSS_GREENS)
  private String cssGreens;

  public static final String SERIALIZED_NAME_CSS_YELLOWS = "css_yellows";
  @SerializedName(SERIALIZED_NAME_CSS_YELLOWS)
  private String cssYellows;

  public static final String SERIALIZED_NAME_CSS_ORANGES = "css_oranges";
  @SerializedName(SERIALIZED_NAME_CSS_ORANGES)
  private String cssOranges;

  public static final String SERIALIZED_NAME_CSS_REDS = "css_reds";
  @SerializedName(SERIALIZED_NAME_CSS_REDS)
  private String cssReds;

  public static final String SERIALIZED_NAME_CSS_BLUES = "css_blues";
  @SerializedName(SERIALIZED_NAME_CSS_BLUES)
  private String cssBlues;

  public static final String SERIALIZED_NAME_CSS_BORDER_COLOR = "css_border_color";
  @SerializedName(SERIALIZED_NAME_CSS_BORDER_COLOR)
  private String cssBorderColor;

  public static final String SERIALIZED_NAME_CSS_GRAPH_COLOR = "css_graph_color";
  @SerializedName(SERIALIZED_NAME_CSS_GRAPH_COLOR)
  private String cssGraphColor;

  public static final String SERIALIZED_NAME_CSS_LINK_COLOR = "css_link_color";
  @SerializedName(SERIALIZED_NAME_CSS_LINK_COLOR)
  private String cssLinkColor;

  public static final String SERIALIZED_NAME_CSS_NO_DATA = "css_no_data";
  @SerializedName(SERIALIZED_NAME_CSS_NO_DATA)
  private String cssNoData;

  public static final String SERIALIZED_NAME_HIDDEN_FROM_SEARCH = "hidden_from_search";
  @SerializedName(SERIALIZED_NAME_HIDDEN_FROM_SEARCH)
  private Boolean hiddenFromSearch;

  public static final String SERIALIZED_NAME_VIEWERS_MUST_BE_TEAM_MEMBERS = "viewers_must_be_team_members";
  @SerializedName(SERIALIZED_NAME_VIEWERS_MUST_BE_TEAM_MEMBERS)
  private Boolean viewersMustBeTeamMembers;

  public static final String SERIALIZED_NAME_ALLOW_PAGE_SUBSCRIBERS = "allow_page_subscribers";
  @SerializedName(SERIALIZED_NAME_ALLOW_PAGE_SUBSCRIBERS)
  private Boolean allowPageSubscribers;

  public static final String SERIALIZED_NAME_ALLOW_INCIDENT_SUBSCRIBERS = "allow_incident_subscribers";
  @SerializedName(SERIALIZED_NAME_ALLOW_INCIDENT_SUBSCRIBERS)
  private Boolean allowIncidentSubscribers;

  public static final String SERIALIZED_NAME_ALLOW_EMAIL_SUBSCRIBERS = "allow_email_subscribers";
  @SerializedName(SERIALIZED_NAME_ALLOW_EMAIL_SUBSCRIBERS)
  private Boolean allowEmailSubscribers;

  public static final String SERIALIZED_NAME_ALLOW_SMS_SUBSCRIBERS = "allow_sms_subscribers";
  @SerializedName(SERIALIZED_NAME_ALLOW_SMS_SUBSCRIBERS)
  private Boolean allowSmsSubscribers;

  public static final String SERIALIZED_NAME_ALLOW_RSS_ATOM_FEEDS = "allow_rss_atom_feeds";
  @SerializedName(SERIALIZED_NAME_ALLOW_RSS_ATOM_FEEDS)
  private Boolean allowRssAtomFeeds;

  public static final String SERIALIZED_NAME_ALLOW_WEBHOOK_SUBSCRIBERS = "allow_webhook_subscribers";
  @SerializedName(SERIALIZED_NAME_ALLOW_WEBHOOK_SUBSCRIBERS)
  private Boolean allowWebhookSubscribers;

  public static final String SERIALIZED_NAME_NOTIFICATIONS_FROM_EMAIL = "notifications_from_email";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS_FROM_EMAIL)
  private String notificationsFromEmail;

  public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_NOTIFICATIONS_EMAIL_FOOTER = "notifications_email_footer";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS_EMAIL_FOOTER)
  private String notificationsEmailFooter;


  public PatchPagesPage name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of your page to be displayed
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of your page to be displayed")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PatchPagesPage domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * CNAME alias for your status page
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CNAME alias for your status page")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public PatchPagesPage subdomain(String subdomain) {
    
    this.subdomain = subdomain;
    return this;
  }

   /**
   * Subdomain at which to access your status page
   * @return subdomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subdomain at which to access your status page")

  public String getSubdomain() {
    return subdomain;
  }


  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  public PatchPagesPage url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Website of your page.  Clicking on your statuspage image will link here.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Website of your page.  Clicking on your statuspage image will link here.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public PatchPagesPage branding(BrandingEnum branding) {
    
    this.branding = branding;
    return this;
  }

   /**
   * The main template your statuspage will use
   * @return branding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The main template your statuspage will use")

  public BrandingEnum getBranding() {
    return branding;
  }


  public void setBranding(BrandingEnum branding) {
    this.branding = branding;
  }


  public PatchPagesPage cssBodyBackgroundColor(String cssBodyBackgroundColor) {
    
    this.cssBodyBackgroundColor = cssBodyBackgroundColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssBodyBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssBodyBackgroundColor() {
    return cssBodyBackgroundColor;
  }


  public void setCssBodyBackgroundColor(String cssBodyBackgroundColor) {
    this.cssBodyBackgroundColor = cssBodyBackgroundColor;
  }


  public PatchPagesPage cssFontColor(String cssFontColor) {
    
    this.cssFontColor = cssFontColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssFontColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssFontColor() {
    return cssFontColor;
  }


  public void setCssFontColor(String cssFontColor) {
    this.cssFontColor = cssFontColor;
  }


  public PatchPagesPage cssLightFontColor(String cssLightFontColor) {
    
    this.cssLightFontColor = cssLightFontColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssLightFontColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssLightFontColor() {
    return cssLightFontColor;
  }


  public void setCssLightFontColor(String cssLightFontColor) {
    this.cssLightFontColor = cssLightFontColor;
  }


  public PatchPagesPage cssGreens(String cssGreens) {
    
    this.cssGreens = cssGreens;
    return this;
  }

   /**
   * CSS Color
   * @return cssGreens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssGreens() {
    return cssGreens;
  }


  public void setCssGreens(String cssGreens) {
    this.cssGreens = cssGreens;
  }


  public PatchPagesPage cssYellows(String cssYellows) {
    
    this.cssYellows = cssYellows;
    return this;
  }

   /**
   * CSS Color
   * @return cssYellows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssYellows() {
    return cssYellows;
  }


  public void setCssYellows(String cssYellows) {
    this.cssYellows = cssYellows;
  }


  public PatchPagesPage cssOranges(String cssOranges) {
    
    this.cssOranges = cssOranges;
    return this;
  }

   /**
   * CSS Color
   * @return cssOranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssOranges() {
    return cssOranges;
  }


  public void setCssOranges(String cssOranges) {
    this.cssOranges = cssOranges;
  }


  public PatchPagesPage cssReds(String cssReds) {
    
    this.cssReds = cssReds;
    return this;
  }

   /**
   * CSS Color
   * @return cssReds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssReds() {
    return cssReds;
  }


  public void setCssReds(String cssReds) {
    this.cssReds = cssReds;
  }


  public PatchPagesPage cssBlues(String cssBlues) {
    
    this.cssBlues = cssBlues;
    return this;
  }

   /**
   * CSS Color
   * @return cssBlues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssBlues() {
    return cssBlues;
  }


  public void setCssBlues(String cssBlues) {
    this.cssBlues = cssBlues;
  }


  public PatchPagesPage cssBorderColor(String cssBorderColor) {
    
    this.cssBorderColor = cssBorderColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssBorderColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssBorderColor() {
    return cssBorderColor;
  }


  public void setCssBorderColor(String cssBorderColor) {
    this.cssBorderColor = cssBorderColor;
  }


  public PatchPagesPage cssGraphColor(String cssGraphColor) {
    
    this.cssGraphColor = cssGraphColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssGraphColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssGraphColor() {
    return cssGraphColor;
  }


  public void setCssGraphColor(String cssGraphColor) {
    this.cssGraphColor = cssGraphColor;
  }


  public PatchPagesPage cssLinkColor(String cssLinkColor) {
    
    this.cssLinkColor = cssLinkColor;
    return this;
  }

   /**
   * CSS Color
   * @return cssLinkColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssLinkColor() {
    return cssLinkColor;
  }


  public void setCssLinkColor(String cssLinkColor) {
    this.cssLinkColor = cssLinkColor;
  }


  public PatchPagesPage cssNoData(String cssNoData) {
    
    this.cssNoData = cssNoData;
    return this;
  }

   /**
   * CSS Color
   * @return cssNoData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSS Color")

  public String getCssNoData() {
    return cssNoData;
  }


  public void setCssNoData(String cssNoData) {
    this.cssNoData = cssNoData;
  }


  public PatchPagesPage hiddenFromSearch(Boolean hiddenFromSearch) {
    
    this.hiddenFromSearch = hiddenFromSearch;
    return this;
  }

   /**
   * Should your page hide itself from search engines
   * @return hiddenFromSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should your page hide itself from search engines")

  public Boolean getHiddenFromSearch() {
    return hiddenFromSearch;
  }


  public void setHiddenFromSearch(Boolean hiddenFromSearch) {
    this.hiddenFromSearch = hiddenFromSearch;
  }


  public PatchPagesPage viewersMustBeTeamMembers(Boolean viewersMustBeTeamMembers) {
    
    this.viewersMustBeTeamMembers = viewersMustBeTeamMembers;
    return this;
  }

   /**
   * Get viewersMustBeTeamMembers
   * @return viewersMustBeTeamMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getViewersMustBeTeamMembers() {
    return viewersMustBeTeamMembers;
  }


  public void setViewersMustBeTeamMembers(Boolean viewersMustBeTeamMembers) {
    this.viewersMustBeTeamMembers = viewersMustBeTeamMembers;
  }


  public PatchPagesPage allowPageSubscribers(Boolean allowPageSubscribers) {
    
    this.allowPageSubscribers = allowPageSubscribers;
    return this;
  }

   /**
   * Can your users subscribe to all notifications on the page
   * @return allowPageSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users subscribe to all notifications on the page")

  public Boolean getAllowPageSubscribers() {
    return allowPageSubscribers;
  }


  public void setAllowPageSubscribers(Boolean allowPageSubscribers) {
    this.allowPageSubscribers = allowPageSubscribers;
  }


  public PatchPagesPage allowIncidentSubscribers(Boolean allowIncidentSubscribers) {
    
    this.allowIncidentSubscribers = allowIncidentSubscribers;
    return this;
  }

   /**
   * Can your users subscribe to notifications for a single incident
   * @return allowIncidentSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users subscribe to notifications for a single incident")

  public Boolean getAllowIncidentSubscribers() {
    return allowIncidentSubscribers;
  }


  public void setAllowIncidentSubscribers(Boolean allowIncidentSubscribers) {
    this.allowIncidentSubscribers = allowIncidentSubscribers;
  }


  public PatchPagesPage allowEmailSubscribers(Boolean allowEmailSubscribers) {
    
    this.allowEmailSubscribers = allowEmailSubscribers;
    return this;
  }

   /**
   * Can your users choose to receive notifications via email
   * @return allowEmailSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users choose to receive notifications via email")

  public Boolean getAllowEmailSubscribers() {
    return allowEmailSubscribers;
  }


  public void setAllowEmailSubscribers(Boolean allowEmailSubscribers) {
    this.allowEmailSubscribers = allowEmailSubscribers;
  }


  public PatchPagesPage allowSmsSubscribers(Boolean allowSmsSubscribers) {
    
    this.allowSmsSubscribers = allowSmsSubscribers;
    return this;
  }

   /**
   * Can your users choose to receive notifications via SMS
   * @return allowSmsSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users choose to receive notifications via SMS")

  public Boolean getAllowSmsSubscribers() {
    return allowSmsSubscribers;
  }


  public void setAllowSmsSubscribers(Boolean allowSmsSubscribers) {
    this.allowSmsSubscribers = allowSmsSubscribers;
  }


  public PatchPagesPage allowRssAtomFeeds(Boolean allowRssAtomFeeds) {
    
    this.allowRssAtomFeeds = allowRssAtomFeeds;
    return this;
  }

   /**
   * Can your users choose to access incident feeds via RSS/Atom (not functional on Audience-Specific pages)
   * @return allowRssAtomFeeds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users choose to access incident feeds via RSS/Atom (not functional on Audience-Specific pages)")

  public Boolean getAllowRssAtomFeeds() {
    return allowRssAtomFeeds;
  }


  public void setAllowRssAtomFeeds(Boolean allowRssAtomFeeds) {
    this.allowRssAtomFeeds = allowRssAtomFeeds;
  }


  public PatchPagesPage allowWebhookSubscribers(Boolean allowWebhookSubscribers) {
    
    this.allowWebhookSubscribers = allowWebhookSubscribers;
    return this;
  }

   /**
   * Can your users choose to receive notifications via Webhooks
   * @return allowWebhookSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Can your users choose to receive notifications via Webhooks")

  public Boolean getAllowWebhookSubscribers() {
    return allowWebhookSubscribers;
  }


  public void setAllowWebhookSubscribers(Boolean allowWebhookSubscribers) {
    this.allowWebhookSubscribers = allowWebhookSubscribers;
  }


  public PatchPagesPage notificationsFromEmail(String notificationsFromEmail) {
    
    this.notificationsFromEmail = notificationsFromEmail;
    return this;
  }

   /**
   * Allows you to customize the email address your page notifications come from
   * @return notificationsFromEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows you to customize the email address your page notifications come from")

  public String getNotificationsFromEmail() {
    return notificationsFromEmail;
  }


  public void setNotificationsFromEmail(String notificationsFromEmail) {
    this.notificationsFromEmail = notificationsFromEmail;
  }


  public PatchPagesPage timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Timezone configured for your page
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timezone configured for your page")

  public String getTimeZone() {
    return timeZone;
  }


  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public PatchPagesPage notificationsEmailFooter(String notificationsEmailFooter) {
    
    this.notificationsEmailFooter = notificationsEmailFooter;
    return this;
  }

   /**
   * Allows you to customize the footer appearing on your notification emails.  Accepts Markdown for formatting
   * @return notificationsEmailFooter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows you to customize the footer appearing on your notification emails.  Accepts Markdown for formatting")

  public String getNotificationsEmailFooter() {
    return notificationsEmailFooter;
  }


  public void setNotificationsEmailFooter(String notificationsEmailFooter) {
    this.notificationsEmailFooter = notificationsEmailFooter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchPagesPage patchPagesPage = (PatchPagesPage) o;
    return Objects.equals(this.name, patchPagesPage.name) &&
        Objects.equals(this.domain, patchPagesPage.domain) &&
        Objects.equals(this.subdomain, patchPagesPage.subdomain) &&
        Objects.equals(this.url, patchPagesPage.url) &&
        Objects.equals(this.branding, patchPagesPage.branding) &&
        Objects.equals(this.cssBodyBackgroundColor, patchPagesPage.cssBodyBackgroundColor) &&
        Objects.equals(this.cssFontColor, patchPagesPage.cssFontColor) &&
        Objects.equals(this.cssLightFontColor, patchPagesPage.cssLightFontColor) &&
        Objects.equals(this.cssGreens, patchPagesPage.cssGreens) &&
        Objects.equals(this.cssYellows, patchPagesPage.cssYellows) &&
        Objects.equals(this.cssOranges, patchPagesPage.cssOranges) &&
        Objects.equals(this.cssReds, patchPagesPage.cssReds) &&
        Objects.equals(this.cssBlues, patchPagesPage.cssBlues) &&
        Objects.equals(this.cssBorderColor, patchPagesPage.cssBorderColor) &&
        Objects.equals(this.cssGraphColor, patchPagesPage.cssGraphColor) &&
        Objects.equals(this.cssLinkColor, patchPagesPage.cssLinkColor) &&
        Objects.equals(this.cssNoData, patchPagesPage.cssNoData) &&
        Objects.equals(this.hiddenFromSearch, patchPagesPage.hiddenFromSearch) &&
        Objects.equals(this.viewersMustBeTeamMembers, patchPagesPage.viewersMustBeTeamMembers) &&
        Objects.equals(this.allowPageSubscribers, patchPagesPage.allowPageSubscribers) &&
        Objects.equals(this.allowIncidentSubscribers, patchPagesPage.allowIncidentSubscribers) &&
        Objects.equals(this.allowEmailSubscribers, patchPagesPage.allowEmailSubscribers) &&
        Objects.equals(this.allowSmsSubscribers, patchPagesPage.allowSmsSubscribers) &&
        Objects.equals(this.allowRssAtomFeeds, patchPagesPage.allowRssAtomFeeds) &&
        Objects.equals(this.allowWebhookSubscribers, patchPagesPage.allowWebhookSubscribers) &&
        Objects.equals(this.notificationsFromEmail, patchPagesPage.notificationsFromEmail) &&
        Objects.equals(this.timeZone, patchPagesPage.timeZone) &&
        Objects.equals(this.notificationsEmailFooter, patchPagesPage.notificationsEmailFooter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, domain, subdomain, url, branding, cssBodyBackgroundColor, cssFontColor, cssLightFontColor, cssGreens, cssYellows, cssOranges, cssReds, cssBlues, cssBorderColor, cssGraphColor, cssLinkColor, cssNoData, hiddenFromSearch, viewersMustBeTeamMembers, allowPageSubscribers, allowIncidentSubscribers, allowEmailSubscribers, allowSmsSubscribers, allowRssAtomFeeds, allowWebhookSubscribers, notificationsFromEmail, timeZone, notificationsEmailFooter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchPagesPage {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    branding: ").append(toIndentedString(branding)).append("\n");
    sb.append("    cssBodyBackgroundColor: ").append(toIndentedString(cssBodyBackgroundColor)).append("\n");
    sb.append("    cssFontColor: ").append(toIndentedString(cssFontColor)).append("\n");
    sb.append("    cssLightFontColor: ").append(toIndentedString(cssLightFontColor)).append("\n");
    sb.append("    cssGreens: ").append(toIndentedString(cssGreens)).append("\n");
    sb.append("    cssYellows: ").append(toIndentedString(cssYellows)).append("\n");
    sb.append("    cssOranges: ").append(toIndentedString(cssOranges)).append("\n");
    sb.append("    cssReds: ").append(toIndentedString(cssReds)).append("\n");
    sb.append("    cssBlues: ").append(toIndentedString(cssBlues)).append("\n");
    sb.append("    cssBorderColor: ").append(toIndentedString(cssBorderColor)).append("\n");
    sb.append("    cssGraphColor: ").append(toIndentedString(cssGraphColor)).append("\n");
    sb.append("    cssLinkColor: ").append(toIndentedString(cssLinkColor)).append("\n");
    sb.append("    cssNoData: ").append(toIndentedString(cssNoData)).append("\n");
    sb.append("    hiddenFromSearch: ").append(toIndentedString(hiddenFromSearch)).append("\n");
    sb.append("    viewersMustBeTeamMembers: ").append(toIndentedString(viewersMustBeTeamMembers)).append("\n");
    sb.append("    allowPageSubscribers: ").append(toIndentedString(allowPageSubscribers)).append("\n");
    sb.append("    allowIncidentSubscribers: ").append(toIndentedString(allowIncidentSubscribers)).append("\n");
    sb.append("    allowEmailSubscribers: ").append(toIndentedString(allowEmailSubscribers)).append("\n");
    sb.append("    allowSmsSubscribers: ").append(toIndentedString(allowSmsSubscribers)).append("\n");
    sb.append("    allowRssAtomFeeds: ").append(toIndentedString(allowRssAtomFeeds)).append("\n");
    sb.append("    allowWebhookSubscribers: ").append(toIndentedString(allowWebhookSubscribers)).append("\n");
    sb.append("    notificationsFromEmail: ").append(toIndentedString(notificationsFromEmail)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    notificationsEmailFooter: ").append(toIndentedString(notificationsEmailFooter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

