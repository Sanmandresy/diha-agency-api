/*
 * diha-agency-api
 * An early version of an API for a travel Agency named \"Diha Agency\".
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PreTransaction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T20:17:02.734Z[GMT]")
public class PreTransaction {
  @SerializedName("client")
  private AllOfPreTransactionClient client = null;

  @SerializedName("client_card_ref")
  private String clientCardRef = null;

  @SerializedName("amount")
  private Integer amount = null;

  public PreTransaction client(AllOfPreTransactionClient client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public AllOfPreTransactionClient getClient() {
    return client;
  }

  public void setClient(AllOfPreTransactionClient client) {
    this.client = client;
  }

  public PreTransaction clientCardRef(String clientCardRef) {
    this.clientCardRef = clientCardRef;
    return this;
  }

   /**
   * Get clientCardRef
   * @return clientCardRef
  **/
  @Schema(description = "")
  public String getClientCardRef() {
    return clientCardRef;
  }

  public void setClientCardRef(String clientCardRef) {
    this.clientCardRef = clientCardRef;
  }

  public PreTransaction amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreTransaction preTransaction = (PreTransaction) o;
    return Objects.equals(this.client, preTransaction.client) &&
        Objects.equals(this.clientCardRef, preTransaction.clientCardRef) &&
        Objects.equals(this.amount, preTransaction.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, clientCardRef, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreTransaction {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientCardRef: ").append(toIndentedString(clientCardRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
