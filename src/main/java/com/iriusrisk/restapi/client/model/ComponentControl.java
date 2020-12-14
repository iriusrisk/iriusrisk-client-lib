


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
import com.iriusrisk.restapi.client.model.Implementation;
import com.iriusrisk.restapi.client.model.Reference;
import com.iriusrisk.restapi.client.model.Standard;
import com.iriusrisk.restapi.client.model.Test;
import com.iriusrisk.restapi.client.model.ThreatNameAndRef;
import com.iriusrisk.restapi.client.model.Udt;
import com.iriusrisk.restapi.client.model.WeaknessNameAndRef;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComponentControl
 */
public class ComponentControl {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("issueId")
  private String issueId = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("cost")
  private Integer cost = null;

  @SerializedName("risk")
  private Integer risk = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("mitigation")
  private String mitigation = null;

  @SerializedName("library")
  private String library = null;

  @SerializedName("implementations")
  private List<Implementation> implementations = null;

  @SerializedName("threats")
  private List<ThreatNameAndRef> threats = null;

  @SerializedName("weaknesses")
  private List<WeaknessNameAndRef> weaknesses = null;

  @SerializedName("references")
  private List<Reference> references = null;

  @SerializedName("standards")
  private List<Standard> standards = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  @SerializedName("test")
  private Test test = null;

  public ComponentControl ref(String ref) {
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

  public ComponentControl name(String name) {
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

  public ComponentControl issueId(String issueId) {
    this.issueId = issueId;
    return this;
  }

   /**
   * Get issueId
   * @return issueId
  **/
  @ApiModelProperty(value = "")
  public String getIssueId() {
    return issueId;
  }

  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }

  public ComponentControl platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ComponentControl cost(Integer cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Integer getCost() {
    return cost;
  }

  public void setCost(Integer cost) {
    this.cost = cost;
  }

  public ComponentControl risk(Integer risk) {
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

  public ComponentControl state(String state) {
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

  public ComponentControl owner(String owner) {
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

  public ComponentControl desc(String desc) {
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

  public ComponentControl source(String source) {
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

  public ComponentControl mitigation(String mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Get mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "")
  public String getMitigation() {
    return mitigation;
  }

  public void setMitigation(String mitigation) {
    this.mitigation = mitigation;
  }

  public ComponentControl library(String library) {
    this.library = library;
    return this;
  }

   /**
   * Reference of the Library
   * @return library
  **/
  @ApiModelProperty(value = "Reference of the Library")
  public String getLibrary() {
    return library;
  }

  public void setLibrary(String library) {
    this.library = library;
  }

  public ComponentControl implementations(List<Implementation> implementations) {
    this.implementations = implementations;
    return this;
  }

  public ComponentControl addImplementationsItem(Implementation implementationsItem) {
    if (this.implementations == null) {
      this.implementations = new ArrayList<Implementation>();
    }
    this.implementations.add(implementationsItem);
    return this;
  }

   /**
   * Get implementations
   * @return implementations
  **/
  @ApiModelProperty(value = "")
  public List<Implementation> getImplementations() {
    return implementations;
  }

  public void setImplementations(List<Implementation> implementations) {
    this.implementations = implementations;
  }

  public ComponentControl threats(List<ThreatNameAndRef> threats) {
    this.threats = threats;
    return this;
  }

  public ComponentControl addThreatsItem(ThreatNameAndRef threatsItem) {
    if (this.threats == null) {
      this.threats = new ArrayList<ThreatNameAndRef>();
    }
    this.threats.add(threatsItem);
    return this;
  }

   /**
   * Get threats
   * @return threats
  **/
  @ApiModelProperty(value = "")
  public List<ThreatNameAndRef> getThreats() {
    return threats;
  }

  public void setThreats(List<ThreatNameAndRef> threats) {
    this.threats = threats;
  }

  public ComponentControl weaknesses(List<WeaknessNameAndRef> weaknesses) {
    this.weaknesses = weaknesses;
    return this;
  }

  public ComponentControl addWeaknessesItem(WeaknessNameAndRef weaknessesItem) {
    if (this.weaknesses == null) {
      this.weaknesses = new ArrayList<WeaknessNameAndRef>();
    }
    this.weaknesses.add(weaknessesItem);
    return this;
  }

   /**
   * Get weaknesses
   * @return weaknesses
  **/
  @ApiModelProperty(value = "")
  public List<WeaknessNameAndRef> getWeaknesses() {
    return weaknesses;
  }

  public void setWeaknesses(List<WeaknessNameAndRef> weaknesses) {
    this.weaknesses = weaknesses;
  }

  public ComponentControl references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public ComponentControl addReferencesItem(Reference referencesItem) {
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

  public ComponentControl standards(List<Standard> standards) {
    this.standards = standards;
    return this;
  }

  public ComponentControl addStandardsItem(Standard standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<Standard>();
    }
    this.standards.add(standardsItem);
    return this;
  }

   /**
   * Get standards
   * @return standards
  **/
  @ApiModelProperty(value = "")
  public List<Standard> getStandards() {
    return standards;
  }

  public void setStandards(List<Standard> standards) {
    this.standards = standards;
  }

  public ComponentControl udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public ComponentControl addUdtsItem(Udt udtsItem) {
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

  public ComponentControl test(Test test) {
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
    ComponentControl componentControl = (ComponentControl) o;
    return Objects.equals(this.ref, componentControl.ref) &&
        Objects.equals(this.name, componentControl.name) &&
        Objects.equals(this.issueId, componentControl.issueId) &&
        Objects.equals(this.platform, componentControl.platform) &&
        Objects.equals(this.cost, componentControl.cost) &&
        Objects.equals(this.risk, componentControl.risk) &&
        Objects.equals(this.state, componentControl.state) &&
        Objects.equals(this.owner, componentControl.owner) &&
        Objects.equals(this.desc, componentControl.desc) &&
        Objects.equals(this.source, componentControl.source) &&
        Objects.equals(this.mitigation, componentControl.mitigation) &&
        Objects.equals(this.library, componentControl.library) &&
        Objects.equals(this.implementations, componentControl.implementations) &&
        Objects.equals(this.threats, componentControl.threats) &&
        Objects.equals(this.weaknesses, componentControl.weaknesses) &&
        Objects.equals(this.references, componentControl.references) &&
        Objects.equals(this.standards, componentControl.standards) &&
        Objects.equals(this.udts, componentControl.udts) &&
        Objects.equals(this.test, componentControl.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, issueId, platform, cost, risk, state, owner, desc, source, mitigation, library, implementations, threats, weaknesses, references, standards, udts, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentControl {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    library: ").append(toIndentedString(library)).append("\n");
    sb.append("    implementations: ").append(toIndentedString(implementations)).append("\n");
    sb.append("    threats: ").append(toIndentedString(threats)).append("\n");
    sb.append("    weaknesses: ").append(toIndentedString(weaknesses)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
    sb.append("    udts: ").append(toIndentedString(udts)).append("\n");
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

