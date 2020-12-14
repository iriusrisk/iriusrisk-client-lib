


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
import com.iriusrisk.restapi.client.model.TestCommand;
import java.io.IOException;

/**
 * CreateWeaknessLibraryRequestBody
 */
public class CreateWeaknessLibraryRequestBody {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  /**
   * Impact
   */
  @JsonAdapter(ImpactEnum.Adapter.class)
  public enum ImpactEnum {
    NONE("none"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high"),
    
    VERY_HIGH("very-high");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImpactEnum fromValue(String text) {
      for (ImpactEnum b : ImpactEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImpactEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("impact")
  private ImpactEnum impact = null;

  @SerializedName("test")
  private TestCommand test = null;

  public CreateWeaknessLibraryRequestBody ref(String ref) {
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

  public CreateWeaknessLibraryRequestBody name(String name) {
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

  public CreateWeaknessLibraryRequestBody desc(String desc) {
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

  public CreateWeaknessLibraryRequestBody impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Impact
   * @return impact
  **/
  @ApiModelProperty(value = "Impact")
  public ImpactEnum getImpact() {
    return impact;
  }

  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }

  public CreateWeaknessLibraryRequestBody test(TestCommand test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(value = "")
  public TestCommand getTest() {
    return test;
  }

  public void setTest(TestCommand test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWeaknessLibraryRequestBody createWeaknessLibraryRequestBody = (CreateWeaknessLibraryRequestBody) o;
    return Objects.equals(this.ref, createWeaknessLibraryRequestBody.ref) &&
        Objects.equals(this.name, createWeaknessLibraryRequestBody.name) &&
        Objects.equals(this.desc, createWeaknessLibraryRequestBody.desc) &&
        Objects.equals(this.impact, createWeaknessLibraryRequestBody.impact) &&
        Objects.equals(this.test, createWeaknessLibraryRequestBody.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, impact, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWeaknessLibraryRequestBody {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

