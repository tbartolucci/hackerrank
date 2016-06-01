package com.hackerrank.structures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
/**
 * ({}[])
(({()})))
({(){}()})()({(){}()})(){()}
{}()))(()()({}}{}
}}}}
))))
{{{
(((
[]{}(){()}((())){{{}}}{()()}{{}{}}
[[]][][]

true
false
true
false
false
false
false
false
true
true
 */
public class JavaStack {

	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("({}[])");
		inputs.add("(({()})))");
		inputs.add("({(){}()})()({(){}()})(){()}");
		inputs.add("{}()))(()()({}}{}");
		inputs.add("}}}}");
		inputs.add("))))");
		inputs.add("{{{");
		inputs.add("(((");
		inputs.add("[]{}(){()}((())){{{}}}{()()}{{}{}}");
		inputs.add("[[]][][]");
	
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < inputs.size(); i++ ){
		//while (sc.hasNext()) {
			//String input = sc.next();
			String input = inputs.get(i);
			validateInput(input);
			//withRegex(input);
		}

	}
	
	public static void validateInput(String input)
	{
		Stack<String> myStack = new Stack<String>();
        //Complete the code
        int len = input.length();
        for (int i = 0; i < len; i++){
            String c = input.substring(i, i + 1);
            if (!myStack.empty()){
                if ((c.equals(")")) && (myStack.peek().equals("("))){
                    myStack.pop();
                } else if ((c.equals("]"))&&(myStack.peek().equals("["))){
                    myStack.pop();
                } else if ((c.equals("}"))&&(myStack.peek().equals("{"))){
                    myStack.pop();
                } else {
                	myStack.push(c);
                }
            } else{
                myStack.push(c);
            }       
        }

        if (myStack.empty()){
        	System.out.println("true");
        }else{
        	System.out.println("false");
        }
	}
	
	/**
	 * 
	 * @param input
	 */
	public static void withRegex(String input)
	{
		 while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	     System.out.println(input.isEmpty());
	}

}
