package com.tree.exercise;

import java.util.LinkedList;



public class LevelOrderTraversal {

	
	public static void printBTUsingBFS(Node root){
     
      LinkedList<Node> nodeList= new LinkedList<Node>()  ;
      LinkedList<Node> levelList = new LinkedList<Node>();
      nodeList.add(root);
		      
		  while(!nodeList.isEmpty()){
			  
			  Node v =nodeList.poll();
			  
			  System.out.print(v.value+" ");
			  if(v.lChild!=null){
				  levelList.add(v.lChild);
			  }
			  if(v.rChild!=null){
				   levelList.add(v.rChild);
			  }
			  
			  if(nodeList.isEmpty()){
				  System.out.println();
				  LinkedList<Node> temp=null;
				  temp=nodeList;
				  nodeList=levelList;
				  levelList=temp;
			  }
		  }
	
}
	
	//Using Method 2 having only one queue;
	public static void printBTUsingOneQ(Node root){
   
		    LinkedList<Node> nodeList= new LinkedList<Node>()  ;
		   
		    nodeList.add(root);
		    int nodesInCurrentLevel=1;
		 		int nodeInNextLevel=0;
		 
		    while(!nodeList.isEmpty()){
					  
				  Node v =nodeList.poll();
				  
				  System.out.print(v.value+" ");
	              nodesInCurrentLevel--;
				  if(v.lChild!=null){
					  nodeList.add(v.lChild);
					  nodeInNextLevel++;
				  }
				  if(v.rChild!=null){
					   nodeList.add(v.rChild);
					   nodeInNextLevel++;
				  }
				  
				  if(nodesInCurrentLevel==0){
					  System.out.println();
					  nodesInCurrentLevel=nodeInNextLevel; 
					  nodeInNextLevel=0;
				  }
		    }
}
	
	public static void printBTUsingDFS(Node root){
		int h= height(root);
	
		for(int i =1;i<=h;i++)	
		{
			printValue(root,i);
	       System.out.println();  
		}		
	}
	
	
	private static void printValue(Node root, int level) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		if(level==1){
		System.out.print(root.value+" ");
	
		}
		else{
		printValue(root.lChild, level-1);
		printValue(root.rChild, level-1);
		}
		
	
	}
	
	public static void printBTZigZagUsingDFS(Node root){
		int h= height(root);
		boolean alt= false;
		for(int i =1;i<=h;i++)	
		{
			printValueZigZag(root,i,alt);
	        System.out.println(); 
	        
	        alt=!alt;
		}		
	}
	
	
	private static void printValueZigZag(Node root, int level,boolean flag) {
		// TODO Auto-generated method stub
		if(root==null){
			return;
		}
		if(level==1){
		System.out.print(root.value+" ");
	
		}
		else{
		if(flag == false){
			printValueZigZag(root.lChild, level-1,flag);
			printValueZigZag(root.rChild, level-1,flag);
		}
		else{
			printValueZigZag(root.rChild, level-1,flag);
			printValueZigZag(root.lChild, level-1,flag);
		}
		}
	
	}
	
	
	
	public static int height(Node root){
		
		if(root==null){
			return 0;
		}
		else{
			
			return 1+Math.max(height(root.lChild),height(root.rChild));
			
		}
	
	}
	public static void printZigZag(Node root){

	      LinkedList<Node> nodeList= new LinkedList<Node>()  ;
	      LinkedList<Node> levelList = new LinkedList<Node>();
	      nodeList.add(root);
	      
	      boolean isOddlevel=false;
			      
			  while(!nodeList.isEmpty()){
				  
				  Node v =nodeList.pollLast();
				  
				  System.out.print(v.value+" ");
				  
				  
				  if(!isOddlevel){
				  
							  if(v.lChild!=null){
								   levelList.add(v.lChild);
							  }
							  if(v.rChild!=null){
								  levelList.add(v.rChild);
							  }
				  
				  }
				  else{
							  if(v.rChild!=null){
								   levelList.add(v.rChild);
							  }
							  if(v.lChild!=null){
								  levelList.add(v.lChild);
							  }
							
				  }
				  
				  if(nodeList.isEmpty() ){
					  System.out.println();
					  LinkedList<Node> temp=null;
					  temp=nodeList;
					  nodeList=levelList;
					  levelList=temp;
					  isOddlevel=!isOddlevel;
				  }
			  }
		
		
		
	}
	
	public static void  main(String args[]) {
		

		Tree newTree = new Tree();
		
		int[] inputValue = new int[]{5,2,8,6,1,3,4,9,7,11,0,14,10,18,23,2,1,2,0,0,1,1,2,2,3,4};
		 for(int i=0;i< inputValue.length;i++){
			  newTree.insert(inputValue[i]);
		 }
		  System.out.println("Using BFS having two Linklist");
				
		      printBTUsingBFS(newTree.root);
		
		      System.out.println("Using BFS having One Linklist");
				
		      printBTUsingOneQ(newTree.root);

		      System.out.println("Tree in ZigZag using BFS");
		     printZigZag(newTree.root);

		      System.out.println("Tree in ZigZag");
			    printBTZigZagUsingDFS(newTree.root);

		      
		      

		      
		      System.out.println("Tree using DFS");
		      printBTUsingDFS(newTree.root);

		      
	}
}
