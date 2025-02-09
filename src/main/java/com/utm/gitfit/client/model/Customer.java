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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
/**
 * A customer represents a person who will be using your application. You need to store the &#x60;id&#x60; returned from the response in your application, which is necessary when creating payments. 
 */
@Schema(description = "A customer represents a person who will be using your application. You need to store the `id` returned from the response in your application, which is necessary when creating payments. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-21T15:13:42.040Z[GMT]")
public class Customer {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Customer id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Creates a customer, returning the customer object.
   * @return id
  **/
  @Schema(required = true, description = "Creates a customer, returning the customer object.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Customer identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * A unique identifier of the new customer
   * @return identifier
  **/
  @Schema(required = true, description = "A unique identifier of the new customer")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Customer secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Customer secret.
   * @return secret
  **/
  @Schema(required = true, description = "Customer secret.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Customer createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * when the customer was created
   * @return createdAt
  **/
  @Schema(required = true, description = "when the customer was created")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Customer updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * when the customer was updated
   * @return updatedAt
  **/
  @Schema(required = true, description = "when the customer was updated")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.identifier, customer.identifier) &&
        Objects.equals(this.secret, customer.secret) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier, secret, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
