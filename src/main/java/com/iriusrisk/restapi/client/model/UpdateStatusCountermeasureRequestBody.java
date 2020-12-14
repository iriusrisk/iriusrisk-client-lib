


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
 * UpdateStatusCountermeasureRequestBody
 */
public class UpdateStatusCountermeasureRequestBody {
  /**
   * New state of the countermeasure ( rejected | recommended | required | implemented )
   */
  @JsonAdapter(StatusNameEnum.Adapter.class)
  public enum StatusNameEnum {
    REJECTED("rejected"),
    
    RECOMMENDED("recommended"),
    
    REQUIRED("required"),
    
    IMPLEMENTED("implemented");

    private String value;

    StatusNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusNameEnum fromValue(String text) {
      for (StatusNameEnum b : StatusNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusNameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("statusName")
  private StatusNameEnum statusName = null;

  @SerializedName("rejectedReason")
  private String rejectedReason = null;

  public UpdateStatusCountermeasureRequestBody statusName(StatusNameEnum statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * New state of the countermeasure ( rejected | recommended | required | implemented )
   * @return statusName
  **/
  @ApiModelProperty(value = "New state of the countermeasure ( rejected | recommended | required | implemented )")
  public StatusNameEnum getStatusName() {
    return statusName;
  }

  public void setStatusName(StatusNameEnum statusName) {
    this.statusName = statusName;
  }

  public UpdateStatusCountermeasureRequestBody rejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
    return this;
  }

   /**
   * Reason for rejecting the countermeasure
   * @return rejectedReason
  **/
  @ApiModelProperty(value = "Reason for rejecting the countermeasure")
  public String getRejectedReason() {
    return rejectedReason;
  }

  public void setRejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody = (UpdateStatusCountermeasureRequestBody) o;
    return Objects.equals(this.statusName, updateStatusCountermeasureRequestBody.statusName) &&
        Objects.equals(this.rejectedReason, updateStatusCountermeasureRequestBody.rejectedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusName, rejectedReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStatusCountermeasureRequestBody {\n");
    
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    rejectedReason: ").append(toIndentedString(rejectedReason)).append("\n");
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

