package com.tree.exercise;

public class FindLCA {

	/**
	 * @param args
	 */
	static int countMatchesPQ(Node root, Node p, Node q) {
		  if (root==null) return 0;
		  int matches = countMatchesPQ(root.lChild, p, q) + countMatchesPQ(root.rChild, p, q);
		  
		  if (root.value == p.value || root.value == q.value)
		    return 1 + matches;
		  else
		    return matches;
		}

	public static Node LCA(Node root,Node p,Node q){
		
		if(root==null||p==null||q==null) return null;
		
		else if(root.lChild.value== p.value || root.rChild.value==q.value){
			return root;
		}
		int totalMatch =countMatchesPQ(root.lChild, p, q);
		
		 if(totalMatch==1){
			return root;
		}
		 else if(totalMatch== 2){
				return LCA(root.lChild, p, q);
				
			}
		 else
		 {
			 return LCA(root.rChild, p, q);
		 }
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Tree newTree = new Tree();
		
		int[] inputValue = new int[]{5,2,1,4,3,7,6,9};
		 for(int i=0;i< inputValue.length;i++){
			  newTree.insert(inputValue[i]);
		 }
		 Node p = new Node();
		 p.value=1;
		 
		 Node q = new Node();
		 q.value=7;
		 
      System.out.println(LCA(newTree.root,p,q).value);

			int[] inputValue2 = new int[]{2,1,4,3,5};
			 for(int i=0;i< inputValue2.length;i++){
				  newTree.insert(inputValue2[i]);
			 }
		 
		  p = new Node();
		 p.value=3;
		 
		 q = new Node();
		 q.value=5;
		 
      System.out.println(LCA(newTree.root,p,q).value);
		
	}

}
