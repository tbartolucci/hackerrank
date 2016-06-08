package com.hackerrank.structures;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray2 {
	
	public static void main(String[] args) {

		int[] nArray = { 5, 6, 6, 3 };
		int[] mArray = { 3, 5, 4, 1 };
		int[][] inputs = { {0, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1}, {0, 0, 1, 1, 1, 0}, {0, 1, 0} };
		
		int testCases = 4;
		for (int i = 0; i < testCases; i++) {
			// Set up input
			int n = nArray[i];
			int m = mArray[i];
			int[] arr = inputs[i];
			
			// Solve problem
			solveProblem(n, m, arr);
		}
	}

	public static void solveProblem(int arraySize, int move, int[] arr) {
		boolean failed = false;
		//starting position
		int current = 0;
		boolean[] walked = new boolean[arraySize];
		Arrays.fill(walked, false);
		while ( !failed ) {
			walked[current] = true;
			if ( current + 1 >= arraySize ) {
				System.out.println("YES");
				return;
			} else if ( current + move >= arraySize ) {
				System.out.println("YES");
				return;
			} else if ( arr[current+1] == 0 ) {
				current = current + 1;
			} else if ( arr[current+move] == 0 ) {
				current = current + move;
			} else {
				boolean keepGoing = false;
				for( int i = 0; i < walked.length; i++ ) {
					if ( walked[i] == false ) {
						keepGoing = true;
					}
				}
				if( !keepGoing ) {
					failed = true;
					System.out.println("NO");
					return;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int testCases = sc.nextInt();
//		for (int i = 0; i < testCases; i++) {
//			// Set up input
//			int n = sc.nextInt();
//			int m = sc.nextInt();
//			int index = 0;
//			int[] arr = new int[n];
//			while (sc.hasNext()) {
//				arr[index] = sc.nextInt();
//				index++;
//			}
//			// Solve problem
//			solveProblem(arr);
//		}
//	}

}
