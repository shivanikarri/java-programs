package com.kodnest.PatternAssignment;

public class Pattern16 {
	public static void main(String[] args)
    {
 
        for (int i = 1; i <= 5; i++)
        {
            int num = 1;
             
            for (int j = 1; j < i*2; j++) 
            {
                if(j % 2 == 0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(num);
                     
                    num++;
                }
                 
            }
             
            System.out.println();
        }
 
}
}
