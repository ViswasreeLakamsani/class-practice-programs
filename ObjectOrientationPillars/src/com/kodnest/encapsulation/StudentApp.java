package com.kodnest.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setId(1);
		s.setName("Raju");
		s.setMarks(99);
		s.setGender("Male");
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getGender());

	}

}
