package com.hackerrank.structures.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if( o1.score == o2.score ){
			int result = o1.name.compareTo(o2.name);
			if (  result == 0) {
				return 0;
			} else if ( result > 0 ){
				return 1;
			} else {
				return -1;
			}
		} else if ( o1.score > o2.score ) {
			return -1;
		} else if ( o1.score < o2.score ) {
			return 1;
		}
		
		return 0;
	}

}
