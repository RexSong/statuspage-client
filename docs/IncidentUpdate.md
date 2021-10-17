

# IncidentUpdate

Update a previous incident update

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Incident Update Identifier. |  [optional]
**incidentId** | **String** | Incident Identifier. |  [optional]
**affectedComponents** | **List&lt;Object&gt;** | Affected components associated with the incident update. |  [optional]
**body** | **String** | Incident update body. |  [optional]
**createdAt** | **OffsetDateTime** | The timestamp when the incident update was created at. |  [optional]
**customTweet** | **String** | An optional customized tweet message for incident postmortem. |  [optional]
**deliverNotifications** | **Boolean** | Controls whether to delivery notifications. |  [optional]
**displayAt** | **OffsetDateTime** | Timestamp when incident update is happened. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed. |  [optional]
**tweetId** | **String** | Tweet identifier associated to this incident update. |  [optional]
**twitterUpdatedAt** | **OffsetDateTime** | The timestamp when twitter updated at. |  [optional]
**updatedAt** | **OffsetDateTime** | The timestamp when the incident update is updated. |  [optional]
**wantsTwitterUpdate** | **Boolean** | Controls whether to create twitter update. |  [optional]



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



