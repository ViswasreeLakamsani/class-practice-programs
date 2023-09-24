package com.kodnest.Multilevelinheritance;

public class VehicleApp {
	public static void main(String[] args) {
		Sedan s=new Sedan();
		s.regno=1234;
		s.move();
		System.out.println("++++++++++++++++++");
		Car c=new Car();
		c.regno=5554;
		c.move();
		System.out.println("+++++++++++++++++++");
		Vehicle v=new Vehicle();
		v.regno=9999;
		v.move();
		
	}

}
