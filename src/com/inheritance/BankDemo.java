package com.inheritance;

public class BankDemo {

	public static void main(String[] args) {
		
		Account ac = new Account(23445555, 2000.20);

		HDFCBank hdfc = new HDFCBank("hdfcbanklimited", "HDFC1234", ac, "hyderabad");
		
		hdfc.Deposit(23445555, 2000);
		
		Bank bank = new HDFCBank("hdfcbanklimited", "HDFC1234", ac, "hyderabad");
		bank.getInterestRate();
		bank.display();
		
	}

}

