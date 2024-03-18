package com.app.rationalmain;
import static com.app.rationalutils.UtilityForRationalNumbers.*;

import java.util.Scanner;
public class RationalMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("lets begin the testing of  two number rational calc!!!");
		int choice;
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				accept();
				break;
			case 2:
				System.out.println("Enter the arithmetic operation (+, -, *, /)");
				calculator(sc.next().charAt(0));
				break;
			}
			
		}
		
		

	}

}
