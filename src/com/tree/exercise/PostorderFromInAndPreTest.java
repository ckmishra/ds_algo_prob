package com.tree.exercise;

import org.junit.Test;

public class PostorderFromInAndPreTest {
	PostorderFromInAndPre postPrint = new PostorderFromInAndPre();

	@Test
	public void testPositive_1() {
		int[] in = new int[] {1};
		int[] pre = new int[] {1};
		Tree t = postPrint.postorderConverter(in, pre);
		t.postOrder(t.root);
	}

	@Test
	public void testPositive_2() {

		int[] inOrder= new int[]{1,2,4,5,7,9,10,13,15,20,25};
		int[] preOrder = new int[]{10,5,2,1,4,7,9,15,13,20,25};
		Tree t = postPrint.postorderConverter(inOrder,preOrder);
		
		System.out.println("PostOrder");
		t.postOrder(t.root);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testNegative_1() {
		
		int[] inOrder= new int[]{1,2,4,5,7,9,10,13,15,20,25};
		int[] preOrder = new int[]{10,5,1,4,7,9,15,13,20,25};
		Tree t = postPrint.postorderConverter(inOrder,preOrder);
		
		System.out.println("PostOrder");
		t.postOrder(t.root);
	}
	@Test
	public void testNegative_2() {
		
		int[] inOrder= new int[]{1,2,4,5,7,9,10,13,15,20,25};
		int[] preOrder = new int[]{10,5,2,5,6,7,9,15,13,20,25};
		Tree t = postPrint.postorderConverter(inOrder,preOrder);
		System.out.println("PostOrder");
		t.postOrder(t.root);
	}

}
