package com.Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {

		File filename = new File("C:\\Users\\siva\\Documents\\empires.txt");
		String[] s = null;
		Stack<String> st= new Stack<String>();
		String stack_content = "";
		
		try {
			
			// FileReader can take String, File and FileID as parameters
			FileReader fr = new FileReader(filename);
			// Scanner to use next or nextLine better than bufferstream
			Scanner sc = new Scanner(fr);

			// Split words based on "-" delimiter and put individual words on to a string array
			while (sc.hasNextLine()) {
				s = sc.next().split("-");
			}
			
			// For each word inside string array, put them on to stack
			for (String c : s){
				System.out.println(c);
				st.push(c);
			}
		}	 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Printing Stack");
			while(!st.isEmpty()){
				//Object obj = st.pop();
				System.out.println(st.pop());
			}
			
		}
	}
}
