

# PostPagesPageIdIncidentsIncident


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Incident Name | 
**status** | [**StatusEnum**](#StatusEnum) | The incident status. For realtime incidents, valid values are investigating, identified, monitoring, and resolved. For scheduled incidents, valid values are scheduled, in_progress, verifying, and completed. |  [optional]
**impactOverride** | [**ImpactOverrideEnum**](#ImpactOverrideEnum) | value to override calculated impact value |  [optional]
**scheduledFor** | **OffsetDateTime** | The timestamp the incident is scheduled for. |  [optional]
**scheduledUntil** | **OffsetDateTime** | The timestamp the incident is scheduled until. |  [optional]
**scheduledRemindPrior** | **Boolean** | Controls whether to remind subscribers prior to scheduled incidents. |  [optional]
**scheduledAutoInProgress** | **Boolean** | Controls whether the incident is scheduled to automatically change to in progress. |  [optional]
**scheduledAutoCompleted** | **Boolean** | Controls whether the incident is scheduled to automatically change to complete. |  [optional]
**metadata** | **Object** | Attach a json object to the incident. All top-level values in the object must also be objects. |  [optional]
**deliverNotifications** | **Boolean** | Deliver notifications to subscribers if this is true. If this is false, create an incident without notifying customers. |  [optional]
**autoTransitionDeliverNotificationsAtEnd** | **Boolean** | Controls whether send notification when scheduled maintenances auto transition to completed. |  [optional]
**autoTransitionDeliverNotificationsAtStart** | **Boolean** | Controls whether send notification when scheduled maintenances auto transition to started. |  [optional]
**autoTransitionToMaintenanceState** | **Boolean** | Controls whether change components status to under_maintenance once scheduled maintenance is in progress. |  [optional]
**autoTransitionToOperationalState** | **Boolean** | Controls whether change components status to operational once scheduled maintenance completes. |  [optional]
**autoTweetAtBeginning** | **Boolean** | Controls whether tweet automatically when scheduled maintenance starts. |  [optional]
**autoTweetOnCompletion** | **Boolean** | Controls whether tweet automatically when scheduled maintenance completes. |  [optional]
**autoTweetOnCreation** | **Boolean** | Controls whether tweet automatically when scheduled maintenance is created. |  [optional]
**autoTweetOneHourBefore** | **Boolean** | Controls whether tweet automatically one hour before scheduled maintenance starts. |  [optional]
**backfillDate** | **String** | TimeStamp when incident was backfilled. |  [optional]
**backfilled** | **Boolean** | Controls whether incident is backfilled. If true, components cannot be specified. |  [optional]
**body** | **String** | The initial message, created as the first incident update. |  [optional]
**components** | **Map&lt;String, String&gt;** | Map of status changes to apply to affected components |  [optional]
**componentIds** | **List&lt;String&gt;** | List of component_ids affected by this incident |  [optional]
**scheduledAutoTransition** | **Boolean** | Same as :scheduled_auto_transition_in_progress. Controls whether the incident is scheduled to automatically change to in progress. |  [optional]



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



## Enum: ImpactOverrideEnum

Name | Value
---- | -----
MAINTENANCE | &quot;maintenance&quot;
NONE | &quot;none&quot;
CRITICAL | &quot;critical&quot;
MAJOR | &quot;major&quot;
MINOR | &quot;minor&quot;



