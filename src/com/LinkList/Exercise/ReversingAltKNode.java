package com.LinkList.Exercise;

public class ReversingAltKNode {

public static Link reverseAltK(Link head,int k){
	Link current=head;
	Link previous=null;
	Link move=null;
	int count=0;
	while(current!=null && count < k){
		move=current.next;
		current.next=previous;
		previous=current;
		current=move;
		count++;
	}
	
	if(head!= null)
	      head.next = current; 
	      
	count=1;

	while(k > count && current!=null){			
		current=current.next;
		count++;
				}
	
	if(current!=null){
    
		current.next=reverseAltK(current.next,k);
	
	}
    
	
	return previous;
}

public static void main(String args[]){
	
	LinkList inputList = new LinkList();
	inputList.addAtTail(5);
	inputList.addAtTail(2);
	inputList.addAtTail(1);
	inputList.addAtTail(7);
	inputList.addAtTail(6);
	inputList.addAtTail(9);
	inputList.addAtTail(71);
	inputList.addAtTail(16);
	inputList.addAtTail(19);
	LinkList.displayLinkList(inputList);
    System.out.println();
    
    Link resultHead=reverseAltK(inputList.first,2);
    while(resultHead!=null)
    {
    resultHead.displayLink();
    resultHead=resultHead.next;
    }
    
		
}

}

