package com.bridgeladz;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter A Number");
		int number = reader.nextInt();
		
		int reverse = 0;
	    int remendar = 0;
	    
	    while(number>=1)
	    {
	    	remendar = number % 10;                //the enter number %10 = remendar
	    	reverse = reverse * 10+ remendar;      //reverse * 10 + the remendar value
	    	number = number / 10;                  // the given number / 10
	    }
	    System.out.println("reverse number is" +reverse);
	    }
	}


