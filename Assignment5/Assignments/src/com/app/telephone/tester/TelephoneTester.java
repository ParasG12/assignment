package com.app.telephone.tester;

import com.app.telephonebill.TelephoneBill;

public class TelephoneTester {

	public static void main(String[] args) {
		TelephoneBill bill=new TelephoneBill("paras",6388402884l,128,0.5);
		System.out.println("the bill is "+bill.calcBill());
	}

}