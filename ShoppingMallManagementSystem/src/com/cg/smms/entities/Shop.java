package com.cg.smms.entities;

import java.rmi.dgc.Lease;
import java.util.List;

public class Shop {
private long shopId;
private enum shopCategory{ WHOLESALE , RETAIL };
private List<Employee>shopEmployees; 
private String shopName;
private List<Customer> customers;
private enum shopStatus{ OPEN , CLOSED};
private ShopOwner shopOwner;
private Lease leaseStatus;


}
