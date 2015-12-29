package com.tree.exercise;

public class BSTtoDLL {

private static Node convertBSTtoDLLUtil(Node root){
	
	if(root==null) return root;
	if(root.lChild!=null){
		
		Node left=convertBSTtoDLLUtil(root.lChild);
		
		for(;left.rChild!=null;left=left.rChild); 
		
		root.lChild=left;
		left.rChild=root;
		
	}
	
	if(root.rChild!=null){
		
		Node right=convertBSTtoDLLUtil(root.rChild);
		for(;right.lChild!=null;right=right.lChild);
		
       right.lChild=root;
       root.rChild=right;
	}
	
			
	return root;
	
}

public static Node BSTtoDLLChange(Node root){
	
	Node head=convertBSTtoDLLUtil(root);

  while(head.lChild!=null){
	head=head.lChild;
	 
  }
  return head;
}


public static void main(String []args){

	Tree t= new Tree();
	t.insert(20);
	t.insert(10);
	t.insert(5);
    t.insert(2);
    t.insert(25);
    t.insert(15);
    t.insert(14);
    t.insert(18);
    t.insert(22);
    t.insert(24);
    t.insert(35);
  
   Node Head = BSTtoDLLChange(t.root);
   
while(Head.rChild!=null){
	System.out.print(Head.value+" ");
	Head=Head.rChild;
}
System.out.print(Head.value);
}


}