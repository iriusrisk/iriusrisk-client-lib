


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
import com.iriusrisk.restapi.client.model.Threat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComponentUseCase
 */
public class ComponentUseCase {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("threats")
  private List<Threat> threats = null;

  public ComponentUseCase ref(String ref) {
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

  public ComponentUseCase name(String name) {
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

  public ComponentUseCase desc(String desc) {
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

  public ComponentUseCase threats(List<Threat> threats) {
    this.threats = threats;
    return this;
  }

  public ComponentUseCase addThreatsItem(Threat threatsItem) {
    if (this.threats == null) {
      this.threats = new ArrayList<Threat>();
    }
    this.threats.add(threatsItem);
    return this;
  }

   /**
   * Get threats
   * @return threats
  **/
  @ApiModelProperty(value = "")
  public List<Threat> getThreats() {
    return threats;
  }

  public void setThreats(List<Threat> threats) {
    this.threats = threats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentUseCase componentUseCase = (ComponentUseCase) o;
    return Objects.equals(this.ref, componentUseCase.ref) &&
        Objects.equals(this.name, componentUseCase.name) &&
        Objects.equals(this.desc, componentUseCase.desc) &&
        Objects.equals(this.threats, componentUseCase.threats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, threats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentUseCase {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
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

