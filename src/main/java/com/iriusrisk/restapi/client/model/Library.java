


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
import com.iriusrisk.restapi.client.model.RiskPattern;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Library
 */
public class Library {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("riskPatterns")
  private List<RiskPattern> riskPatterns = null;

  public Library ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Library name(String name) {
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

  public Library desc(String desc) {
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

  public Library riskPatterns(List<RiskPattern> riskPatterns) {
    this.riskPatterns = riskPatterns;
    return this;
  }

  public Library addRiskPatternsItem(RiskPattern riskPatternsItem) {
    if (this.riskPatterns == null) {
      this.riskPatterns = new ArrayList<RiskPattern>();
    }
    this.riskPatterns.add(riskPatternsItem);
    return this;
  }

   /**
   * Get riskPatterns
   * @return riskPatterns
  **/
  @ApiModelProperty(value = "")
  public List<RiskPattern> getRiskPatterns() {
    return riskPatterns;
  }

  public void setRiskPatterns(List<RiskPattern> riskPatterns) {
    this.riskPatterns = riskPatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Library library = (Library) o;
    return Objects.equals(this.ref, library.ref) &&
        Objects.equals(this.name, library.name) &&
        Objects.equals(this.desc, library.desc) &&
        Objects.equals(this.riskPatterns, library.riskPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, riskPatterns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Library {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    riskPatterns: ").append(toIndentedString(riskPatterns)).append("\n");
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

