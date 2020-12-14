


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
 * UpdateGroupRequestBody1
 */
public class UpdateGroupRequestBody1 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  public UpdateGroupRequestBody1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name field value
   * @return name
  **/
  @ApiModelProperty(value = "Name field value")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateGroupRequestBody1 desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description field value
   * @return desc
  **/
  @ApiModelProperty(value = "Description field value")
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
    UpdateGroupRequestBody1 updateGroupRequestBody1 = (UpdateGroupRequestBody1) o;
    return Objects.equals(this.name, updateGroupRequestBody1.name) &&
        Objects.equals(this.desc, updateGroupRequestBody1.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, desc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRequestBody1 {\n");
    
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

