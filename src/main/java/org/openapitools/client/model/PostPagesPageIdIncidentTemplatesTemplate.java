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
import java.util.ArrayList;
import java.util.List;

/**
 * PostPagesPageIdIncidentTemplatesTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PostPagesPageIdIncidentTemplatesTemplate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  /**
   * The status the incident or maintenance should transition to when selecting this template
   */
  @JsonAdapter(UpdateStatusEnum.Adapter.class)
  public enum UpdateStatusEnum {
    INVESTIGATING("investigating"),
    
    IDENTIFIED("identified"),
    
    MONITORING("monitoring"),
    
    RESOLVED("resolved"),
    
    SCHEDULED("scheduled"),
    
    IN_PROGRESS("in_progress"),
    
    VERIFYING("verifying"),
    
    COMPLETED("completed");

    private String value;

    UpdateStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateStatusEnum fromValue(String value) {
      for (UpdateStatusEnum b : UpdateStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_STATUS = "update_status";
  @SerializedName(SERIALIZED_NAME_UPDATE_STATUS)
  private UpdateStatusEnum updateStatus;

  public static final String SERIALIZED_NAME_SHOULD_TWEET = "should_tweet";
  @SerializedName(SERIALIZED_NAME_SHOULD_TWEET)
  private Boolean shouldTweet;

  public static final String SERIALIZED_NAME_SHOULD_SEND_NOTIFICATIONS = "should_send_notifications";
  @SerializedName(SERIALIZED_NAME_SHOULD_SEND_NOTIFICATIONS)
  private Boolean shouldSendNotifications;

  public static final String SERIALIZED_NAME_COMPONENT_IDS = "component_ids";
  @SerializedName(SERIALIZED_NAME_COMPONENT_IDS)
  private List<String> componentIds = null;


  public PostPagesPageIdIncidentTemplatesTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the template, as shown in the list on the \&quot;Templates\&quot; tab of the \&quot;Incidents\&quot; page
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the template, as shown in the list on the \"Templates\" tab of the \"Incidents\" page")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostPagesPageIdIncidentTemplatesTemplate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title to be applied to the incident or maintenance when selecting this template
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Title to be applied to the incident or maintenance when selecting this template")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PostPagesPageIdIncidentTemplatesTemplate body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The initial message, created as the first incident or maintenance update.
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The initial message, created as the first incident or maintenance update.")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public PostPagesPageIdIncidentTemplatesTemplate groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Identifier of Template Group this template belongs to
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of Template Group this template belongs to")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public PostPagesPageIdIncidentTemplatesTemplate updateStatus(UpdateStatusEnum updateStatus) {
    
    this.updateStatus = updateStatus;
    return this;
  }

   /**
   * The status the incident or maintenance should transition to when selecting this template
   * @return updateStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status the incident or maintenance should transition to when selecting this template")

  public UpdateStatusEnum getUpdateStatus() {
    return updateStatus;
  }


  public void setUpdateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
  }


  public PostPagesPageIdIncidentTemplatesTemplate shouldTweet(Boolean shouldTweet) {
    
    this.shouldTweet = shouldTweet;
    return this;
  }

   /**
   * Whether the \&quot;tweet update\&quot; checkbox should be selected when selecting this template
   * @return shouldTweet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the \"tweet update\" checkbox should be selected when selecting this template")

  public Boolean getShouldTweet() {
    return shouldTweet;
  }


  public void setShouldTweet(Boolean shouldTweet) {
    this.shouldTweet = shouldTweet;
  }


  public PostPagesPageIdIncidentTemplatesTemplate shouldSendNotifications(Boolean shouldSendNotifications) {
    
    this.shouldSendNotifications = shouldSendNotifications;
    return this;
  }

   /**
   * Whether the \&quot;deliver notifications\&quot; checkbox should be selected when selecting this template
   * @return shouldSendNotifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the \"deliver notifications\" checkbox should be selected when selecting this template")

  public Boolean getShouldSendNotifications() {
    return shouldSendNotifications;
  }


  public void setShouldSendNotifications(Boolean shouldSendNotifications) {
    this.shouldSendNotifications = shouldSendNotifications;
  }


  public PostPagesPageIdIncidentTemplatesTemplate componentIds(List<String> componentIds) {
    
    this.componentIds = componentIds;
    return this;
  }

  public PostPagesPageIdIncidentTemplatesTemplate addComponentIdsItem(String componentIdsItem) {
    if (this.componentIds == null) {
      this.componentIds = new ArrayList<String>();
    }
    this.componentIds.add(componentIdsItem);
    return this;
  }

   /**
   * List of component_ids affected by this incident
   * @return componentIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of component_ids affected by this incident")

  public List<String> getComponentIds() {
    return componentIds;
  }


  public void setComponentIds(List<String> componentIds) {
    this.componentIds = componentIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPagesPageIdIncidentTemplatesTemplate postPagesPageIdIncidentTemplatesTemplate = (PostPagesPageIdIncidentTemplatesTemplate) o;
    return Objects.equals(this.name, postPagesPageIdIncidentTemplatesTemplate.name) &&
        Objects.equals(this.title, postPagesPageIdIncidentTemplatesTemplate.title) &&
        Objects.equals(this.body, postPagesPageIdIncidentTemplatesTemplate.body) &&
        Objects.equals(this.groupId, postPagesPageIdIncidentTemplatesTemplate.groupId) &&
        Objects.equals(this.updateStatus, postPagesPageIdIncidentTemplatesTemplate.updateStatus) &&
        Objects.equals(this.shouldTweet, postPagesPageIdIncidentTemplatesTemplate.shouldTweet) &&
        Objects.equals(this.shouldSendNotifications, postPagesPageIdIncidentTemplatesTemplate.shouldSendNotifications) &&
        Objects.equals(this.componentIds, postPagesPageIdIncidentTemplatesTemplate.componentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, body, groupId, updateStatus, shouldTweet, shouldSendNotifications, componentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPagesPageIdIncidentTemplatesTemplate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    shouldTweet: ").append(toIndentedString(shouldTweet)).append("\n");
    sb.append("    shouldSendNotifications: ").append(toIndentedString(shouldSendNotifications)).append("\n");
    sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
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
