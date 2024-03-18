package com.app.creditcalculator;

public class CreditScoreCalculator {
private int creditHistory;
private double creditUtilization;
private boolean paymentHistory;
public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
	super();
	this.creditHistory = creditHistory;
	this.creditUtilization = creditUtilization;
	this.paymentHistory = paymentHistory;
}
public int getCreditHistory() {
	return creditHistory;
}
public void setCreditHistory(int creditHistory) {
	this.creditHistory = creditHistory;
}
public double getCreditUtilization() {
	return creditUtilization;
}
public void setCreditUtilization(double creditUtilization) {
	this.creditUtilization = creditUtilization;
}
public boolean isPaymentHistory() {
	return paymentHistory;
}
public void setPaymentHistory(boolean paymentHistory) {
	this.paymentHistory = paymentHistory;
}
public int calculateCreditScore() {
if(paymentHistory) {
	return creditHistory*15+(int)(creditUtilization*30)+55;
}
System.out.println("he dont have a goodcredithistory");
return (creditHistory * 15) + (int)(creditUtilization * 30) + 3;
}



}
