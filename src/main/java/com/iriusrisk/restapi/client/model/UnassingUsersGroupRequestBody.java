


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
 * UnassingUsersGroupRequestBody
 */
public class UnassingUsersGroupRequestBody {
  @SerializedName("usernames")
  private List<String> usernames = null;

  public UnassingUsersGroupRequestBody usernames(List<String> usernames) {
    this.usernames = usernames;
    return this;
  }

  public UnassingUsersGroupRequestBody addUsernamesItem(String usernamesItem) {
    if (this.usernames == null) {
      this.usernames = new ArrayList<String>();
    }
    this.usernames.add(usernamesItem);
    return this;
  }

   /**
   * List of usernames of users to be unassigned from a group
   * @return usernames
  **/
  @ApiModelProperty(value = "List of usernames of users to be unassigned from a group")
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
    UnassingUsersGroupRequestBody unassingUsersGroupRequestBody = (UnassingUsersGroupRequestBody) o;
    return Objects.equals(this.usernames, unassingUsersGroupRequestBody.usernames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usernames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnassingUsersGroupRequestBody {\n");
    
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

