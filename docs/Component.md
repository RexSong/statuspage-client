

# Component

Add page access groups to a component

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier for component |  [optional]
**pageId** | **String** | Page identifier |  [optional]
**groupId** | **String** | Component Group identifier |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]
**group** | **Boolean** | Is this component a group |  [optional]
**name** | **String** | Display name for component |  [optional]
**description** | **String** | More detailed description for component |  [optional]
**position** | **Integer** | Order the component will appear on the page |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of component |  [optional]
**showcase** | **Boolean** | Should this component be showcased |  [optional]
**onlyShowIfDegraded** | **Boolean** | Requires a special feature flag to be enabled |  [optional]
**automationEmail** | **String** | Requires a special feature flag to be enabled |  [optional]
**startDate** | **LocalDate** | The date this component started being used |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
OPERATIONAL | &quot;operational&quot;
UNDER_MAINTENANCE | &quot;under_maintenance&quot;
DEGRADED_PERFORMANCE | &quot;degraded_performance&quot;
PARTIAL_OUTAGE | &quot;partial_outage&quot;
MAJOR_OUTAGE | &quot;major_outage&quot;
EMPTY | &quot;&quot;



