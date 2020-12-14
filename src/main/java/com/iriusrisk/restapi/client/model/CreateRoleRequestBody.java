


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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateRoleRequestBody
 */
public class CreateRoleRequestBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("permissions")
  private List<String> permissions = null;

  public CreateRoleRequestBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the new role
   * @return name
  **/
  @ApiModelProperty(value = "Name of the new role")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateRoleRequestBody permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public CreateRoleRequestBody addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<String>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Role&#39;s permissions list
   * @return permissions
  **/
  @ApiModelProperty(value = "Role's permissions list")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoleRequestBody createRoleRequestBody = (CreateRoleRequestBody) o;
    return Objects.equals(this.name, createRoleRequestBody.name) &&
        Objects.equals(this.permissions, createRoleRequestBody.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoleRequestBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

