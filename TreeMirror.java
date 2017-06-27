package com.Interviews;


class Node{
	int data;
	Node left, right;
	
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}

public class TreeMirror {

	Node a, b;
	
	public static boolean isMirror(Node a, Node b){
		
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		else
			return a.data==b.data && isMirror(a.left, b.right) && isMirror(a.right, b.left);
		
	}
	
	public static void main(String[] args) {
		
		TreeMirror bt = new TreeMirror();
		
		Node n1 = new Node(1);
		Node n2 = new Node(1);
		n1.left = new Node(3);
		n1.right = new Node(4);
		n2.left = new Node(5);
		n2.right = new Node(6);
		n1.left.left = new Node(7);
		
		
		
		
		
		if(isMirror(n1, n2)==true)
			System.out.println("Mirror Tree");
		else System.out.println("Not Mirror");
		
	}

}
