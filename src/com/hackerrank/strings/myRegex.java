package com.hackerrank.strings;

import java.util.Scanner;

public class myRegex {

	public String pattern = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }	
	}
}
