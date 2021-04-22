package com.userregistration;

/*
@description: class to checking user email ID
by regular expression
@parameters: defining a method email() to
check if email is valid using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	//method to check user email is valid or not by using regular expression
	public static boolean email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.next();
		if (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email)) {

			System.out.println("valid");
			return true;
		} else {
			System.out.println("invalid");
			return email();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		email();
	}
}