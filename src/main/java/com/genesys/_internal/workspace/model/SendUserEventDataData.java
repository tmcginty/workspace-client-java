/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys._internal.workspace.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import com.genesys.workspace.models.KeyValueCollection;

/**
 * SendUserEventDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class SendUserEventDataData {
  @SerializedName("userData")
  private KeyValueCollection userData = new KeyValueCollection();

  @SerializedName("callUuid")
  private String callUuid = null;

  public SendUserEventDataData userData(KeyValueCollection userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "")
  public KeyValueCollection getUserData() {
    return userData;
  }

  public void setUserData(KeyValueCollection userData) {
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
