package com.tree.exercise;

public class CheckTreeBalanced {

	
	private static int  findMaxHeight(Node root){
		
		if(root==null){
			return 0;
		}
		else
		{
			return 1 + Math.max(findMaxHeight(root.lChild), findMaxHeight(root.rChild));
		}
		
	}
	
private static int  findMinHeight(Node root){
		
		if(root==null){
			return 0;
		}
		else
		{
			return 1 + Math.min(findMaxHeight(root.lChild), findMaxHeight(root.rChild));
		}
		
	}

public static boolean isBalancedTree(Node root){
	 System.out.println(findMaxHeight(root));
	 System.out.println(findMinHeight(root));
	if(Math.abs(findMaxHeight(root)-findMinHeight(root)) <= 1)
		return true;
	else
		return false;
}

public static void main(String args[]){
	
	Tree newTree = new Tree();
	int[] inputValue = new int[]{5,2,3,6,8,7,1,9};
	 for(int i=0;i< inputValue.length;i++){
		  newTree.insert(inputValue[i]);
	 }
	
	System.out.println(isBalancedTree(newTree.root));
}

}
