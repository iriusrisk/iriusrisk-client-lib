


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
 * ProductTrustZone
 */
public class ProductTrustZone {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("trustRating")
  private Integer trustRating = null;

  public ProductTrustZone name(String name) {
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

  public ProductTrustZone desc(String desc) {
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

  public ProductTrustZone trustRating(Integer trustRating) {
    this.trustRating = trustRating;
    return this;
  }

   /**
   * Get trustRating
   * @return trustRating
  **/
  @ApiModelProperty(value = "")
  public Integer getTrustRating() {
    return trustRating;
  }

  public void setTrustRating(Integer trustRating) {
    this.trustRating = trustRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTrustZone productTrustZone = (ProductTrustZone) o;
    return Objects.equals(this.name, productTrustZone.name) &&
        Objects.equals(this.desc, productTrustZone.desc) &&
        Objects.equals(this.trustRating, productTrustZone.trustRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc, trustRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTrustZone {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    trustRating: ").append(toIndentedString(trustRating)).append("\n");
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

