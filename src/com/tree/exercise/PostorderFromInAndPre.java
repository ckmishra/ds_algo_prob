package com.tree.exercise;

public class PostorderFromInAndPre {

	Tree t = new Tree();
	int size=0;
	
	public Tree postorderConverter(int[] inOrder,int[] preOrder)
	{
		if(inOrder.length!=preOrder.length){
			throw new IllegalArgumentException("Argument is Wrong");
		}
		if(size >= preOrder.length ){
			
			return null;
		}
		else {
		int index= find(inOrder,preOrder[size++]);
		if(index != -1)
		{
		t.insert(inOrder[index]);
		postorderConverter(inOrder, preOrder);
		}
		else{
			return null;
		}
				
		}
		return t;
	}
	
	private int find(int[] inOrder, int i) {
		for (int j = 0; j < inOrder.length; j++) {
			if(inOrder[j]==i){
				return j;
			}
			}
			return -1;
		
	}

}
