package com.app.telephonebill;

public class TelephoneBill {
private String cName;
private long phoneNo;
private int numCallsMade;
private double duration;
public TelephoneBill(String cName, long phoneNo, int numCallsMade, double duration) {
	super();
	this.cName = cName;
	this.phoneNo = phoneNo;
	this.numCallsMade = numCallsMade;
	this.duration = duration;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public int getNumCallsMade() {
	return numCallsMade;
}
public void setNumCallsMade(int numCallsMade) {
	this.numCallsMade = numCallsMade;
}
public double getDuration() {
	return duration;
}
public void setDuration(int duration) {
	if(duration<1) {
		this.duration=1;
		return;
	}
	this.duration = duration;
}
public double calcBill() {
	double Bill;
	if(numCallsMade<=0) {
		return 100;
	}
	else {
	if(numCallsMade<=100) {
		Bill=numCallsMade*0.5;
	}
	else  {
	Bill=100*0.5+(numCallsMade-100)*0.25;
	}}
	return Bill+100;
}

}
