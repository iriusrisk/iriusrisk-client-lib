


package com.iriusrisk.restapi.client.model;

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
 * RiskCount
 */
public class RiskCount {
  @SerializedName("mitigated")
  private Integer mitigated = null;

  @SerializedName("low")
  private Integer low = null;

  @SerializedName("medium")
  private Integer medium = null;

  @SerializedName("high")
  private Integer high = null;

  @SerializedName("critical")
  private Integer critical = null;

  public RiskCount mitigated(Integer mitigated) {
    this.mitigated = mitigated;
    return this;
  }

   /**
   * Get mitigated
   * @return mitigated
  **/
  @ApiModelProperty(value = "")
  public Integer getMitigated() {
    return mitigated;
  }

  public void setMitigated(Integer mitigated) {
    this.mitigated = mitigated;
  }

  public RiskCount low(Integer low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @ApiModelProperty(value = "")
  public Integer getLow() {
    return low;
  }

  public void setLow(Integer low) {
    this.low = low;
  }

  public RiskCount medium(Integer medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @ApiModelProperty(value = "")
  public Integer getMedium() {
    return medium;
  }

  public void setMedium(Integer medium) {
    this.medium = medium;
  }

  public RiskCount high(Integer high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(value = "")
  public Integer getHigh() {
    return high;
  }

  public void setHigh(Integer high) {
    this.high = high;
  }

  public RiskCount critical(Integer critical) {
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @ApiModelProperty(value = "")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCount riskCount = (RiskCount) o;
    return Objects.equals(this.mitigated, riskCount.mitigated) &&
        Objects.equals(this.low, riskCount.low) &&
        Objects.equals(this.medium, riskCount.medium) &&
        Objects.equals(this.high, riskCount.high) &&
        Objects.equals(this.critical, riskCount.critical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mitigated, low, medium, high, critical);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCount {\n");
    
    sb.append("    mitigated: ").append(toIndentedString(mitigated)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

