package com.hackerrank.structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Map<String,Integer> phonebook = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			phonebook.put(name, phone);

		}
		while (in.hasNext()) {
			String s = in.nextLine();
			Integer phonenumber = phonebook.get(s);
			if( phonenumber == null ){
				System.out.println("Not found");
			}else{
				System.out.printf("%s=%d%n",s,phonenumber);
			}
		}

	}

}
