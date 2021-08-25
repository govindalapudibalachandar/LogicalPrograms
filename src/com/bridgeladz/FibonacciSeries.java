package com.bridgeladz;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= reader.nextInt();
		
		int x=1,y=1,i;
		
	 System.out.print("1 1 ");
		for(i=0; i<=n ;i++)
		{
			i=x+y; 
            x=y;
            y =i;
			System.out.print(i+" ");
           
		         
			
		}

	}

}
