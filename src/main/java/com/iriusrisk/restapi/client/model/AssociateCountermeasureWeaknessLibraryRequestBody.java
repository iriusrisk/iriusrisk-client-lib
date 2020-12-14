


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
 * AssociateCountermeasureWeaknessLibraryRequestBody
 */
public class AssociateCountermeasureWeaknessLibraryRequestBody {
  @SerializedName("ref")
  private String ref = null;

  public AssociateCountermeasureWeaknessLibraryRequestBody ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Existing Countermesasure reference
   * @return ref
  **/
  @ApiModelProperty(value = "Existing Countermesasure reference")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody = (AssociateCountermeasureWeaknessLibraryRequestBody) o;
    return Objects.equals(this.ref, associateCountermeasureWeaknessLibraryRequestBody.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateCountermeasureWeaknessLibraryRequestBody {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

