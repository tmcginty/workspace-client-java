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
import com.genesys.workspace.model.Call;
import com.genesys.workspace.model.CurrentUserDataUserActiveSessionDn;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CurrentUserDataUserActiveSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-20T23:02:55.937Z")
public class CurrentUserDataUserActiveSession {
  @SerializedName("dn")
  private CurrentUserDataUserActiveSessionDn dn = null;

  @SerializedName("calls")
  private List<Call> calls = new ArrayList<Call>();

  public CurrentUserDataUserActiveSession dn(CurrentUserDataUserActiveSessionDn dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
   * @return dn
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentUserDataUserActiveSessionDn getDn() {
    return dn;
  }

  public void setDn(CurrentUserDataUserActiveSessionDn dn) {
    this.dn = dn;
  }

  public CurrentUserDataUserActiveSession calls(List<Call> calls) {
    this.calls = calls;
    return this;
  }

  public CurrentUserDataUserActiveSession addCallsItem(Call callsItem) {
    this.calls.add(callsItem);
    return this;
  }

   /**
   * An array containing any active calls.
   * @return calls
  **/
  @ApiModelProperty(example = "null", value = "An array containing any active calls.")
  public List<Call> getCalls() {
    return calls;
  }

  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserDataUserActiveSession currentUserDataUserActiveSession = (CurrentUserDataUserActiveSession) o;
    return Objects.equals(this.dn, currentUserDataUserActiveSession.dn) &&
        Objects.equals(this.calls, currentUserDataUserActiveSession.calls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, calls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserDataUserActiveSession {\n");
    
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
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

