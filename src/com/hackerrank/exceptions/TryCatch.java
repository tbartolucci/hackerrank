package com.hackerrank.exceptions;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		try{
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			Integer c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}catch(Exception e){
			System.out.println(e.getClass().getName());
		}
	}

}
