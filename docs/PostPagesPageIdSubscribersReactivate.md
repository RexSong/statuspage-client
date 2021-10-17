

# PostPagesPageIdSubscribersReactivate

Reactivate a list of quarantined subscribers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscribers** | **String** | The array of quarantined subscriber codes to reactivate, or \&quot;all\&quot; to reactivate all quarantined subscribers. | 
**type** | [**TypeEnum**](#TypeEnum) | If this is present, only reactivate subscribers of this type. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
SMS | &quot;sms&quot;
SLACK | &quot;slack&quot;
WEBHOOK | &quot;webhook&quot;
INTEGRATION_PARTNER | &quot;integration_partner&quot;



