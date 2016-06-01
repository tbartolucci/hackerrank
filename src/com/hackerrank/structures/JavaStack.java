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
//		inputs.add("(({()})))");
//		inputs.add("({(){}()})()({(){}()})(){()}(");
//		inputs.add("{}()))(()()({}}{}");
//		inputs.add("}}}}");
//		inputs.add("))))");
//		inputs.add("{{{");
//		inputs.add("(((");
//		inputs.add("[]{}(){()}((())){{{}}}{()()}{{}{}}");
//		inputs.add("[[]][][]");
	
		Scanner sc = new Scanner(System.in);
		for ( int i = 0; i < inputs.size(); i++ ){
		//while (sc.hasNext()) {
			//String input = sc.next();
			String input = inputs.get(i);
			validateInput(input);
		}

	}
	
	public static void validateInput(String input)
	{
		Stack<String> openStack = new Stack<String>();
		Stack<String> closeStack = new Stack<String>();
		for ( int j = 0; j < input.length(); j++ ) {
			String paren = input.substring(j, j+1);
			if( paren.equals("(") || paren.equals("{") || paren.equals("[") ){
				openStack.push(paren);
			} else if( paren.equals(")") ) {
				closeStack.push("(");
			} else if ( paren.equals("}") ) {
				closeStack.push("{");
			} else if ( paren.equals("]") ) {
				closeStack.push("[");
			}else{
				System.out.println("false");
				return;
			}
		}
		
		if( openStack.size() != closeStack.size() ){
			System.out.println("false");
			return;
		}
		
		while( !openStack.isEmpty() ){
			String open = openStack.pop();
			String close = closeStack.pop();
			if( !open.equals(close) ){
				System.out.println("false");
				return;
			}
		}
		
		System.out.println("true");
		return;
	}

}
