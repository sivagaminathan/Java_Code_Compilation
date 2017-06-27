package com.Interviews;

public class FindReplacedNumber {

	public void someMethod(int a[]){

		int len = a.length;
		//System.out.println(len);
		
		int sum = 0; 
		int square = 0;
		
		for(int i=0 ; i<len ; i++) 
			sum += a[i];
		
		for(int i=0 ; i<len ; i++) 
			square += a[i]*a[i];
		
		
		System.out.println(sum);
		int sum_numbers = (len) * (len - 1) / 2 - sum;
		System.out.println(sum_numbers);
		int square_sum = (len) * (len-1) * (2*len-1) / 6 - square;
		System.out.println(square_sum);
		int value = square_sum / sum_numbers;
		System.out.println(value);
		
		System.out.println("Replaced Number is : "+ (value + sum_numbers)/2);
		System.out.println("Replaced by Number : "+ (value - sum_numbers)/2);
		
	}
	
	public void FindReplaceNumber(){
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FindReplacedNumber frn = new FindReplacedNumber();
		
		int a[] = {0,1,2,4,5,3,6,7,8,7,10};
		int len = a.length;
		int sum =0 ,sum_array = 0;
	
		//System.out.println(a[len-1]);
		frn.someMethod(a);
		
		boolean B[] = new boolean[len];
		
		for(int i = 0; i<len;i++)
			B[i] = false;
		
		for(int i=0;i<len;i++)
			B[a[i]] = true;
		
		for(int i=0 ; i<len ; i++)
			sum +=i;
		
		for(int i=0 ; i<len ; i++) 
			sum_array += a[i];
		
		for(int i = 0; i<len;i++){
			if(B[i] == false){
				System.out.println("Replaced Number : "+i);
				System.out.println("Replaced by : "+(i-(sum-sum_array)));
			}
		}
	}

}
