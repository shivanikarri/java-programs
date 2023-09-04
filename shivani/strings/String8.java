package com.shivani.strings;

public class String8 {
	public static void main(String[] args) {
		String s1="SHIVANI";                    // SHIVANI
		System.out.println(s1);  
		String s2="SIREESHA";
		System.out.println(s2);                  // SIREESHA
		s1.concat(s2);
		System.out.println(s1);                  // SHIVANI because we create string using "String" class 
	}                                             // i.e immutable so string cannot concat.
}
