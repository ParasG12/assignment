package com.app.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTester {

	public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter date in dd/mm/yyyy");
	String date=sc.next();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("date in dd/mm/yyyy format is "+new SimpleDateFormat("dd/MM/yyyy").format(sdf.parse(date)));
	System.out.println("date in mm/dd/yyyy format is "+new SimpleDateFormat("MM/dd/yyyy").format(sdf.parse(date)));
	System.out.println("date in yyyy/MM/dd format is "+new SimpleDateFormat("yyyy/MM/dd").format(sdf.parse(date)));
	System.out.println("enter datetime in dd/mm/yyyyhh:mm:ss");
	LocalTime time=LocalTime.now();
	DateTimeFormatter format=DateTimeFormatter.ofPattern("HH:mm:ss");
	String timeResult=time.format(format);
	System.out.println("the time in hh:mm:ss is "+timeResult);
	System.out.println("the time in hh:mm:ss a is "+time.format(DateTimeFormatter.ofPattern("HH:mm:ss a")));
	System.out.println("the time in hh:mm is "+time.format(DateTimeFormatter.ofPattern("HH:mm")));
	LocalDateTime res=LocalDateTime.of(1999,12,16,12,58,58 );
	System.out.println("the localdatetime in dd/mm/yyyy hh:mm:ss is "+res.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	System.out.println("the localdatetime in mm/dd/yyyy hh:mm:ss is "+res.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")));
	System.out.println("the localdatetime in yyyy/mm/dd hh:mm  is "+res.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")));
	

	
	
	
	
	
	
	

	
	
	
	
//	System.out.println("the date in dd/mm/yyyy format is "+new SimpleDateFormat("dd/MM/yyyy").format(cDate));
	
		
		
		
	
	
		
		

	}

}
