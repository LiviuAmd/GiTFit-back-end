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
 * PaymentTokenRequestBodyData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class PaymentTokenRequestBodyData {
  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("provider_code")
  private String providerCode = null;

  @SerializedName("payment_attributes")
  private PaymentAttributes paymentAttributes = null;

  @SerializedName("template_identifier")
  private String templateIdentifier = null;

  @SerializedName("return_to")
  private String returnTo = null;

  @SerializedName("show_consent_confirmation")
  private Boolean showConsentConfirmation = true;

  @SerializedName("disable_provider_search")
  private Boolean disableProviderSearch = null;

  /**
   * allows you to specify what kind of callback type you are expecting.
   */
  @JsonAdapter(JavascriptCallbackTypeEnum.Adapter.class)
  public enum JavascriptCallbackTypeEnum {
    POST_MESSAGE("post_message");

    private String value;

    JavascriptCallbackTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static JavascriptCallbackTypeEnum fromValue(String input) {
      for (JavascriptCallbackTypeEnum b : JavascriptCallbackTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<JavascriptCallbackTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JavascriptCallbackTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public JavascriptCallbackTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return JavascriptCallbackTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("javascript_callback_type")
  private JavascriptCallbackTypeEnum javascriptCallbackType = null;

  @SerializedName("return_payment_id")
  private Boolean returnPaymentId = null;

  @SerializedName("return_error_class")
  private Boolean returnErrorClass = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  public PaymentTokenRequestBodyData customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * the &#x60;id&#x60; of the customer received from [customer create](#customers-create)
   * @return customerId
  **/
  @Schema(required = true, description = "the `id` of the customer received from [customer create](#customers-create)")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public PaymentTokenRequestBodyData providerCode(String providerCode) {
    this.providerCode = providerCode;
    return this;
  }

   /**
   * the code of the desired provider. To access the list of providers that support payments, see [providers list](#providers-list). If passed, make sure the chosen provider supports the desired payment template.  Even though the &#x60;provider_code&#x60; is an &#x60;optional&#x60; field, its absence during payment initiation may lead to the following outcomes:   - The end-user may choose a provider that does not support the payment template the client has passed to Salt Edge. This will result in an error.  - The end-user may choose a provider that has additional &#x60;required_payment_fields&#x60;. Absence of required payment attributes during payment initiation will result in an error. 
   * @return providerCode
  **/
  @Schema(description = "the code of the desired provider. To access the list of providers that support payments, see [providers list](#providers-list). If passed, make sure the chosen provider supports the desired payment template.  Even though the `provider_code` is an `optional` field, its absence during payment initiation may lead to the following outcomes:   - The end-user may choose a provider that does not support the payment template the client has passed to Salt Edge. This will result in an error.  - The end-user may choose a provider that has additional `required_payment_fields`. Absence of required payment attributes during payment initiation will result in an error. ")
  public String getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(String providerCode) {
    this.providerCode = providerCode;
  }

  public PaymentTokenRequestBodyData paymentAttributes(PaymentAttributes paymentAttributes) {
    this.paymentAttributes = paymentAttributes;
    return this;
  }

   /**
   * Get paymentAttributes
   * @return paymentAttributes
  **/
  @Schema(required = true, description = "")
  public PaymentAttributes getPaymentAttributes() {
    return paymentAttributes;
  }

  public void setPaymentAttributes(PaymentAttributes paymentAttributes) {
    this.paymentAttributes = paymentAttributes;
  }

  public PaymentTokenRequestBodyData templateIdentifier(String templateIdentifier) {
    this.templateIdentifier = templateIdentifier;
    return this;
  }

   /**
   * the payment template identifier received in [show templates](#payment_templates-show)
   * @return templateIdentifier
  **/
  @Schema(required = true, description = "the payment template identifier received in [show templates](#payment_templates-show)")
  public String getTemplateIdentifier() {
    return templateIdentifier;
  }

  public void setTemplateIdentifier(String templateIdentifier) {
    this.templateIdentifier = templateIdentifier;
  }

  public PaymentTokenRequestBodyData returnTo(String returnTo) {
    this.returnTo = returnTo;
    return this;
  }

   /**
   * the URL the user will be redirected to. Defaults to the &#x60;client&#x27;s home URL&#x60;
   * @return returnTo
  **/
  @Schema(description = "the URL the user will be redirected to. Defaults to the `client's home URL`")
  public String getReturnTo() {
    return returnTo;
  }

  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }

  public PaymentTokenRequestBodyData showConsentConfirmation(Boolean showConsentConfirmation) {
    this.showConsentConfirmation = showConsentConfirmation;
    return this;
  }

   /**
   * if sent as &#x60;false&#x60;, upon submitting the form, the end-user will not be asked to give consent to Salt Edge.
   * @return showConsentConfirmation
  **/
  @Schema(description = "if sent as `false`, upon submitting the form, the end-user will not be asked to give consent to Salt Edge.")
  public Boolean isShowConsentConfirmation() {
    return showConsentConfirmation;
  }

  public void setShowConsentConfirmation(Boolean showConsentConfirmation) {
    this.showConsentConfirmation = showConsentConfirmation;
  }

  public PaymentTokenRequestBodyData disableProviderSearch(Boolean disableProviderSearch) {
    this.disableProviderSearch = disableProviderSearch;
    return this;
  }

   /**
   * if sent as &#x60;true&#x60;, together with &#x60;provider_code&#x60;, does not allow the end-user to change the preselected provider.
   * @return disableProviderSearch
  **/
  @Schema(description = "if sent as `true`, together with `provider_code`, does not allow the end-user to change the preselected provider.")
  public Boolean isDisableProviderSearch() {
    return disableProviderSearch;
  }

  public void setDisableProviderSearch(Boolean disableProviderSearch) {
    this.disableProviderSearch = disableProviderSearch;
  }

  public PaymentTokenRequestBodyData javascriptCallbackType(JavascriptCallbackTypeEnum javascriptCallbackType) {
    this.javascriptCallbackType = javascriptCallbackType;
    return this;
  }

   /**
   * allows you to specify what kind of callback type you are expecting.
   * @return javascriptCallbackType
  **/
  @Schema(description = "allows you to specify what kind of callback type you are expecting.")
  public JavascriptCallbackTypeEnum getJavascriptCallbackType() {
    return javascriptCallbackType;
  }

  public void setJavascriptCallbackType(JavascriptCallbackTypeEnum javascriptCallbackType) {
    this.javascriptCallbackType = javascriptCallbackType;
  }

  public PaymentTokenRequestBodyData returnPaymentId(Boolean returnPaymentId) {
    this.returnPaymentId = returnPaymentId;
    return this;
  }

   /**
   * whether to append &#x60;payment_id&#x60; to &#x60;return_to&#x60; URL.
   * @return returnPaymentId
  **/
  @Schema(description = "whether to append `payment_id` to `return_to` URL.")
  public Boolean isReturnPaymentId() {
    return returnPaymentId;
  }

  public void setReturnPaymentId(Boolean returnPaymentId) {
    this.returnPaymentId = returnPaymentId;
  }

  public PaymentTokenRequestBodyData returnErrorClass(Boolean returnErrorClass) {
    this.returnErrorClass = returnErrorClass;
    return this;
  }

   /**
   * whether to append &#x60;error_class&#x60; to &#x60;return_to&#x60; URL.
   * @return returnErrorClass
  **/
  @Schema(description = "whether to append `error_class` to `return_to` URL.")
  public Boolean isReturnErrorClass() {
    return returnErrorClass;
  }

  public void setReturnErrorClass(Boolean returnErrorClass) {
    this.returnErrorClass = returnErrorClass;
  }

  public PaymentTokenRequestBodyData locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * the language of the Payments Connect widget and of the returned error message(s) in the &lt;a href&#x3D;&#x27;http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes&#x27; target&#x3D;\&quot;_blank\&quot;&gt;ISO 639-1&lt;/a&gt; format. Possible values are: &#x60;bg&#x60;, &#x60;cz&#x60;, &#x60;de&#x60;, &#x60;en&#x60;, &#x60;es-MX&#x60;, &#x60;es&#x60;, &#x60;fi&#x60;, &#x60;fr&#x60;, &#x60;he&#x60;, &#x60;hr&#x60;, &#x60;hu&#x60;, &#x60;it&#x60;, &#x60;nl&#x60;, &#x60;pl&#x60;, &#x60;pt-BR&#x60;, &#x60;pt&#x60;, &#x60;ro&#x60;, &#x60;ru&#x60;, &#x60;si&#x60;, &#x60;sk&#x60;, &#x60;sv&#x60;, &#x60;tr&#x60;, &#x60;uk&#x60;, &#x60;zh-HK&#x60;(Traditional), &#x60;zh&#x60;(Simplified). Defaults to &#x60;en&#x60;.
   * @return locale
  **/
  @Schema(description = "the language of the Payments Connect widget and of the returned error message(s) in the <a href='http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes' target=\"_blank\">ISO 639-1</a> format. Possible values are: `bg`, `cz`, `de`, `en`, `es-MX`, `es`, `fi`, `fr`, `he`, `hr`, `hu`, `it`, `nl`, `pl`, `pt-BR`, `pt`, `ro`, `ru`, `si`, `sk`, `sv`, `tr`, `uk`, `zh-HK`(Traditional), `zh`(Simplified). Defaults to `en`.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PaymentTokenRequestBodyData customFields(Object customFields) {
    this.customFields = customFields;
    return this;
  }

   /**
   * a JSON object, which will be sent back on any of your callbacks
   * @return customFields
  **/
  @Schema(description = "a JSON object, which will be sent back on any of your callbacks")
  public Object getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenRequestBodyData paymentTokenRequestBodyData = (PaymentTokenRequestBodyData) o;
    return Objects.equals(this.customerId, paymentTokenRequestBodyData.customerId) &&
        Objects.equals(this.providerCode, paymentTokenRequestBodyData.providerCode) &&
        Objects.equals(this.paymentAttributes, paymentTokenRequestBodyData.paymentAttributes) &&
        Objects.equals(this.templateIdentifier, paymentTokenRequestBodyData.templateIdentifier) &&
        Objects.equals(this.returnTo, paymentTokenRequestBodyData.returnTo) &&
        Objects.equals(this.showConsentConfirmation, paymentTokenRequestBodyData.showConsentConfirmation) &&
        Objects.equals(this.disableProviderSearch, paymentTokenRequestBodyData.disableProviderSearch) &&
        Objects.equals(this.javascriptCallbackType, paymentTokenRequestBodyData.javascriptCallbackType) &&
        Objects.equals(this.returnPaymentId, paymentTokenRequestBodyData.returnPaymentId) &&
        Objects.equals(this.returnErrorClass, paymentTokenRequestBodyData.returnErrorClass) &&
        Objects.equals(this.locale, paymentTokenRequestBodyData.locale) &&
        Objects.equals(this.customFields, paymentTokenRequestBodyData.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, providerCode, paymentAttributes, templateIdentifier, returnTo, showConsentConfirmation, disableProviderSearch, javascriptCallbackType, returnPaymentId, returnErrorClass, locale, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenRequestBodyData {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    paymentAttributes: ").append(toIndentedString(paymentAttributes)).append("\n");
    sb.append("    templateIdentifier: ").append(toIndentedString(templateIdentifier)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    showConsentConfirmation: ").append(toIndentedString(showConsentConfirmation)).append("\n");
    sb.append("    disableProviderSearch: ").append(toIndentedString(disableProviderSearch)).append("\n");
    sb.append("    javascriptCallbackType: ").append(toIndentedString(javascriptCallbackType)).append("\n");
    sb.append("    returnPaymentId: ").append(toIndentedString(returnPaymentId)).append("\n");
    sb.append("    returnErrorClass: ").append(toIndentedString(returnErrorClass)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
