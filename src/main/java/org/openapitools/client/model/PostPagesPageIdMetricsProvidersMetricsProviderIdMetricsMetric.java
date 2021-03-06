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
 * PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-18T19:24:20.728733+08:00[Asia/Shanghai]")
public class PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METRIC_IDENTIFIER = "metric_identifier";
  @SerializedName(SERIALIZED_NAME_METRIC_IDENTIFIER)
  private String metricIdentifier;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private String transform;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;

  public static final String SERIALIZED_NAME_Y_AXIS_MIN = "y_axis_min";
  @SerializedName(SERIALIZED_NAME_Y_AXIS_MIN)
  private Integer yAxisMin;

  public static final String SERIALIZED_NAME_Y_AXIS_MAX = "y_axis_max";
  @SerializedName(SERIALIZED_NAME_Y_AXIS_MAX)
  private Integer yAxisMax;

  public static final String SERIALIZED_NAME_Y_AXIS_HIDDEN = "y_axis_hidden";
  @SerializedName(SERIALIZED_NAME_Y_AXIS_HIDDEN)
  private Boolean yAxisHidden;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private Boolean display;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimal_places";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_TOOLTIP_DESCRIPTION = "tooltip_description";
  @SerializedName(SERIALIZED_NAME_TOOLTIP_DESCRIPTION)
  private String tooltipDescription;


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of metric
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of metric")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric metricIdentifier(String metricIdentifier) {
    
    this.metricIdentifier = metricIdentifier;
    return this;
  }

   /**
   * The identifier used to look up the metric data from the provider
   * @return metricIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier used to look up the metric data from the provider")

  public String getMetricIdentifier() {
    return metricIdentifier;
  }


  public void setMetricIdentifier(String metricIdentifier) {
    this.metricIdentifier = metricIdentifier;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric transform(String transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * The transform to apply to metric before pulling into Statuspage. One of: \&quot;average\&quot;, \&quot;count\&quot;, \&quot;max\&quot;, \&quot;min\&quot;, or \&quot;sum\&quot;
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transform to apply to metric before pulling into Statuspage. One of: \"average\", \"count\", \"max\", \"min\", or \"sum\"")

  public String getTransform() {
    return transform;
  }


  public void setTransform(String transform) {
    this.transform = transform;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix to describe the units on the graph
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suffix to describe the units on the graph")

  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric yAxisMin(Integer yAxisMin) {
    
    this.yAxisMin = yAxisMin;
    return this;
  }

   /**
   * The lower bound of the y axis
   * @return yAxisMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The lower bound of the y axis")

  public Integer getyAxisMin() {
    return yAxisMin;
  }


  public void setyAxisMin(Integer yAxisMin) {
    this.yAxisMin = yAxisMin;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric yAxisMax(Integer yAxisMax) {
    
    this.yAxisMax = yAxisMax;
    return this;
  }

   /**
   * The upper bound of the y axis
   * @return yAxisMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The upper bound of the y axis")

  public Integer getyAxisMax() {
    return yAxisMax;
  }


  public void setyAxisMax(Integer yAxisMax) {
    this.yAxisMax = yAxisMax;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric yAxisHidden(Boolean yAxisHidden) {
    
    this.yAxisHidden = yAxisHidden;
    return this;
  }

   /**
   * Should the values on the y axis be hidden on render
   * @return yAxisHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should the values on the y axis be hidden on render")

  public Boolean getyAxisHidden() {
    return yAxisHidden;
  }


  public void setyAxisHidden(Boolean yAxisHidden) {
    this.yAxisHidden = yAxisHidden;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric display(Boolean display) {
    
    this.display = display;
    return this;
  }

   /**
   * Should the metric be displayed
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should the metric be displayed")

  public Boolean getDisplay() {
    return display;
  }


  public void setDisplay(Boolean display) {
    this.display = display;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * How many decimal places to render on the graph
   * @return decimalPlaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many decimal places to render on the graph")

  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric tooltipDescription(String tooltipDescription) {
    
    this.tooltipDescription = tooltipDescription;
    return this;
  }

   /**
   * Get tooltipDescription
   * @return tooltipDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTooltipDescription() {
    return tooltipDescription;
  }


  public void setTooltipDescription(String tooltipDescription) {
    this.tooltipDescription = tooltipDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric = (PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric) o;
    return Objects.equals(this.name, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.name) &&
        Objects.equals(this.metricIdentifier, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.metricIdentifier) &&
        Objects.equals(this.transform, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.transform) &&
        Objects.equals(this.suffix, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.suffix) &&
        Objects.equals(this.yAxisMin, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.yAxisMin) &&
        Objects.equals(this.yAxisMax, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.yAxisMax) &&
        Objects.equals(this.yAxisHidden, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.yAxisHidden) &&
        Objects.equals(this.display, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.display) &&
        Objects.equals(this.decimalPlaces, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.decimalPlaces) &&
        Objects.equals(this.tooltipDescription, postPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric.tooltipDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metricIdentifier, transform, suffix, yAxisMin, yAxisMax, yAxisHidden, display, decimalPlaces, tooltipDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPagesPageIdMetricsProvidersMetricsProviderIdMetricsMetric {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metricIdentifier: ").append(toIndentedString(metricIdentifier)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    yAxisMin: ").append(toIndentedString(yAxisMin)).append("\n");
    sb.append("    yAxisMax: ").append(toIndentedString(yAxisMax)).append("\n");
    sb.append("    yAxisHidden: ").append(toIndentedString(yAxisHidden)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    tooltipDescription: ").append(toIndentedString(tooltipDescription)).append("\n");
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

