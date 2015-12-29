package com.LinkList.Exercise;

import java.util.HashSet;

class Link{
	int data;
	Link next=null;
	Link(int d) {data=d;}
	public void displayLink(){
		System.out.print(data+" ");
		
	}
}

 class LinkList{
	 Link first;
	 
	public LinkList(){
		first=null;
	}
	

	public void addAtTail(int v){
		
		Link end = new Link(v);
	
		Link current=this.first;
		if(this.first==null){
			this.first=end;
		}
		else{
		while(current.next!=null){
			current=current.next;
		}
		
		current.next=end;	
	    
		}
	}

	public void addCircular(int v){
		
		Link end = new Link(v);
		Link current=this.first;
		Link last =this.first;
		if(this.first==null){
			this.first=end;
		}
		else{
			while(last.next!=null){
				last=last.next;
			}
			
		while(current!=null){
			if(current.data == v)
			{
				last.next=current;
				break;
			}
			current=current.next;
		}
		 if(current==null){
			 last.next= end;
		 }
			
	    
		}
	}
	
	
	public Link deleteNode(int value){
		Link previous=first;
		Link current =first;
		
		if(first.data==value){
			
	     first=first.next;
			return current;
		
		}
		while(current.next!=null){
			previous=current;
			current=current.next;
			
			if(current.data==value){
				previous.next=current.next;
				
			}
		}
		return current;
	}
	
	 public  void deleteDuplicateNodeWithBuffer(){
		 HashSet<Integer> table = new HashSet<Integer>();
	     Link current = this.first;
	     Link previous=null;
	     while(current!=null)
	     {
	    	 if(!table.contains(current.data)) {
	    		 table.add(current.data);
	    		 previous=current;
	    	 }
		
	    	 else{
	    		 previous.next=current.next;
	    	 }
	    	 current=current.next;
	     }
	
	 }
	
	 public void deleteDuplicateNode(){
		 Link current = this.first;
		 Link previous=null;
		while(current!=null){
			Link runner = current.next;	
		 while(runner!=null){
			 previous=runner;
//			 runner=runner.next;
			 			 
			 if(runner.data==current.data){
				 previous.next=runner.next;
				 runner=runner.next;

			 }
			 else 
				 {//current.next=runner;
				 runner=runner.next;
				 }
			 
		 }
		 current=current.next;
		}
		 
	 }
	public static void displayLinkList(LinkList l){
		Link current=l.first;
		while(current!=null){
			current.displayLink();
		//	System.out.println(current.hashCode());
			current=current.next;
	}		
	}
}

public class LinkListCRUD {

	/**
	 * @param args
	 */
	
	public static LinkList createLinkList(int [] input){
		LinkList l1= new LinkList();
		for (int i = 0; i < input.length; i++) {
			l1.addAtTail(input[i]);
			
		}
		return l1;
		
	}   
	public static LinkList createCircularLinkList(int [] input){
		LinkList l1= new LinkList();
		for (int i = 0; i < input.length; i++) {
			l1.addCircular(input[i]);
			
		}
		return l1;
		
	}   
 
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.addAtTail(5);
		theList.addAtTail(2);
		theList.addAtTail(1);
		theList.addAtTail(7);
		theList.addAtTail(1);
		LinkList.displayLinkList(theList);
	   
		System.out.println(theList.deleteNode(1));
	
		//theList.deleteNode(5);
       // theList.deleteDuplicateNodeWithBuffer();
		//theList.deleteDuplicateNode();
		LinkList.displayLinkList(theList);	
		
	}
}
