


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
 * AssociateCountermeasureThreatLibraryRequestBody
 */
public class AssociateCountermeasureThreatLibraryRequestBody {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("mitigation")
  private Integer mitigation = null;

  public AssociateCountermeasureThreatLibraryRequestBody ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Existing Countermeasure reference
   * @return ref
  **/
  @ApiModelProperty(value = "Existing Countermeasure reference")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public AssociateCountermeasureThreatLibraryRequestBody mitigation(Integer mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "Mitigation")
  public Integer getMitigation() {
    return mitigation;
  }

  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateCountermeasureThreatLibraryRequestBody associateCountermeasureThreatLibraryRequestBody = (AssociateCountermeasureThreatLibraryRequestBody) o;
    return Objects.equals(this.ref, associateCountermeasureThreatLibraryRequestBody.ref) &&
        Objects.equals(this.mitigation, associateCountermeasureThreatLibraryRequestBody.mitigation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, mitigation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateCountermeasureThreatLibraryRequestBody {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
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

