package com.LinkList.Exercise;

import org.junit.Test;

public class KeepMDeleteNTest {

	@Test
	public void test1() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 0, 0);
		LinkList.displayLinkList(list);

	}
	@Test
	public void test2() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 1, 1);
		LinkList.displayLinkList(list);

	}
	@Test
	public void test3() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 2, 3);
		LinkList.displayLinkList(list);

	}
	@Test
	public void test4() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 3, 2);
		LinkList.displayLinkList(list);

	}
	@Test
	public void test5() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 11, 0);
		LinkList.displayLinkList(list);

	}
	@Test
	public void test6() {
		KeepMDeleteN keepDelete = new KeepMDeleteN();
		
		LinkList list = LinkListCRUD.createLinkList(new int[]{1,2,3,4,5,6,7,8,9,10,11});
		 list=	keepDelete.keepDeleteAlt(list, 0, 11);
		//LinkList.displayLinkList(list);

	}
}
