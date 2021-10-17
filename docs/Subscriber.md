

# Subscriber

Get an incident subscriber

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Subscriber Identifier |  [optional]
**skipConfirmationNotification** | **Boolean** | If this is true, do not notify the user with changes to their subscription. |  [optional]
**mode** | **String** | The communication mode of the subscriber. |  [optional]
**email** | **String** | The email address to use to contact the subscriber. Used for Email and Webhook subscribers. |  [optional]
**endpoint** | **String** | The URL where a webhook subscriber elects to receive updates. |  [optional]
**phoneNumber** | **String** | The phone number used to contact an SMS subscriber |  [optional]
**phoneCountry** | **String** | The two-character country code representing the country of which the phone_number is a part. |  [optional]
**displayPhoneNumber** | **String** | A formatted version of the phone_number and phone_country pair, nicely formatted for display. |  [optional]
**obfuscatedChannelName** | **String** | Obfuscated slack channel name |  [optional]
**workspaceName** | **String** | The workspace name of the slack subscriber. |  [optional]
**quarantinedAt** | **OffsetDateTime** | The timestamp when the subscriber was quarantined due to an issue reaching them. |  [optional]
**purgeAt** | **OffsetDateTime** | The timestamp when a quarantined subscriber will be purged (unsubscribed). |  [optional]
**components** | **String** | The components for which the subscriber has elected to receive updates. |  [optional]
**pageAccessUserId** | **String** | The Page Access user this subscriber belongs to (only for audience-specific pages). |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]



