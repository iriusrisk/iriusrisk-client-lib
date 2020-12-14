


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
 * Test
 */
@ApiModel(description = "Test")
public class TestCommand {

  @SerializedName("steps")
  private String steps = null;

  @SerializedName("notes")
  private String notes = null;

  public TestCommand steps(String steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Test steps
   * @return steps
  **/
  @ApiModelProperty(value = "Test steps")
  public String getSteps() {
    return steps;
  }

  public void setSteps(String steps) {
    this.steps = steps;
  }

  public TestCommand notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Test notes
   * @return notes
  **/
  @ApiModelProperty(value = "Test notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCommand testCommand = (TestCommand) o;
    return Objects.equals(this.steps, testCommand.steps) &&
        Objects.equals(this.notes, testCommand.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCommand {\n");
    
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

