package com.Encapsulation.java;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a=new Account();
		a.setAccName("Johnn");
		System.out.println(a.getAccName());
		
		a.setAccNo(1290);
		System.out.println(a.getAccNo());
		
		a.setAmount(20000);
		System.out.println(a.getAmount());

	}

}
