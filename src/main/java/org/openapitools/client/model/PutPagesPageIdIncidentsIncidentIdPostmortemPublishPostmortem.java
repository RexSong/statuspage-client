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
 * PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem {
  public static final String SERIALIZED_NAME_NOTIFY_TWITTER = "notify_twitter";
  @SerializedName(SERIALIZED_NAME_NOTIFY_TWITTER)
  private Boolean notifyTwitter;

  public static final String SERIALIZED_NAME_NOTIFY_SUBSCRIBERS = "notify_subscribers";
  @SerializedName(SERIALIZED_NAME_NOTIFY_SUBSCRIBERS)
  private Boolean notifySubscribers;

  public static final String SERIALIZED_NAME_CUSTOM_TWEET = "custom_tweet";
  @SerializedName(SERIALIZED_NAME_CUSTOM_TWEET)
  private String customTweet;


  public PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem notifyTwitter(Boolean notifyTwitter) {
    
    this.notifyTwitter = notifyTwitter;
    return this;
  }

   /**
   * Whether to notify Twitter followers
   * @return notifyTwitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to notify Twitter followers")

  public Boolean getNotifyTwitter() {
    return notifyTwitter;
  }


  public void setNotifyTwitter(Boolean notifyTwitter) {
    this.notifyTwitter = notifyTwitter;
  }


  public PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem notifySubscribers(Boolean notifySubscribers) {
    
    this.notifySubscribers = notifySubscribers;
    return this;
  }

   /**
   * Whether to notify e-mail subscribers
   * @return notifySubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to notify e-mail subscribers")

  public Boolean getNotifySubscribers() {
    return notifySubscribers;
  }


  public void setNotifySubscribers(Boolean notifySubscribers) {
    this.notifySubscribers = notifySubscribers;
  }


  public PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem customTweet(String customTweet) {
    
    this.customTweet = customTweet;
    return this;
  }

   /**
   * Custom postmortem tweet to publish
   * @return customTweet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom postmortem tweet to publish")

  public String getCustomTweet() {
    return customTweet;
  }


  public void setCustomTweet(String customTweet) {
    this.customTweet = customTweet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem putPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem = (PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem) o;
    return Objects.equals(this.notifyTwitter, putPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem.notifyTwitter) &&
        Objects.equals(this.notifySubscribers, putPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem.notifySubscribers) &&
        Objects.equals(this.customTweet, putPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem.customTweet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyTwitter, notifySubscribers, customTweet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutPagesPageIdIncidentsIncidentIdPostmortemPublishPostmortem {\n");
    sb.append("    notifyTwitter: ").append(toIndentedString(notifyTwitter)).append("\n");
    sb.append("    notifySubscribers: ").append(toIndentedString(notifySubscribers)).append("\n");
    sb.append("    customTweet: ").append(toIndentedString(customTweet)).append("\n");
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

