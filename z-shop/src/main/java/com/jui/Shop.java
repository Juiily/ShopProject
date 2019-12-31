package com.jui;

public class Shop {
	
	int CustId;
	int Total;
	
	

	public int getCustId() {
		return CustId;
	}



	public void setCustId(int custId) {
		CustId = custId;
	}



	public int getTotal() {
		return Total;
	}



	public void setTotal(int total) {
		Total = total;
	}



	public Shop(int custId, int total) {
		super();
		CustId = custId;
		Total = total;
	}



	public static void main(String[] args) {
		
		
		Shop s = new Shop(12 , 1050);
		
		System.out.println("Enter customer id:");
		
		

	}

}
