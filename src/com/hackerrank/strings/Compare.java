package com.hackerrank.strings;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String A = sc.nextLine();
//		int length = sc.nextInt();
		
		int length = 3;
		String A = "welcometojava";
		
		String min = A.substring(0,length);
		String max = min;
		int end = A.length() - length + 1;
		for( int index = 1; index < end; index++ ){
			String substr = A.substring(index, index + length);
			
			if( min.compareTo(substr) > 0 ){
				min = substr;
			}
			
			if( max.compareTo(substr) < 0 ){
				max = substr;
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
