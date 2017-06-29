package InterviewStuff;

public class rotatedarray2 {
	
	// Input Arrays
	public static int[] A = { 1,2,3,4,5,6,7 };
	public static int[] B = { 5,6,7,1,2,3,4 };
	public static int[] C = { 5,6,7,8,1,2,3 };
	public static int[] D = { 5,6,7,8,1,2,3,5 };
	public static int[] E = { 1,2,3,5,5,6,7,8 };
	
	// To display in required format
	public static void displayArray(int[] A, int[]B){
		
		for(int i=0;i<A.length;i++) System.out.print(" " + A[i]);
		System.out.println(": Array A");
		for(int i=0;i<B.length;i++) System.out.print(" "+ B[i]);
		System.out.print(": Array B");
		System.out.print(" \nRotated : ");
	
	}
	
	// Boolean function that tells whether arrays are rotated or not
	public static boolean isRotated(int[] A, int[] B){
	
		// Create Flag as true, we will set to false in program
		// If A[] ! = B[] 
		boolean flag=true;
		// Create a temp array to twice the size of B
		// We are going to concatenate B to temp array
		// Then find A[] inside this temp array
		int[] tmp = new int[B.length*2];
		// Track an index where A[i] = B[index]
		// If arrays are rotated, this is where the rotation begins
		// A[i..n] = B[index+1 ... n-1]+B[0...index]
		int index=0;
		// Calculate array lengths (easy to keep track of)
		int alen = A.length;
		int blen = B.length;
		// We will reuse i,j so declare it here
		int i=0;
		int j=0;
		
		// if two arrays have different lengths
		// They are not rotated (basic condition)
		if(alen!=blen){
			return false;
		}
		
		// Copy B array to temp array
		// Store i value for last index of temp array
		for(i=0;i<blen;i++){
			tmp[i]=B[i];
			index=i;
		}
		// concatenate B array to end of temp array from index+1
		for(i=0;i<blen;i++){
			tmp[i+index+1]=B[i];
		}
		
		// variable to reset i,j values again
		i=0;j=0;
		
		//Find index element where A[i] = B[index] where i=0
		while(i<alen){
			if(A[i]!=B[j]) j++;
			else if (A[i]==B[j]){
				index=j;
				// we exit since we only need index value
				break;
			}
		}
		
		// Traverse the temp array from 'index' till 'B.len+index'
		// This should be the A array elements
		// If not, the array is not rotated
		for(i=index,j=0;i<blen+index;i++,j++){
			if(tmp[i]!=A[j]) flag=false;
		}
		// Calls a function that displays arrays in required format
		displayArray(A,B);
		// Flag is set as true initially
		// If at no point temp[] ! = A[] flag remains true
		// Else flag is set to false
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method calls
		System.out.println(isRotated(A,B));
		System.out.println(isRotated(A,C));
		System.out.println(isRotated(C,B));
		System.out.println(isRotated(D,E));
		System.out.println(isRotated(B,A));
		System.out.println(isRotated(E,D));
	}

}
