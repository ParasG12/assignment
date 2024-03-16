package com.app.vehicle;

import java.util.Scanner;

public class Vehicle {

private String model;
private String vehName;
private int numDoors;


public void accept(String model,String vehName,int numDoors) {
	this.model=model;
	this.vehName=vehName;
	this.numDoors=numDoors;
}
public void accept(String model,String vehName) {
	this.model=model;
	this.vehName=vehName;
	this.numDoors=0;
}
public void print() {
	System.out.println("the vehname is "+vehName+" model is "+model+" numDoors is "+numDoors);
}
}
