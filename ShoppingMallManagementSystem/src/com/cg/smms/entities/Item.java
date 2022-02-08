package com.cg.smms.entities;

import java.time.LocalDate;

public class Item {
	private long id;
	private String itemName;
	private double price;
	private LocalDate manufacturingDate;
	private LocalDate expiry;
	private enum category{ CLOTHING, MOBILES, ACCESSIORIES }
	

}
