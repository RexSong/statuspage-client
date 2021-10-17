

# PatchPagesPage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of your page to be displayed |  [optional]
**domain** | **String** | CNAME alias for your status page |  [optional]
**subdomain** | **String** | Subdomain at which to access your status page |  [optional]
**url** | **String** | Website of your page.  Clicking on your statuspage image will link here. |  [optional]
**branding** | [**BrandingEnum**](#BrandingEnum) | The main template your statuspage will use |  [optional]
**cssBodyBackgroundColor** | **String** | CSS Color |  [optional]
**cssFontColor** | **String** | CSS Color |  [optional]
**cssLightFontColor** | **String** | CSS Color |  [optional]
**cssGreens** | **String** | CSS Color |  [optional]
**cssYellows** | **String** | CSS Color |  [optional]
**cssOranges** | **String** | CSS Color |  [optional]
**cssReds** | **String** | CSS Color |  [optional]
**cssBlues** | **String** | CSS Color |  [optional]
**cssBorderColor** | **String** | CSS Color |  [optional]
**cssGraphColor** | **String** | CSS Color |  [optional]
**cssLinkColor** | **String** | CSS Color |  [optional]
**cssNoData** | **String** | CSS Color |  [optional]
**hiddenFromSearch** | **Boolean** | Should your page hide itself from search engines |  [optional]
**viewersMustBeTeamMembers** | **Boolean** |  |  [optional]
**allowPageSubscribers** | **Boolean** | Can your users subscribe to all notifications on the page |  [optional]
**allowIncidentSubscribers** | **Boolean** | Can your users subscribe to notifications for a single incident |  [optional]
**allowEmailSubscribers** | **Boolean** | Can your users choose to receive notifications via email |  [optional]
**allowSmsSubscribers** | **Boolean** | Can your users choose to receive notifications via SMS |  [optional]
**allowRssAtomFeeds** | **Boolean** | Can your users choose to access incident feeds via RSS/Atom (not functional on Audience-Specific pages) |  [optional]
**allowWebhookSubscribers** | **Boolean** | Can your users choose to receive notifications via Webhooks |  [optional]
**notificationsFromEmail** | **String** | Allows you to customize the email address your page notifications come from |  [optional]
**timeZone** | **String** | Timezone configured for your page |  [optional]
**notificationsEmailFooter** | **String** | Allows you to customize the footer appearing on your notification emails.  Accepts Markdown for formatting |  [optional]



## Enum: BrandingEnum

Name | Value
---- | -----
BASIC | &quot;basic&quot;
PREMIUM | &quot;premium&quot;



