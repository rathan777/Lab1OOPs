package com.greatlearning.plan;

public class Employee {

	public String firstName,lastName;
	//public String lastName;
	
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void getLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
}
