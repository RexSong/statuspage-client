/*
 * Statuspage API
 * # Code of Conduct Please don't abuse the API, and please report all feature requests and issues to https://support.atlassian.com/contact  # Rate Limiting Each API token is limited to 1 request / second as measured on a 60 second rolling window. To get this limit increased, please contact us at https://support.atlassian.com/contact  # Basics  ## HTTPS It's required  ## URL Prefix In order to maintain version integrity into the future, the API is versioned. All calls currently begin with the following prefix:    https://api.statuspage.io/v1/  ## RESTful Interface Wherever possible, the API seeks to implement repeatable patterns with logical, representative URLs and descriptive HTTP verbs. Below are some examples and conventions you will see throughout the documentation.  * Collections are buckets: https://api.statuspage.io/v1/pages/asdf123/incidents.json * Elements have unique IDs: https://api.statuspage.io/v1/pages/asdf123/incidents/jklm456.json * GET will retrieve information about a collection/element * POST will create an element in a collection * PATCH will update a single element * PUT will replace a single element in a collection (rarely used) * DELETE will destroy a single element  ## Sending Data Information can be sent in the body as form urlencoded or JSON, but make sure the Content-Type header matches the body structure or the server gremlins will be angry.  All examples are provided in JSON format, however they can easily be converted to form encoding if required.  Some examples of how to convert things are below:      // JSON     {       \"incident\": {         \"name\": \"test incident\",         \"components\": [\"8kbf7d35c070\", \"vtnh60py4yd7\"]       }     }      // Form Encoded (using curl as an example):     curl -X POST https://api.statuspage.io/v1/example \\       -d \"incident[name]=test incident\" \\       -d \"incident[components][]=8kbf7d35c070\" \\       -d \"incident[components][]=vtnh60py4yd7\"  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.PostPagesPageIdComponentGroupsComponentGroup;

/**
 * Update a component group
 */
@ApiModel(description = "Update a component group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PutPagesPageIdComponentGroups {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COMPONENT_GROUP = "component_group";
  @SerializedName(SERIALIZED_NAME_COMPONENT_GROUP)
  private PostPagesPageIdComponentGroupsComponentGroup componentGroup;


  public PutPagesPageIdComponentGroups description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Updated description of the component group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated description of the component group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PutPagesPageIdComponentGroups componentGroup(PostPagesPageIdComponentGroupsComponentGroup componentGroup) {
    
    this.componentGroup = componentGroup;
    return this;
  }

   /**
   * Get componentGroup
   * @return componentGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostPagesPageIdComponentGroupsComponentGroup getComponentGroup() {
    return componentGroup;
  }


  public void setComponentGroup(PostPagesPageIdComponentGroupsComponentGroup componentGroup) {
    this.componentGroup = componentGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutPagesPageIdComponentGroups putPagesPageIdComponentGroups = (PutPagesPageIdComponentGroups) o;
    return Objects.equals(this.description, putPagesPageIdComponentGroups.description) &&
        Objects.equals(this.componentGroup, putPagesPageIdComponentGroups.componentGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, componentGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutPagesPageIdComponentGroups {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

