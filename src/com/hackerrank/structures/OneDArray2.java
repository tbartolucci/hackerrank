package com.hackerrank.structures;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray2 {
	
//	public static void main(String[] args) {
//
//		int[] nArray = { 5, 6, 6, 3, 8 };
//		int[] mArray = { 3, 5, 3, 1, 3 };
//		int[][] inputs = { 
//			{0, 0, 0, 0, 0}, 
//			{0, 0, 0, 1, 1, 1}, 
//			{0, 0, 1, 1, 1, 0}, 
//			{0, 1, 0},
//			{ 0, 0, 1, 0, 0, 1, 0, 1 }
//		};
//		
//		int testCases = 5;
//		for (int i = 0; i < testCases; i++) {
//			// Set up input
//			int n = nArray[i];
//			int m = mArray[i];
//			int[] arr = inputs[i];
//			
//			// Solve problem
//			boolean solvable = isSolvable(m, arr, 0);
//			if( solvable ) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//	}

	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}
	
//	public static void solveProblem(int arraySize, int move, int[] arr) {
//		//starting position
//		int current = 0;
//		int[] walked = new int[arraySize];
//		Arrays.fill(walked, 0);
//		boolean failed = false;
//		
//		while ( !failed ) {
//			if ( current + 1 >= arraySize ) {
//				System.out.println("YES");
//				return;
//			} else if ( current + move >= arraySize ) {
//				System.out.println("YES");
//				return;
//			} else if ( arr[current+move] == 0 && (walked[current]) ) {
//				current = current + move;
//			} else if ( arr[current+1] == 0 ) {
//				current = current + 1;
//			} else if ( arr[current-1] == 0 ) {
//				current = current - 1;
//			} 
//		}
//	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			// Set up input
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			for( int j = 0; j < n; j++ ){
				arr[j] = sc.nextInt();
			}
			// Solve problem
			boolean solvable = isSolvable(m, arr, 0);
			if( solvable ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}