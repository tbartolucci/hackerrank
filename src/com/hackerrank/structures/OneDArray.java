package com.hackerrank.structures;

import java.util.Scanner;

public class OneDArray {

	/**
	 * 
	 * 5
1 -2 4 -5 1
	 * @param args
	 */
	public static void main(String[] args) {
//
//		int size = 5;
//		int[] numbers = new int[size];
//		numbers[0] = 1;
//		numbers[1] = -2;
//		numbers[2] = 4;
//		numbers[3] = -5;
//		numbers[4] = 1;
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers = new int[size];
		int index = 0;
		while ( sc.hasNext() ){
			numbers[index] = sc.nextInt();
			index++;
		}
		
		int start = 0;
		int negativeSums = 0;
		while ( start < size ) {
			int end = start;
			while ( end < size ) {
				int sum = 0;
				for( int i = start; i <= end; i++){
					sum += numbers[i];
				}
				if( sum < 0 ){
					negativeSums++;
				}
				end++;
			}
			start++;
		}
		System.out.println(negativeSums);
	}

}
