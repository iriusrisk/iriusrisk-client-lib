


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
import com.iriusrisk.restapi.client.model.TestSource;
import com.iriusrisk.restapi.client.model.Udt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test
 */
public class Test {
  @SerializedName("expiryDate")
  private String expiryDate = null;

  @SerializedName("expiryPeriod")
  private Integer expiryPeriod = null;

  @SerializedName("steps")
  private String steps = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("source")
  private TestSource source = null;

  @SerializedName("references")
  private List<Reference> references = null;

  @SerializedName("udts")
  private List<Udt> udts = null;

  public Test expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Test expiryPeriod(Integer expiryPeriod) {
    this.expiryPeriod = expiryPeriod;
    return this;
  }

   /**
   * Get expiryPeriod
   * @return expiryPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getExpiryPeriod() {
    return expiryPeriod;
  }

  public void setExpiryPeriod(Integer expiryPeriod) {
    this.expiryPeriod = expiryPeriod;
  }

  public Test steps(String steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public String getSteps() {
    return steps;
  }

  public void setSteps(String steps) {
    this.steps = steps;
  }

  public Test notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Test source(TestSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public TestSource getSource() {
    return source;
  }

  public void setSource(TestSource source) {
    this.source = source;
  }

  public Test references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public Test addReferencesItem(Reference referencesItem) {
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

  public Test udts(List<Udt> udts) {
    this.udts = udts;
    return this;
  }

  public Test addUdtsItem(Udt udtsItem) {
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
    Test test = (Test) o;
    return Objects.equals(this.expiryDate, test.expiryDate) &&
        Objects.equals(this.expiryPeriod, test.expiryPeriod) &&
        Objects.equals(this.steps, test.steps) &&
        Objects.equals(this.notes, test.notes) &&
        Objects.equals(this.source, test.source) &&
        Objects.equals(this.references, test.references) &&
        Objects.equals(this.udts, test.udts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, expiryPeriod, steps, notes, source, references, udts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Test {\n");
    
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    expiryPeriod: ").append(toIndentedString(expiryPeriod)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

