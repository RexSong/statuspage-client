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
import org.openapitools.client.model.Component;
import org.openapitools.client.model.IncidentUpdate;
import org.threeten.bp.OffsetDateTime;

/**
 * Get an incident
 */
@ApiModel(description = "Get an incident")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class Incident {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<Component> components = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private String impact;

  public static final String SERIALIZED_NAME_IMPACT_OVERRIDE = "impact_override";
  @SerializedName(SERIALIZED_NAME_IMPACT_OVERRIDE)
  private String impactOverride;

  public static final String SERIALIZED_NAME_INCIDENT_UPDATES = "incident_updates";
  @SerializedName(SERIALIZED_NAME_INCIDENT_UPDATES)
  private List<IncidentUpdate> incidentUpdates = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_MONITORING_AT = "monitoring_at";
  @SerializedName(SERIALIZED_NAME_MONITORING_AT)
  private OffsetDateTime monitoringAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PAGE_ID = "page_id";
  @SerializedName(SERIALIZED_NAME_PAGE_ID)
  private String pageId;

  public static final String SERIALIZED_NAME_POSTMORTEM_BODY = "postmortem_body";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_BODY)
  private String postmortemBody;

  public static final String SERIALIZED_NAME_POSTMORTEM_BODY_LAST_UPDATED_AT = "postmortem_body_last_updated_at";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_BODY_LAST_UPDATED_AT)
  private OffsetDateTime postmortemBodyLastUpdatedAt;

  public static final String SERIALIZED_NAME_POSTMORTEM_IGNORED = "postmortem_ignored";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_IGNORED)
  private Boolean postmortemIgnored;

  public static final String SERIALIZED_NAME_POSTMORTEM_NOTIFIED_SUBSCRIBERS = "postmortem_notified_subscribers";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_NOTIFIED_SUBSCRIBERS)
  private Boolean postmortemNotifiedSubscribers;

  public static final String SERIALIZED_NAME_POSTMORTEM_NOTIFIED_TWITTER = "postmortem_notified_twitter";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_NOTIFIED_TWITTER)
  private Boolean postmortemNotifiedTwitter;

  public static final String SERIALIZED_NAME_POSTMORTEM_PUBLISHED_AT = "postmortem_published_at";
  @SerializedName(SERIALIZED_NAME_POSTMORTEM_PUBLISHED_AT)
  private Boolean postmortemPublishedAt;

  public static final String SERIALIZED_NAME_RESOLVED_AT = "resolved_at";
  @SerializedName(SERIALIZED_NAME_RESOLVED_AT)
  private OffsetDateTime resolvedAt;

  public static final String SERIALIZED_NAME_SCHEDULED_AUTO_COMPLETED = "scheduled_auto_completed";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AUTO_COMPLETED)
  private Boolean scheduledAutoCompleted;

  public static final String SERIALIZED_NAME_SCHEDULED_AUTO_IN_PROGRESS = "scheduled_auto_in_progress";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AUTO_IN_PROGRESS)
  private Boolean scheduledAutoInProgress;

  public static final String SERIALIZED_NAME_SCHEDULED_FOR = "scheduled_for";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_FOR)
  private OffsetDateTime scheduledFor;

  public static final String SERIALIZED_NAME_SCHEDULED_REMIND_PRIOR = "scheduled_remind_prior";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_REMIND_PRIOR)
  private Boolean scheduledRemindPrior;

  public static final String SERIALIZED_NAME_SCHEDULED_REMINDED_AT = "scheduled_reminded_at";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_REMINDED_AT)
  private OffsetDateTime scheduledRemindedAt;

  public static final String SERIALIZED_NAME_SCHEDULED_UNTIL = "scheduled_until";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_UNTIL)
  private OffsetDateTime scheduledUntil;

  public static final String SERIALIZED_NAME_SHORTLINK = "shortlink";
  @SerializedName(SERIALIZED_NAME_SHORTLINK)
  private String shortlink;

  /**
   * The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    INVESTIGATING("investigating"),
    
    IDENTIFIED("identified"),
    
    MONITORING("monitoring"),
    
    RESOLVED("resolved"),
    
    SCHEDULED("scheduled"),
    
    IN_PROGRESS("in_progress"),
    
    VERIFYING("verifying"),
    
    COMPLETED("completed");

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

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public Incident id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Incident Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8wy5pb4l2ndh", value = "Incident Identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Incident components(List<Component> components) {
    
    this.components = components;
    return this;
  }

  public Incident addComponentsItem(Component componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<Component>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Incident components
   * @return components
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Incident components")

  public List<Component> getComponents() {
    return components;
  }


  public void setComponents(List<Component> components) {
    this.components = components;
  }


  public Incident createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The timestamp when the incident was created at.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the incident was created at.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Incident impact(String impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * The impact of the incident.
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "critical", value = "The impact of the incident.")

  public String getImpact() {
    return impact;
  }


  public void setImpact(String impact) {
    this.impact = impact;
  }


  public Incident impactOverride(String impactOverride) {
    
    this.impactOverride = impactOverride;
    return this;
  }

   /**
   * value to override calculated impact value
   * @return impactOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "minor", value = "value to override calculated impact value")

  public String getImpactOverride() {
    return impactOverride;
  }


  public void setImpactOverride(String impactOverride) {
    this.impactOverride = impactOverride;
  }


  public Incident incidentUpdates(List<IncidentUpdate> incidentUpdates) {
    
    this.incidentUpdates = incidentUpdates;
    return this;
  }

  public Incident addIncidentUpdatesItem(IncidentUpdate incidentUpdatesItem) {
    if (this.incidentUpdates == null) {
      this.incidentUpdates = new ArrayList<IncidentUpdate>();
    }
    this.incidentUpdates.add(incidentUpdatesItem);
    return this;
  }

   /**
   * The incident updates for incident.
   * @return incidentUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The incident updates for incident.")

  public List<IncidentUpdate> getIncidentUpdates() {
    return incidentUpdates;
  }


  public void setIncidentUpdates(List<IncidentUpdate> incidentUpdates) {
    this.incidentUpdates = incidentUpdates;
  }


  public Incident metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata attached to the incident. Top level values must be objects.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"jira\":{\"issue_id\":\"value\"}}", value = "Metadata attached to the incident. Top level values must be objects.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public Incident monitoringAt(OffsetDateTime monitoringAt) {
    
    this.monitoringAt = monitoringAt;
    return this;
  }

   /**
   * The timestamp when incident entered monitoring state.
   * @return monitoringAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when incident entered monitoring state.")

  public OffsetDateTime getMonitoringAt() {
    return monitoringAt;
  }


  public void setMonitoringAt(OffsetDateTime monitoringAt) {
    this.monitoringAt = monitoringAt;
  }


  public Incident name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Incident Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Data Layer Migration", value = "Incident Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Incident pageId(String pageId) {
    
    this.pageId = pageId;
    return this;
  }

   /**
   * Incident Page Identifier
   * @return pageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Incident Page Identifier")

  public String getPageId() {
    return pageId;
  }


  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  public Incident postmortemBody(String postmortemBody) {
    
    this.postmortemBody = postmortemBody;
    return this;
  }

   /**
   * Body of the Postmortem.
   * @return postmortemBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "##### Issue At approximately 17:02 UTC on 2013-04-21, our master database server unexpectedly went unresponsive to all network. A reboot of the machine at 17:05 UTC resulted in a failed mount of a corrupted EBS volume, and we made the decision at that time to fail over the slave database.  ##### Resolution At 17:12 UTC, the slave database had been successfully promoted to master and the application recovered enough to accept web traffic again. A new slave database node was created and placed into the rotation to guard against future master failures. The promoted slave database performed slowly for the next couple of hours as the query cache began to warm up, and eventually settled into a reasonable performance profile around 20:00 UTC.  ##### Future Mitigation Plans Over the past few months, we have been working on an overhaul to our data storage layer with a migration from a Postgres setup to a distributed, fault-tolerant, multi-region data layer using Riak. This initiative has been prioritized, and the migration will be performed in the coming weeks. We will notify our clients of the scheduled downtime via an incident on this status site, and via a blog post. ", value = "Body of the Postmortem.")

  public String getPostmortemBody() {
    return postmortemBody;
  }


  public void setPostmortemBody(String postmortemBody) {
    this.postmortemBody = postmortemBody;
  }


  public Incident postmortemBodyLastUpdatedAt(OffsetDateTime postmortemBodyLastUpdatedAt) {
    
    this.postmortemBodyLastUpdatedAt = postmortemBodyLastUpdatedAt;
    return this;
  }

   /**
   * The timestamp when the incident postmortem body was last updated at.
   * @return postmortemBodyLastUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the incident postmortem body was last updated at.")

  public OffsetDateTime getPostmortemBodyLastUpdatedAt() {
    return postmortemBodyLastUpdatedAt;
  }


  public void setPostmortemBodyLastUpdatedAt(OffsetDateTime postmortemBodyLastUpdatedAt) {
    this.postmortemBodyLastUpdatedAt = postmortemBodyLastUpdatedAt;
  }


  public Incident postmortemIgnored(Boolean postmortemIgnored) {
    
    this.postmortemIgnored = postmortemIgnored;
    return this;
  }

   /**
   * Controls whether the incident will have postmortem.
   * @return postmortemIgnored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether the incident will have postmortem.")

  public Boolean getPostmortemIgnored() {
    return postmortemIgnored;
  }


  public void setPostmortemIgnored(Boolean postmortemIgnored) {
    this.postmortemIgnored = postmortemIgnored;
  }


  public Incident postmortemNotifiedSubscribers(Boolean postmortemNotifiedSubscribers) {
    
    this.postmortemNotifiedSubscribers = postmortemNotifiedSubscribers;
    return this;
  }

   /**
   * Indicates whether subscribers are already notificed about postmortem.
   * @return postmortemNotifiedSubscribers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether subscribers are already notificed about postmortem.")

  public Boolean getPostmortemNotifiedSubscribers() {
    return postmortemNotifiedSubscribers;
  }


  public void setPostmortemNotifiedSubscribers(Boolean postmortemNotifiedSubscribers) {
    this.postmortemNotifiedSubscribers = postmortemNotifiedSubscribers;
  }


  public Incident postmortemNotifiedTwitter(Boolean postmortemNotifiedTwitter) {
    
    this.postmortemNotifiedTwitter = postmortemNotifiedTwitter;
    return this;
  }

   /**
   * Controls whether to decide if notify postmortem on twitter.
   * @return postmortemNotifiedTwitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether to decide if notify postmortem on twitter.")

  public Boolean getPostmortemNotifiedTwitter() {
    return postmortemNotifiedTwitter;
  }


  public void setPostmortemNotifiedTwitter(Boolean postmortemNotifiedTwitter) {
    this.postmortemNotifiedTwitter = postmortemNotifiedTwitter;
  }


  public Incident postmortemPublishedAt(Boolean postmortemPublishedAt) {
    
    this.postmortemPublishedAt = postmortemPublishedAt;
    return this;
  }

   /**
   * The timestamp when the postmortem was published.
   * @return postmortemPublishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the postmortem was published.")

  public Boolean getPostmortemPublishedAt() {
    return postmortemPublishedAt;
  }


  public void setPostmortemPublishedAt(Boolean postmortemPublishedAt) {
    this.postmortemPublishedAt = postmortemPublishedAt;
  }


  public Incident resolvedAt(OffsetDateTime resolvedAt) {
    
    this.resolvedAt = resolvedAt;
    return this;
  }

   /**
   * The timestamp when incident was resolved.
   * @return resolvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when incident was resolved.")

  public OffsetDateTime getResolvedAt() {
    return resolvedAt;
  }


  public void setResolvedAt(OffsetDateTime resolvedAt) {
    this.resolvedAt = resolvedAt;
  }


  public Incident scheduledAutoCompleted(Boolean scheduledAutoCompleted) {
    
    this.scheduledAutoCompleted = scheduledAutoCompleted;
    return this;
  }

   /**
   * Controls whether the incident is scheduled to automatically change to complete.
   * @return scheduledAutoCompleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether the incident is scheduled to automatically change to complete.")

  public Boolean getScheduledAutoCompleted() {
    return scheduledAutoCompleted;
  }


  public void setScheduledAutoCompleted(Boolean scheduledAutoCompleted) {
    this.scheduledAutoCompleted = scheduledAutoCompleted;
  }


  public Incident scheduledAutoInProgress(Boolean scheduledAutoInProgress) {
    
    this.scheduledAutoInProgress = scheduledAutoInProgress;
    return this;
  }

   /**
   * Controls whether the incident is scheduled to automatically change to in progress.
   * @return scheduledAutoInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether the incident is scheduled to automatically change to in progress.")

  public Boolean getScheduledAutoInProgress() {
    return scheduledAutoInProgress;
  }


  public void setScheduledAutoInProgress(Boolean scheduledAutoInProgress) {
    this.scheduledAutoInProgress = scheduledAutoInProgress;
  }


  public Incident scheduledFor(OffsetDateTime scheduledFor) {
    
    this.scheduledFor = scheduledFor;
    return this;
  }

   /**
   * The timestamp the incident is scheduled for.
   * @return scheduledFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-05-07T03:00:00.007Z", value = "The timestamp the incident is scheduled for.")

  public OffsetDateTime getScheduledFor() {
    return scheduledFor;
  }


  public void setScheduledFor(OffsetDateTime scheduledFor) {
    this.scheduledFor = scheduledFor;
  }


  public Incident scheduledRemindPrior(Boolean scheduledRemindPrior) {
    
    this.scheduledRemindPrior = scheduledRemindPrior;
    return this;
  }

   /**
   * Controls whether to remind subscribers prior to scheduled incidents.
   * @return scheduledRemindPrior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether to remind subscribers prior to scheduled incidents.")

  public Boolean getScheduledRemindPrior() {
    return scheduledRemindPrior;
  }


  public void setScheduledRemindPrior(Boolean scheduledRemindPrior) {
    this.scheduledRemindPrior = scheduledRemindPrior;
  }


  public Incident scheduledRemindedAt(OffsetDateTime scheduledRemindedAt) {
    
    this.scheduledRemindedAt = scheduledRemindedAt;
    return this;
  }

   /**
   * The timestamp when the scheduled incident reminder was sent at.
   * @return scheduledRemindedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the scheduled incident reminder was sent at.")

  public OffsetDateTime getScheduledRemindedAt() {
    return scheduledRemindedAt;
  }


  public void setScheduledRemindedAt(OffsetDateTime scheduledRemindedAt) {
    this.scheduledRemindedAt = scheduledRemindedAt;
  }


  public Incident scheduledUntil(OffsetDateTime scheduledUntil) {
    
    this.scheduledUntil = scheduledUntil;
    return this;
  }

   /**
   * The timestamp the incident is scheduled until.
   * @return scheduledUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-05-07T06:00:00.007Z", value = "The timestamp the incident is scheduled until.")

  public OffsetDateTime getScheduledUntil() {
    return scheduledUntil;
  }


  public void setScheduledUntil(OffsetDateTime scheduledUntil) {
    this.scheduledUntil = scheduledUntil;
  }


  public Incident shortlink(String shortlink) {
    
    this.shortlink = shortlink;
    return this;
  }

   /**
   * Incident Shortlink.
   * @return shortlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://stspg.io/803310a12", value = "Incident Shortlink.")

  public String getShortlink() {
    return shortlink;
  }


  public void setShortlink(String shortlink) {
    this.shortlink = shortlink;
  }


  public Incident status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "scheduled", value = "The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Incident updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The timestamp when the incident was updated at.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the incident was updated at.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(this.id, incident.id) &&
        Objects.equals(this.components, incident.components) &&
        Objects.equals(this.createdAt, incident.createdAt) &&
        Objects.equals(this.impact, incident.impact) &&
        Objects.equals(this.impactOverride, incident.impactOverride) &&
        Objects.equals(this.incidentUpdates, incident.incidentUpdates) &&
        Objects.equals(this.metadata, incident.metadata) &&
        Objects.equals(this.monitoringAt, incident.monitoringAt) &&
        Objects.equals(this.name, incident.name) &&
        Objects.equals(this.pageId, incident.pageId) &&
        Objects.equals(this.postmortemBody, incident.postmortemBody) &&
        Objects.equals(this.postmortemBodyLastUpdatedAt, incident.postmortemBodyLastUpdatedAt) &&
        Objects.equals(this.postmortemIgnored, incident.postmortemIgnored) &&
        Objects.equals(this.postmortemNotifiedSubscribers, incident.postmortemNotifiedSubscribers) &&
        Objects.equals(this.postmortemNotifiedTwitter, incident.postmortemNotifiedTwitter) &&
        Objects.equals(this.postmortemPublishedAt, incident.postmortemPublishedAt) &&
        Objects.equals(this.resolvedAt, incident.resolvedAt) &&
        Objects.equals(this.scheduledAutoCompleted, incident.scheduledAutoCompleted) &&
        Objects.equals(this.scheduledAutoInProgress, incident.scheduledAutoInProgress) &&
        Objects.equals(this.scheduledFor, incident.scheduledFor) &&
        Objects.equals(this.scheduledRemindPrior, incident.scheduledRemindPrior) &&
        Objects.equals(this.scheduledRemindedAt, incident.scheduledRemindedAt) &&
        Objects.equals(this.scheduledUntil, incident.scheduledUntil) &&
        Objects.equals(this.shortlink, incident.shortlink) &&
        Objects.equals(this.status, incident.status) &&
        Objects.equals(this.updatedAt, incident.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, components, createdAt, impact, impactOverride, incidentUpdates, metadata, monitoringAt, name, pageId, postmortemBody, postmortemBodyLastUpdatedAt, postmortemIgnored, postmortemNotifiedSubscribers, postmortemNotifiedTwitter, postmortemPublishedAt, resolvedAt, scheduledAutoCompleted, scheduledAutoInProgress, scheduledFor, scheduledRemindPrior, scheduledRemindedAt, scheduledUntil, shortlink, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incident {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    impactOverride: ").append(toIndentedString(impactOverride)).append("\n");
    sb.append("    incidentUpdates: ").append(toIndentedString(incidentUpdates)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monitoringAt: ").append(toIndentedString(monitoringAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    postmortemBody: ").append(toIndentedString(postmortemBody)).append("\n");
    sb.append("    postmortemBodyLastUpdatedAt: ").append(toIndentedString(postmortemBodyLastUpdatedAt)).append("\n");
    sb.append("    postmortemIgnored: ").append(toIndentedString(postmortemIgnored)).append("\n");
    sb.append("    postmortemNotifiedSubscribers: ").append(toIndentedString(postmortemNotifiedSubscribers)).append("\n");
    sb.append("    postmortemNotifiedTwitter: ").append(toIndentedString(postmortemNotifiedTwitter)).append("\n");
    sb.append("    postmortemPublishedAt: ").append(toIndentedString(postmortemPublishedAt)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    scheduledAutoCompleted: ").append(toIndentedString(scheduledAutoCompleted)).append("\n");
    sb.append("    scheduledAutoInProgress: ").append(toIndentedString(scheduledAutoInProgress)).append("\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
    sb.append("    scheduledRemindPrior: ").append(toIndentedString(scheduledRemindPrior)).append("\n");
    sb.append("    scheduledRemindedAt: ").append(toIndentedString(scheduledRemindedAt)).append("\n");
    sb.append("    scheduledUntil: ").append(toIndentedString(scheduledUntil)).append("\n");
    sb.append("    shortlink: ").append(toIndentedString(shortlink)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

