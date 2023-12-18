package com.kn.beans;

public class Person {
	
	
	Mobile mobile;
	public Person() {
		super();
	}
	
	

	

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}

public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public Person( Mobile mobile) {
		
		this.mobile = mobile;
	}

	
	
	
	
	
	

	


}
