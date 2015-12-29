package com.LinkList.Exercise;

import org.junit.Before;
import org.junit.Test;

public class SwapKthFromBeginWithLastTest {
	SwapKthFromBeginWithLast swapper;

	@Before
	public void setUp() throws Exception {
		swapper = new SwapKthFromBeginWithLast();
	}

	@Test
	public void test1() {
		LinkList list = LinkListCRUD.createLinkList(new int[] { 1, 2, 3, 4, 5,
				6, 7, 8, 9, 10, 11 });
		list = swapper.swapKth(list, 0);
		LinkList.displayLinkList(list);

	}

	
	public void test2() {
		LinkList list = LinkListCRUD.createLinkList(new int[] { 1, 2, 3, 4, 5,
				6, 7, 8, 9, 10, 11 });
		list = swapper.swapKth(list, 12);
		LinkList.displayLinkList(list);

	}

	@Test
	public void test3() {

		LinkList list = LinkListCRUD
				.createLinkList(new int[] { 1, 2, 3, 4, 5 });
		list = swapper.swapKth(list, 3);
		LinkList.displayLinkList(list);

	}

	@Test
	public void test4() {

		LinkList list = LinkListCRUD.createLinkList(new int[] { 1, 2, 3, 4, 5,
				6, 7, 8, 9, 10 });
		list = swapper.swapKth(list, 5);
		LinkList.displayLinkList(list);

	}

	@Test
	public void test5() {

		LinkList list = LinkListCRUD.createLinkList(new int[] { 1, 2, 3, 4, 5,
				6, 7 });
		list = swapper.swapKth(list, 3);
		LinkList.displayLinkList(list);

	}

}
