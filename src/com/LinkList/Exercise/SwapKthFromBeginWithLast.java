package com.LinkList.Exercise;

public class SwapKthFromBeginWithLast {

	public LinkList swapKth(LinkList list, int k) {
		Link first = list.first;
		Link xPointer = first;
		Link xPointerPrevious = null;
		Link yPointer = first;
		Link yPointerPrevious = null;
		int size = 0;
		while (first != null) {
			size++;
			first = first.next;
		}
		first = list.first;
		if (k == 0) {
			return list;
		}
		else if (2*k -1==size){
			return list;
		}
		else if (k > size) {
			return null;
		} else {
			
			for(int i =1;i<k;i++){
				xPointerPrevious = xPointer;
				xPointer = xPointer.next;
			}
			for(int i =1;i<size - k+1;i++){
				yPointerPrevious = yPointer;
				yPointer = yPointer.next;
			}

			
			if(xPointerPrevious!=null){
				xPointerPrevious.next=yPointer;
			}
			if(yPointerPrevious!=null){
				yPointerPrevious.next=xPointer;
			}
			Link temp = xPointer.next;
			xPointer.next=yPointer.next;
			yPointer.next=temp;
			if(k==1)
				list.first=yPointer;
			if(k==size)
				list.first=xPointer;
			return list;
		}

	}

	public static void main(String args[]) {
		
		SwapKthFromBeginWithLast swapper = new SwapKthFromBeginWithLast();
		for (int i = 1; i < 9; i++) {
			LinkList list = LinkListCRUD.createLinkList(new int[] { 1, 2, 3, 4, 5,
					6, 7, 8 });
			list = swapper.swapKth(list, i);
			LinkList.displayLinkList(list);
			System.out.println();

		}

	}
}
