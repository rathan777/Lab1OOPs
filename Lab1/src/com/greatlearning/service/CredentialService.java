package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.plan.Employee;

public class CredentialService {
	public char[] generatePassword(){

		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		 String specialcharacters= "!@#$%^&*()_+{}|:";
		String combinedChars = uppercase+lowercase+numbers+specialcharacters;
		
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i]= combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
		
	}
	public String generateEmailAddress(String firstname, String lastname, String department)
	
	{
	
		return firstname+lastname+"@"+department+".abc.com";
		
		}


public void showCredentials(Employee employee, String email, char[] generatedPassword) {
	System.out.println("Dear " + employee.getFirstName()+ " your generated credentials are:");
	System.out.println("Email: " + email);
	System.out.println("password: " +"");
	System.out.println(generatedPassword);
}

}

