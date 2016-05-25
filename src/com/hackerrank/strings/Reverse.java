package com.hackerrank.strings;

public class Reverse {

	public static void main(String[] args) {
		String A = "mastam";
		
		int start = 0;
		int end = A.length() - 1;
		
		while( start <= end ){
			if( A.charAt(start) != A.charAt(end) ){
				System.out.println("No");
				return;
			}
			start++;
			end--;
		}
		
		System.out.println("Yes");

	}

}
