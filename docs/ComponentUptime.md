

# ComponentUptime

Get uptime data for a component that has uptime showcase enabled

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rangeStart** | **OffsetDateTime** | Start date used for uptime calculation (see the warnings field in the response if this value does not match the start parameter you provided). |  [optional]
**rangeEnd** | **OffsetDateTime** | End date used for uptime calculation (see the warnings field in the response if this value does not match the end parameter you provided). |  [optional]
**uptimePercentage** | **Float** | Uptime percentage for a component |  [optional]
**majorOutage** | **Integer** | Seconds of major outage |  [optional]
**partialOutage** | **Integer** | Seconds of partial outage |  [optional]
**warnings** | **String** | Warning messages related to the uptime query that may occur |  [optional]
**id** | **String** | Component identifier |  [optional]
**name** | **String** | Component display name |  [optional]
**relatedEvents** | [**ComponentUptimeRelatedEvents**](ComponentUptimeRelatedEvents.md) |  |  [optional]



