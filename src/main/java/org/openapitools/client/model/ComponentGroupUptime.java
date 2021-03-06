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
import org.openapitools.client.model.ComponentGroupUptimeRelatedEvents;
import org.threeten.bp.OffsetDateTime;

/**
 * Get uptime data for a component group that has uptime showcase enabled for at least one component.
 */
@ApiModel(description = "Get uptime data for a component group that has uptime showcase enabled for at least one component.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class ComponentGroupUptime {
  public static final String SERIALIZED_NAME_RANGE_START = "range_start";
  @SerializedName(SERIALIZED_NAME_RANGE_START)
  private OffsetDateTime rangeStart;

  public static final String SERIALIZED_NAME_RANGE_END = "range_end";
  @SerializedName(SERIALIZED_NAME_RANGE_END)
  private OffsetDateTime rangeEnd;

  public static final String SERIALIZED_NAME_UPTIME_PERCENTAGE = "uptime_percentage";
  @SerializedName(SERIALIZED_NAME_UPTIME_PERCENTAGE)
  private Float uptimePercentage;

  public static final String SERIALIZED_NAME_MAJOR_OUTAGE = "major_outage";
  @SerializedName(SERIALIZED_NAME_MAJOR_OUTAGE)
  private Integer majorOutage;

  public static final String SERIALIZED_NAME_PARTIAL_OUTAGE = "partial_outage";
  @SerializedName(SERIALIZED_NAME_PARTIAL_OUTAGE)
  private Integer partialOutage;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private String warnings;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RELATED_EVENTS = "related_events";
  @SerializedName(SERIALIZED_NAME_RELATED_EVENTS)
  private ComponentGroupUptimeRelatedEvents relatedEvents;


  public ComponentGroupUptime rangeStart(OffsetDateTime rangeStart) {
    
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * Start date used for uptime calculation (see the warnings field in the response if this value does not match the start parameter you provided).
   * @return rangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date used for uptime calculation (see the warnings field in the response if this value does not match the start parameter you provided).")

  public OffsetDateTime getRangeStart() {
    return rangeStart;
  }


  public void setRangeStart(OffsetDateTime rangeStart) {
    this.rangeStart = rangeStart;
  }


  public ComponentGroupUptime rangeEnd(OffsetDateTime rangeEnd) {
    
    this.rangeEnd = rangeEnd;
    return this;
  }

   /**
   * End date used for uptime calculation (see the warnings field in the response if this value does not match the end parameter you provided).
   * @return rangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date used for uptime calculation (see the warnings field in the response if this value does not match the end parameter you provided).")

  public OffsetDateTime getRangeEnd() {
    return rangeEnd;
  }


  public void setRangeEnd(OffsetDateTime rangeEnd) {
    this.rangeEnd = rangeEnd;
  }


  public ComponentGroupUptime uptimePercentage(Float uptimePercentage) {
    
    this.uptimePercentage = uptimePercentage;
    return this;
  }

   /**
   * Uptime percentage for a component
   * @return uptimePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96.67", value = "Uptime percentage for a component")

  public Float getUptimePercentage() {
    return uptimePercentage;
  }


  public void setUptimePercentage(Float uptimePercentage) {
    this.uptimePercentage = uptimePercentage;
  }


  public ComponentGroupUptime majorOutage(Integer majorOutage) {
    
    this.majorOutage = majorOutage;
    return this;
  }

   /**
   * Seconds of major outage
   * @return majorOutage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "86400", value = "Seconds of major outage")

  public Integer getMajorOutage() {
    return majorOutage;
  }


  public void setMajorOutage(Integer majorOutage) {
    this.majorOutage = majorOutage;
  }


  public ComponentGroupUptime partialOutage(Integer partialOutage) {
    
    this.partialOutage = partialOutage;
    return this;
  }

   /**
   * Seconds of partial outage
   * @return partialOutage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Seconds of partial outage")

  public Integer getPartialOutage() {
    return partialOutage;
  }


  public void setPartialOutage(Integer partialOutage) {
    this.partialOutage = partialOutage;
  }


  public ComponentGroupUptime warnings(String warnings) {
    
    this.warnings = warnings;
    return this;
  }

   /**
   * Warning messages related to the uptime query that may occur
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"End date was adjusted to today. See range_end field in response for end date used.\"]", value = "Warning messages related to the uptime query that may occur")

  public String getWarnings() {
    return warnings;
  }


  public void setWarnings(String warnings) {
    this.warnings = warnings;
  }


  public ComponentGroupUptime id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Component group identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component group identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ComponentGroupUptime name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Component group display name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component group display name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComponentGroupUptime relatedEvents(ComponentGroupUptimeRelatedEvents relatedEvents) {
    
    this.relatedEvents = relatedEvents;
    return this;
  }

   /**
   * Get relatedEvents
   * @return relatedEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentGroupUptimeRelatedEvents getRelatedEvents() {
    return relatedEvents;
  }


  public void setRelatedEvents(ComponentGroupUptimeRelatedEvents relatedEvents) {
    this.relatedEvents = relatedEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentGroupUptime componentGroupUptime = (ComponentGroupUptime) o;
    return Objects.equals(this.rangeStart, componentGroupUptime.rangeStart) &&
        Objects.equals(this.rangeEnd, componentGroupUptime.rangeEnd) &&
        Objects.equals(this.uptimePercentage, componentGroupUptime.uptimePercentage) &&
        Objects.equals(this.majorOutage, componentGroupUptime.majorOutage) &&
        Objects.equals(this.partialOutage, componentGroupUptime.partialOutage) &&
        Objects.equals(this.warnings, componentGroupUptime.warnings) &&
        Objects.equals(this.id, componentGroupUptime.id) &&
        Objects.equals(this.name, componentGroupUptime.name) &&
        Objects.equals(this.relatedEvents, componentGroupUptime.relatedEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeStart, rangeEnd, uptimePercentage, majorOutage, partialOutage, warnings, id, name, relatedEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentGroupUptime {\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
    sb.append("    uptimePercentage: ").append(toIndentedString(uptimePercentage)).append("\n");
    sb.append("    majorOutage: ").append(toIndentedString(majorOutage)).append("\n");
    sb.append("    partialOutage: ").append(toIndentedString(partialOutage)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relatedEvents: ").append(toIndentedString(relatedEvents)).append("\n");
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

