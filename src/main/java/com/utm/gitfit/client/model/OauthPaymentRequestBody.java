/*
 * Salt Edge Payment Initiation API
 * API Reference for services
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@saltedge.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.utm.gitfit.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * The credentials object should be modeled after the provider&#x27;s fields.
 */
@Schema(description = "The credentials object should be modeled after the provider's fields.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class OauthPaymentRequestBody {
  @SerializedName("data")
  private OauthPaymentRequestBodyData data = null;

  public OauthPaymentRequestBody data(OauthPaymentRequestBodyData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public OauthPaymentRequestBodyData getData() {
    return data;
  }

  public void setData(OauthPaymentRequestBodyData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthPaymentRequestBody oauthPaymentRequestBody = (OauthPaymentRequestBody) o;
    return Objects.equals(this.data, oauthPaymentRequestBody.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthPaymentRequestBody {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
