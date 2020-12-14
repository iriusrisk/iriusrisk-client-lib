


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
 * UpdateStatusTestRequestBody
 */
public class UpdateStatusTestRequestBody {
  /**
   * New state of the test ( not-tested | passed | failed | error )
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NOT_TESTED("not-tested"),
    
    PASSED("passed"),
    
    FAILED("failed"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("output")
  private String output = null;

  public UpdateStatusTestRequestBody state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * New state of the test ( not-tested | passed | failed | error )
   * @return state
  **/
  @ApiModelProperty(value = "New state of the test ( not-tested | passed | failed | error )")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public UpdateStatusTestRequestBody output(String output) {
    this.output = output;
    return this;
  }

   /**
   * new output of the test
   * @return output
  **/
  @ApiModelProperty(value = "new output of the test")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStatusTestRequestBody updateStatusTestRequestBody = (UpdateStatusTestRequestBody) o;
    return Objects.equals(this.state, updateStatusTestRequestBody.state) &&
        Objects.equals(this.output, updateStatusTestRequestBody.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStatusTestRequestBody {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

