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


package com.genesys.workspace.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrentUserDataPendingloginasync
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-19T05:23:01.340Z")
public class CurrentUserDataPendingloginasync {
  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    @SerializedName("NotStarted")
    NOTSTARTED("NotStarted"),
    
    @SerializedName("Executing")
    EXECUTING("Executing"),
    
    @SerializedName("Failed")
    FAILED("Failed"),
    
    @SerializedName("Complete")
    COMPLETE("Complete");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("actualWaitTime")
  private Integer actualWaitTime = null;

  @SerializedName("submittedAt")
  private String submittedAt = null;

  @SerializedName("errors")
  private Object errors = null;

  public CurrentUserDataPendingloginasync state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CurrentUserDataPendingloginasync actualWaitTime(Integer actualWaitTime) {
    this.actualWaitTime = actualWaitTime;
    return this;
  }

   /**
   * Get actualWaitTime
   * @return actualWaitTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getActualWaitTime() {
    return actualWaitTime;
  }

  public void setActualWaitTime(Integer actualWaitTime) {
    this.actualWaitTime = actualWaitTime;
  }

  public CurrentUserDataPendingloginasync submittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
  }

  public CurrentUserDataPendingloginasync errors(Object errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getErrors() {
    return errors;
  }

  public void setErrors(Object errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserDataPendingloginasync currentUserDataPendingloginasync = (CurrentUserDataPendingloginasync) o;
    return Objects.equals(this.state, currentUserDataPendingloginasync.state) &&
        Objects.equals(this.actualWaitTime, currentUserDataPendingloginasync.actualWaitTime) &&
        Objects.equals(this.submittedAt, currentUserDataPendingloginasync.submittedAt) &&
        Objects.equals(this.errors, currentUserDataPendingloginasync.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, actualWaitTime, submittedAt, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserDataPendingloginasync {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    actualWaitTime: ").append(toIndentedString(actualWaitTime)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

