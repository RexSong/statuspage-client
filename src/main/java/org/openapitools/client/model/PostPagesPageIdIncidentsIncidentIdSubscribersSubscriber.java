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
 * PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY = "phone_country";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY)
  private String phoneCountry;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_SKIP_CONFIRMATION_NOTIFICATION = "skip_confirmation_notification";
  @SerializedName(SERIALIZED_NAME_SKIP_CONFIRMATION_NOTIFICATION)
  private Boolean skipConfirmationNotification;


  public PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address for creating Email subscribers.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address for creating Email subscribers.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber phoneCountry(String phoneCountry) {
    
    this.phoneCountry = phoneCountry;
    return this;
  }

   /**
   * The two-character country where the phone number is located to use for the new SMS subscriber.
   * @return phoneCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The two-character country where the phone number is located to use for the new SMS subscriber.")

  public String getPhoneCountry() {
    return phoneCountry;
  }


  public void setPhoneCountry(String phoneCountry) {
    this.phoneCountry = phoneCountry;
  }


  public PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number (as you would dial from the phone_country) to use for the new SMS subscriber.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number (as you would dial from the phone_country) to use for the new SMS subscriber.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber skipConfirmationNotification(Boolean skipConfirmationNotification) {
    
    this.skipConfirmationNotification = skipConfirmationNotification;
    return this;
  }

   /**
   * If skip_confirmation_notification is true, the subscriber does not receive any notifications when their subscription changes. Email subscribers will be automatically opted in. This option is only available for paid pages. This option has no effect for trial customers.
   * @return skipConfirmationNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If skip_confirmation_notification is true, the subscriber does not receive any notifications when their subscription changes. Email subscribers will be automatically opted in. This option is only available for paid pages. This option has no effect for trial customers.")

  public Boolean getSkipConfirmationNotification() {
    return skipConfirmationNotification;
  }


  public void setSkipConfirmationNotification(Boolean skipConfirmationNotification) {
    this.skipConfirmationNotification = skipConfirmationNotification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber postPagesPageIdIncidentsIncidentIdSubscribersSubscriber = (PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber) o;
    return Objects.equals(this.email, postPagesPageIdIncidentsIncidentIdSubscribersSubscriber.email) &&
        Objects.equals(this.phoneCountry, postPagesPageIdIncidentsIncidentIdSubscribersSubscriber.phoneCountry) &&
        Objects.equals(this.phoneNumber, postPagesPageIdIncidentsIncidentIdSubscribersSubscriber.phoneNumber) &&
        Objects.equals(this.skipConfirmationNotification, postPagesPageIdIncidentsIncidentIdSubscribersSubscriber.skipConfirmationNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phoneCountry, phoneNumber, skipConfirmationNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPagesPageIdIncidentsIncidentIdSubscribersSubscriber {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneCountry: ").append(toIndentedString(phoneCountry)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    skipConfirmationNotification: ").append(toIndentedString(skipConfirmationNotification)).append("\n");
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

