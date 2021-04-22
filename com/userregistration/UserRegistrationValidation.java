package com.userregistration;

/*
	@description: class to checking user first name 
	by regular expression
	@parameters: defining a method firstName() to
	check if first name is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;
public class UserRegistrationValidation {

	//method to check user first name is valid or not by using regular expression
	public static boolean firstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String first = sc.next();
		// Using REGEX
		if (Pattern.matches("^[A-Z][aA-zZ]{2,}", first)) {
			System.out.println("First Name valid");
			return true;
		} else {
			System.out.println("First Name invalid");
			return firstName();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		firstName();
	}
}

