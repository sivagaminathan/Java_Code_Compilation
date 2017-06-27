package OOPS;

// Program to find Factorial using loop
// Program to count the number of '6' s in given number (100)

import java.util.Scanner;

public class FactorialEx {

	public static int fact(int n){
		
		int value=n;
		for(int i=1;i<n;i++){
			value = value*i;
		}
		return value;
	}
	
	public static int sixes(int number){
		int something = number / 6;
		return something;
	}
	
	public static int countsixes(int number){
		int x = 0;
		boolean present6 = false;
		for(int i=0;i<number;i++){
			x=i;
		}
		return x;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fact(a));
		System.out.println(fact(5));
		System.out.println(sixes(100));
	}

}
