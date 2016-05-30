package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//int testCases = Integer.parseInt(in.nextLine());
		int testCases = 3;
		String[] inputStrings = new String[4];
		inputStrings[3] = "alpha_naheed";
		inputStrings[2] = "xahidbuffon";
		inputStrings[1] = "nagib@007";
		inputStrings[0] = "123Swakkhar";
		
		while (testCases >= 0) {
			//String username = in.nextLine();
			String username = inputStrings[testCases];
			String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(username);

			if (m.find()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
