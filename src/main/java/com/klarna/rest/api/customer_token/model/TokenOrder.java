/*
 * Customer Tokens
 * The Customer Token API is used to charge customers with a tokenized Klarna payment method and can be used for recurring purchases, subscriptions and for storing a customer's payment method. Tokens are created using the [generate a customer token](#payments-api-generate-a-consumer-token) call in the payments API.
 *
 * OpenAPI spec version: 3.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.customer_token.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TokenOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-02T11:40:30.975Z")
public class TokenOrder {
  @JsonProperty("fraud_status")
  private String fraudStatus = null;

  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("redirect_url")
  private String redirectUrl = null;

  public TokenOrder fraudStatus(String fraudStatus) {
    this.fraudStatus = fraudStatus;
    return this;
  }

   /**
   * Get fraudStatus
   * @return fraudStatus
  **/
  @ApiModelProperty(value = "")
  public String getFraudStatus() {
    return fraudStatus;
  }

  public void setFraudStatus(String fraudStatus) {
    this.fraudStatus = fraudStatus;
  }

  public TokenOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TokenOrder redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenOrder order = (TokenOrder) o;
    return Objects.equals(this.fraudStatus, order.fraudStatus) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.redirectUrl, order.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudStatus, orderId, redirectUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenOrder {\n");
    
    sb.append("    fraudStatus: ").append(toIndentedString(fraudStatus)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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
