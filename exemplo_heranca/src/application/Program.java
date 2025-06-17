package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002,"Maria", 0.0, 500.0);
		
		//upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 1000.0, 500.0);
		Account acc3 = new SavingsAccount(1003, "Anna", 1000.0, 0.01);
		
		//downcasting
		
		BusinessAcount acc4 = (BusinessAcount) acc2;
		acc4.loan(100.0);
		
		//BusinessAcount acc5 = (BusinessAcount) acc3;
		
//		if(acc3 instanceof BusinessAcount){
//			BusinessAcount acc5 = (BusinessAcount) acc3;
//			acc5.loan(200.0);
//			System.out.println("loan!");
//		}
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("Update");
//		}
		
//		acc.deposit(1000.00);
//		acc.withdraw(200.00);
//		System.out.println(acc.getBalance());
//		
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		
//		acc3.withdraw(200.00);
//		System.out.println(acc3.getBalance());
		
	}	
}
