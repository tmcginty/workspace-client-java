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
 * VoicecallsidsenddtmfData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class VoicecallsidsenddtmfData {
  @SerializedName("reasons")
  private KeyValueCollection reasons = null;

  @SerializedName("extensions")
  private KeyValueCollection extensions = null;

  @SerializedName("dtmfDigits")
  private String dtmfDigits = null;

  public VoicecallsidsenddtmfData reasons(KeyValueCollection reasons) {
    this.reasons = reasons;
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public KeyValueCollection getReasons() {
    return reasons;
  }

  public void setReasons(KeyValueCollection reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidsenddtmfData extensions(KeyValueCollection extensions) {
    this.extensions = extensions;
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public KeyValueCollection getExtensions() {
    return extensions;
  }

  public void setExtensions(KeyValueCollection extensions) {
    this.extensions = extensions;
  }

  public VoicecallsidsenddtmfData dtmfDigits(String dtmfDigits) {
    this.dtmfDigits = dtmfDigits;
    return this;
  }

   /**
   * The digits that should be sent.
   * @return dtmfDigits
  **/
  @ApiModelProperty(required = true, value = "The digits that should be sent.")
  public String getDtmfDigits() {
    return dtmfDigits;
  }

  public void setDtmfDigits(String dtmfDigits) {
    this.dtmfDigits = dtmfDigits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidsenddtmfData voicecallsidsenddtmfData = (VoicecallsidsenddtmfData) o;
    return Objects.equals(this.reasons, voicecallsidsenddtmfData.reasons) &&
        Objects.equals(this.extensions, voicecallsidsenddtmfData.extensions) &&
        Objects.equals(this.dtmfDigits, voicecallsidsenddtmfData.dtmfDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasons, extensions, dtmfDigits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsenddtmfData {\n");
    
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    dtmfDigits: ").append(toIndentedString(dtmfDigits)).append("\n");
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
