


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
import java.math.BigDecimal;

/**
 * InlineResponse2011
 */
public class InlineResponse2011 {
  @SerializedName("changedTest")
  private BigDecimal changedTest = null;

  public InlineResponse2011 changedTest(BigDecimal changedTest) {
    this.changedTest = changedTest;
    return this;
  }

   /**
   * Get changedTest
   * @return changedTest
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChangedTest() {
    return changedTest;
  }

  public void setChangedTest(BigDecimal changedTest) {
    this.changedTest = changedTest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.changedTest, inlineResponse2011.changedTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedTest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    changedTest: ").append(toIndentedString(changedTest)).append("\n");
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

