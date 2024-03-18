package com.app.book.main;

import static com.app.book.tester.BookTester.*;

import java.util.Scanner;

public class BookMain {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int choice=0;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				acceptBook();
				break;
			case 2:
				displayBook();
				break;
			case 3:
				System.out.println("enter quantity to inc");
				incQuantity(sc.nextInt());
				break;
			case 4:
				System.out.println("enter quantity to inc");
				decQuantity(sc.nextInt());
				break;
			case 5:
				System.out.println("the inv value is "+getInventoryValue());
				break;
			}
		}
	

	}

}
