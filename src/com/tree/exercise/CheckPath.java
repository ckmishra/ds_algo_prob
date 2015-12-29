package com.tree.exercise;

import java.util.LinkedList;

public class CheckPath {

	
	public static boolean isPathhavingSUM(Node root,int sum) {
		if(root==null){
			return false;
		}
		boolean ans=false;
		sum =sum - root.value;	
		if(sum==0 && root.lChild==null && root.rChild==null){
				return true;
		}
		else{	
			
			ans= ans ||isPathhavingSUM(root.lChild, sum);
			
			ans= ans ||isPathhavingSUM(root.rChild, sum);
		}
		
		return ans;
		
	}
	
	public static boolean isPathbetweenNode(Node n1,Node n2){
		
		LinkedList<Node> nodeList = new LinkedList<Node>();
      
		nodeList.add(n1);
		Node v = null;
		while(!nodeList.isEmpty()){
			
			 v = nodeList.remove();
			
			if(v != n2){
				if(v.lChild!=null){
					nodeList.add(v.lChild);
				}
				
				if(v.rChild!=null){
					nodeList.add(v.rChild);
				}
				
			}
			else{
					break;
			}
		}
		
	    if(v == n2)	return true;
	    else return false;
	}

	
	

	public static void  main(String args[]) {

		Tree newTree = new Tree();
		
		int[] inputValue = new int[]{5,2,1,4,3,7,6,9};
		 for(int i=0;i< inputValue.length;i++){
			  newTree.insert(inputValue[i]);
		 }
        System.out.println(isPathhavingSUM(newTree.root, 14));
		
        //System.out.println(isPathbetweenNode(newTree.root,new Node()));
        
	}
	
}
