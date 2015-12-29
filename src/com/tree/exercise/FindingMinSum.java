package com.tree.exercise;

public class FindingMinSum {
	
	static int globalSum=10000 ;
	 
        
	public static int findMinSum(Node root,int gSum){
			
		if(root==null){
			return 0;
		}
		
		gSum += root.value;
		
		if(root.lChild==null && root.rChild==null){
			if(globalSum > gSum){
				
				globalSum = gSum; 
			    
			}
		    			
					}
		    findMinSum(root.lChild,gSum);
	 	    findMinSum(root.rChild,gSum);
		
		return globalSum;		
	}

	public static void inOrder(Node root){
		
		if(root!=null){
			inOrder(root.lChild);
			System.out.println(root.value);
			inOrder(root.rChild);
			
		}
	}
	
	public static void main(String args[]){
		Tree t = new Tree();
		t.insert(5);
		t.insert(3);
	//	t.insert(5);
		t.insert(5);
		t.insert(4);
	   //t.insert(2);
		
		System.out.println(findMinSum(t.root,0));
		
		System.out.println(FindingMinSum.globalSum);
		
	   
		//inOrder(t.root);
	   
		
	}
	
}
