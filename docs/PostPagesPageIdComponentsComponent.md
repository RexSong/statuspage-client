

# PostPagesPageIdComponentsComponent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | More detailed description for component |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of component |  [optional]
**name** | **String** | Display name for component |  [optional]
**onlyShowIfDegraded** | **Boolean** | Requires a special feature flag to be enabled |  [optional]
**groupId** | **String** | Component Group identifier |  [optional]
**showcase** | **Boolean** | Should this component be showcased |  [optional]
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



