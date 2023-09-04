package com.shivani.strings;

public class String10 {
	public static void main(String[] args) {
		String s3="SHIVANI";
		String s4="Shivani";
		
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
