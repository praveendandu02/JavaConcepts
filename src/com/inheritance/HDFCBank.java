package com.inheritance;

public class HDFCBank extends Bank {
	String location;
	int m = 5;

	public HDFCBank(String bankName, String ifscCode, Account account, String location) {
		super(bankName, ifscCode, account);
		this.location = location;
		
	}
	
	public double getInterestRate()
	{
		return 1.24;
	}
	
	public void display()
	{
		super.display();
		System.out.println(super.m);
	}

}
