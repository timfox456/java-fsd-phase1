package com.example.learnjava;


import com.example.learnjava.InnerClassExample.MyInnerClass;
import java.util.HashMap;
import java.util.ArrayList;

public class LearnjavaApplication {

	public static void main(String[] args) {

		System.out.println("Hello World!");


		// Map Example
		MapExample example = new MapExample();
		example.ShowMap();

		// Inner Class Example

		InnerClassExample innerClassExample = new InnerClassExample("test1");
		System.out.println(innerClassExample.useMyInnerClass()); // should say "test2"

		// String

		StringExample stringExample = new StringExample();

		stringExample.TestStrings();

		// Array

		ArrayExample arrayExample = new ArrayExample();
		arrayExample.TestArrays();





	}

}
