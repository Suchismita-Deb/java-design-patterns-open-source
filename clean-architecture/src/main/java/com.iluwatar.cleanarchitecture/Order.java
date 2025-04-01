package com.iluwatar.cleanarchitecture;

import lombok.Getter;
import java.util.List;

@Getter
public class Order {
  private String orderId;
  private List<Cart> items;
  private double totalPrice;

  public Order(String orderId, List<Cart> items) {
    this.orderId = orderId;
    this.items = items;
    this.totalPrice = items.stream().mapToDouble(Cart::getTotalPrice).sum();
  }
}
