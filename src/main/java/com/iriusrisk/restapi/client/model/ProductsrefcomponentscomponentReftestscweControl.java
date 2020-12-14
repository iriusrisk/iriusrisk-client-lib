


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
 * ProductsrefcomponentscomponentReftestscweControl
 */
public class ProductsrefcomponentscomponentReftestscweControl {
  @SerializedName("name")
  private String name = null;

  @SerializedName("component")
  private String component = null;

  @SerializedName("project")
  private String project = null;

  public ProductsrefcomponentscomponentReftestscweControl name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductsrefcomponentscomponentReftestscweControl component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(value = "")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public ProductsrefcomponentscomponentReftestscweControl project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsrefcomponentscomponentReftestscweControl productsrefcomponentscomponentReftestscweControl = (ProductsrefcomponentscomponentReftestscweControl) o;
    return Objects.equals(this.name, productsrefcomponentscomponentReftestscweControl.name) &&
        Objects.equals(this.component, productsrefcomponentscomponentReftestscweControl.component) &&
        Objects.equals(this.project, productsrefcomponentscomponentReftestscweControl.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, component, project);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsrefcomponentscomponentReftestscweControl {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

