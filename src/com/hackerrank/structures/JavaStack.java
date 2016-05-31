package com.hackerrank.structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Map<String, Integer> stack = new HashMap<String, Integer>();
		Stack<String> stack = new Stack<String>();
		while (sc.hasNext()) {
			String input = sc.next();
			stack.push(input);
		}

	}

}
