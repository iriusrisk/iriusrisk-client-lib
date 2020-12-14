


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
import com.iriusrisk.restapi.client.model.LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating;
import java.io.IOException;

/**
 * CreateThreatLibraryRequestBody
 */
public class CreateThreatLibraryRequestBody {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("riskRating")
  private LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating riskRating = null;

  public CreateThreatLibraryRequestBody ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Reference field value
   * @return ref
  **/
  @ApiModelProperty(value = "Reference field value")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public CreateThreatLibraryRequestBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name field value
   * @return name
  **/
  @ApiModelProperty(value = "Name field value")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateThreatLibraryRequestBody desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description field value
   * @return desc
  **/
  @ApiModelProperty(value = "Description field value")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public CreateThreatLibraryRequestBody riskRating(LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating riskRating) {
    this.riskRating = riskRating;
    return this;
  }

   /**
   * Get riskRating
   * @return riskRating
  **/
  @ApiModelProperty(value = "")
  public LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating getRiskRating() {
    return riskRating;
  }

  public void setRiskRating(LibrarieslibraryRefriskpatternsriskPatternRefusecasesuseCaseRefthreatsRiskRating riskRating) {
    this.riskRating = riskRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreatLibraryRequestBody createThreatLibraryRequestBody = (CreateThreatLibraryRequestBody) o;
    return Objects.equals(this.ref, createThreatLibraryRequestBody.ref) &&
        Objects.equals(this.name, createThreatLibraryRequestBody.name) &&
        Objects.equals(this.desc, createThreatLibraryRequestBody.desc) &&
        Objects.equals(this.riskRating, createThreatLibraryRequestBody.riskRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, riskRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreatLibraryRequestBody {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
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

