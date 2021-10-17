

# ComponentGroupUptime

Get uptime data for a component group that has uptime showcase enabled for at least one component.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rangeStart** | **OffsetDateTime** | Start date used for uptime calculation (see the warnings field in the response if this value does not match the start parameter you provided). |  [optional]
**rangeEnd** | **OffsetDateTime** | End date used for uptime calculation (see the warnings field in the response if this value does not match the end parameter you provided). |  [optional]
**uptimePercentage** | **Float** | Uptime percentage for a component |  [optional]
**majorOutage** | **Integer** | Seconds of major outage |  [optional]
**partialOutage** | **Integer** | Seconds of partial outage |  [optional]
**warnings** | **String** | Warning messages related to the uptime query that may occur |  [optional]
**id** | **String** | Component group identifier |  [optional]
**name** | **String** | Component group display name |  [optional]
**relatedEvents** | [**ComponentGroupUptimeRelatedEvents**](ComponentGroupUptimeRelatedEvents.md) |  |  [optional]



