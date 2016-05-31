package com.hackerrank.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TokenContentExtractor {

	public static void main(String[] args) {
		 //Scanner in = new Scanner(System.in);
	     // int testCases = Integer.parseInt(in.nextLine());
	    int testCases = 3;
	    String[] inputStrings = new String[4];
	    inputStrings[3] = "<h1>Nayeem loves counseling</h1>";
	    inputStrings[2] = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
	    inputStrings[1] = "<Amee>safat codes like a ninja</amee>";
	    inputStrings[0] = "<SA premium>Imtiaz has a secret crush</SA premium>";
		while(testCases>=0){
	         //String line = in.nextLine();
	         String line = inputStrings[testCases];
	         
	         int count = 0;
	         Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
	         Matcher m = r.matcher(line);
	         while(m.find()) {
	             if (m.group(2).length() !=0) {
	                 System.out.println(m.group(2));
	                 count++;
	             }
	         }
	         if (count == 0) System.out.println("None");
	         
	         testCases--;
	      }
	}
}
