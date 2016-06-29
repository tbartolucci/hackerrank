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
			for ( int j = 0; j < d; j++ ) { 
				nums.add(sc.nextInt());
			}
			list.add(nums);
		}
		
		int q = sc.nextInt();
		for ( int i = 0; i < q; i++ ) {
			int x = sc.nextInt() - 1;
			x = ( x < 0 ? 0 : x );
			int y = sc.nextInt() - 1;
			y = ( y < 0 ? 0 : y ) ;
			ArrayList<Integer> tmplist;
			Integer tmp;
			System.out.println("Looking up: "+x+" and "+y);
			try{
				tmplist = list.get(x);
			} catch (Exception e ) {
				System.out.println("ERROR!");
				continue;
			}
			System.out.println(tmplist);	
			try{
				tmp = tmplist.get(y);
			} catch (Exception e ) {
				System.out.println("ERROR!");
				continue;
			}
			
			
			System.out.println(tmp);
		}
		
		sc.close();
	}

}
