package com.kodnest.PatternAssignment;

public class Pattern10 {

	    public static void main(String[] args)
	    {
	      
	        for (int i = 1; i <= 5; i++)
	        {
	 
	            for (int j = 1; j <= 5-i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (int j = i; j < 2*i; j++)
	            {
	                System.out.print(j+" ");
	            }
	 
	            System.out.println();
	     
	    }
	}
	 

}
