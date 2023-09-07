package com.kodnest.PatternAssignment;

public class Pattern20 {
	public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 2*i-1; j++)
            {
                if (i == j)
                {
                    System.out.print(i);
                } 
                else
                {
                    System.out.print("*");
                }
            }
 
            System.out.println();
        }
 
        
    }
}
