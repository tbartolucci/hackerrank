package com.hackerrank.exceptions;

import java.util.Scanner;

public class myCalculator {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

	        while(in.hasNextInt())
	        {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            myCalculator M = new myCalculator();
	            try
	            {
	                System.out.println(M.power(n,p));
	            }
	            catch(Exception e)
	            {
	                System.out.println(e);
	            }
	        }

	}
	
	public int power( int n, int p) throws Exception{
		if( n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}
		
		return (int)Math.pow((double)n, (double)p);
	}
}
