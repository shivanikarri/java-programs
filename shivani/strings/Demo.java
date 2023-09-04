package com.shivani.strings;

public class Demo {
	public static void main(String[] args)
	{
		// it is stored in string pool
		String s1="SHIVANI";
		System.out.println(s1);
		
		// it is stored in heap segment
		String s2=new String("SHIVANI");
		System.out.println(s2);
		
        // it is stored in heap segment		
		char ch[]= {'S','H','I','V','A','N','I'};
		String s3=new String(ch);
		System.out.println(s3);
		
		// duplicates are not allowed in string pool
		String s4="SHIVANI";
		System.out.println(s4);
		
		
	}

}
