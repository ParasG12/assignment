package com.app.bmi.main;

import com.app.bmi.tester.BMITESTER;
import static com.app.bmi.tester.BMITESTER.*;

public class BMIMAIN {

	public static void main(String[] args) {
		BMITESTER test=new BMITESTER();
		int input=0;
		while((input=options())!=0) {
			switch(input) {
			case 1:
				accept();
				break;
			case 2:
				print();
				break;
			case 3:
				calcBmi();
				break;
			case 4:
				break;
			}
		}

	}

}
