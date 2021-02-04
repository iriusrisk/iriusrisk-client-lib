/*
 * IriusRisk API
 * IriusRisk provides this featured API to allow for deeper customer integrations as well as enable very flexible automations within the many varied environments IriusRisk needs to operate.
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iriusrisk.api.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.iriusrisk.api.client.model.Reference;
import com.iriusrisk.api.client.model.RiskRating;
import com.iriusrisk.api.client.model.ThreatControl;
import com.iriusrisk.api.client.model.ThreatWeakness;
import com.iriusrisk.api.client.model.Udt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryThreat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-04T10:27:59.154+01:00")
public class LibraryThreat {
  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("mitigation")
  private Integer mitigation = null;

  @JsonProperty("risk")
  private Integer risk = null;

  @JsonProperty("inherentRisk")
  private Integer inherentRisk = null;

  @JsonProperty("projectedRisk")
  private Integer projectedRisk = null;

  @JsonProperty("riskRating")
  private RiskRating riskRating = null;

  @JsonProperty("references")
  private List<Reference> references = null;

  @JsonProperty("weaknesses")
  private List<ThreatWeakness> weaknesses = null;

  @JsonProperty("controls")
  private List<ThreatControl> controls = null;

  @JsonProperty("udts")
  private List<Udt> udts = null;

  public LibraryThreat ref(String ref) {
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

  public LibraryThreat name(String name) {
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

  public LibraryThreat desc(String desc) {
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

  public LibraryThreat mitigation(Integer mitigation) {
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

  public LibraryThreat risk(Integer risk) {
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

  public LibraryThreat inherentRisk(Integer inherentRisk) {
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

  public LibraryThreat projectedRisk(Integer projectedRisk) {
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

  public LibraryThreat riskRating(RiskRating riskRating) {
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

  public LibraryThreat references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public LibraryThreat addReferencesItem(Reference referencesItem) {
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

  public LibraryThreat weaknesses(List<ThreatWeakness> weaknesses) {
    this.weaknesses = weaknesses;
    return this;
  }

  public LibraryThreat addWeaknessesItem(ThreatWeakness weaknessesItem) {
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

  public LibraryThreat controls(List<ThreatControl> controls) {
    this.controls = controls;
    return this;
  }

  public LibraryThreat addControlsItem(ThreatControl controlsItem) {
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

  public LibraryThreat udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public LibraryThreat addUdtsItem(Udt udtsItem) {
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
    LibraryThreat libraryThreat = (LibraryThreat) o;
    return Objects.equals(this.ref, libraryThreat.ref) &&
        Objects.equals(this.name, libraryThreat.name) &&
        Objects.equals(this.desc, libraryThreat.desc) &&
        Objects.equals(this.mitigation, libraryThreat.mitigation) &&
        Objects.equals(this.risk, libraryThreat.risk) &&
        Objects.equals(this.inherentRisk, libraryThreat.inherentRisk) &&
        Objects.equals(this.projectedRisk, libraryThreat.projectedRisk) &&
        Objects.equals(this.riskRating, libraryThreat.riskRating) &&
        Objects.equals(this.references, libraryThreat.references) &&
        Objects.equals(this.weaknesses, libraryThreat.weaknesses) &&
        Objects.equals(this.controls, libraryThreat.controls) &&
        Objects.equals(this.udts, libraryThreat.udts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, mitigation, risk, inherentRisk, projectedRisk, riskRating, references, weaknesses, controls, udts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryThreat {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    inherentRisk: ").append(toIndentedString(inherentRisk)).append("\n");
    sb.append("    projectedRisk: ").append(toIndentedString(projectedRisk)).append("\n");
    sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
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

