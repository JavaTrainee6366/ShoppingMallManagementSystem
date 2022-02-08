package com.cg.smms.entities;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDetails {
private long id;
private LocalDateTime dateOfPurchase;
private float total;
private List<Customer>customers;
private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING};
private Customer customer;
private Shop shop;
}
