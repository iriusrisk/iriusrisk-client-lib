


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
 * AssignUserGroupRequestBody1
 */
public class AssignUserGroupRequestBody1 {
  @SerializedName("usernames")
  private List<String> usernames = null;

  public AssignUserGroupRequestBody1 usernames(List<String> usernames) {
    this.usernames = usernames;
    return this;
  }

  public AssignUserGroupRequestBody1 addUsernamesItem(String usernamesItem) {
    if (this.usernames == null) {
      this.usernames = new ArrayList<String>();
    }
    this.usernames.add(usernamesItem);
    return this;
  }

   /**
   * List of users to assign to business unit
   * @return usernames
  **/
  @ApiModelProperty(value = "List of users to assign to business unit")
  public List<String> getUsernames() {
    return usernames;
  }

  public void setUsernames(List<String> usernames) {
    this.usernames = usernames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignUserGroupRequestBody1 assignUserGroupRequestBody1 = (AssignUserGroupRequestBody1) o;
    return Objects.equals(this.usernames, assignUserGroupRequestBody1.usernames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usernames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignUserGroupRequestBody1 {\n");
    
    sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
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

