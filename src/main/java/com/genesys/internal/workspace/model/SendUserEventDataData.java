/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.genesys.internal.workspace.model.Kvpair;
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
 * SendUserEventDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-27T12:38:01.879Z")
public class SendUserEventDataData {
  @SerializedName("userData")
  private List<Kvpair> userData = new ArrayList<Kvpair>();

  @SerializedName("callUuid")
  private String callUuid = null;

  public SendUserEventDataData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public SendUserEventDataData addUserDataItem(Kvpair userDataItem) {
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }

  public SendUserEventDataData callUuid(String callUuid) {
    this.callUuid = callUuid;
    return this;
  }

   /**
   * Get callUuid
   * @return callUuid
  **/
  @ApiModelProperty(value = "")
  public String getCallUuid() {
    return callUuid;
  }

  public void setCallUuid(String callUuid) {
    this.callUuid = callUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendUserEventDataData sendUserEventDataData = (SendUserEventDataData) o;
    return Objects.equals(this.userData, sendUserEventDataData.userData) &&
        Objects.equals(this.callUuid, sendUserEventDataData.callUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userData, callUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendUserEventDataData {\n");
    
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    callUuid: ").append(toIndentedString(callUuid)).append("\n");
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

