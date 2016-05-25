package hackerrank.introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for ( int testcase = 0; testcase < t; testcase++ ) {
		
			int a=sc.nextInt();
	        int b=sc.nextInt();
	        int n=sc.nextInt();
	         
	        int answer = a;
			for ( int counter = 0; counter < n; counter++ ) {
				answer = answer + ((int) ( Math.pow(2, counter) * b));
				System.out.printf("%d ", answer);
			}
			System.out.printf("%n");
		}
	}

}
