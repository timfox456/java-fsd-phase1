package calculator;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
	
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

		
        Scanner in = new Scanner(System.in); 
        
        String s = "Welcome to Calculator!";
        System.out.println(s);
        while ((s = in.nextLine()) != "") {
            System.out.println(s);
            String[] components = s.split(" ");
            

        }
        
	}
	

}
