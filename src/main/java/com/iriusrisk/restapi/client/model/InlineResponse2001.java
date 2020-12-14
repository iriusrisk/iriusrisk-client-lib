


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
import com.iriusrisk.restapi.client.model.ProductsrefcomponentscomponentReftestscweControl;
import com.iriusrisk.restapi.client.model.ProductsrefcomponentscomponentReftestscweSource;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineResponse2001
 */
public class InlineResponse2001 {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("source")
  private ProductsrefcomponentscomponentReftestscweSource source = null;

  @SerializedName("control")
  private ProductsrefcomponentscomponentReftestscweControl control = null;

  @SerializedName("weakness")
  private ProductsrefcomponentscomponentReftestscweControl weakness = null;

  public InlineResponse2001 id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public InlineResponse2001 source(ProductsrefcomponentscomponentReftestscweSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public ProductsrefcomponentscomponentReftestscweSource getSource() {
    return source;
  }

  public void setSource(ProductsrefcomponentscomponentReftestscweSource source) {
    this.source = source;
  }

  public InlineResponse2001 control(ProductsrefcomponentscomponentReftestscweControl control) {
    this.control = control;
    return this;
  }

   /**
   * Get control
   * @return control
  **/
  @ApiModelProperty(value = "")
  public ProductsrefcomponentscomponentReftestscweControl getControl() {
    return control;
  }

  public void setControl(ProductsrefcomponentscomponentReftestscweControl control) {
    this.control = control;
  }

  public InlineResponse2001 weakness(ProductsrefcomponentscomponentReftestscweControl weakness) {
    this.weakness = weakness;
    return this;
  }

   /**
   * Get weakness
   * @return weakness
  **/
  @ApiModelProperty(value = "")
  public ProductsrefcomponentscomponentReftestscweControl getWeakness() {
    return weakness;
  }

  public void setWeakness(ProductsrefcomponentscomponentReftestscweControl weakness) {
    this.weakness = weakness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.source, inlineResponse2001.source) &&
        Objects.equals(this.control, inlineResponse2001.control) &&
        Objects.equals(this.weakness, inlineResponse2001.weakness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, control, weakness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
    sb.append("    weakness: ").append(toIndentedString(weakness)).append("\n");
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

