package com.app.electricbill;

public class ElectricBill {
private String cName;
private double uConsumed;
private double bAmt;
public ElectricBill(String cName, double uConsumed) {
	super();
	this.cName = cName;
	this.uConsumed = uConsumed;
	
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public double getuConsumed() {
	return uConsumed;
}
public void setuConsumed(double uConsumed) {
	this.uConsumed = uConsumed;
}

public double calBillAmt() {
	double bill;
	if(uConsumed<=0) {
		return 0.0;
	}
	if(uConsumed<=100) {
		bill=uConsumed*5;
	}
	else if(uConsumed<=300) {
		bill=(100*5)+(uConsumed-100)*7;
	}
	else {
		bill=(100*5)+(200*7)+(uConsumed-300)*10;
	}
   bAmt=bill;
   return bAmt;
}
}
//Create a class named "ElectricityBill" that has the following instance variables:
//a. customerName (String)
//b. unitsConsumed (double)
//c. billAmount (double)
//Create a constructor that initializes the customerName and unitsConsumed instance
//variables.
//Define a method named "calculateBillAmount" that calculates the bill amount based
//on the number of units consumed. The formula for calculating the bill amount is:
//a. For the first 100 units: Rs. 5 per unit
//b. For the next 200 units: Rs. 7 per unit
//c. For the remaining units: Rs. 10 per unit
//Core Java Assignment 2
//Designed by Sandeep Kulange
//Implement the "calculateBillAmount" method in the "ElectricityBill" class.
//Define a main method that creates an object of the "ElectricityBill" class and sets the
//customerName and unitsConsumed instance variables. Then, call the
//"calculateBillAmount" method to calculate the bill amount and display the
//customerName, unitsConsumed, and billAmount
