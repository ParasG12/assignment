package com.app.bank;

public class BankAccount {

private String aName;
private long accNo;
private double bal;
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public boolean isValid(long accNo) {
	return this.accNo==accNo;
}
public BankAccount(String aName, long accNo, double bal) {
	super();
	this.aName = aName;
	this.accNo = accNo;
	this.bal = bal;
}
public void deposit(double amt) {
	if(amt>0) {
		bal+=amt;
		System.out.println("deposit success");
	}
	else {
	System.out.println("cant deposit less than equal zero amt");
	}
}
public void withdraw(double amt) {
	if(amt>bal) {
		System.out.println("insufficient bal cant withdraw");
	}
	bal-=amt;
	System.out.println("withdraw success");
}
public void display() {
	System.out.println("the accntholder name is "+aName+"accNo is "+accNo+" bal is "+bal);
}
}
