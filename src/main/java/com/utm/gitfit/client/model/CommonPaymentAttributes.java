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
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
/**
 * CommonPaymentAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class CommonPaymentAttributes {
  @SerializedName("end_to_end_id")
  private String endToEndId = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("customer_last_logged_at")
  private OffsetDateTime customerLastLoggedAt = null;

  @SerializedName("customer_ip_address")
  private String customerIpAddress = null;

  @SerializedName("customer_ip_port")
  private String customerIpPort = null;

  @SerializedName("customer_device_os")
  private String customerDeviceOs = null;

  @SerializedName("customer_user_agent")
  private String customerUserAgent = null;

  @SerializedName("customer_latitude")
  private String customerLatitude = null;

  @SerializedName("customer_longitude")
  private String customerLongitude = null;

  @SerializedName("debtor_name")
  private String debtorName = null;

  @SerializedName("debtor_address")
  private String debtorAddress = null;

  @SerializedName("debtor_street_name")
  private String debtorStreetName = null;

  @SerializedName("debtor_building_number")
  private String debtorBuildingNumber = null;

  @SerializedName("debtor_post_code")
  private String debtorPostCode = null;

  @SerializedName("debtor_town")
  private String debtorTown = null;

  @SerializedName("debtor_region")
  private String debtorRegion = null;

  @SerializedName("debtor_country_code")
  private String debtorCountryCode = null;

  @SerializedName("creditor_name")
  private String creditorName = null;

  @SerializedName("creditor_agent")
  private String creditorAgent = null;

  @SerializedName("creditor_agent_name")
  private String creditorAgentName = null;

  @SerializedName("creditor_address")
  private String creditorAddress = null;

  @SerializedName("creditor_street_name")
  private String creditorStreetName = null;

  @SerializedName("creditor_building_number")
  private String creditorBuildingNumber = null;

  @SerializedName("creditor_post_code")
  private String creditorPostCode = null;

  @SerializedName("creditor_town")
  private String creditorTown = null;

  @SerializedName("creditor_region")
  private String creditorRegion = null;

  @SerializedName("creditor_country_code")
  private String creditorCountryCode = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("purpose_code")
  private String purposeCode = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("time")
  private String time = null;

  public CommonPaymentAttributes endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

   /**
   * An internal identifier used by the merchants and not accesible/visible to the end-user
   * @return endToEndId
  **/
  @Schema(required = true, description = "An internal identifier used by the merchants and not accesible/visible to the end-user")
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }

  public CommonPaymentAttributes reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * An external identifier which is visible to the end-user (e.g. tracking number, order number, bill number, etc)
   * @return reference
  **/
  @Schema(description = "An external identifier which is visible to the end-user (e.g. tracking number, order number, bill number, etc)")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CommonPaymentAttributes customerLastLoggedAt(OffsetDateTime customerLastLoggedAt) {
    this.customerLastLoggedAt = customerLastLoggedAt;
    return this;
  }

   /**
   * Time when the customer was last logged in
   * @return customerLastLoggedAt
  **/
  @Schema(description = "Time when the customer was last logged in")
  public OffsetDateTime getCustomerLastLoggedAt() {
    return customerLastLoggedAt;
  }

  public void setCustomerLastLoggedAt(OffsetDateTime customerLastLoggedAt) {
    this.customerLastLoggedAt = customerLastLoggedAt;
  }

  public CommonPaymentAttributes customerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
    return this;
  }

   /**
   * IP address of the customer
   * @return customerIpAddress
  **/
  @Schema(required = true, description = "IP address of the customer")
  public String getCustomerIpAddress() {
    return customerIpAddress;
  }

  public void setCustomerIpAddress(String customerIpAddress) {
    this.customerIpAddress = customerIpAddress;
  }

  public CommonPaymentAttributes customerIpPort(String customerIpPort) {
    this.customerIpPort = customerIpPort;
    return this;
  }

   /**
   * IP port of the customer
   * @return customerIpPort
  **/
  @Schema(description = "IP port of the customer")
  public String getCustomerIpPort() {
    return customerIpPort;
  }

  public void setCustomerIpPort(String customerIpPort) {
    this.customerIpPort = customerIpPort;
  }

  public CommonPaymentAttributes customerDeviceOs(String customerDeviceOs) {
    this.customerDeviceOs = customerDeviceOs;
    return this;
  }

   /**
   * The operating system of the customer
   * @return customerDeviceOs
  **/
  @Schema(description = "The operating system of the customer")
  public String getCustomerDeviceOs() {
    return customerDeviceOs;
  }

  public void setCustomerDeviceOs(String customerDeviceOs) {
    this.customerDeviceOs = customerDeviceOs;
  }

  public CommonPaymentAttributes customerUserAgent(String customerUserAgent) {
    this.customerUserAgent = customerUserAgent;
    return this;
  }

   /**
   * The user-agent of the customer
   * @return customerUserAgent
  **/
  @Schema(description = "The user-agent of the customer")
  public String getCustomerUserAgent() {
    return customerUserAgent;
  }

  public void setCustomerUserAgent(String customerUserAgent) {
    this.customerUserAgent = customerUserAgent;
  }

  public CommonPaymentAttributes customerLatitude(String customerLatitude) {
    this.customerLatitude = customerLatitude;
    return this;
  }

   /**
   * Defines the customer&#x27;s location
   * @return customerLatitude
  **/
  @Schema(description = "Defines the customer's location")
  public String getCustomerLatitude() {
    return customerLatitude;
  }

  public void setCustomerLatitude(String customerLatitude) {
    this.customerLatitude = customerLatitude;
  }

  public CommonPaymentAttributes customerLongitude(String customerLongitude) {
    this.customerLongitude = customerLongitude;
    return this;
  }

   /**
   * Defines the customer&#x27;s location
   * @return customerLongitude
  **/
  @Schema(description = "Defines the customer's location")
  public String getCustomerLongitude() {
    return customerLongitude;
  }

  public void setCustomerLongitude(String customerLongitude) {
    this.customerLongitude = customerLongitude;
  }

  public CommonPaymentAttributes debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

   /**
   * The full name of the debtor (payer)
   * @return debtorName
  **/
  @Schema(description = "The full name of the debtor (payer)")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public CommonPaymentAttributes debtorAddress(String debtorAddress) {
    this.debtorAddress = debtorAddress;
    return this;
  }

   /**
   * The full address of the debtor
   * @return debtorAddress
  **/
  @Schema(description = "The full address of the debtor")
  public String getDebtorAddress() {
    return debtorAddress;
  }

  public void setDebtorAddress(String debtorAddress) {
    this.debtorAddress = debtorAddress;
  }

  public CommonPaymentAttributes debtorStreetName(String debtorStreetName) {
    this.debtorStreetName = debtorStreetName;
    return this;
  }

   /**
   * The street name of the debtor
   * @return debtorStreetName
  **/
  @Schema(description = "The street name of the debtor")
  public String getDebtorStreetName() {
    return debtorStreetName;
  }

  public void setDebtorStreetName(String debtorStreetName) {
    this.debtorStreetName = debtorStreetName;
  }

  public CommonPaymentAttributes debtorBuildingNumber(String debtorBuildingNumber) {
    this.debtorBuildingNumber = debtorBuildingNumber;
    return this;
  }

   /**
   * The building number of the debtor
   * @return debtorBuildingNumber
  **/
  @Schema(description = "The building number of the debtor")
  public String getDebtorBuildingNumber() {
    return debtorBuildingNumber;
  }

  public void setDebtorBuildingNumber(String debtorBuildingNumber) {
    this.debtorBuildingNumber = debtorBuildingNumber;
  }

  public CommonPaymentAttributes debtorPostCode(String debtorPostCode) {
    this.debtorPostCode = debtorPostCode;
    return this;
  }

   /**
   * The post code of the debtor
   * @return debtorPostCode
  **/
  @Schema(description = "The post code of the debtor")
  public String getDebtorPostCode() {
    return debtorPostCode;
  }

  public void setDebtorPostCode(String debtorPostCode) {
    this.debtorPostCode = debtorPostCode;
  }

  public CommonPaymentAttributes debtorTown(String debtorTown) {
    this.debtorTown = debtorTown;
    return this;
  }

   /**
   * The name of the town/city of the debtor
   * @return debtorTown
  **/
  @Schema(description = "The name of the town/city of the debtor")
  public String getDebtorTown() {
    return debtorTown;
  }

  public void setDebtorTown(String debtorTown) {
    this.debtorTown = debtorTown;
  }

  public CommonPaymentAttributes debtorRegion(String debtorRegion) {
    this.debtorRegion = debtorRegion;
    return this;
  }

   /**
   * The name of the country/region of the debtor
   * @return debtorRegion
  **/
  @Schema(description = "The name of the country/region of the debtor")
  public String getDebtorRegion() {
    return debtorRegion;
  }

  public void setDebtorRegion(String debtorRegion) {
    this.debtorRegion = debtorRegion;
  }

  public CommonPaymentAttributes debtorCountryCode(String debtorCountryCode) {
    this.debtorCountryCode = debtorCountryCode;
    return this;
  }

   /**
   * The ISO code of the debtor&#x27;s country
   * @return debtorCountryCode
  **/
  @Schema(description = "The ISO code of the debtor's country")
  public String getDebtorCountryCode() {
    return debtorCountryCode;
  }

  public void setDebtorCountryCode(String debtorCountryCode) {
    this.debtorCountryCode = debtorCountryCode;
  }

  public CommonPaymentAttributes creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

   /**
   * The full name of the creditor (payee)
   * @return creditorName
  **/
  @Schema(required = true, description = "The full name of the creditor (payee)")
  public String getCreditorName() {
    return creditorName;
  }

  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }

  public CommonPaymentAttributes creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * The &#x60;id&#x60; of the creditor&#x27;s agent
   * @return creditorAgent
  **/
  @Schema(description = "The `id` of the creditor's agent")
  public String getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public CommonPaymentAttributes creditorAgentName(String creditorAgentName) {
    this.creditorAgentName = creditorAgentName;
    return this;
  }

   /**
   * The name of the creditor&#x27;s agent
   * @return creditorAgentName
  **/
  @Schema(description = "The name of the creditor's agent")
  public String getCreditorAgentName() {
    return creditorAgentName;
  }

  public void setCreditorAgentName(String creditorAgentName) {
    this.creditorAgentName = creditorAgentName;
  }

  public CommonPaymentAttributes creditorAddress(String creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

   /**
   * The full address of the creditor
   * @return creditorAddress
  **/
  @Schema(description = "The full address of the creditor")
  public String getCreditorAddress() {
    return creditorAddress;
  }

  public void setCreditorAddress(String creditorAddress) {
    this.creditorAddress = creditorAddress;
  }

  public CommonPaymentAttributes creditorStreetName(String creditorStreetName) {
    this.creditorStreetName = creditorStreetName;
    return this;
  }

   /**
   * The street name of the creditor
   * @return creditorStreetName
  **/
  @Schema(description = "The street name of the creditor")
  public String getCreditorStreetName() {
    return creditorStreetName;
  }

  public void setCreditorStreetName(String creditorStreetName) {
    this.creditorStreetName = creditorStreetName;
  }

  public CommonPaymentAttributes creditorBuildingNumber(String creditorBuildingNumber) {
    this.creditorBuildingNumber = creditorBuildingNumber;
    return this;
  }

   /**
   * The building number of the creditor
   * @return creditorBuildingNumber
  **/
  @Schema(description = "The building number of the creditor")
  public String getCreditorBuildingNumber() {
    return creditorBuildingNumber;
  }

  public void setCreditorBuildingNumber(String creditorBuildingNumber) {
    this.creditorBuildingNumber = creditorBuildingNumber;
  }

  public CommonPaymentAttributes creditorPostCode(String creditorPostCode) {
    this.creditorPostCode = creditorPostCode;
    return this;
  }

   /**
   * The post code of the creditor
   * @return creditorPostCode
  **/
  @Schema(description = "The post code of the creditor")
  public String getCreditorPostCode() {
    return creditorPostCode;
  }

  public void setCreditorPostCode(String creditorPostCode) {
    this.creditorPostCode = creditorPostCode;
  }

  public CommonPaymentAttributes creditorTown(String creditorTown) {
    this.creditorTown = creditorTown;
    return this;
  }

   /**
   * The name of the town/city of the creditor
   * @return creditorTown
  **/
  @Schema(description = "The name of the town/city of the creditor")
  public String getCreditorTown() {
    return creditorTown;
  }

  public void setCreditorTown(String creditorTown) {
    this.creditorTown = creditorTown;
  }

  public CommonPaymentAttributes creditorRegion(String creditorRegion) {
    this.creditorRegion = creditorRegion;
    return this;
  }

   /**
   * The name of the country/region of the creditor
   * @return creditorRegion
  **/
  @Schema(description = "The name of the country/region of the creditor")
  public String getCreditorRegion() {
    return creditorRegion;
  }

  public void setCreditorRegion(String creditorRegion) {
    this.creditorRegion = creditorRegion;
  }

  public CommonPaymentAttributes creditorCountryCode(String creditorCountryCode) {
    this.creditorCountryCode = creditorCountryCode;
    return this;
  }

   /**
   * The ISO code of the creditor&#x27;s country
   * @return creditorCountryCode
  **/
  @Schema(required = true, description = "The ISO code of the creditor's country")
  public String getCreditorCountryCode() {
    return creditorCountryCode;
  }

  public void setCreditorCountryCode(String creditorCountryCode) {
    this.creditorCountryCode = creditorCountryCode;
  }

  public CommonPaymentAttributes amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Payment amount in the specified currency
   * @return amount
  **/
  @Schema(required = true, description = "Payment amount in the specified currency")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public CommonPaymentAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The unstructured description of the payment:   - Most ASPSPs have certain limitations in place when it comes to the formatting of the unstructured payment remittance information (&#x60;description&#x60;).   - Using alphanumeric characters along with &#x60;., ,, -, /, ?, (, ), +, &#x27;&#x60; and spaces as well as keeping the length of the description under 1000 characters should be a safe approach for most ASPSPs (RegExp &#x60;/[A-Za-z0-9.-,()+&#x27;? ]{2,1000}/&#x60;).  - ASPSPs may extend these constraints depending on their core banking system, payment schema and other relevant factors. 
   * @return description
  **/
  @Schema(required = true, description = "The unstructured description of the payment:   - Most ASPSPs have certain limitations in place when it comes to the formatting of the unstructured payment remittance information (`description`).   - Using alphanumeric characters along with `., ,, -, /, ?, (, ), +, '` and spaces as well as keeping the length of the description under 1000 characters should be a safe approach for most ASPSPs (RegExp `/[A-Za-z0-9.-,()+'? ]{2,1000}/`).  - ASPSPs may extend these constraints depending on their core banking system, payment schema and other relevant factors. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CommonPaymentAttributes purposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

   /**
   * ISO 18245 purpose code
   * @return purposeCode
  **/
  @Schema(description = "ISO 18245 purpose code")
  public String getPurposeCode() {
    return purposeCode;
  }

  public void setPurposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
  }

  public CommonPaymentAttributes date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date when to execute the payment. Defaults to the &#x60;current date&#x60;.
   * @return date
  **/
  @Schema(description = "The date when to execute the payment. Defaults to the `current date`.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CommonPaymentAttributes time(String time) {
    this.time = time;
    return this;
  }

   /**
   * The precise time when to execute the payment. Defaults to the &#x60;current time&#x60;.
   * @return time
  **/
  @Schema(description = "The precise time when to execute the payment. Defaults to the `current time`.")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonPaymentAttributes commonPaymentAttributes = (CommonPaymentAttributes) o;
    return Objects.equals(this.endToEndId, commonPaymentAttributes.endToEndId) &&
        Objects.equals(this.reference, commonPaymentAttributes.reference) &&
        Objects.equals(this.customerLastLoggedAt, commonPaymentAttributes.customerLastLoggedAt) &&
        Objects.equals(this.customerIpAddress, commonPaymentAttributes.customerIpAddress) &&
        Objects.equals(this.customerIpPort, commonPaymentAttributes.customerIpPort) &&
        Objects.equals(this.customerDeviceOs, commonPaymentAttributes.customerDeviceOs) &&
        Objects.equals(this.customerUserAgent, commonPaymentAttributes.customerUserAgent) &&
        Objects.equals(this.customerLatitude, commonPaymentAttributes.customerLatitude) &&
        Objects.equals(this.customerLongitude, commonPaymentAttributes.customerLongitude) &&
        Objects.equals(this.debtorName, commonPaymentAttributes.debtorName) &&
        Objects.equals(this.debtorAddress, commonPaymentAttributes.debtorAddress) &&
        Objects.equals(this.debtorStreetName, commonPaymentAttributes.debtorStreetName) &&
        Objects.equals(this.debtorBuildingNumber, commonPaymentAttributes.debtorBuildingNumber) &&
        Objects.equals(this.debtorPostCode, commonPaymentAttributes.debtorPostCode) &&
        Objects.equals(this.debtorTown, commonPaymentAttributes.debtorTown) &&
        Objects.equals(this.debtorRegion, commonPaymentAttributes.debtorRegion) &&
        Objects.equals(this.debtorCountryCode, commonPaymentAttributes.debtorCountryCode) &&
        Objects.equals(this.creditorName, commonPaymentAttributes.creditorName) &&
        Objects.equals(this.creditorAgent, commonPaymentAttributes.creditorAgent) &&
        Objects.equals(this.creditorAgentName, commonPaymentAttributes.creditorAgentName) &&
        Objects.equals(this.creditorAddress, commonPaymentAttributes.creditorAddress) &&
        Objects.equals(this.creditorStreetName, commonPaymentAttributes.creditorStreetName) &&
        Objects.equals(this.creditorBuildingNumber, commonPaymentAttributes.creditorBuildingNumber) &&
        Objects.equals(this.creditorPostCode, commonPaymentAttributes.creditorPostCode) &&
        Objects.equals(this.creditorTown, commonPaymentAttributes.creditorTown) &&
        Objects.equals(this.creditorRegion, commonPaymentAttributes.creditorRegion) &&
        Objects.equals(this.creditorCountryCode, commonPaymentAttributes.creditorCountryCode) &&
        Objects.equals(this.amount, commonPaymentAttributes.amount) &&
        Objects.equals(this.description, commonPaymentAttributes.description) &&
        Objects.equals(this.purposeCode, commonPaymentAttributes.purposeCode) &&
        Objects.equals(this.date, commonPaymentAttributes.date) &&
        Objects.equals(this.time, commonPaymentAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndId, reference, customerLastLoggedAt, customerIpAddress, customerIpPort, customerDeviceOs, customerUserAgent, customerLatitude, customerLongitude, debtorName, debtorAddress, debtorStreetName, debtorBuildingNumber, debtorPostCode, debtorTown, debtorRegion, debtorCountryCode, creditorName, creditorAgent, creditorAgentName, creditorAddress, creditorStreetName, creditorBuildingNumber, creditorPostCode, creditorTown, creditorRegion, creditorCountryCode, amount, description, purposeCode, date, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonPaymentAttributes {\n");
    
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    customerLastLoggedAt: ").append(toIndentedString(customerLastLoggedAt)).append("\n");
    sb.append("    customerIpAddress: ").append(toIndentedString(customerIpAddress)).append("\n");
    sb.append("    customerIpPort: ").append(toIndentedString(customerIpPort)).append("\n");
    sb.append("    customerDeviceOs: ").append(toIndentedString(customerDeviceOs)).append("\n");
    sb.append("    customerUserAgent: ").append(toIndentedString(customerUserAgent)).append("\n");
    sb.append("    customerLatitude: ").append(toIndentedString(customerLatitude)).append("\n");
    sb.append("    customerLongitude: ").append(toIndentedString(customerLongitude)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAddress: ").append(toIndentedString(debtorAddress)).append("\n");
    sb.append("    debtorStreetName: ").append(toIndentedString(debtorStreetName)).append("\n");
    sb.append("    debtorBuildingNumber: ").append(toIndentedString(debtorBuildingNumber)).append("\n");
    sb.append("    debtorPostCode: ").append(toIndentedString(debtorPostCode)).append("\n");
    sb.append("    debtorTown: ").append(toIndentedString(debtorTown)).append("\n");
    sb.append("    debtorRegion: ").append(toIndentedString(debtorRegion)).append("\n");
    sb.append("    debtorCountryCode: ").append(toIndentedString(debtorCountryCode)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAgentName: ").append(toIndentedString(creditorAgentName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorStreetName: ").append(toIndentedString(creditorStreetName)).append("\n");
    sb.append("    creditorBuildingNumber: ").append(toIndentedString(creditorBuildingNumber)).append("\n");
    sb.append("    creditorPostCode: ").append(toIndentedString(creditorPostCode)).append("\n");
    sb.append("    creditorTown: ").append(toIndentedString(creditorTown)).append("\n");
    sb.append("    creditorRegion: ").append(toIndentedString(creditorRegion)).append("\n");
    sb.append("    creditorCountryCode: ").append(toIndentedString(creditorCountryCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
