package com.iluwatar.cleanarchitecture;

import lombok.Getter;

@Getter
public class Cart {
  private Product product;
  private int quantity;

  public Cart(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public double getTotalPrice() {
    return product.getPrice() * quantity;
  }

}
