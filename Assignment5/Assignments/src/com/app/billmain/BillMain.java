package com.app.billmain;

import com.app.electricbill.ElectricBill;

public class BillMain {

	public static void main(String[] args) {
	ElectricBill bill1=new ElectricBill("paras", 205);
	System.out.println("the bill of the person is "+bill1.calBillAmt());

	}

}
