package com.app.credit.helper;

import com.app.creditcalculator.CreditScoreCalculator;

public class CreditMain {

	public static void main(String[] args) {
		CreditScoreCalculator calC=new CreditScoreCalculator(5000, 500.5, true);
		System.out.println("the creditScore is "+calC.calculateCreditScore());

	}

}
