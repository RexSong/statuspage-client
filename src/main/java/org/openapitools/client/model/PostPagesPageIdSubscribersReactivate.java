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

/**
 * Reactivate a list of quarantined subscribers
 */
@ApiModel(description = "Reactivate a list of quarantined subscribers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PostPagesPageIdSubscribersReactivate {
  public static final String SERIALIZED_NAME_SUBSCRIBERS = "subscribers";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBERS)
  private String subscribers;

  /**
   * If this is present, only reactivate subscribers of this type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EMAIL("email"),
    
    SMS("sms"),
    
    SLACK("slack"),
    
    WEBHOOK("webhook"),
    
    INTEGRATION_PARTNER("integration_partner");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public PostPagesPageIdSubscribersReactivate subscribers(String subscribers) {
    
    this.subscribers = subscribers;
    return this;
  }

   /**
   * The array of quarantined subscriber codes to reactivate, or \&quot;all\&quot; to reactivate all quarantined subscribers.
   * @return subscribers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The array of quarantined subscriber codes to reactivate, or \"all\" to reactivate all quarantined subscribers.")

  public String getSubscribers() {
    return subscribers;
  }


  public void setSubscribers(String subscribers) {
    this.subscribers = subscribers;
  }


  public PostPagesPageIdSubscribersReactivate type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * If this is present, only reactivate subscribers of this type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this is present, only reactivate subscribers of this type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPagesPageIdSubscribersReactivate postPagesPageIdSubscribersReactivate = (PostPagesPageIdSubscribersReactivate) o;
    return Objects.equals(this.subscribers, postPagesPageIdSubscribersReactivate.subscribers) &&
        Objects.equals(this.type, postPagesPageIdSubscribersReactivate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscribers, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPagesPageIdSubscribersReactivate {\n");
    sb.append("    subscribers: ").append(toIndentedString(subscribers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
