package ListsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a1 = new ArrayList();
		
		a1.add("s");
		a1.add("y");
		a1.add("h");
		a1.add(1);
		// a1.add(new Object()); // this causes ClassCastException
		
		System.out.println("Zeroth Element: "+ a1.get(0));
		
		String s = (String) a1.get(1); // Typecast is required to prevent ClassCastException
		
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			Object element = itr.next(); 
			//String element = (String) itr.next(); // ClassCastException will cause
			System.out.println(element);
		}
		
		// Generic Types
		// Create String List 
		List<String> strList = new ArrayList<String>();
		
		// Populate values i0 to i9
		for(int i=0;i < 10;i++){
			strList.add("i"+i);
		}
		
		
		System.out.println("-------------------------------------"); 
		System.out.println("Contents of StrList using For Loop");
		System.out.println("-------------------------------------");
		// Loop over contents way 1 - repeat
		for(int i=0; i < strList.size();i++){
			System.out.println(strList.get(i));
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Contents of StrList with Objects");
		System.out.println("-------------------------------------");
		// Loop over contents way 2 - object
		for( String obj : strList) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Contents of StrList with Iterators");
		System.out.println("-------------------------------------");
		// Loop over contents way 3 - Iterator
		Iterator<String> itr2 = strList.iterator();
		while(itr2.hasNext()) {
			Object ele = itr2.next();
			System.out.println(ele);
		}
	}

}
