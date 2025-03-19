package com.demo;

import java.util.Scanner;

public class StringTask2 {
	 public static void main(String args[]) {
			try (Scanner scanner = new Scanner(System.in)){
	        System.out.println("Enter a string");
	        String str= scanner.nextLine();
	        char[] vowels= {'a','e','i','o','u'};
	        int n = 0;
	        for (int i = 0; i < str.length(); i++) {
	        	
	        	for ( int j = 0;j < vowels.length; j++) {
	        		
	            if (str.charAt(i)==vowels[j]) 
	                n++;
	        }
	       }
	 
			 System.out.println(n);
	 }

	}
}

