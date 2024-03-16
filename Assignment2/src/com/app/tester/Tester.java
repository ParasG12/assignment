package com.app.tester;

import com.app.vehicle.Vehicle;

public class Tester {

	public static void main(String[] args) {
	Vehicle car=new Vehicle();
	car.accept("maruti", "suv800",4);
	Vehicle bicycle=new Vehicle();
	bicycle.accept("hero", "booz125");
	car.print();
	bicycle.print();
	

	}

}
