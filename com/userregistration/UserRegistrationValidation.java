package com.userregistration;

/*
@description: class to checking user phone number
by regular expression
@parameters: defining a method isValidIndianMobileNumber() to
check if phone number is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	//method to check valid phone number
	public static boolean isValidIndianMobileNumber(String s) 
	{ 
		Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$"); 

		Matcher m = p.matcher(s); 
		return (m.find() && m.group().equals(s)); 
	} 

	public static void main(String[] args) 
	{ 
		String phone1 = "+91-7123456789"; 
		String phone2 = "08123456789";
		String phone3 = "9876543210";
		String[] phoneNumbers= {phone1,phone2,phone3};

		for (int i = 0; i < phoneNumbers.length; i++) {
			String phoneNumber=phoneNumbers[i];
			if (isValidIndianMobileNumber(phoneNumber)) 
				System.out.print(phoneNumber+" is valid mobile number"); 
			else
				System.out.print(phoneNumber+" is invalid mobile number"); 

			System.out.println();
		}    
	} 
} 