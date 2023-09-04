package com.shivani.strings;

public class EqualIgnoreCase {
	public static void main(String[] args) {
		String s3=new String("SHIVANI");
		String s4=new String("Shivani");
		
		if(s3==s4)
		{
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references are not equal");
		}
		 
		if(s3.equals(s4))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		
		//it compare two strings by ignoring the cases
		if(s3.equalsIgnoreCase(s4))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}
