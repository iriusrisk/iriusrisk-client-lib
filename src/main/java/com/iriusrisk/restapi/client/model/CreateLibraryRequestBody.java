


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
 * CreateLibraryRequestBody
 */
public class CreateLibraryRequestBody {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  public CreateLibraryRequestBody ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Reference field value
   * @return ref
  **/
  @ApiModelProperty(value = "Reference field value")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public CreateLibraryRequestBody name(String name) {
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

  public CreateLibraryRequestBody desc(String desc) {
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
    CreateLibraryRequestBody createLibraryRequestBody = (CreateLibraryRequestBody) o;
    return Objects.equals(this.ref, createLibraryRequestBody.ref) &&
        Objects.equals(this.name, createLibraryRequestBody.name) &&
        Objects.equals(this.desc, createLibraryRequestBody.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLibraryRequestBody {\n");
    
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

