


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
import com.iriusrisk.restapi.client.model.ComponentDefinitionRiskPatterns;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Component Definition
 */
@ApiModel(description = "Component Definition")
public class ComponentDefinition {
  @SerializedName("ref")
  private String ref = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("categoryRef")
  private String categoryRef = null;

  @SerializedName("riskPatterns")
  private List<ComponentDefinitionRiskPatterns> riskPatterns = null;

  public ComponentDefinition ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Unique identifier of the Component Definition
   * @return ref
  **/
  @ApiModelProperty(value = "Unique identifier of the Component Definition")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ComponentDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Component Definition
   * @return name
  **/
  @ApiModelProperty(value = "Name of the Component Definition")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComponentDefinition desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description of the Component Definition
   * @return desc
  **/
  @ApiModelProperty(value = "Description of the Component Definition")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ComponentDefinition categoryRef(String categoryRef) {
    this.categoryRef = categoryRef;
    return this;
  }

   /**
   * Reference of the category of the component
   * @return categoryRef
  **/
  @ApiModelProperty(value = "Reference of the category of the component")
  public String getCategoryRef() {
    return categoryRef;
  }

  public void setCategoryRef(String categoryRef) {
    this.categoryRef = categoryRef;
  }

  public ComponentDefinition riskPatterns(List<ComponentDefinitionRiskPatterns> riskPatterns) {
    this.riskPatterns = riskPatterns;
    return this;
  }

  public ComponentDefinition addRiskPatternsItem(ComponentDefinitionRiskPatterns riskPatternsItem) {
    if (this.riskPatterns == null) {
      this.riskPatterns = new ArrayList<ComponentDefinitionRiskPatterns>();
    }
    this.riskPatterns.add(riskPatternsItem);
    return this;
  }

   /**
   * Get riskPatterns
   * @return riskPatterns
  **/
  @ApiModelProperty(value = "")
  public List<ComponentDefinitionRiskPatterns> getRiskPatterns() {
    return riskPatterns;
  }

  public void setRiskPatterns(List<ComponentDefinitionRiskPatterns> riskPatterns) {
    this.riskPatterns = riskPatterns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDefinition componentDefinition = (ComponentDefinition) o;
    return Objects.equals(this.ref, componentDefinition.ref) &&
        Objects.equals(this.name, componentDefinition.name) &&
        Objects.equals(this.desc, componentDefinition.desc) &&
        Objects.equals(this.categoryRef, componentDefinition.categoryRef) &&
        Objects.equals(this.riskPatterns, componentDefinition.riskPatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, name, desc, categoryRef, riskPatterns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDefinition {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    categoryRef: ").append(toIndentedString(categoryRef)).append("\n");
    sb.append("    riskPatterns: ").append(toIndentedString(riskPatterns)).append("\n");
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

