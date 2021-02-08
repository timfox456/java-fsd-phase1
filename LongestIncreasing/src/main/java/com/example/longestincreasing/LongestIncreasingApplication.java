package com.example.longestincreasing;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LongestIncreasingApplication {

	public static void main(String[] args) {


		int n = 100;
		SequenceGenerator sg = new SequenceGenerator(n);
		ArrayList<Integer> sequence = sg.GenerateSequence();

		


	}
}
