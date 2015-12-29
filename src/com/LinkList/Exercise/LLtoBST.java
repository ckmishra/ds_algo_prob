package com.LinkList.Exercise;
class Node{
    public int  value;	
	public Node lChild;
    public Node rChild;
Node(){
	
}
    Node(int data){
	value=data;
	rChild=null;
	lChild=null;
}
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
	
	
	public static void preorder(Node root){
	
		if(root!=null){
		System.out.print(root.value);
		preorder(root.lChild);
		preorder(root.rChild);
		}
	}


}


public class LLtoBST {

	private static int countNode(Link first){
		int n=0;
		while(first!=null){
		first=first.next;
		n++;
		}
		return n;
	}
	
	public static Node convertLLtoBST(Link head,int n)
	{
		//Link head=l.first;
		
		if(n<=0) return null;
		
		Node leftSubtree =convertLLtoBST(head, n/2);
		
		Node root= new Node(head.data);
		root.lChild=leftSubtree;
		
		head=head.next;
		
		
		root.rChild=convertLLtoBST(head, n-n/2-1);
		
		return root;
		
	}
	
	public static void  main(String args[]) {
		LinkList l = new LinkList();
		l=LinkListCRUD.createLinkList(new int [] {5,8,12,18,19,20,25,35,40,50});
	
		Node root=convertLLtoBST(l.first,countNode(l.first));

/*	while(root.rChild!=null){
		System.out.println(root.value);
		root=root.rChild;
	}
		*/
	
		Tree.preorder(root);
	}
}
