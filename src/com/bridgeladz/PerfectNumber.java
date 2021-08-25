package com.bridgeladz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		   
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter A Number");
        int num = reader.nextInt(); 
        
        int  sum=0;
        
        
        if(num>0)
        {
        	for (int i=1;i<num;i++)
        	{
        		if(num % i == 0)
        		{
        			sum = sum + i;  
        		}
        	}
        	
        	if (sum == num)
        	{
        		System.out.println("Its A Prefect Number");
        	}
        	else
        	{
        		System.out.println("Its Not A Prefect Number");
        	}
        	
        //	else
         	//{
       		//System.out.println("Enter A Postive Number");
        //	}
        }

	
}
}


	


