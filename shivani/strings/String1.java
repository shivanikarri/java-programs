package com.shivani.strings;

public class String1 {
public static void main(String[] args) {
	String s1="SHIVANI";
	String s2="SHIVANI";
	
	//equal operator compares the references of strings
	if(s1==s2)
	{
		System.out.println("references are equal");
	}
	else
	{
		System.out.println("references are not equal");
	}
	
	// equals method compares the strings 
	if(s1.equals(s2))
	{
		System.out.println("strings are equal");
	}
	else
	{
		System.out.println("strings are not equal");
	}
}
}
