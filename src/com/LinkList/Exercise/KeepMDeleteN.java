package com.LinkList.Exercise;

public class KeepMDeleteN {

	
	public LinkList keepDeleteAlt(LinkList list,int m,int n){
	

		Link current=list.first;
		Link previous=current;
		int keepLength=m;
		int deleteLength=n;
		if((keepLength==0 && deleteLength==0)||deleteLength==0){
			return list;
		}
		else if(keepLength==0){
			return null;
		}
		else{
		while(current.next != null){
			
			while(keepLength>0)
			{
				previous=current;
				current=current.next;
				keepLength--;
			}
			
			keepLength=m;
			
			while(deleteLength>0)
			{
				current=current.next;	
				deleteLength--;
			}
			
				previous.next=current;
			
				deleteLength=n;
			
		}
		return list;
		}
	}
}
