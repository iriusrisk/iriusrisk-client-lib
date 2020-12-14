


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
 * ArchitectureDiagram
 */
public class ArchitectureDiagram {
  @SerializedName("draft")
  private Boolean draft = null;

  @SerializedName("schema")
  private String schema = null;

  public ArchitectureDiagram draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

   /**
   * Get draft
   * @return draft
  **/
  @ApiModelProperty(value = "")
  public Boolean isDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public ArchitectureDiagram schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * The representation of the architecture diagram in Draw.io XML format encoded in Base64
   * @return schema
  **/
  @ApiModelProperty(value = "The representation of the architecture diagram in Draw.io XML format encoded in Base64")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectureDiagram architectureDiagram = (ArchitectureDiagram) o;
    return Objects.equals(this.draft, architectureDiagram.draft) &&
        Objects.equals(this.schema, architectureDiagram.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draft, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectureDiagram {\n");
    
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

