

# PostPagesPageIdSubscribersUnsubscribe

Unsubscribe a list of subscribers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscribers** | **String** | The array of subscriber codes to unsubscribe (limited to 100), or \&quot;all\&quot; to unsubscribe all subscribers if the number of subscribers is less than 100. | 
**type** | [**TypeEnum**](#TypeEnum) | If this is present, only unsubscribe subscribers of this type. |  [optional]
**state** | [**StateEnum**](#StateEnum) | If this is present, only unsubscribe subscribers in this state. Specify state \&quot;all\&quot; to unsubscribe subscribers in any states. |  [optional]
**skipUnsubscriptionNotification** | **Boolean** | If skip_unsubscription_notification is true, the subscribers do not receive any notifications when they are unsubscribed. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
SMS | &quot;sms&quot;
SLACK | &quot;slack&quot;
WEBHOOK | &quot;webhook&quot;
INTEGRATION_PARTNER | &quot;integration_partner&quot;



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
UNCONFIRMED | &quot;unconfirmed&quot;
QUARANTINED | &quot;quarantined&quot;
ALL | &quot;all&quot;



