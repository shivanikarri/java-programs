package com.kodnest.PatternAssignment;

public class Pattern21 {
	public static void main(String args[])
	{
	int a = 65;//ASCII value of 'A'
	for(int i = 1; i <8; i++)
	{
	for(int j = 1; j <= i; j++)
	{
	System.out.print((char)a);
	a++;
	}
	System.out.println();
	}
	}
}
