package com.hackerrank.strings;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token {


    public static void main(String[] args)
    {


        //Scanner scan = new Scanner(System.in);
        //String s=scan.nextLine();
        //Complete the code

        String s = "He is a very very good boy, isn't he?";

        int numberOfTokens = 0;
        ArrayList<String> list = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s," !,?._'@");
        while (st.hasMoreTokens()) {
            numberOfTokens++;
            list.add(st.nextToken());
        }

        System.out.println(numberOfTokens);
        for (String string : list) {
            System.out.println(string);
        }

    }
}