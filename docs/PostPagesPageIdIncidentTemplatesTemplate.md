

# PostPagesPageIdIncidentTemplatesTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the template, as shown in the list on the \&quot;Templates\&quot; tab of the \&quot;Incidents\&quot; page | 
**title** | **String** | Title to be applied to the incident or maintenance when selecting this template | 
**body** | **String** | The initial message, created as the first incident or maintenance update. | 
**groupId** | **String** | Identifier of Template Group this template belongs to |  [optional]
**updateStatus** | [**UpdateStatusEnum**](#UpdateStatusEnum) | The status the incident or maintenance should transition to when selecting this template |  [optional]
**shouldTweet** | **Boolean** | Whether the \&quot;tweet update\&quot; checkbox should be selected when selecting this template |  [optional]
**shouldSendNotifications** | **Boolean** | Whether the \&quot;deliver notifications\&quot; checkbox should be selected when selecting this template |  [optional]
**componentIds** | **List&lt;String&gt;** | List of component_ids affected by this incident |  [optional]



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



