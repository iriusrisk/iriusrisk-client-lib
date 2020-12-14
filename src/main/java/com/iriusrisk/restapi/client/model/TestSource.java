


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
 * TestSource
 */
public class TestSource {
  @SerializedName("filename")
  private String filename = null;

  @SerializedName("args")
  private String args = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("result")
  private String result = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  @SerializedName("output")
  private String output = null;

  public TestSource filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public TestSource args(String args) {
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(value = "")
  public String getArgs() {
    return args;
  }

  public void setArgs(String args) {
    this.args = args;
  }

  public TestSource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TestSource result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public TestSource enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public TestSource timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public TestSource output(String output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")
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
    TestSource testSource = (TestSource) o;
    return Objects.equals(this.filename, testSource.filename) &&
        Objects.equals(this.args, testSource.args) &&
        Objects.equals(this.type, testSource.type) &&
        Objects.equals(this.result, testSource.result) &&
        Objects.equals(this.enabled, testSource.enabled) &&
        Objects.equals(this.timestamp, testSource.timestamp) &&
        Objects.equals(this.output, testSource.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, args, type, result, enabled, timestamp, output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSource {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

