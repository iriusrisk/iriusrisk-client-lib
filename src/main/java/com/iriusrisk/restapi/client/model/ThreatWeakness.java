


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
import com.iriusrisk.restapi.client.model.ThreatControl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ThreatWeakness
 */
public class ThreatWeakness {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("controls")
  private List<ThreatControl> controls = null;

  public ThreatWeakness ref(String ref) {
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

  public ThreatWeakness controls(List<ThreatControl> controls) {
    this.controls = controls;
    return this;
  }

  public ThreatWeakness addControlsItem(ThreatControl controlsItem) {
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
    ThreatWeakness threatWeakness = (ThreatWeakness) o;
    return Objects.equals(this.ref, threatWeakness.ref) &&
        Objects.equals(this.controls, threatWeakness.controls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, controls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreatWeakness {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

