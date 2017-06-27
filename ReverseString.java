package OOPS;

public class ReverseString {
	
	@SuppressWarnings("null")
	public String Reverse(String var){
		
		int length = var.length();
		char c[] = var.toCharArray();
		char v[] = null;
	
		//String reversestring;
		//char c[];
		
		int j=0;
		int i=0;
		
		for(j=0,i=length-1;j<length-1;j++,i--){
			v[j]=c[i];
			System.out.println(v[j]);
		}
		
		return v.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		String reverse = rs.Reverse("Siva");
		System.out.println(reverse);
	}

}
