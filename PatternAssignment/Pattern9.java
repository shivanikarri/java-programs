package com.kodnest.PatternAssignment;

public class Pattern9 {
	public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            } 
 
            System.out.println();
        } 
 
        //Printing lower half of the pattern 
 
        for (int i = 3; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {    
            	System.out.print(j+" ");
            }
 
            System.out.println();
        }
    }
}
