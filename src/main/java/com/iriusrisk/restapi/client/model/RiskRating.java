


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
 * RiskRating
 */
public class RiskRating {
  @SerializedName("confidentiality")
  private String confidentiality = null;

  @SerializedName("integrity")
  private String integrity = null;

  @SerializedName("availability")
  private String availability = null;

  @SerializedName("easeOfExploitation")
  private String easeOfExploitation = null;

  public RiskRating confidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

   /**
   * Get confidentiality
   * @return confidentiality
  **/
  @ApiModelProperty(value = "")
  public String getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(String confidentiality) {
    this.confidentiality = confidentiality;
  }

  public RiskRating integrity(String integrity) {
    this.integrity = integrity;
    return this;
  }

   /**
   * Get integrity
   * @return integrity
  **/
  @ApiModelProperty(value = "")
  public String getIntegrity() {
    return integrity;
  }

  public void setIntegrity(String integrity) {
    this.integrity = integrity;
  }

  public RiskRating availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public RiskRating easeOfExploitation(String easeOfExploitation) {
    this.easeOfExploitation = easeOfExploitation;
    return this;
  }

   /**
   * Get easeOfExploitation
   * @return easeOfExploitation
  **/
  @ApiModelProperty(value = "")
  public String getEaseOfExploitation() {
    return easeOfExploitation;
  }

  public void setEaseOfExploitation(String easeOfExploitation) {
    this.easeOfExploitation = easeOfExploitation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskRating riskRating = (RiskRating) o;
    return Objects.equals(this.confidentiality, riskRating.confidentiality) &&
        Objects.equals(this.integrity, riskRating.integrity) &&
        Objects.equals(this.availability, riskRating.availability) &&
        Objects.equals(this.easeOfExploitation, riskRating.easeOfExploitation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidentiality, integrity, availability, easeOfExploitation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskRating {\n");
    
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    easeOfExploitation: ").append(toIndentedString(easeOfExploitation)).append("\n");
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

