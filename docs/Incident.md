

# Incident

Get an incident

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Incident Identifier |  [optional]
**components** | [**List&lt;Component&gt;**](Component.md) | Incident components |  [optional]
**createdAt** | **OffsetDateTime** | The timestamp when the incident was created at. |  [optional]
**impact** | **String** | The impact of the incident. |  [optional]
**impactOverride** | **String** | value to override calculated impact value |  [optional]
**incidentUpdates** | [**List&lt;IncidentUpdate&gt;**](IncidentUpdate.md) | The incident updates for incident. |  [optional]
**metadata** | **Object** | Metadata attached to the incident. Top level values must be objects. |  [optional]
**monitoringAt** | **OffsetDateTime** | The timestamp when incident entered monitoring state. |  [optional]
**name** | **String** | Incident Name |  [optional]
**pageId** | **String** | Incident Page Identifier |  [optional]
**postmortemBody** | **String** | Body of the Postmortem. |  [optional]
**postmortemBodyLastUpdatedAt** | **OffsetDateTime** | The timestamp when the incident postmortem body was last updated at. |  [optional]
**postmortemIgnored** | **Boolean** | Controls whether the incident will have postmortem. |  [optional]
**postmortemNotifiedSubscribers** | **Boolean** | Indicates whether subscribers are already notificed about postmortem. |  [optional]
**postmortemNotifiedTwitter** | **Boolean** | Controls whether to decide if notify postmortem on twitter. |  [optional]
**postmortemPublishedAt** | **Boolean** | The timestamp when the postmortem was published. |  [optional]
**resolvedAt** | **OffsetDateTime** | The timestamp when incident was resolved. |  [optional]
**scheduledAutoCompleted** | **Boolean** | Controls whether the incident is scheduled to automatically change to complete. |  [optional]
**scheduledAutoInProgress** | **Boolean** | Controls whether the incident is scheduled to automatically change to in progress. |  [optional]
**scheduledFor** | **OffsetDateTime** | The timestamp the incident is scheduled for. |  [optional]
**scheduledRemindPrior** | **Boolean** | Controls whether to remind subscribers prior to scheduled incidents. |  [optional]
**scheduledRemindedAt** | **OffsetDateTime** | The timestamp when the scheduled incident reminder was sent at. |  [optional]
**scheduledUntil** | **OffsetDateTime** | The timestamp the incident is scheduled until. |  [optional]
**shortlink** | **String** | Incident Shortlink. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed. |  [optional]
**updatedAt** | **OffsetDateTime** | The timestamp when the incident was updated at. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
INVESTIGATING | &quot;investigating&quot;
IDENTIFIED | &quot;identified&quot;
MONITORING | &quot;monitoring&quot;
RESOLVED | &quot;resolved&quot;
SCHEDULED | &quot;scheduled&quot;
IN_PROGRESS | &quot;in_progress&quot;
VERIFYING | &quot;verifying&quot;
COMPLETED | &quot;completed&quot;



