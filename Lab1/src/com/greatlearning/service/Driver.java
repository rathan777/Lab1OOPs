package com.greatlearning.service;

import java.util.Random;
import java.util.Scanner;

import com.greatlearning.plan.Employee;

public class Driver {
	public static void main(String []args){

	//System.out.println("Please enter the firstname and lastname of the employee:");
		//Scanner sc1= new Scanner(System.in);
		
//String fname = sc1.next();
//String lname = sc1.next();
		
       Employee employee = new Employee("Harshit", "Choudary");
       CredentialService cs= new CredentialService();
     
     String generatedEmail;
     char[] generatedPassword;
  
     System.out.println("Please enter the department from the following");
  System.out.println("1. Technical");
  System.out.println("2. Admin");
  System.out.println("3. Human Resource");
  System.out.println("4. Legal");
  
  Scanner sc = new Scanner(System.in);
  int option = sc.nextInt();
  
if (option == 1) {
	  generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
	  generatedPassword = cs.generatePassword();
	  cs.showCredentials(employee,generatedEmail,generatedPassword);
  }
else if(option == 2) {
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"adm");
	  generatedPassword = cs.generatePassword();
	  cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else if(option == 3) {
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
	  generatedPassword = cs.generatePassword();
	  cs.showCredentials(employee,generatedEmail,generatedPassword);
}
else if (option == 4) {
	generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");
	  generatedPassword = cs.generatePassword();
	  cs.showCredentials(employee,generatedEmail,generatedPassword);
	
}
else
System.err.println("Invalid entry! Please try again.");

	sc.close();
}
		
	}
	

