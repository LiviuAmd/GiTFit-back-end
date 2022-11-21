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
 * CHAPSPaymentAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class CHAPSPaymentAttributes extends CommonPaymentAttributes implements PaymentAttributes {
  @SerializedName("currency_code")
  private String currencyCode = "GBP";

  @SerializedName("debtor_sort_code")
  private String debtorSortCode = null;

  @SerializedName("debtor_account_number")
  private String debtorAccountNumber = null;

  @SerializedName("creditor_sort_code")
  private String creditorSortCode = null;

  @SerializedName("creditor_account_number")
  private String creditorAccountNumber = null;

  public CHAPSPaymentAttributes currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency of the payment.
   * @return currencyCode
  **/
  @Schema(required = true, description = "The currency of the payment.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CHAPSPaymentAttributes debtorSortCode(String debtorSortCode) {
    this.debtorSortCode = debtorSortCode;
    return this;
  }

   /**
   * The debtor&#x27;s bank sort code
   * @return debtorSortCode
  **/
  @Schema(description = "The debtor's bank sort code")
  public String getDebtorSortCode() {
    return debtorSortCode;
  }

  public void setDebtorSortCode(String debtorSortCode) {
    this.debtorSortCode = debtorSortCode;
  }

  public CHAPSPaymentAttributes debtorAccountNumber(String debtorAccountNumber) {
    this.debtorAccountNumber = debtorAccountNumber;
    return this;
  }

   /**
   * The debtor&#x27;s bank account number
   * @return debtorAccountNumber
  **/
  @Schema(description = "The debtor's bank account number")
  public String getDebtorAccountNumber() {
    return debtorAccountNumber;
  }

  public void setDebtorAccountNumber(String debtorAccountNumber) {
    this.debtorAccountNumber = debtorAccountNumber;
  }

  public CHAPSPaymentAttributes creditorSortCode(String creditorSortCode) {
    this.creditorSortCode = creditorSortCode;
    return this;
  }

   /**
   * The creditor&#x27;s bank sort code
   * @return creditorSortCode
  **/
  @Schema(required = true, description = "The creditor's bank sort code")
  public String getCreditorSortCode() {
    return creditorSortCode;
  }

  public void setCreditorSortCode(String creditorSortCode) {
    this.creditorSortCode = creditorSortCode;
  }

  public CHAPSPaymentAttributes creditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
    return this;
  }

   /**
   * The creditor&#x27;s bank account number
   * @return creditorAccountNumber
  **/
  @Schema(required = true, description = "The creditor's bank account number")
  public String getCreditorAccountNumber() {
    return creditorAccountNumber;
  }

  public void setCreditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CHAPSPaymentAttributes chAPSPaymentAttributes = (CHAPSPaymentAttributes) o;
    return Objects.equals(this.currencyCode, chAPSPaymentAttributes.currencyCode) &&
        Objects.equals(this.debtorSortCode, chAPSPaymentAttributes.debtorSortCode) &&
        Objects.equals(this.debtorAccountNumber, chAPSPaymentAttributes.debtorAccountNumber) &&
        Objects.equals(this.creditorSortCode, chAPSPaymentAttributes.creditorSortCode) &&
        Objects.equals(this.creditorAccountNumber, chAPSPaymentAttributes.creditorAccountNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, debtorSortCode, debtorAccountNumber, creditorSortCode, creditorAccountNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CHAPSPaymentAttributes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    debtorSortCode: ").append(toIndentedString(debtorSortCode)).append("\n");
    sb.append("    debtorAccountNumber: ").append(toIndentedString(debtorAccountNumber)).append("\n");
    sb.append("    creditorSortCode: ").append(toIndentedString(creditorSortCode)).append("\n");
    sb.append("    creditorAccountNumber: ").append(toIndentedString(creditorAccountNumber)).append("\n");
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
