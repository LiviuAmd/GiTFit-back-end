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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;
/**
 * SEPAPaymentAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class SEPAPaymentAttributes extends CommonPaymentAttributes implements PaymentAttributes {
  @SerializedName("currency_code")
  private String currencyCode = "EUR";

  @SerializedName("debtor_iban")
  private String debtorIban = null;

  @SerializedName("creditor_iban")
  private String creditorIban = null;

  /**
   * &lt;span class&#x3D;\&quot;note\&quot;&gt;   This attribute has been deprecated and will not be used. If you need to initiate an instant SEPA payment please see the [SEPA Instant template](#payment_templates-sepa_instant). &lt;/span&gt; 
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    NORMAL("NORMAL"),
    INSTANT("INSTANT");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModeEnum fromValue(String input) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("mode")
  private ModeEnum mode = ModeEnum.NORMAL;

  public SEPAPaymentAttributes currencyCode(String currencyCode) {
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

  public SEPAPaymentAttributes debtorIban(String debtorIban) {
    this.debtorIban = debtorIban;
    return this;
  }

   /**
   * The debtor&#x27;s IBAN
   * @return debtorIban
  **/
  @Schema(description = "The debtor's IBAN")
  public String getDebtorIban() {
    return debtorIban;
  }

  public void setDebtorIban(String debtorIban) {
    this.debtorIban = debtorIban;
  }

  public SEPAPaymentAttributes creditorIban(String creditorIban) {
    this.creditorIban = creditorIban;
    return this;
  }

   /**
   * The creditor&#x27;s IBAN
   * @return creditorIban
  **/
  @Schema(required = true, description = "The creditor's IBAN")
  public String getCreditorIban() {
    return creditorIban;
  }

  public void setCreditorIban(String creditorIban) {
    this.creditorIban = creditorIban;
  }

  public SEPAPaymentAttributes mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * &lt;span class&#x3D;\&quot;note\&quot;&gt;   This attribute has been deprecated and will not be used. If you need to initiate an instant SEPA payment please see the [SEPA Instant template](#payment_templates-sepa_instant). &lt;/span&gt; 
   * @return mode
  **/
  @Schema(description = "<span class=\"note\">   This attribute has been deprecated and will not be used. If you need to initiate an instant SEPA payment please see the [SEPA Instant template](#payment_templates-sepa_instant). </span> ")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEPAPaymentAttributes sePAPaymentAttributes = (SEPAPaymentAttributes) o;
    return Objects.equals(this.currencyCode, sePAPaymentAttributes.currencyCode) &&
        Objects.equals(this.debtorIban, sePAPaymentAttributes.debtorIban) &&
        Objects.equals(this.creditorIban, sePAPaymentAttributes.creditorIban) &&
        Objects.equals(this.mode, sePAPaymentAttributes.mode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, debtorIban, creditorIban, mode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEPAPaymentAttributes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    debtorIban: ").append(toIndentedString(debtorIban)).append("\n");
    sb.append("    creditorIban: ").append(toIndentedString(creditorIban)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
