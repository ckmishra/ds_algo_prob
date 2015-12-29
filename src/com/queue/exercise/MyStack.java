package com.queue.exercise;

class Link <E>{
	
	E item;
	Link<E> next;
	
	public Link(E value)
	{
		item=value;
		next=null;
	}
	
	
}

class LinkList<E>{
	
	Link<E> first=null;
 
	public LinkList(){
	 first=null;
 }
	
	public void addFirst(Link<E> element)
	{
		if(first==null){
			first=element;
		}
		else
		{
			element.next=first;
			first= element;
		}
	}
	
	public Link<E> remove()
	{
		if(first != null){
			Link<E> output;
			output=first;
			first=first.next;
			return output;
		}
		
		else return first;
	}
	
}

public class MyStack<E> {

	LinkList<E> inputList = new LinkList<>();
	
	public void push(Link<E> item)
	{
		
		inputList.addFirst(item);
		
	}
	
	public Link<E> pop(){
		
	 Link<E> output= inputList.remove();
	 return output;
	}
	
	public boolean isEmpty(){
		if (inputList.first==null)
	 return true;
		else return false;
	}
	
}
