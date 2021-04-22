package com.userregistration;

/*
@description: class to checking user last name 
by regular expression
@parameters: defining a method firstName() to
check if last name is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	//method to check user last name is valid or not by using regular expression
	public static boolean lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: ");
		String last = sc.next();
		// Using REGEX
		if (Pattern.matches("^[A-Z][aA-zZ]{2,}", last)) {
			System.out.println("Last Name valid");
			return true;
		} else {
			System.out.println("Last Name invalid");
			return lastName(); //using recursion
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		lastName();
	}

}