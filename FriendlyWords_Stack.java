package com.Interviews;

import java.util.Arrays;
import java.util.Stack;

public class FriendlyWords_Stack {

	public static final String s[] = { "car", "teaching", "silent", "listen", "heart", "cheating", "arc" };
	//private static final boolean  x = true;
	
	public static String sortString(String s){
		
		String original = s;
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        //System.out.println(sorted);
        return sorted;
	}
	
	public static void main(String[] args) {

		Stack<String> orig_stack = new Stack<String>();
		Stack<String> temp_stack = new Stack<String>();
		
		for( String c: s){
			orig_stack.push(sortString(c));
			temp_stack.push(sortString(c));
		}
		
		for(String n : temp_stack){
			int counter = 0;
			//String n = temp_stack.pop();
			for( String a: orig_stack){
				if(orig_stack.contains(n)) {
					counter++;
				}
				if(counter>1) System.out.println(a);
			}
		}
	}

}
