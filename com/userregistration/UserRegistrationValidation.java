package com.userregistration;


/*
@description: class to checking user password
by regular expression
@parameters: defining a method passwordCheck() to
check if password is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	// method to validate Password by using regular expression
	public static boolean passwordCheck()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum 8 Character password : ");
		String password = sc.next();

		// Regular Expressions
		if (Pattern.matches("[\\S]{8,}", password)) 
		{
			System.out.println("Password valid");
			return true;
		}
		else 
		{
			System.out.println("Password invalid");
			return passwordCheck();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		passwordCheck();
	}

} 