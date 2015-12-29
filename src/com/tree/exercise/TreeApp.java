package com.tree.exercise;


 class Node{
    public int  value;	
	public Node lChild;
    public Node rChild;

	public void displayNode(){
		System.out.println(value);
	}
}

 class Tree{
	
	Node root;
	Tree(){
		root=null;
	}
	
	
	public void insert(int v){
		
		Node newNode= new Node();
		newNode.value=v;
		if(root==null){
			root=newNode;
		}
		else{
			Node current=root;
			Node parent;
			while(true){
				parent=current;
				if(current.value > v){
					current=current.lChild;
					
					if(current==null){
					parent.lChild=newNode;
					return;
					}
				}
				else{
					current=current.rChild;
					
					if(current==null){
						parent.rChild=newNode;
						return;
					}
				}
			}
			
		}
		
	}
	
	public void postOrder(Node root){
		if(root==null && root== null)
		{ 
			return ;
		}
		else
		{
			postOrder(root.lChild);
			postOrder(root.rChild);
			System.out.println(root.value);
		}
			
	}
	public void preOrder(Node root){
		if(root==null && root== null)
		{
			return ;
		}
		else
		{
			System.out.print(root.value+" ");
			preOrder(root.lChild);
			preOrder(root.rChild);
			
		}
			
	}
	public void inOrder(Node root){
		if(root==null && root== null)
		{
			return ;
		}
		else
		{
			inOrder(root.lChild);
			System.out.print(root.value);
			inOrder(root.rChild);
			
		}
			
	}
	public Node find(int key){
		
		return null;
	}


}

public class TreeApp {


	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
