package com.kodnest.Heirarchialinheritance;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Esha";
		e.salary=65000;
		System.out.println(e.name+" "+e.salary);
		e.work();
		System.out.println("++++++++++++++++++");
		Manager m=new Manager();
		m.name="Manisha";
		m.salary=200000;
		System.out.println(m.name+" "+m.salary);
		m.work();
		System.out.println("++++++++++++++++++");
		Developer d=new Developer();
		d.name="Divya";
		d.salary=100000;
		System.out.println(d.name+" "+d.salary);
		d.work();
		TestEngineer t=new TestEngineer();
		t.name="Tanmay";
		t.salary=100000;
		System.out.println(t.name+" "+t.salary);
		t.work();
		System.out.println("++++++++++++++++++++++++");
		TeamLead tl=new TeamLead();
		tl.name="Lavanaya";
		tl.salary=150000;
		System.out.println(tl.name+" "+tl.salary);
		tl.work();
		
		
	}

}
