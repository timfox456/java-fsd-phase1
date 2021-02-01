package com.example.emailvalidate;


import java.util.HashMap;
import java.util.ArrayList;

public class EmailvalidateApplication {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		if(args.length < 1) {
			System.out.println("Usage: EmailvalidateApplication email id");
			System.exit(0);
		}

		String email = args[0];

		System.out.println(email);


		EmailValidator emailValidator = new EmailValidator();
		System.out.println( emailValidator.Validate(email) ? "Valid" : "Not Valid");
		EmailSearcher emailSearcher = new EmailSearcher();
		System.out.println(emailSearcher.SearchEmail(email) ? "Found it!" : "Didn't find it!");





	}

}
