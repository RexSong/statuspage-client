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
 * Get a count of subscribers by type
 */
@ApiModel(description = "Get a count of subscribers by type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class SubscriberCountByType {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private Integer email;

  public static final String SERIALIZED_NAME_SMS = "sms";
  @SerializedName(SERIALIZED_NAME_SMS)
  private Integer sms;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private Integer webhook;

  public static final String SERIALIZED_NAME_INTEGRATION_PARTNER = "integration_partner";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_PARTNER)
  private Integer integrationPartner;

  public static final String SERIALIZED_NAME_SLACK = "slack";
  @SerializedName(SERIALIZED_NAME_SLACK)
  private Integer slack;


  public SubscriberCountByType email(Integer email) {
    
    this.email = email;
    return this;
  }

   /**
   * The number of Email subscribers found by the query.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Email subscribers found by the query.")

  public Integer getEmail() {
    return email;
  }


  public void setEmail(Integer email) {
    this.email = email;
  }


  public SubscriberCountByType sms(Integer sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * The number of Webhook subscribers found by the query.
   * @return sms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Webhook subscribers found by the query.")

  public Integer getSms() {
    return sms;
  }


  public void setSms(Integer sms) {
    this.sms = sms;
  }


  public SubscriberCountByType webhook(Integer webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The number of SMS subscribers found by the query.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of SMS subscribers found by the query.")

  public Integer getWebhook() {
    return webhook;
  }


  public void setWebhook(Integer webhook) {
    this.webhook = webhook;
  }


  public SubscriberCountByType integrationPartner(Integer integrationPartner) {
    
    this.integrationPartner = integrationPartner;
    return this;
  }

   /**
   * The number of integration partners found by the query.
   * @return integrationPartner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of integration partners found by the query.")

  public Integer getIntegrationPartner() {
    return integrationPartner;
  }


  public void setIntegrationPartner(Integer integrationPartner) {
    this.integrationPartner = integrationPartner;
  }


  public SubscriberCountByType slack(Integer slack) {
    
    this.slack = slack;
    return this;
  }

   /**
   * The number of Slack subscribers found by the query.
   * @return slack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Slack subscribers found by the query.")

  public Integer getSlack() {
    return slack;
  }


  public void setSlack(Integer slack) {
    this.slack = slack;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberCountByType subscriberCountByType = (SubscriberCountByType) o;
    return Objects.equals(this.email, subscriberCountByType.email) &&
        Objects.equals(this.sms, subscriberCountByType.sms) &&
        Objects.equals(this.webhook, subscriberCountByType.webhook) &&
        Objects.equals(this.integrationPartner, subscriberCountByType.integrationPartner) &&
        Objects.equals(this.slack, subscriberCountByType.slack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sms, webhook, integrationPartner, slack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberCountByType {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    integrationPartner: ").append(toIndentedString(integrationPartner)).append("\n");
    sb.append("    slack: ").append(toIndentedString(slack)).append("\n");
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
