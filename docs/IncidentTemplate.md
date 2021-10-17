

# IncidentTemplate

Get a list of templates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Incident Template Identifier |  [optional]
**components** | [**List&lt;Component&gt;**](Component.md) | Affected components |  [optional]
**name** | **String** | Name of the template, as shown in the list on the \&quot;Templates\&quot; tab of the \&quot;Incidents\&quot; page |  [optional]
**title** | **String** | Title to be applied to the incident or maintenance when selecting this template |  [optional]
**body** | **String** | Body of the incident or maintenance update to be applied when selecting this template |  [optional]
**groupId** | **String** | Identifier of Template Group this template belongs to |  [optional]
**updateStatus** | [**UpdateStatusEnum**](#UpdateStatusEnum) | The status the incident or maintenance should transition to when selecting this template |  [optional]
**shouldTweet** | **Boolean** | Whether the \&quot;tweet update\&quot; checkbox should be selected when selecting this template |  [optional]
**shouldSendNotifications** | **Boolean** | Whether the \&quot;deliver notifications\&quot; checkbox should be selected when selecting this template |  [optional]



## Enum: UpdateStatusEnum

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



