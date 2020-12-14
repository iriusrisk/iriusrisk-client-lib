


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
import com.iriusrisk.restapi.client.model.ControlCommandStandards;
import com.iriusrisk.restapi.client.model.TestCommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ControlCommand
 */
public class ControlCommand {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("mitigation")
  private Integer mitigation = null;

  @SerializedName("test")
  private TestCommand test = null;

  /**
   * Countermeasure state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NOT_APPLICABLE("not-applicable"),
    
    REJECTED("rejected"),
    
    RECOMMENDED("recommended"),
    
    REQUIRED("required"),
    
    IMPLEMENTED("implemented");

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

  /**
   * Countermeasure cost
   */
  @JsonAdapter(CostRatingEnum.Adapter.class)
  public enum CostRatingEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    CostRatingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CostRatingEnum fromValue(String text) {
      for (CostRatingEnum b : CostRatingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CostRatingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CostRatingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CostRatingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CostRatingEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("costRating")
  private CostRatingEnum costRating = null;

  @SerializedName("standards")
  private List<ControlCommandStandards> standards = null;

  public ControlCommand ref(String ref) {
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

  public ControlCommand name(String name) {
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

  public ControlCommand desc(String desc) {
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

  public ControlCommand mitigation(Integer mitigation) {
    this.mitigation = mitigation;
    return this;
  }

   /**
   * Mitigation
   * @return mitigation
  **/
  @ApiModelProperty(value = "Mitigation")
  public Integer getMitigation() {
    return mitigation;
  }

  public void setMitigation(Integer mitigation) {
    this.mitigation = mitigation;
  }

  public ControlCommand test(TestCommand test) {
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

  public ControlCommand state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Countermeasure state
   * @return state
  **/
  @ApiModelProperty(value = "Countermeasure state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ControlCommand costRating(CostRatingEnum costRating) {
    this.costRating = costRating;
    return this;
  }

   /**
   * Countermeasure cost
   * @return costRating
  **/
  @ApiModelProperty(value = "Countermeasure cost")
  public CostRatingEnum getCostRating() {
    return costRating;
  }

  public void setCostRating(CostRatingEnum costRating) {
    this.costRating = costRating;
  }

  public ControlCommand standards(List<ControlCommandStandards> standards) {
    this.standards = standards;
    return this;
  }

  public ControlCommand addStandardsItem(ControlCommandStandards standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<ControlCommandStandards>();
    }
    this.standards.add(standardsItem);
    return this;
  }

   /**
   * List of standards
   * @return standards
  **/
  @ApiModelProperty(value = "List of standards")
  public List<ControlCommandStandards> getStandards() {
    return standards;
  }

  public void setStandards(List<ControlCommandStandards> standards) {
    this.standards = standards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlCommand controlCommand = (ControlCommand) o;
    return Objects.equals(this.ref, controlCommand.ref) &&
        Objects.equals(this.name, controlCommand.name) &&
        Objects.equals(this.desc, controlCommand.desc) &&
        Objects.equals(this.mitigation, controlCommand.mitigation) &&
        Objects.equals(this.test, controlCommand.test) &&
        Objects.equals(this.state, controlCommand.state) &&
        Objects.equals(this.costRating, controlCommand.costRating) &&
        Objects.equals(this.standards, controlCommand.standards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, mitigation, test, state, costRating, standards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlCommand {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    mitigation: ").append(toIndentedString(mitigation)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    costRating: ").append(toIndentedString(costRating)).append("\n");
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
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

