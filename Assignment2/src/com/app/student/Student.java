package com.app.student;

import java.util.Scanner;

public class Student {
private String name;
private int rollNo;
private int std;
private static Scanner sc;
static {
	sc=new Scanner(System.in);
}
public void accept() {
	System.out.println("enter name,rollNo,std");
	this.name=sc.next();
	this.rollNo=sc.nextInt();
	this.std=sc.nextInt();
}
public void print() {
	System.out.print("the name of the student is "+name+" and the rollNo is "+rollNo+" std is "+std);
}
}
