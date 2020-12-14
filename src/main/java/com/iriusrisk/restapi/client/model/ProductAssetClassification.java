


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
 * ProductAssetClassification
 */
public class ProductAssetClassification {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("confidentiality")
  private Integer confidentiality = null;

  @SerializedName("integrity")
  private Integer integrity = null;

  @SerializedName("availability")
  private Integer availability = null;

  public ProductAssetClassification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAssetClassification desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ProductAssetClassification confidentiality(Integer confidentiality) {
    this.confidentiality = confidentiality;
    return this;
  }

   /**
   * Get confidentiality
   * @return confidentiality
  **/
  @ApiModelProperty(value = "")
  public Integer getConfidentiality() {
    return confidentiality;
  }

  public void setConfidentiality(Integer confidentiality) {
    this.confidentiality = confidentiality;
  }

  public ProductAssetClassification integrity(Integer integrity) {
    this.integrity = integrity;
    return this;
  }

   /**
   * Get integrity
   * @return integrity
  **/
  @ApiModelProperty(value = "")
  public Integer getIntegrity() {
    return integrity;
  }

  public void setIntegrity(Integer integrity) {
    this.integrity = integrity;
  }

  public ProductAssetClassification availability(Integer availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public Integer getAvailability() {
    return availability;
  }

  public void setAvailability(Integer availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAssetClassification productAssetClassification = (ProductAssetClassification) o;
    return Objects.equals(this.name, productAssetClassification.name) &&
        Objects.equals(this.desc, productAssetClassification.desc) &&
        Objects.equals(this.confidentiality, productAssetClassification.confidentiality) &&
        Objects.equals(this.integrity, productAssetClassification.integrity) &&
        Objects.equals(this.availability, productAssetClassification.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, confidentiality, integrity, availability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAssetClassification {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    confidentiality: ").append(toIndentedString(confidentiality)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

