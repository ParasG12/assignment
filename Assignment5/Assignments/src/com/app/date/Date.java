package com.app.date;

import java.util.Calendar;

public class Date {
private int day;
private int month;
private int year;
private static Calendar cal;
static {
	 cal=Calendar.getInstance();
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}
public boolean isLeap() {
	if(isValid()) {
	return ((this.getYear()%400==0)||(this.year%4
			==0 && this.year%100!=0));
	}
	return false;
}
public boolean isValid() {
//     if(year<1900 || year>2024) {
//    	 return  false;
//     }
//     else {
//    	 if(isLeap()) {
//    		 if((month==2) && (day>=1 && day<=29)) {
//    			 return true;
//    		 }
//    		 }
//    	 return true;
//     }
	return true;
}
public static void setDateInCalendar(int day,int month,int year) {
	cal.set(Calendar.DAY_OF_MONTH, day);
	cal.set(Calendar.MONTH, month-1);
	cal.set(Calendar.YEAR, year);
}
public String getDayOfWeek() {
	if(isValid()) {
	int day=getDay();
	setDateInCalendar(day,month,year);
	int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
String days[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
return days[dayOfWeek-1];
	}
	return null;
}
public Date getNextDay() {
	if(isValid()) {
	setDateInCalendar(day+1,month,year);
	int day=cal.get(Calendar.DAY_OF_MONTH);
	int month=cal.get(Calendar.MONTH)+1;
	int year=cal.get(Calendar.YEAR);
	return new Date(day,month,year);
	}
	return null;
}
public Date getPrevDay() {
	if(isValid()) {
	setDateInCalendar(day-1,month,year);
	int day=cal.get(Calendar.DAY_OF_MONTH);
	int month=cal.get(Calendar.MONTH)+1;
	int year=cal.get(Calendar.YEAR);
	return new Date(day,month,year);
	}
	return null;
}
public void display() {
	System.out.println("the date is "+getDay()+"/"+getMonth()+"/"+getYear());
}
}



	
	
	

	
	


