package com.shivani.strings;

public class String5 {
	public static void main(String[] args) {
		String s1="SHIVANI";
		String s2="SIREESHA";
		String s3="SHIVANI"+"SIREESHA";    // stored in string pool
		String s4="SHIVANI"+"SIREESHA";    // stored in string pool
		
		
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
	}
}
