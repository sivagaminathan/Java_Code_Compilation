package com.arraysum;

// Progam to call methods in a class
// Calls static methods too 

public class Method {
	static int c = 9;
	int x = 2;
	
	void process() {
		x = 67;
		System.out.println("From process: " + x);
	}
	
	double calculatesum() {
		System.out.println("From calculate");
		double d = 34;
		double e = 16;
		return d+e;
	}
	
	int factorial(int number){
		
		if(number == 1) {
			return 1;
		}
		else
			return number*factorial(number-1);
	}
	
	static void iamstatic() {
		//static methods can not call non-static variables directly
		c = 89;
		//x=10;
		System.out.println("From I AM STATIC :" + c);
	}
	
	int fibonacci(int number){
		if(number == 0) return 0;
		else if(number == 1) return 1;
		else{
			//System.out.print(" " + fibonacci(number-1) + fibonacci(number-2));
			return fibonacci(number-1) + fibonacci(number-2);
		}
			
		//This method takes a long time to compute
	}
public static void main (String[] args) {
	Method ex = new Method();
	ex.process();
	iamstatic();
	double sum = ex.calculatesum();
	int a=5;
	int i=a++;
	System.out.println(i);
	System.out.println(a);
	System.out.println("Sum of values: " + sum++);
	System.out.println("Factorial of 5 is :" + ex.factorial(5));
	System.out.print("Fibonacci for number 6 is :" +ex.fibonacci(6));
}
}
