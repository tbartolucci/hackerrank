package com.hackerrank.strings;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String A, String B) {
	   A = A.toLowerCase();
	   B = B.toLowerCase();
	   if( A.length() != B.length() ){
		   return false;
	   }
	   
	   int[] letters = new int[26];
	   
	   
	   
	   return true;
	}
	
	public static void main(String[] args) {
	    
//	    Scanner sc=new Scanner(System.in);
//	    String A=sc.next();
//	    String B=sc.next();
	    String A = "Hello";
	    String B = "hello";
		
		boolean ret=isAnagram(A,B);
	    if(ret)System.out.println("Anagrams");
	    else System.out.println("Not Anagrams");
	    
	}

}
