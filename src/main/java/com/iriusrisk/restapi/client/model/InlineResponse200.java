


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
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse200
 */
public class InlineResponse200 {
  @SerializedName("unassigned")
  private List<String> unassigned = null;

  @SerializedName("notFound")
  private List<String> notFound = null;

  public InlineResponse200 unassigned(List<String> unassigned) {
    this.unassigned = unassigned;
    return this;
  }

  public InlineResponse200 addUnassignedItem(String unassignedItem) {
    if (this.unassigned == null) {
      this.unassigned = new ArrayList<String>();
    }
    this.unassigned.add(unassignedItem);
    return this;
  }

   /**
   * Get unassigned
   * @return unassigned
  **/
  @ApiModelProperty(value = "")
  public List<String> getUnassigned() {
    return unassigned;
  }

  public void setUnassigned(List<String> unassigned) {
    this.unassigned = unassigned;
  }

  public InlineResponse200 notFound(List<String> notFound) {
    this.notFound = notFound;
    return this;
  }

  public InlineResponse200 addNotFoundItem(String notFoundItem) {
    if (this.notFound == null) {
      this.notFound = new ArrayList<String>();
    }
    this.notFound.add(notFoundItem);
    return this;
  }

   /**
   * Get notFound
   * @return notFound
  **/
  @ApiModelProperty(value = "")
  public List<String> getNotFound() {
    return notFound;
  }

  public void setNotFound(List<String> notFound) {
    this.notFound = notFound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.unassigned, inlineResponse200.unassigned) &&
        Objects.equals(this.notFound, inlineResponse200.notFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unassigned, notFound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    notFound: ").append(toIndentedString(notFound)).append("\n");
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

