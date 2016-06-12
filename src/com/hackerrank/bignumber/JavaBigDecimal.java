package com.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// Input
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[] s = new String[n + 2];
//		for (int i = 0; i < n; i++) {
//			s[i] = sc.next();
//		}
int n = 9;
String[] s = new String[n + 2];
{
	int i = 0;
	s[i++] = "-100";
	s[i++] = "50";
	s[i++] = "0";
	s[i++] = "56.6";
	s[i++] = "90";
	s[i++] = "0.12";
	s[i++] = ".12";
	s[i++] = "02.34";
	s[i++] = "000.000";
}
		
		// Write your code here
		s = BubbleSort(s);

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

	public static String[] BubbleSort(String[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		String temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if( num[j+1] == null ){
					continue;
				}
				BigDecimal a = new BigDecimal(num[j]);
				BigDecimal b = new BigDecimal(num[j+1]);
				
				if (a.compareTo(b) == -1 ) // change to > for ascending sort
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		return num;
	}

}
