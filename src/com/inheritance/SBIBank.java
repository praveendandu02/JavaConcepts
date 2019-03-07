package com.inheritance;

public class SBIBank extends Bank {
	
	

	public SBIBank(String bankName, String ifscCode, Account account) {
		super(bankName, ifscCode, account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 5.4;
	}


}
