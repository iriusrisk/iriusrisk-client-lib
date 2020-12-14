


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
import com.iriusrisk.restapi.client.model.Reference;
import com.iriusrisk.restapi.client.model.RiskRating;
import com.iriusrisk.restapi.client.model.ThreatControl;
import com.iriusrisk.restapi.client.model.ThreatWeakness;
import com.iriusrisk.restapi.client.model.Udt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Threat
 */
public class Threat {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("riskRating")
  private RiskRating riskRating = null;

  @SerializedName("inherentRisk")
  private Integer inherentRisk = null;

  @SerializedName("risk")
  private Integer risk = null;

  @SerializedName("projectedRisk")
  private Integer projectedRisk = null;

  @SerializedName("mitigation")
  private Integer mitigation = null;

  @SerializedName("library")
  private String library = null;

  @SerializedName("references")
  private List<Reference> references = null;

  @SerializedName("weaknesses")
  private List<ThreatWeakness> weaknesses = null;

  @SerializedName("controls")
  private List<ThreatControl> controls = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  public Threat ref(String ref) {
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

  public Threat name(String name) {
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

  public Threat state(String state) {
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

  public Threat owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Threat desc(String desc) {
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

  public Threat source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Threat riskRating(RiskRating riskRating) {
    this.riskRating = riskRating;
    return this;
  }

   /**
   * Get riskRating
   * @return riskRating
  **/
  @ApiModelProperty(value = "")
  public RiskRating getRiskRating() {
    return riskRating;
  }

  public void setRiskRating(RiskRating riskRating) {
    this.riskRating = riskRating;
  }

  public Threat inherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
    return this;
  }

   /**
   * Get inherentRisk
   * @return inherentRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getInherentRisk() {
    return inherentRisk;
  }

  public void setInherentRisk(Integer inherentRisk) {
    this.inherentRisk = inherentRisk;
  }

  public Threat risk(Integer risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")
  public Integer getRisk() {
    return risk;
  }

  public void setRisk(Integer risk) {
    this.risk = risk;
  }

  public Threat projectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
    return this;
  }

   /**
   * Get projectedRisk
   * @return projectedRisk
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectedRisk() {
    return projectedRisk;
  }

  public void setProjectedRisk(Integer projectedRisk) {
    this.projectedRisk = projectedRisk;
  }

  public Threat mitigation(Integer mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Get mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "")
  public Integer getMitigation() {
    return mitigation;
  }

  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }

  public Threat library(String library) {
    this.library = library;
    return this;
  }

   /**
   * Get library
   * @return library
  **/
  @ApiModelProperty(value = "")
  public String getLibrary() {
    return library;
  }

  public void setLibrary(String library) {
    this.library = library;
  }

  public Threat references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public Threat addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<Reference>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @ApiModelProperty(value = "")
  public List<Reference> getReferences() {
    return references;
  }

  public void setReferences(List<Reference> references) {
    this.references = references;
  }

  public Threat weaknesses(List<ThreatWeakness> weaknesses) {
    this.weaknesses = weaknesses;
    return this;
  }

  public Threat addWeaknessesItem(ThreatWeakness weaknessesItem) {
    if (this.weaknesses == null) {
      this.weaknesses = new ArrayList<ThreatWeakness>();
    }
    this.weaknesses.add(weaknessesItem);
    return this;
  }

   /**
   * Get weaknesses
   * @return weaknesses
  **/
  @ApiModelProperty(value = "")
  public List<ThreatWeakness> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(List<ThreatWeakness> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public Threat controls(List<ThreatControl> controls) {
    this.controls = controls;
    return this;
  }

  public Threat addControlsItem(ThreatControl controlsItem) {
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

  public Threat udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public Threat addUdtsItem(Udt udtsItem) {
    if (this.udts == null) {
      this.udts = new ArrayList<Udt>();
    }
    this.udts.add(udtsItem);
    return this;
  }

   /**
   * Get udts
   * @return udts
  **/
  @ApiModelProperty(value = "")
  public List<Udt> getUdts() {
    return udts;
  }

  public void setUdts(List<Udt> udts) {
    this.udts = udts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Threat threat = (Threat) o;
    return Objects.equals(this.ref, threat.ref) &&
        Objects.equals(this.name, threat.name) &&
        Objects.equals(this.state, threat.state) &&
        Objects.equals(this.owner, threat.owner) &&
        Objects.equals(this.desc, threat.desc) &&
        Objects.equals(this.source, threat.source) &&
        Objects.equals(this.riskRating, threat.riskRating) &&
        Objects.equals(this.inherentRisk, threat.inherentRisk) &&
        Objects.equals(this.risk, threat.risk) &&
        Objects.equals(this.projectedRisk, threat.projectedRisk) &&
        Objects.equals(this.mitigation, threat.mitigation) &&
        Objects.equals(this.library, threat.library) &&
        Objects.equals(this.references, threat.references) &&
        Objects.equals(this.weaknesses, threat.weaknesses) &&
        Objects.equals(this.controls, threat.controls) &&
        Objects.equals(this.udts, threat.udts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, state, owner, desc, source, riskRating, inherentRisk, risk, projectedRisk, mitigation, library, references, weaknesses, controls, udts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Threat {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
    sb.append("    inherentRisk: ").append(toIndentedString(inherentRisk)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    projectedRisk: ").append(toIndentedString(projectedRisk)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    library: ").append(toIndentedString(library)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    weaknesses: ").append(toIndentedString(weaknesses)).append("\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
    sb.append("    udts: ").append(toIndentedString(udts)).append("\n");
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

