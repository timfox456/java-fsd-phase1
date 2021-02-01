package com.example.learnjava;


import com.example.learnjava.InnerClassExample.MyInnerClass;
import java.util.HashMap;
import java.util.ArrayList;

public class LearnjavaApplication {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		System.out.println("--------------------");


		// Map Example
		MapExample example = new MapExample();
		example.ShowMap();


		System.out.println("--------------------");


		// Inner Class Example

		InnerClassExample innerClassExample = new InnerClassExample("test1");
		System.out.println(innerClassExample.useMyInnerClass()); // should say "test2"


		System.out.println("--------------------");

		// String

		StringExample stringExample = new StringExample();

		stringExample.TestStrings();

		System.out.println("--------------------");


		// Array

		ArrayExample arrayExample = new ArrayExample();
		arrayExample.TestArrays();

		System.out.println("--------------------");

        // Regex

		RegexExample regexExample = new RegexExample();
		regexExample.FindPatterns();


	}

}
