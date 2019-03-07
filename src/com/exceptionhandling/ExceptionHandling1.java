package com.exceptionhandling;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {

		m();
		System.out.println("within the main method");
		
	}
	
	public static void m()
	{
		p();
		System.out.println(Integer.parseInt("123"));
	}
	
	public static void p()
	{
		//System.out.println("hello"+args[0]);
				System.out.println(10/5);
				System.out.println("welcome to java");
	}

}
