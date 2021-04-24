package com.userregistration;


/*
@description: class to checking user password having 1 upper case
and atleast 1 number and 1 special character by regular expression
@parameters: defining a method checkpassword() to
check if password is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	// method to check Password is valid or not by using regular expression
	public static boolean checkPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum 8 Character password : ");
		String password = sc.next();

		if (Pattern.matches("[\\S]{8,}", password) && Pattern.matches(".*[A-Z].*", password) 
				&& Pattern.matches(".*[0-9].*", password) && Pattern.matches(".*[\\W]{1}.*", password)) {
			System.out.println("Password valid");
			return true;
		} else {
			System.out.println("Password invalid");
			return checkPassword();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		checkPassword();
	}
} 