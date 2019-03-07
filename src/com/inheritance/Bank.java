package com.inheritance;

public abstract class Bank {
	
	String bankName;
	String ifscCode;
	Account account;
	private static final double minimumBalance = 1000.00;
	int m = 10;
	
	public Bank(String bankName, String ifscCode, Account account) {
		super();
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.account = account;
	}
	
	
	
	public final void Deposit(int accountNo, double amount)
	{
		if(account.accountNo == accountNo)
		{
			account.balance = account.balance+amount;
			
			//minimumBalance = minimumBalance+100;
			
			System.out.println(amount +"Successfully Credited");
			System.out.println("your avilable balance is"+ account.balance);
		}
		
		else
		{
			System.out.println("invalid account");
		}
	}
	
	public void Withdrawl(int accountNo, double amount)
	{
		if(account.accountNo==accountNo)
		{
			account.balance = account.balance-amount;
			
			System.out.println("avilable balance is"+account.balance);
		}
	}
	
	public abstract double getInterestRate();
	
	
	public void display()
	{
		System.out.println("with in the bank class");
	}
	
	

}
