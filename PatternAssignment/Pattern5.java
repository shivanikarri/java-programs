package com.kodnest.PatternAssignment;

public class Pattern5 {
	    public static void main(String[] args)
	    {
	   
	        for (int i = 5; i >= 1; i--)
	        {
	            for (int j = 2*5-i; j > i; j--)
	            {
	                System.out.print(" ");
	            }
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	 
	            System.out.println();
	        }
}
}
