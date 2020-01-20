/*
 * Klarna Settlements API
 * This API gives you access to your payouts and transactions.     Resources are split into two broad types:     * Collections, including pagination information:      collections are queryable, typically by the attributes of the sub-resource      as well as pagination.    * Entity resources containing a single entity.
 *
 * OpenAPI spec version: 1.0.0-rc2
 * Contact: integration@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.settlements.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * SettlementsTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T11:18:02.332Z")
public class SettlementsTransaction {
  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("capture_id")
  private UUID captureId = null;

  @JsonProperty("merchant_reference1")
  private String merchantReference1 = null;

  @JsonProperty("sale_date")
  private OffsetDateTime saleDate = null;

  /**
   * The type of transaction.
   */
  public enum TypeEnum {
    COMMISSION("COMMISSION"),
    
    SALE("SALE"),
    
    REVERSAL("REVERSAL"),
    
    RETURN("RETURN"),
    
    FEE("FEE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("capture_date")
  private OffsetDateTime captureDate = null;

  @JsonProperty("payment_reference")
  private String paymentReference = null;

  @JsonProperty("order_id")
  private UUID orderId = null;

  @JsonProperty("payout")
  private String payout = null;

  @JsonProperty("refund_id")
  private UUID refundId = null;

  @JsonProperty("short_order_id")
  private String shortOrderId = null;

  @JsonProperty("merchant_reference2")
  private String merchantReference2 = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("purchase_country")
  private String purchaseCountry = null;

  @JsonProperty("vat_rate")
  private Integer vatRate = null;

  @JsonProperty("vat_amount")
  private Integer vatAmount = null;

  @JsonProperty("shipping_country")
  private String shippingCountry = null;

  @JsonProperty("initial_payment_method_type")
  private String initialPaymentMethodType = null;

  @JsonProperty("initial_number_of_installments")
  private Integer initialNumberOfInstallments = null;

  @JsonProperty("merchant_capture_reference")
  private String merchantCaptureReference = null;

  @JsonProperty("merchant_refund_reference")
  private String merchantRefundReference = null;

  /**
   * Detailed description of the transaction type
   */
  public enum DetailedTypeEnum {
    LOAN_AMORTISATION("LOAN_AMORTISATION"),
    
    COMMISSION("COMMISSION"),
    
    CREDITED_CORRECTION("CREDITED_CORRECTION"),
    
    LOAN_FEE("LOAN_FEE"),
    
    LOAN_PAYOUT("LOAN_PAYOUT"),
    
    FEE_REFUND("FEE_REFUND"),
    
    EXPIRY_FEE_GROSS("EXPIRY_FEE_GROSS"),
    
    LATE_RETURN_FEE("LATE_RETURN_FEE"),
    
    PURCHASE_FEE_FIXED("PURCHASE_FEE_FIXED"),
    
    PURCHASE_FEE_PERCENTAGE("PURCHASE_FEE_PERCENTAGE"),
    
    SERVICING_FEE("SERVICING_FEE"),
    
    PURCHASE_RETURN("PURCHASE_RETURN"),
    
    COMMISSION_RETURN("COMMISSION_RETURN"),
    
    REVERSAL("REVERSAL"),
    
    FRAUD_POLICY_CHARGE("FRAUD_POLICY_CHARGE"),
    
    FRAUD_POLICY_CREDIT_NET("FRAUD_POLICY_CREDIT_NET"),
    
    PURCHASE("PURCHASE");

    private String value;

    DetailedTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DetailedTypeEnum fromValue(String text) {
      for (DetailedTypeEnum b : DetailedTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("detailed_type")
  private DetailedTypeEnum detailedType = null;

  public SettlementsTransaction amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total amount of the specific transaction, in minor units
   * @return amount
  **/
  @ApiModelProperty(example = "2000", required = true, value = "Total amount of the specific transaction, in minor units")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public SettlementsTransaction captureId(UUID captureId) {
    this.captureId = captureId;
    return this;
  }

   /**
   * The Klarna assigned id reference of a specific capture
   * @return captureId
  **/
  @ApiModelProperty(example = "33db6f16-9f43-43fa-a587-cc51411c98e4", required = true, value = "The Klarna assigned id reference of a specific capture")
  public UUID getCaptureId() {
    return captureId;
  }

  public void setCaptureId(UUID captureId) {
    this.captureId = captureId;
  }

  public SettlementsTransaction merchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
    return this;
  }

   /**
   * Merchant assigned reference, typically a reference to an order management system id
   * @return merchantReference1
  **/
  @ApiModelProperty(value = "Merchant assigned reference, typically a reference to an order management system id")
  public String getMerchantReference1() {
    return merchantReference1;
  }

  public void setMerchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
  }

  public SettlementsTransaction saleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
    return this;
  }

   /**
   * ISO-8601 formatted date-time string
   * @return saleDate
  **/
  @ApiModelProperty(example = "2016-12-14T07:52:26Z", required = true, value = "ISO-8601 formatted date-time string")
  public OffsetDateTime getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(OffsetDateTime saleDate) {
    this.saleDate = saleDate;
  }

  public SettlementsTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of transaction.
   * @return type
  **/
  @ApiModelProperty(example = "SALE", required = true, value = "The type of transaction.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SettlementsTransaction captureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
    return this;
  }

   /**
   * ISO-8601 formatted date-time string
   * @return captureDate
  **/
  @ApiModelProperty(example = "2016-12-14T07:52:26Z", required = true, value = "ISO-8601 formatted date-time string")
  public OffsetDateTime getCaptureDate() {
    return captureDate;
  }

  public void setCaptureDate(OffsetDateTime captureDate) {
    this.captureDate = captureDate;
  }

  public SettlementsTransaction paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * Reference to the specific payout the transaction is part of, if available.
   * @return paymentReference
  **/
  @ApiModelProperty(example = "XISA93DJ", value = "Reference to the specific payout the transaction is part of, if available.")
  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public SettlementsTransaction orderId(UUID orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * The Klarna assigned order id reference
   * @return orderId
  **/
  @ApiModelProperty(example = "ce17b4cb-147f-48b7-b8e6-dde2fa397f04", required = true, value = "The Klarna assigned order id reference")
  public UUID getOrderId() {
    return orderId;
  }

  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }

  public SettlementsTransaction payout(String payout) {
    this.payout = payout;
    return this;
  }

   /**
   * Link to the payout that this transaction is part of
   * @return payout
  **/
  @ApiModelProperty(example = "https://{settlements_api}/payouts/XISA93DJ", value = "Link to the payout that this transaction is part of")
  public String getPayout() {
    return payout;
  }

  public void setPayout(String payout) {
    this.payout = payout;
  }

  public SettlementsTransaction refundId(UUID refundId) {
    this.refundId = refundId;
    return this;
  }

   /**
   * The Klarna assigned id reference of a specific refund
   * @return refundId
  **/
  @ApiModelProperty(example = "ef1baa1f-b42e-44be-b9e4-4b94510b53e5", value = "The Klarna assigned id reference of a specific refund")
  public UUID getRefundId() {
    return refundId;
  }

  public void setRefundId(UUID refundId) {
    this.refundId = refundId;
  }

  public SettlementsTransaction shortOrderId(String shortOrderId) {
    this.shortOrderId = shortOrderId;
    return this;
  }

   /**
   * The Klarna assigned short order id reference
   * @return shortOrderId
  **/
  @ApiModelProperty(example = "shortrid", value = "The Klarna assigned short order id reference")
  public String getShortOrderId() {
    return shortOrderId;
  }

  public void setShortOrderId(String shortOrderId) {
    this.shortOrderId = shortOrderId;
  }

  public SettlementsTransaction merchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
    return this;
  }

   /**
   * Merchant assigned reference, typically a reference to an order management system id
   * @return merchantReference2
  **/
  @ApiModelProperty(value = "Merchant assigned reference, typically a reference to an order management system id")
  public String getMerchantReference2() {
    return merchantReference2;
  }

  public void setMerchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
  }

  public SettlementsTransaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO-3166 Currency Code.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "ISO-3166 Currency Code.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public SettlementsTransaction purchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
    return this;
  }

   /**
   * ISO Alpha-2 Country Code
   * @return purchaseCountry
  **/
  @ApiModelProperty(example = "PL", required = true, value = "ISO Alpha-2 Country Code")
  public String getPurchaseCountry() {
    return purchaseCountry;
  }

  public void setPurchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
  }

  public SettlementsTransaction vatRate(Integer vatRate) {
    this.vatRate = vatRate;
    return this;
  }

   /**
   * VAT (Value added tax) rate on Klarna fees
   * @return vatRate
  **/
  @ApiModelProperty(example = "2000", value = "VAT (Value added tax) rate on Klarna fees")
  public Integer getVatRate() {
    return vatRate;
  }

  public void setVatRate(Integer vatRate) {
    this.vatRate = vatRate;
  }

  public SettlementsTransaction vatAmount(Integer vatAmount) {
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * VAT (Value added tax) amount on Klarna fees, in minor units
   * @return vatAmount
  **/
  @ApiModelProperty(example = "1000", value = "VAT (Value added tax) amount on Klarna fees, in minor units")
  public Integer getVatAmount() {
    return vatAmount;
  }

  public void setVatAmount(Integer vatAmount) {
    this.vatAmount = vatAmount;
  }

  public SettlementsTransaction shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

   /**
   * ISO Alpha-2 Country Code
   * @return shippingCountry
  **/
  @ApiModelProperty(example = "PL", value = "ISO Alpha-2 Country Code")
  public String getShippingCountry() {
    return shippingCountry;
  }

  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }

  public SettlementsTransaction initialPaymentMethodType(String initialPaymentMethodType) {
    this.initialPaymentMethodType = initialPaymentMethodType;
    return this;
  }

   /**
   * Payment method the consumer chose during checkout
   * @return initialPaymentMethodType
  **/
  @ApiModelProperty(example = "direct_debit", value = "Payment method the consumer chose during checkout")
  public String getInitialPaymentMethodType() {
    return initialPaymentMethodType;
  }

  public void setInitialPaymentMethodType(String initialPaymentMethodType) {
    this.initialPaymentMethodType = initialPaymentMethodType;
  }

  public SettlementsTransaction initialNumberOfInstallments(Integer initialNumberOfInstallments) {
    this.initialNumberOfInstallments = initialNumberOfInstallments;
    return this;
  }

   /**
   * Number of installments the consumer chose during checkout in case of installment payments
   * @return initialNumberOfInstallments
  **/
  @ApiModelProperty(example = "3", value = "Number of installments the consumer chose during checkout in case of installment payments")
  public Integer getInitialNumberOfInstallments() {
    return initialNumberOfInstallments;
  }

  public void setInitialNumberOfInstallments(Integer initialNumberOfInstallments) {
    this.initialNumberOfInstallments = initialNumberOfInstallments;
  }

  public SettlementsTransaction merchantCaptureReference(String merchantCaptureReference) {
    this.merchantCaptureReference = merchantCaptureReference;
    return this;
  }

   /**
   * Your internal reference to the capture, that has been submitted during capturing an order via API
   * @return merchantCaptureReference
  **/
  @ApiModelProperty(value = "Your internal reference to the capture, that has been submitted during capturing an order via API")
  public String getMerchantCaptureReference() {
    return merchantCaptureReference;
  }

  public void setMerchantCaptureReference(String merchantCaptureReference) {
    this.merchantCaptureReference = merchantCaptureReference;
  }

  public SettlementsTransaction merchantRefundReference(String merchantRefundReference) {
    this.merchantRefundReference = merchantRefundReference;
    return this;
  }

   /**
   * Your internal reference to the refund, that has been submitted during refunding an order via API
   * @return merchantRefundReference
  **/
  @ApiModelProperty(value = "Your internal reference to the refund, that has been submitted during refunding an order via API")
  public String getMerchantRefundReference() {
    return merchantRefundReference;
  }

  public void setMerchantRefundReference(String merchantRefundReference) {
    this.merchantRefundReference = merchantRefundReference;
  }

  public SettlementsTransaction detailedType(DetailedTypeEnum detailedType) {
    this.detailedType = detailedType;
    return this;
  }

   /**
   * Detailed description of the transaction type
   * @return detailedType
  **/
  @ApiModelProperty(example = "PURCHASE", value = "Detailed description of the transaction type")
  public DetailedTypeEnum getDetailedType() {
    return detailedType;
  }

  public void setDetailedType(DetailedTypeEnum detailedType) {
    this.detailedType = detailedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementsTransaction transaction = (SettlementsTransaction) o;
    return Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.captureId, transaction.captureId) &&
        Objects.equals(this.merchantReference1, transaction.merchantReference1) &&
        Objects.equals(this.saleDate, transaction.saleDate) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.captureDate, transaction.captureDate) &&
        Objects.equals(this.paymentReference, transaction.paymentReference) &&
        Objects.equals(this.orderId, transaction.orderId) &&
        Objects.equals(this.payout, transaction.payout) &&
        Objects.equals(this.refundId, transaction.refundId) &&
        Objects.equals(this.shortOrderId, transaction.shortOrderId) &&
        Objects.equals(this.merchantReference2, transaction.merchantReference2) &&
        Objects.equals(this.currencyCode, transaction.currencyCode) &&
        Objects.equals(this.purchaseCountry, transaction.purchaseCountry) &&
        Objects.equals(this.vatRate, transaction.vatRate) &&
        Objects.equals(this.vatAmount, transaction.vatAmount) &&
        Objects.equals(this.shippingCountry, transaction.shippingCountry) &&
        Objects.equals(this.initialPaymentMethodType, transaction.initialPaymentMethodType) &&
        Objects.equals(this.initialNumberOfInstallments, transaction.initialNumberOfInstallments) &&
        Objects.equals(this.merchantCaptureReference, transaction.merchantCaptureReference) &&
        Objects.equals(this.merchantRefundReference, transaction.merchantRefundReference) &&
        Objects.equals(this.detailedType, transaction.detailedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, captureId, merchantReference1, saleDate, type, captureDate, paymentReference, orderId, payout, refundId, shortOrderId, merchantReference2, currencyCode, purchaseCountry, vatRate, vatAmount, shippingCountry, initialPaymentMethodType, initialNumberOfInstallments, merchantCaptureReference, merchantRefundReference, detailedType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementsTransaction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    captureId: ").append(toIndentedString(captureId)).append("\n");
    sb.append("    merchantReference1: ").append(toIndentedString(merchantReference1)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    captureDate: ").append(toIndentedString(captureDate)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    shortOrderId: ").append(toIndentedString(shortOrderId)).append("\n");
    sb.append("    merchantReference2: ").append(toIndentedString(merchantReference2)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    purchaseCountry: ").append(toIndentedString(purchaseCountry)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
    sb.append("    initialPaymentMethodType: ").append(toIndentedString(initialPaymentMethodType)).append("\n");
    sb.append("    initialNumberOfInstallments: ").append(toIndentedString(initialNumberOfInstallments)).append("\n");
    sb.append("    merchantCaptureReference: ").append(toIndentedString(merchantCaptureReference)).append("\n");
    sb.append("    merchantRefundReference: ").append(toIndentedString(merchantRefundReference)).append("\n");
    sb.append("    detailedType: ").append(toIndentedString(detailedType)).append("\n");
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

