package com.tree.exercise;
/***
 * 
 * @author CKM
 *Mirror of given tree
 */
public class MirroringOfTree {

	
	public static void mirroringTree(Node root){
		if(root == null){
			return ;
		}
		else{
			Node temp=root.rChild;
			root.rChild=root.lChild;
			root.lChild=temp;
			mirroringTree(root.lChild);
			mirroringTree(root.rChild);
		}
	}
	public static void  main(String args[]){

		Tree newTree = new Tree();
		
		int[] inputValue = new int[]{5,2,8,6,1,3,4,9,7,11};
		 for(int i=0;i< inputValue.length;i++){
			  newTree.insert(inputValue[i]);
		 }
		 newTree.preOrder(newTree.root);
		 mirroringTree(newTree.root);
		 System.out.println("After Mirror");
		 newTree.preOrder(newTree.root);
	}
	
}
