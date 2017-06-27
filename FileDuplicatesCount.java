package com.Interviews;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Contain {
	String word;
	int occurence;
}

public class FileDuplicatesCount {
	
	public FileDuplicatesCount(){
		
	}
	
	public static String sortString(String s){
		
		String original = s;
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        //System.out.println(sorted);
        return sorted;
	}
	
	public static boolean isPalindrome(String a, String b){
		return (sortString(a).equalsIgnoreCase(sortString(b))) ? true : false ;
	}
	
	public ArrayList<Contain> someMethod(ArrayList<Contain> array, Stack<String> s){
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileDuplicatesCount f = new FileDuplicatesCount();
		
		ArrayList<Contain> array = new ArrayList<Contain>();
		String[] s = null;
		
		Stack<String> stack = new Stack<String>();

		File filename = new File("C:\\Users\\siva\\Documents\\dupwords.txt");

		try {
			// FileReader can take String, File and FileID as parameters
			FileReader fr = new FileReader(filename);
			// Scanner to use next or nextLine better than bufferstream
			Scanner sc = new Scanner(fr);
			// Split words based on "-" delimiter and put individual words on to
			// a string array
			while (sc.hasNextLine()) {
				s = sc.nextLine().split(" ");
			}
			// For each word inside string array, put them on to stack
			for (String c : s) {
				System.out.println(c);
				if(array.size()==0){
					Contain cr = new Contain();
					cr.word=c;
					cr.occurence=1;
					array.add(cr);
				}
				else{
					boolean present = false;
					for(int i=0;i<array.size();i++){
						if(isPalindrome(array.get(i).word, c)){
							array.get(i).word = array.get(i).word + ", "+ c;
							array.get(i).occurence++;
							present = true;
						}
					}
					if(present == false){
							Contain cr = new Contain();
							cr.word=c;
							cr.occurence=1;
							array.add(cr);
					}
					
				//stack.push(c);
				}
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally");
		}
		for(int i=0;i<array.size();i++){
			if(array.get(i).occurence > 1)
				System.out.println("[ " +array.get(i).word+ " ]");
		}
		//sc.close();

	}
}
