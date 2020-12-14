


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
import com.iriusrisk.restapi.client.model.ThreatControl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryWeakness
 */
public class LibraryWeakness {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("impact")
  private String impact = null;

  @SerializedName("test")
  private Test test = null;

  @SerializedName("controls")
  private List<ThreatControl> controls = null;

  public LibraryWeakness ref(String ref) {
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

  public LibraryWeakness name(String name) {
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

  public LibraryWeakness desc(String desc) {
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

  public LibraryWeakness state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LibraryWeakness impact(String impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @ApiModelProperty(value = "")
  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public LibraryWeakness test(Test test) {
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

  public LibraryWeakness controls(List<ThreatControl> controls) {
    this.controls = controls;
    return this;
  }

  public LibraryWeakness addControlsItem(ThreatControl controlsItem) {
    if (this.controls == null) {
      this.controls = new ArrayList<ThreatControl>();
    }
    this.controls.add(controlsItem);
    return this;
  }

   /**
   * Get controls
   * @return controls
  **/
  @ApiModelProperty(value = "")
  public List<ThreatControl> getControls() {
    return controls;
  }

  public void setControls(List<ThreatControl> controls) {
    this.controls = controls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryWeakness libraryWeakness = (LibraryWeakness) o;
    return Objects.equals(this.ref, libraryWeakness.ref) &&
        Objects.equals(this.name, libraryWeakness.name) &&
        Objects.equals(this.desc, libraryWeakness.desc) &&
        Objects.equals(this.state, libraryWeakness.state) &&
        Objects.equals(this.impact, libraryWeakness.impact) &&
        Objects.equals(this.test, libraryWeakness.test) &&
        Objects.equals(this.controls, libraryWeakness.controls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, state, impact, test, controls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryWeakness {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
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

