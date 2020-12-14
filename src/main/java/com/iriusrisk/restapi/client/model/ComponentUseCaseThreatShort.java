


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
import com.iriusrisk.restapi.client.model.ComponentUseCaseShort;
import java.io.IOException;

/**
 * ComponentUseCaseThreatShort
 */
public class ComponentUseCaseThreatShort {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("useCase")
  private ComponentUseCaseShort useCase = null;

  public ComponentUseCaseThreatShort ref(String ref) {
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

  public ComponentUseCaseThreatShort name(String name) {
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

  public ComponentUseCaseThreatShort useCase(ComponentUseCaseShort useCase) {
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @ApiModelProperty(value = "")
  public ComponentUseCaseShort getUseCase() {
    return useCase;
  }

  public void setUseCase(ComponentUseCaseShort useCase) {
    this.useCase = useCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentUseCaseThreatShort componentUseCaseThreatShort = (ComponentUseCaseThreatShort) o;
    return Objects.equals(this.ref, componentUseCaseThreatShort.ref) &&
        Objects.equals(this.name, componentUseCaseThreatShort.name) &&
        Objects.equals(this.useCase, componentUseCaseThreatShort.useCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, useCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentUseCaseThreatShort {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
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

