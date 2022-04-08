package com.hexaware.oopsexample.accessspecifiers;

public class Product {
	
	private int productId;
	private String productName;
	private float productPrice;
	
	public void readProductDetails(){
		//local variables cannot be specified with access specifiers
		int n;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
