package com.bridgeladz;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = reader.nextInt();
		
		int count =0;
		
        if (num>1)
        {
        	for(int i=1; i<num; i++)
        	{
        		if(num%i==0)
        			count++;
        	}
        	if(count == 2)
        	{
        		System.out.println("Its Is A Prime Number");
        	}
        	else
        	{
        		System.out.println("Its Not A Prime Number");
        	}
        }
        	else
        	{
        		System.out.println("Its Not A Prime Number ");
        	}
        }
        
	
}

 