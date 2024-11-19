package com.abhishekvtcodes.Day2;

public class EncapsulationExample {

	private String accountHolderName;
	private double balance;
	
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public static void main(String[] args) {
		
		EncapsulationExample a = new EncapsulationExample();
		a.setAccountHolderName("Abhishek");
		a.setBalance(100.00);
		
		System.out.println(a.getAccountHolderName());
		System.out.println(a.getBalance());
		
	}
	
	
	

}
