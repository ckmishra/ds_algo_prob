package com.LinkList.Exercise;

public class RemoveBackAddFront {

public static LinkList removeAddMethod(LinkList inputList,int n){
	
	Link current = inputList.first;
	
	int listLength = 0;
    while(current!=null){
    	current=current.next;
    	listLength ++;
    }
 
    current=inputList.first;
    Link previous=null;
    
    
    while(listLength-n > 0){
    	previous=current;
    	current=current.next;
    	listLength--;
    }
    
    previous.next=null;
    
    Link newPrevious=null;
    Link newFirst=current;
    
    while(current!=null)
    {
    newPrevious=current;
    current=current.next;
    }
    
    newPrevious.next=inputList.first; 
    inputList.first=newFirst;
	
    //current.displayLink();
	/*previous.displayLink();
	newFirst.displayLink();
	newPrevious.displayLink();
*/ 
    return inputList;
}


public static LinkList removeAddMethodBestApproach(LinkList inputList,int n){
	
	Link fastPtr=inputList.first;
	
	while(n>1){
		fastPtr=fastPtr.next;
		n--;
	}
	Link slowPtr=inputList.first;
	 while(fastPtr.next!=null){
		 fastPtr=fastPtr.next;
		 slowPtr=slowPtr.next;
	 }
	fastPtr.next=inputList.first;
	fastPtr=inputList.first;

 	while(fastPtr.next!=slowPtr){
	fastPtr=fastPtr.next;	
	}
 	
	fastPtr.next=null;
	inputList.first=slowPtr;
	return inputList;
    
}

public static void main(String args[]){
	LinkList ll = new LinkList();
	  ll.addAtTail(5);
	  ll.addAtTail(2);
	  ll.addAtTail(7);
	  ll.addAtTail(6);
	  ll.addAtTail(1);
	  ll.addAtTail(3);
	  ll.addAtTail(4);
	  System.out.println("Before Operation");
	  LinkList.displayLinkList(ll);
	  System.out.println("After Operation");
	  LinkList.displayLinkList(removeAddMethodBestApproach(ll, 3));
	
}

}
