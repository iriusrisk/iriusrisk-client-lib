


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
 * ProductsrefcomponentscomponentReftestscweSource
 */
public class ProductsrefcomponentscomponentReftestscweSource {
  @SerializedName("result")
  private String result = null;

  @SerializedName("output")
  private String output = null;

  public ProductsrefcomponentscomponentReftestscweSource result(String result) {
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

  public ProductsrefcomponentscomponentReftestscweSource output(String output) {
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
    ProductsrefcomponentscomponentReftestscweSource productsrefcomponentscomponentReftestscweSource = (ProductsrefcomponentscomponentReftestscweSource) o;
    return Objects.equals(this.result, productsrefcomponentscomponentReftestscweSource.result) &&
        Objects.equals(this.output, productsrefcomponentscomponentReftestscweSource.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, output);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsrefcomponentscomponentReftestscweSource {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

