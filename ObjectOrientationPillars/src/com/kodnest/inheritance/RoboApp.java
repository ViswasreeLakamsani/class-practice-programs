package com.kodnest.inheritance;

public class RoboApp {

	public static void main(String[] args) {
		TeacherRobo t=new TeacherRobo();
		ChefRobo c=new ChefRobo();
		DriverRobo d=new DriverRobo();
		t.name="Chitti";
		t.type="humanoid";
		t.talk();
		t.walk();
		t.charge();
		t.teach();
		System.out.println("==================");
		c.name="Amy jackson";
		c.type="humanferiod";
		c.talk();
		c.walk();
		c.charge();
		c.cooking();
		System.out.println("====================");
        d.name="Will smith";
		d.type="Androboronoid";
		d.talk();
		d.walk();
		d.charge();
		d.drive();

	}

}
