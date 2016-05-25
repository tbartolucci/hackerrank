package hackerrank.introduction;

import java.util.Scanner;

public class Endoffile {

	public static void main(String[] args) {
		int lines = 0;
		Scanner sc = new Scanner(System.in);
		
		while ( sc.hasNext() ){
			++lines;
			String line = sc.nextLine();
			System.out.printf("%d %s%n", lines, line);
		}

	}

}
