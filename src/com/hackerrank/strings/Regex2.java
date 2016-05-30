package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2
{
    public static void main(String[] args){

        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        //Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());
        int testCases = 4;
        String[] inputStrings = new String[5];
        inputStrings[4] = "Goodbye bye bye world world world";
        inputStrings[3] = "Swapnil went went to to to his business";
        inputStrings[2] = "Rana is is the the best player in eye eye game";
        inputStrings[1] = "in inthe";
        inputStrings[0] = "Hello hello Ab aB";
        
        while(testCases>=0){
            //String input = in.nextLine();
            String input = inputStrings[testCases];
        	Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}
