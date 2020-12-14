


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
import com.iriusrisk.restapi.client.model.Test;
import java.io.IOException;

/**
 * ComponentWeakness
 */
public class ComponentWeakness {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private Integer state = null;

  @SerializedName("impact")
  private Integer impact = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("test")
  private Test test = null;

  public ComponentWeakness ref(String ref) {
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

  public ComponentWeakness name(String name) {
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

  public ComponentWeakness state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public ComponentWeakness impact(Integer impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @ApiModelProperty(value = "")
  public Integer getImpact() {
    return impact;
  }

  public void setImpact(Integer impact) {
    this.impact = impact;
  }

  public ComponentWeakness desc(String desc) {
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

  public ComponentWeakness test(Test test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public Test getTest() {
    return test;
  }

  public void setTest(Test test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentWeakness componentWeakness = (ComponentWeakness) o;
    return Objects.equals(this.ref, componentWeakness.ref) &&
        Objects.equals(this.name, componentWeakness.name) &&
        Objects.equals(this.state, componentWeakness.state) &&
        Objects.equals(this.impact, componentWeakness.impact) &&
        Objects.equals(this.desc, componentWeakness.desc) &&
        Objects.equals(this.test, componentWeakness.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, state, impact, desc, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentWeakness {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

