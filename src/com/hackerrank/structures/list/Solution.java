package com.hackerrank.structures.list;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ ) {
			int d = sc.nextInt();
			list.add(d);
		}
		
		int q = sc.nextInt();
		for ( int i = 0; i < q; i++ ) {
			String query = sc.next();
			int x = sc.nextInt();
			if( "Insert".equals(query) ){
				int y = sc.nextInt();
				list.add(x, y);
			}else if ( "Delete".equals(query) ){
				try{
					list.remove(x);
				} catch ( Exception e ){
					//do nothing
				}
			}
		}
		
		for ( int i = 0; i < list.size(); i++ ) { 
			System.out.printf("%d ",list.get(i));
		}
		System.out.printf("%n");
    }
}
