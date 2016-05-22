package com.hackerrank.strings;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "word";
		String B = "bees";
		
		System.out.println( A.length() + B.length() );
		if( A.compareTo(B) > 0 ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		String newA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
		String newB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
		System.out.println(newA + " " + newB  );

	}

}
