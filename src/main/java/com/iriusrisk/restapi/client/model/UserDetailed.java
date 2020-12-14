


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
 * User
 */
@ApiModel(description = "User")
public class UserDetailed {
  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("userGroups")
  private List<String> userGroups = null;

  @SerializedName("userRoles")
  private List<String> userRoles = null;

  @SerializedName("apiToken")
  private String apiToken = null;

  @SerializedName("passwordExpired")
  private Boolean passwordExpired = null;

  public UserDetailed username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the User
   * @return username
  **/
  @ApiModelProperty(value = "Username of the User")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDetailed firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name of the User
   * @return firstName
  **/
  @ApiModelProperty(value = "First Name of the User")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDetailed lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name of the User
   * @return lastName
  **/
  @ApiModelProperty(value = "Last Name of the User")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDetailed email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the User
   * @return email
  **/
  @ApiModelProperty(value = "Email of the User")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDetailed userGroups(List<String> userGroups) {
    this.userGroups = userGroups;
    return this;
  }

  public UserDetailed addUserGroupsItem(String userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<String>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * Get userGroups
   * @return userGroups
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserGroups() {
    return userGroups;
  }

  public void setUserGroups(List<String> userGroups) {
    this.userGroups = userGroups;
  }

  public UserDetailed userRoles(List<String> userRoles) {
    this.userRoles = userRoles;
    return this;
  }

  public UserDetailed addUserRolesItem(String userRolesItem) {
    if (this.userRoles == null) {
      this.userRoles = new ArrayList<String>();
    }
    this.userRoles.add(userRolesItem);
    return this;
  }

   /**
   * Get userRoles
   * @return userRoles
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<String> userRoles) {
    this.userRoles = userRoles;
  }

  public UserDetailed apiToken(String apiToken) {
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Token to be able to make calls through the API
   * @return apiToken
  **/
  @ApiModelProperty(value = "Token to be able to make calls through the API")
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }

  public UserDetailed passwordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
    return this;
  }

   /**
   * Indicated if the password is expired
   * @return passwordExpired
  **/
  @ApiModelProperty(value = "Indicated if the password is expired")
  public Boolean isPasswordExpired() {
    return passwordExpired;
  }

  public void setPasswordExpired(Boolean passwordExpired) {
    this.passwordExpired = passwordExpired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetailed userDetailed = (UserDetailed) o;
    return Objects.equals(this.username, userDetailed.username) &&
        Objects.equals(this.firstName, userDetailed.firstName) &&
        Objects.equals(this.lastName, userDetailed.lastName) &&
        Objects.equals(this.email, userDetailed.email) &&
        Objects.equals(this.userGroups, userDetailed.userGroups) &&
        Objects.equals(this.userRoles, userDetailed.userRoles) &&
        Objects.equals(this.apiToken, userDetailed.apiToken) &&
        Objects.equals(this.passwordExpired, userDetailed.passwordExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, email, userGroups, userRoles, apiToken, passwordExpired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailed {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    userRoles: ").append(toIndentedString(userRoles)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    passwordExpired: ").append(toIndentedString(passwordExpired)).append("\n");
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

