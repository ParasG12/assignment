package com.app.bmi.tester;

import java.util.Scanner;

import com.app.bmi.BmICalculator;

public class BMITESTER {
private static BmICalculator bmiObj;
static {
	bmiObj=new BmICalculator();
}
private static Scanner sc=new Scanner(System.in);
public static void accept() {
	System.out.println("enter height and weight");
	bmiObj.setHeight(sc.nextDouble());
	bmiObj.setWeight(sc.nextDouble());
}
public static void print() {
	System.out.println("the height of the person is "+bmiObj.getHeight()+" and width is "+bmiObj.getWeight());
}
public static void calcBmi() {
	System.out.println("the bmi fo the person is "+bmiObj.calculateBMI());
}
public static int options() {
	System.out.println("1:accept person\n2:display person\n3:calcBmi\n4:exit");
	return sc.nextInt();
}
	
	

}
