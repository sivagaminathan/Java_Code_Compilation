package InterviewStuff;

import java.util.Stack;

// THIS PROGRAM CHECKS IF GIVEN {} or () or [] is balanced
// Example for balanced : {sara}nya()ia[va]
// Example for unbalanced : {sar(nya}h)


public class checkbalance {

	public static String s = "s{ara[n(ya}bl)ah]";
	public static String x = "s{aran(y)abl[a]h}";
	
	public static boolean isBalanced(String s){
		char n;
		boolean flag = false;
		Stack S1 = new Stack();
		char[] newarray = new char[s.length()];
		int i=0;
		for(char c: s.toCharArray()){
			if(c == '{'){
				S1.push(c);
			}
			else if(c == '('){
				S1.push(c);
			}
			else if(c == '['){
				S1.push(c);
			}
			else if(c =='}'){
				n = (char) S1.pop();
				if(n != '{') {
					flag = true;
					break;
				}
			}
			else if(c ==')'){
				n = (char) S1.pop();
				if(n != '(') {
					flag = true;
					break;
				}
			}
			else if(c ==']'){
				n = (char) S1.pop();
				if(n != '[') {
					flag=true;
					break;
				}
			}
			
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checkbalance c = new checkbalance();
		
		if(isBalanced(s) == true)
			System.out.println("String : "+s+" is Not Balanced");
		else System.out.println("String : "+s+" is Balanced");
		
		if(isBalanced(x) == true)
			System.out.println("String : "+x+" is Not Balanced");
		else System.out.println("String : "+x+" is Balanced");
	}
	
}
