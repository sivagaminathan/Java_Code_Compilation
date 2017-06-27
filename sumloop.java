package com.arraysum;
import java.util.Scanner;

public class sumloop {

	  //PART 4 ASSIGNMENT - PRINT IN PYRAMID
	
	public static void display(int number){
		for(int i=0;i<number;i++){
		for(int j=i;j<number;j++){
			System.out.print("A");
		}
		System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// PART 2 ASSIGNMENT
		double d[] = new double [7];
				
		for (int i=0; i< 7; i++) {
			d[i]=i*i;
			//System.out.println(d[i]);
		}
		
		/*
		d[0]=0;
		d[1]=1;
		d[2]=2;
		d[3]=3;
		d[4]=4;
		d[5]=5;
		d[6]=6;
		*/
		
		double sum =0; 
		for (int i=0; i< 7; i++) {
			sum=sum+d[i];
		}
		System.out.println("Sum is " + sum);
		
		//PART 3 ASSIGNMENT
		int a=10,b=10;
		int value = a++;
		System.out.println("a++ " + value);
		value = ++a;
		System.out.println("++a " + value);
		value = b++ + ++b;
		System.out.println("Hello " + value);
		
		
		Scanner S = new Scanner(System.in);

		  System.out.println("Enter the number : ");
		  
		 
		  
		   
		  
		  
		  //Scanner S = new Scanner(System.in);

		  System.out.println("Enter the number you want for counting sixes : ");
		  
		  int num = S.nextInt();
		  value = num % 6;
		  
		  
		  // PART 4 ASSIGNMENT - PYRAMID
		  
		 num = S.nextInt();
		  
		  for (int j = 0; j < num; j++) {
		  	   for (int k = 0; k <= j; k++) {
		  		   System.out.print("A");
		  	   }
		   	   System.out.println("");
		  }
		  System.out.println(value);
		  display(4);
	}
		
}
