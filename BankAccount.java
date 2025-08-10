package com.sathya.bank;

public class BankAccount  {
	int balance;
	public BankAccount(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		 return balance;
		
	}
	
	 
	 
		 
	
	 void deposit(int amount) {
		 if (amount<0) {
		throw new NegativeNumberException("your current blance is not suuffecient it is in found  to be negetive");
		}
		 else {
			 balance=balance+amount;
			 System.out.println(balance);
		 }
	 }
		void withdraw(int amount) {
			if(amount<0) {
				throw new NegativeNumberException("your current blance is not suffecient it is in found  to be negetive");
			}
			else if(amount>balance) {
				throw new InsufficentFundsException("your balance is insuffecent");
			}
			else
			{
				balance=balance-amount;
				System.out.println(balance);
			}
			
			
			
			
			
		}
	 }
	 


