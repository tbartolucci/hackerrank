package com.hackerrank.structures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ ) {
			int d = sc.nextInt();
			ArrayList<Integer> nums = new ArrayList<Integer>();
			for ( int j = 0; i < d; j++ ) { 
				nums.add(sc.nextInt());
			}
			list.add(nums);
		}
		
		int q = sc.nextInt();
		for ( int i = 0; i < q; i++ ) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			try{
				list.get(x);
			} catch (Exception e ) {
				
			}
			
			System.out.println(list.get(x).get(y));
		}
		
		sc.close();
	}

}
