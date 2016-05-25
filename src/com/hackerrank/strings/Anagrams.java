package com.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String A, String B) {
		A = A.toLowerCase();
		B = B.toLowerCase();
	   if( A.length() != B.length() ){
		   return false;
	   }
	   
	   char[] chars = A.toCharArray();
       Arrays.sort(chars);
       String sortedA = new String(chars);
       
       chars = B.toCharArray();
       Arrays.sort(chars);
       String sortedB = new String(chars);
	          
	   if( !sortedA.equals(sortedB) ){
		   return false;
	   }
	   
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
