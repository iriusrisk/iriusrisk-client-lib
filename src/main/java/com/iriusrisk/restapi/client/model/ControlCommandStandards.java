


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
 * ControlCommandStandards
 */
public class ControlCommandStandards {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("supportedStandardRef")
  private String supportedStandardRef = null;

  public ControlCommandStandards ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Reference of the Standard
   * @return ref
  **/
  @ApiModelProperty(value = "Reference of the Standard")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ControlCommandStandards name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Supported Standard
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Supported Standard")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ControlCommandStandards supportedStandardRef(String supportedStandardRef) {
    this.supportedStandardRef = supportedStandardRef;
    return this;
  }

   /**
   * Reference of the Supported Standard
   * @return supportedStandardRef
  **/
  @ApiModelProperty(value = "Reference of the Supported Standard")
  public String getSupportedStandardRef() {
    return supportedStandardRef;
  }

  public void setSupportedStandardRef(String supportedStandardRef) {
    this.supportedStandardRef = supportedStandardRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlCommandStandards controlCommandStandards = (ControlCommandStandards) o;
    return Objects.equals(this.ref, controlCommandStandards.ref) &&
        Objects.equals(this.name, controlCommandStandards.name) &&
        Objects.equals(this.supportedStandardRef, controlCommandStandards.supportedStandardRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, supportedStandardRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlCommandStandards {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedStandardRef: ").append(toIndentedString(supportedStandardRef)).append("\n");
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

