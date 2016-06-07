package com.hackerrank.structures;

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
