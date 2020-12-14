


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
import com.iriusrisk.restapi.client.model.RiskCount;
import java.io.IOException;

/**
 * RiskSummary
 */
public class RiskSummary {
  @SerializedName("riskCount")
  private RiskCount riskCount = null;

  @SerializedName("inherentRisk")
  private Integer inherentRisk = null;

  @SerializedName("projectedRisk")
  private Integer projectedRisk = null;

  @SerializedName("residualRisk")
  private Integer residualRisk = null;

  public RiskSummary riskCount(RiskCount riskCount) {
    this.riskCount = riskCount;
    return this;
  }

   /**
   * Get riskCount
   * @return riskCount
  **/
  @ApiModelProperty(value = "")
  public RiskCount getRiskCount() {
    return riskCount;
  }

  public void setRiskCount(RiskCount riskCount) {
    this.riskCount = riskCount;
  }

  public RiskSummary inherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
    return this;
  }

   /**
   * Get inherentRisk
   * @return inherentRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getInherentRisk() {
    return inherentRisk;
  }

  public void setInherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
  }

  public RiskSummary projectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
    return this;
  }

   /**
   * Get projectedRisk
   * @return projectedRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectedRisk() {
    return projectedRisk;
  }

  public void setProjectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
  }

  public RiskSummary residualRisk(Integer residualRisk) {
    this.residualRisk = residualRisk;
    return this;
  }

   /**
   * Get residualRisk
   * @return residualRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getResidualRisk() {
    return residualRisk;
  }

  public void setResidualRisk(Integer residualRisk) {
    this.residualRisk = residualRisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskSummary riskSummary = (RiskSummary) o;
    return Objects.equals(this.riskCount, riskSummary.riskCount) &&
        Objects.equals(this.inherentRisk, riskSummary.inherentRisk) &&
        Objects.equals(this.projectedRisk, riskSummary.projectedRisk) &&
        Objects.equals(this.residualRisk, riskSummary.residualRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCount, inherentRisk, projectedRisk, residualRisk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskSummary {\n");
    
    sb.append("    riskCount: ").append(toIndentedString(riskCount)).append("\n");
    sb.append("    inherentRisk: ").append(toIndentedString(inherentRisk)).append("\n");
    sb.append("    projectedRisk: ").append(toIndentedString(projectedRisk)).append("\n");
    sb.append("    residualRisk: ").append(toIndentedString(residualRisk)).append("\n");
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

