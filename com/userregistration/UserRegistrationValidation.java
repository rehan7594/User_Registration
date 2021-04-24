package com.userregistration;


/*
@description: class to validate emailID by using
regular expression
@parameters: defining a method emailCheck() to
check if email is valid or not using regular expression 
 */

import java.util.*;
import java.util.regex.*;

public class UserRegistrationValidation {

	// method for email validation by using regular expression
	public static boolean emailCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.next();
		if (Pattern.matches("[a-z A-Z 0-9][a-z A-Z 0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email)) {

			System.out.println("valid");
			return true;
		} else {
			System.out.println("invalid");
			return emailCheck();
		}
	}

	public static void main(String[] args) {
		emailCheck();
	}
} 