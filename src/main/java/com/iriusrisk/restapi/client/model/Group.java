


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
 * Group
 */
@ApiModel(description = "Group")
public class Group {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  public Group ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Unique identifier of the group
   * @return ref
  **/
  @ApiModelProperty(value = "Unique identifier of the group")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the group
   * @return name
  **/
  @ApiModelProperty(value = "Name of the group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description of the group
   * @return desc
  **/
  @ApiModelProperty(value = "Description of the group")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.ref, group.ref) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.desc, group.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

