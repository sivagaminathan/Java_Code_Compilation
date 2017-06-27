package com.arraysum;
// HASHMAP solution to finding anagrams of given string 
// Displays the strings in sorted order


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FriendlyWords {

	public static final String s[] = { "car", "teaching", "silent", "listen", "heart", "cheating", "arc" };
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static String[] getFriendlyWords(String s[]) {

		List<String> friend = new ArrayList<String>();
		
		Map<String,ArrayList<String>> friend_map = new HashMap<String, ArrayList<String>>();
		String sorted_s = null;
	
		for (String p : s) {
			char c_arr[] = p.toCharArray();
			Arrays.sort(c_arr);
			sorted_s = new String(c_arr);
			if(friend_map.get(sorted_s)==null){
				friend_map.put(sorted_s, new ArrayList<String>());
			}
			friend_map.get(sorted_s).add(p);
		}
		
		System.out.println("----------------------------------");
		Iterator itr = friend_map.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry) itr.next();
			List value_arr = (ArrayList)m.getValue();
			if (value_arr.size() <=1) {
				itr.remove();
			}
			else {
				Collections.sort(value_arr);
				friend.addAll(value_arr);
				System.out.println(value_arr.toString());
			}
		}
		
		System.out.println("----------------------------------");
		System.out.println(friend.toString());
		System.out.println("----------------------------------");
		return s;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		getFriendlyWords(s);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
