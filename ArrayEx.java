package OOPS;

// Simple array example 

public class ArrayEx {

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) 
			System.out.print(" " +a[i]);
		System.out.println(" ");
	}

	public int[] square(int a[]) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) 
			b[i] = a[i] * a[i];
		return b;
	}

	public void display(String a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(" " +a[i]);
		System.out.println(" ");
	}

	public int[] duplicates(int a[]){
		int[] temp = new int[a.length];
		for(int i=0;i<temp.length;i++)
			temp[i]=-1;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]!=a[j])
					temp[i] = a[i];
				else if(a[i]==a[j] && i!=j)
					i++;
			}
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayEx ax = new ArrayEx();

		int[] a = new int[5];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		ax.display(a);
		
		int[] duparray = {1,2,3,4,5,6,7,8,9,1,2,3,8,0,11,12,16,12};
		ax.display(ax.duplicates(duparray));
		
		
		int[] b = ax.square(a);
		ax.display(b);

		String s[] = { "Jan", "Feb" };
		ax.display(s);
	}

}
