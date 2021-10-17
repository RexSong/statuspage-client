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
import org.threeten.bp.LocalDate;

/**
 * PostPagesPageIdComponentsComponent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PostPagesPageIdComponentsComponent {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Status of component
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPERATIONAL("operational"),
    
    UNDER_MAINTENANCE("under_maintenance"),
    
    DEGRADED_PERFORMANCE("degraded_performance"),
    
    PARTIAL_OUTAGE("partial_outage"),
    
    MAJOR_OUTAGE("major_outage"),
    
    EMPTY("");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ONLY_SHOW_IF_DEGRADED = "only_show_if_degraded";
  @SerializedName(SERIALIZED_NAME_ONLY_SHOW_IF_DEGRADED)
  private Boolean onlyShowIfDegraded;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_SHOWCASE = "showcase";
  @SerializedName(SERIALIZED_NAME_SHOWCASE)
  private Boolean showcase;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;


  public PostPagesPageIdComponentsComponent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * More detailed description for component
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "More detailed description for component")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostPagesPageIdComponentsComponent status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of component
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of component")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PostPagesPageIdComponentsComponent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Display name for component
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name for component")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostPagesPageIdComponentsComponent onlyShowIfDegraded(Boolean onlyShowIfDegraded) {
    
    this.onlyShowIfDegraded = onlyShowIfDegraded;
    return this;
  }

   /**
   * Requires a special feature flag to be enabled
   * @return onlyShowIfDegraded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requires a special feature flag to be enabled")

  public Boolean getOnlyShowIfDegraded() {
    return onlyShowIfDegraded;
  }


  public void setOnlyShowIfDegraded(Boolean onlyShowIfDegraded) {
    this.onlyShowIfDegraded = onlyShowIfDegraded;
  }


  public PostPagesPageIdComponentsComponent groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Component Group identifier
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component Group identifier")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public PostPagesPageIdComponentsComponent showcase(Boolean showcase) {
    
    this.showcase = showcase;
    return this;
  }

   /**
   * Should this component be showcased
   * @return showcase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should this component be showcased")

  public Boolean getShowcase() {
    return showcase;
  }


  public void setShowcase(Boolean showcase) {
    this.showcase = showcase;
  }


  public PostPagesPageIdComponentsComponent startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date this component started being used
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date this component started being used")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPagesPageIdComponentsComponent postPagesPageIdComponentsComponent = (PostPagesPageIdComponentsComponent) o;
    return Objects.equals(this.description, postPagesPageIdComponentsComponent.description) &&
        Objects.equals(this.status, postPagesPageIdComponentsComponent.status) &&
        Objects.equals(this.name, postPagesPageIdComponentsComponent.name) &&
        Objects.equals(this.onlyShowIfDegraded, postPagesPageIdComponentsComponent.onlyShowIfDegraded) &&
        Objects.equals(this.groupId, postPagesPageIdComponentsComponent.groupId) &&
        Objects.equals(this.showcase, postPagesPageIdComponentsComponent.showcase) &&
        Objects.equals(this.startDate, postPagesPageIdComponentsComponent.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, status, name, onlyShowIfDegraded, groupId, showcase, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPagesPageIdComponentsComponent {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlyShowIfDegraded: ").append(toIndentedString(onlyShowIfDegraded)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    showcase: ").append(toIndentedString(showcase)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

