package com.app.bank;

import java.util.Scanner;

public class BankAccountMain {
	public static int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Create a new account\n2:Deposit money into an account\n3:Withdraw money from an account\n4:Display the account balance:\n5:Display the account info");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount bObj=null;
		int choice;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				bObj=new BankAccount("paras", 12345, 5000);
				break;
			case 2:
				if(bObj!=null) {
				bObj.deposit(500);
				}
				break;
			case 3:
				if(bObj!=null) {
				bObj.withdraw(200);
				}
				break;
			case 4:
				if(bObj!=null) {
					System.out.println("enter accNo");
					if(bObj.isValid(sc.nextLong())) {
			 System.out.println("the accBal is "+bObj.getBal());
					}
					else {
						System.out.println("invalid credentials");
					}
				}
				break;
			case 5:
				if(bObj!=null) {
					System.out.println("enter accNo");
					if(bObj.isValid(sc.nextLong())) {
				bObj.display();
					}
					else {
						System.out.println("invalid credentials");
					}
					}
				break;
			}
		}
		
		

	}

}
