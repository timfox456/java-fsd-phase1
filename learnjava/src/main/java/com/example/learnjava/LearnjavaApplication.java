package com.example.learnjava;


import com.example.learnjava.InnerClassExample.MyInnerClass;
import com.example.learnjava.cars.VehicleExample;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
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

		System.out.println("MAIN: Running Sleep Wait Example...");

		try {
			Thread.sleep(1000);
			ThreadSleepWaitExample.RunSleepWait();
		} catch (InterruptedException iex) {
			System.out.println("MAIN:Exception in main thread: "+iex.getMessage());
		}

		System.out.println("-----------------");
		System.out.println("ThreadSender:");

		ThreadSender snd = new ThreadSender();
		ThreadedSend S1 =
				new ThreadedSend( " Hi " , snd );

		// Sleep for 100ms
		try {
			Thread.sleep(100);
		} catch (InterruptedException iex) {
			System.out.println("MAIN:Exception in main thread: "+iex.getMessage());
		}

		ThreadedSend S2 =
				new ThreadedSend( " Bye " , snd );
		S1.start();
		S2.start();
		try
		{
			S1.join();
			S2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}

		System.out.println("-----------------");
		System.out.println("ExceptionExample:");

		ExceptionExample exceptionExample = new ExceptionExample();
		exceptionExample.HandleException();

		try {
			exceptionExample.TranslateText();
		}
		catch (UnknownWordException ex) {
			System.err.println(ex.getMessage());
		}


		// Sleep for 100ms
		try {
			Thread.sleep(100);
		} catch (InterruptedException iex) {
			System.out.println("MAIN:Exception in main thread: "+iex.getMessage());
		}



		System.out.println("-----------------");
		System.out.println("FileExample:");


		String fileName = "text.txt";
		Path path = FileSystems.getDefault().getPath(fileName).toAbsolutePath();

		FileSystem myFileSystem = FileSystems.getDefault();

		Path pwd = FileSystems.getDefault().getPath(".").toAbsolutePath();

		System.out.println(pwd);

		Path paths = Paths.get("foo", "bar", "baz.txt");


		System.out.println(path);



		FileExample fileExample = new FileExample();
		fileExample.DeleteFileIfExists("text.txt");
		File myFile = fileExample.CreateFile("text.txt");
		fileExample.WriteFile("Hello world! LOL");
		fileExample.WriteFileStreams("Hello World!\nHow are you?");
		fileExample.ReadFileStream("text2.txt");

		System.out.println("-----------------");
		System.out.println("VehicleExample:");
		VehicleExample vehicleExample = new VehicleExample();
		vehicleExample.GetVehicles();

	}
}
