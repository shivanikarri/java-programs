package com.shivani.strings;

public class String6 {
	public static void main(String[] args) {
		String s1="SHIVANI";
		String s2="SIREESHA";
		String s3=s1+s2;    // stored in heap
		String s4=s1+s2;    // stored in heap
		
		//equal operator compares the references of strings
		if(s3==s4)
		{
			System.out.println("references are equal");
		}
		else
		{
			System.out.println("references are not equal");
		}
		
		// equals method compares the strings 
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
