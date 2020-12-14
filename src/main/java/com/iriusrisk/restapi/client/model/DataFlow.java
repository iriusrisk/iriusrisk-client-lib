


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
import com.iriusrisk.restapi.client.model.DataFlowAssets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DataFlow
 */
@ApiModel(description = "DataFlow")
public class DataFlow {
  @SerializedName("name")
  private String name = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("assets")
  private List<DataFlowAssets> assets = null;

  public DataFlow name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the DataFlow
   * @return name
  **/
  @ApiModelProperty(value = "Name of the DataFlow")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataFlow source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Reference of the source Component
   * @return source
  **/
  @ApiModelProperty(value = "Reference of the source Component")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DataFlow target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Reference of the target Component
   * @return target
  **/
  @ApiModelProperty(value = "Reference of the target Component")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public DataFlow assets(List<DataFlowAssets> assets) {
    this.assets = assets;
    return this;
  }

  public DataFlow addAssetsItem(DataFlowAssets assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<DataFlowAssets>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(value = "")
  public List<DataFlowAssets> getAssets() {
    return assets;
  }

  public void setAssets(List<DataFlowAssets> assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFlow dataFlow = (DataFlow) o;
    return Objects.equals(this.name, dataFlow.name) &&
        Objects.equals(this.source, dataFlow.source) &&
        Objects.equals(this.target, dataFlow.target) &&
        Objects.equals(this.assets, dataFlow.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, source, target, assets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFlow {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

