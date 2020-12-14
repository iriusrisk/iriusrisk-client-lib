


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
 * Supported Standard
 */
@ApiModel(description = "Supported Standard")
public class SupportedStandard {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  public SupportedStandard ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Unique identifier of the Supported Standard
   * @return ref
  **/
  @ApiModelProperty(value = "Unique identifier of the Supported Standard")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public SupportedStandard name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedStandard supportedStandard = (SupportedStandard) o;
    return Objects.equals(this.ref, supportedStandard.ref) &&
        Objects.equals(this.name, supportedStandard.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedStandard {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

