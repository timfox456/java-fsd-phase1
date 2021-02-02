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
		System.out.println("Regex");

		RegexExample regexExample = new RegexExample();
		regexExample.FindPatterns();

		System.out.println("--------------------");


		// Thread
		System.out.println("Threads");

		ThreadExample threadExample = new ThreadExample();
		threadExample.start();

		System.out.println("MAIN: Starting Main Thread...");
		ThreadRunnableExample mrt = new ThreadRunnableExample();
		Thread t = new Thread(mrt);
		t.start();
		while(ThreadRunnableExample.myCount <= 10){
			try{
				System.out.println("MAIN: Main Thread: "+(++ThreadRunnableExample.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex){
				System.out.println("MAIN:Exception in main thread: "+iex.getMessage());
			}
		}
		System.out.println("MAIN: End of Main Thread...");
	}
}
