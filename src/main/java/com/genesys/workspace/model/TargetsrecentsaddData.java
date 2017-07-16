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
import com.genesys.workspace.model.RecentData;
import com.genesys.workspace.model.TargetId;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TargetsrecentsaddData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-16T13:14:58.883Z")
public class TargetsrecentsaddData {
  @SerializedName("target")
  private TargetId target = null;

  @SerializedName("recentInformation")
  private RecentData recentInformation = null;

  public TargetsrecentsaddData target(TargetId target) {
    this.target = target;
    return this;
  }

   /**
   * The recent target
   * @return target
  **/
  @ApiModelProperty(example = "null", required = true, value = "The recent target")
  public TargetId getTarget() {
    return target;
  }

  public void setTarget(TargetId target) {
    this.target = target;
  }

  public TargetsrecentsaddData recentInformation(RecentData recentInformation) {
    this.recentInformation = recentInformation;
    return this;
  }

   /**
   * data about recent interaction with the target
   * @return recentInformation
  **/
  @ApiModelProperty(example = "null", required = true, value = "data about recent interaction with the target")
  public RecentData getRecentInformation() {
    return recentInformation;
  }

  public void setRecentInformation(RecentData recentInformation) {
    this.recentInformation = recentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetsrecentsaddData targetsrecentsaddData = (TargetsrecentsaddData) o;
    return Objects.equals(this.target, targetsrecentsaddData.target) &&
        Objects.equals(this.recentInformation, targetsrecentsaddData.recentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, recentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetsrecentsaddData {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    recentInformation: ").append(toIndentedString(recentInformation)).append("\n");
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
