package com.app.date;

public class DateTester {

	public static void main(String[] args) {
		Date d1=new Date(10,12,1999);
		System.out.println(d1.isValid());
		System.out.println(d1.isLeap());
		System.out.println(d1.getDayOfWeek());
	Date nextDay=d1.getNextDay();
	d1.display();
	nextDay.display();
	d1.getPrevDay().display();
	

	}

}
