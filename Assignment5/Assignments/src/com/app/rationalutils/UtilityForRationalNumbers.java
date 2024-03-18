package com.app.rationalutils;

import java.util.Scanner;

import com.app.ratinal.RationalNumberCalculator;

public class UtilityForRationalNumbers {
	private static RationalNumberCalculator r1;
	private static RationalNumberCalculator r2;
	private static Scanner sc;
	static {
		sc=new Scanner(System.in);
	}
	public static void  accept() {
		System.out.println("enter 1stno:numerator and denominator");
		r1=new RationalNumberCalculator(sc.nextInt(),sc.nextInt());
		System.out.println("enter 2stno:numerator and denominator");
		r2=new RationalNumberCalculator(sc.nextInt(),sc.nextInt());
		}
	public static  boolean isValid() {
		return r1.getDenominator()!=0 && r2.getDenominator()!=0;
	}
		public static void  calculator(char choice) {
			if(isValid()) {
	switch(choice) {
	case '+':
		int numerator=((r1.getNumerator()*r2.getDenominator())+(r2.getNumerator()*r1.getDenominator()));
		int denominator=(r1.getDenominator()*r2.getDenominator());
		System.out.println("the result of the opr + is "+numerator+"/"+denominator);
		break;
	case '-':
		int numerator1=((r1.getNumerator()*r2.getDenominator())-(r2.getNumerator()*r1.getDenominator()));
		int denominator1=(r1.getDenominator()*r2.getDenominator());
		System.out.println("the result of the opr - is "+numerator1+"/"+denominator1);
		break;
	case '*':
		int numerator3=(r1.getNumerator()*r2.getNumerator());
		int denominator3=(r1.getDenominator()*r2.getDenominator());
		System.out.println("the result of the opr * is "+numerator3+"/"+denominator3);
		break;
	case '/':
		int numerator4=(r1.getNumerator()*r2.getDenominator());
		int denominator4=(r1.getDenominator()*r2.getNumerator());
		System.out.println("the result of the opr / is "+numerator4+"/"+denominator4);
		
		break;
default:
		System.out.println("invalid choice");
		}
			}
			System.out.println("nos are invalid they may throw exception");
	
}
		public static int menu() {
			System.out.println("1:accpet two numbers\n2:Calculator:\n0:exit");
			return sc.nextInt();
		}
}
