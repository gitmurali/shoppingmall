package com.shoppingmall.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author muralinutalapati
 */
@Entity
@Table(name = "products")
public class Product {

  @Id
  @Column(name = "productCode")
  private String productCode;
  private String productName;
  private BigDecimal buyPrice;

  public Product(String productName, BigDecimal buyPrice) {
    this.productName = productName;
    this.buyPrice = buyPrice;
  }

  public Product() {
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(BigDecimal buyPrice) {
    this.buyPrice = buyPrice;
  }
}
