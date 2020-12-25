/*
 * OpenDataDiscovery API Contract
 * OpenDataDiscovery API Contract
 *
 * The version of the OpenAPI document: 0.0.1
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
import org.openapitools.client.model.BinaryFieldStat;
import org.openapitools.client.model.BooleanFieldStat;
import org.openapitools.client.model.DateFieldStat;
import org.openapitools.client.model.DoubleFieldStat;
import org.openapitools.client.model.LongFieldStat;
import org.openapitools.client.model.StringFieldStat;

/**
 * DataSetFieldStat
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-25T17:26:01.976053+03:00[Europe/Moscow]")
public class DataSetFieldStat {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BOOLEAN_STATS = "booleanStats";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_STATS)
  private BooleanFieldStat booleanStats;

  public static final String SERIALIZED_NAME_LONG_STATS = "longStats";
  @SerializedName(SERIALIZED_NAME_LONG_STATS)
  private LongFieldStat longStats;

  public static final String SERIALIZED_NAME_DOUBLE_STATS = "doubleStats";
  @SerializedName(SERIALIZED_NAME_DOUBLE_STATS)
  private DoubleFieldStat doubleStats;

  public static final String SERIALIZED_NAME_STRING_STATS = "stringStats";
  @SerializedName(SERIALIZED_NAME_STRING_STATS)
  private StringFieldStat stringStats;

  public static final String SERIALIZED_NAME_BINARY_STATS = "binaryStats";
  @SerializedName(SERIALIZED_NAME_BINARY_STATS)
  private BinaryFieldStat binaryStats;

  public static final String SERIALIZED_NAME_DATE_STATS = "DateStats";
  @SerializedName(SERIALIZED_NAME_DATE_STATS)
  private DateFieldStat dateStats;


  public DataSetFieldStat name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DataSetFieldStat booleanStats(BooleanFieldStat booleanStats) {
    
    this.booleanStats = booleanStats;
    return this;
  }

   /**
   * Get booleanStats
   * @return booleanStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BooleanFieldStat getBooleanStats() {
    return booleanStats;
  }


  public void setBooleanStats(BooleanFieldStat booleanStats) {
    this.booleanStats = booleanStats;
  }


  public DataSetFieldStat longStats(LongFieldStat longStats) {
    
    this.longStats = longStats;
    return this;
  }

   /**
   * Get longStats
   * @return longStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LongFieldStat getLongStats() {
    return longStats;
  }


  public void setLongStats(LongFieldStat longStats) {
    this.longStats = longStats;
  }


  public DataSetFieldStat doubleStats(DoubleFieldStat doubleStats) {
    
    this.doubleStats = doubleStats;
    return this;
  }

   /**
   * Get doubleStats
   * @return doubleStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DoubleFieldStat getDoubleStats() {
    return doubleStats;
  }


  public void setDoubleStats(DoubleFieldStat doubleStats) {
    this.doubleStats = doubleStats;
  }


  public DataSetFieldStat stringStats(StringFieldStat stringStats) {
    
    this.stringStats = stringStats;
    return this;
  }

   /**
   * Get stringStats
   * @return stringStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StringFieldStat getStringStats() {
    return stringStats;
  }


  public void setStringStats(StringFieldStat stringStats) {
    this.stringStats = stringStats;
  }


  public DataSetFieldStat binaryStats(BinaryFieldStat binaryStats) {
    
    this.binaryStats = binaryStats;
    return this;
  }

   /**
   * Get binaryStats
   * @return binaryStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BinaryFieldStat getBinaryStats() {
    return binaryStats;
  }


  public void setBinaryStats(BinaryFieldStat binaryStats) {
    this.binaryStats = binaryStats;
  }


  public DataSetFieldStat dateStats(DateFieldStat dateStats) {
    
    this.dateStats = dateStats;
    return this;
  }

   /**
   * Get dateStats
   * @return dateStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateFieldStat getDateStats() {
    return dateStats;
  }


  public void setDateStats(DateFieldStat dateStats) {
    this.dateStats = dateStats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSetFieldStat dataSetFieldStat = (DataSetFieldStat) o;
    return Objects.equals(this.name, dataSetFieldStat.name) &&
        Objects.equals(this.booleanStats, dataSetFieldStat.booleanStats) &&
        Objects.equals(this.longStats, dataSetFieldStat.longStats) &&
        Objects.equals(this.doubleStats, dataSetFieldStat.doubleStats) &&
        Objects.equals(this.stringStats, dataSetFieldStat.stringStats) &&
        Objects.equals(this.binaryStats, dataSetFieldStat.binaryStats) &&
        Objects.equals(this.dateStats, dataSetFieldStat.dateStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, booleanStats, longStats, doubleStats, stringStats, binaryStats, dateStats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSetFieldStat {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    booleanStats: ").append(toIndentedString(booleanStats)).append("\n");
    sb.append("    longStats: ").append(toIndentedString(longStats)).append("\n");
    sb.append("    doubleStats: ").append(toIndentedString(doubleStats)).append("\n");
    sb.append("    stringStats: ").append(toIndentedString(stringStats)).append("\n");
    sb.append("    binaryStats: ").append(toIndentedString(binaryStats)).append("\n");
    sb.append("    dateStats: ").append(toIndentedString(dateStats)).append("\n");
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
