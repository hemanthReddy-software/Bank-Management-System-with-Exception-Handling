package com.sathya.bank;

import java.util.Scanner;

public class Custemer {
	 

	public static void main(String[] args) {
		BankAccount account=new BankAccount(1000);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Bank Account Created Sussfully");
		System.out.println("Your total Available Balance.. "+account.getBalance());
		System.out.println("Enter the trascation type 1.Deposite 2.Withdraw");
		try
		{
		 int num=scanner.nextInt();
		
		 
		 if(num==1) {
			 System.out.println("you selected Deposite Option");
			 System.out.println("Enter amount to deposite ");
			 int dep=scanner.nextInt();
			 System.out.println("Total Available balance amount ");
			 account.deposit(dep);
			 
			 
		 }
		 
		 
		 
		 if(num==2)
		 {
			 System.out.println("you selected withdraw Option");
			 System.out.println("Enter amount to withdraw ");
			 int withd=scanner.nextInt();
			 System.out.println("Total Available balance amount ");
			 account.withdraw(withd);
			 
			 
		 }
		 
		 
		}
		finally
		{
			scanner.close();
		}

	}

}
