package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Tom on 5/24/2016.
 */
public class PatternChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
            	Pattern r = Pattern.compile(pattern);
            	System.out.println("Valid");
            }catch(Exception e){
            	System.out.println("Invalid");
            }
            	testCases--;
        }
    }
}
