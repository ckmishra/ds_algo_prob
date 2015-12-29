package com.LinkList.Exercise;



public class AddUsingLinkedList {

	/**
	 * @param args
		    You have two numbers represented by a linked list, where each node contains a sin-gle digit The digits are stored in reverse order, such that the 1�s digit is at the head of 
			the list Write a function that adds the two numbers and returns the sum as a linked 
			list
			EXAMPLE 
			Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
			Output: 8 -> 0 -> 8
	 */
	
	public static LinkList addList(LinkList num1,LinkList num2){
		

		Link currentFirst=num1.first;
		Link currentSecond=num2.first;
		LinkList result=new LinkList();
		
		int sumOfDigit ;
		int inHand=0;
	
		while(currentFirst != null || currentSecond != null){
		   
			if(currentFirst==null){
			           sumOfDigit = inHand + currentSecond.data; 
			   		   currentSecond = currentSecond.next;
		   }
		   else if (currentSecond==null)
		   {
			 sumOfDigit = inHand + currentFirst.data ;
			 currentFirst = currentFirst.next;
			
		   }
		   else {

				sumOfDigit = inHand + currentFirst.data +currentSecond.data;
				currentFirst = currentFirst.next;
				currentSecond = currentSecond.next;
		   }
		   
			if(sumOfDigit  >= 10){
				inHand =sumOfDigit /10;
				sumOfDigit =sumOfDigit %10;
			 
		  }
			else{
				 inHand=0;
			}
			
			result.addAtTail(sumOfDigit );
			
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList first = LinkListCRUD.createLinkList(new int[]{1,1,5});
		LinkList second = LinkListCRUD.createLinkList(new int[]{1,9,3});
	    LinkList res =  addList(first, second);
	    LinkList.displayLinkList(res);
		
		
	}

}
