package com.hackerrank.structures;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[6][6];
//		
//		for (int i = 0; i < 6; i++) {
//			for( int j = 0; j < 6; j++ ){
//				arr[i][j] = sc.nextInt();
//			}
//		}
		
		int[][] arr = {
				{ 0,-4,-6,0,-7,-6 },
					{ -1,-2,-6,-8,-3,-1},
					{ -8,-4,-2,-8,-8,-6},
						{ -3,-1,-2,-5,-7,-4},
						{ -3,-5,-3,-6,-6,-6},
							{ -3,-6,0,-8,-6,-7}	
		};
		
		int largestSum = 0;
		//no hour glass can go beyond the length-2 because of the size
		for( int i = 0; i < 4; i++ ) {
			for( int j = 0; j < 4; j++ ){
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] 
							+ arr[i+1][j+1] 
						+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				
				if( i == 0 && j == 0 ){
					largestSum = sum;
				}else if( sum > largestSum ){
					largestSum = sum;
				}
			}
		}
		System.out.println(largestSum);
	}

}
