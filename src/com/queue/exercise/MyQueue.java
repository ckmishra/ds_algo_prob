package com.queue.exercise;

public class MyQueue <E> {
	MyStack<E> myStack1;
	MyStack<E> myStack2;
	
	public MyQueue(){
		myStack1= new MyStack<>();
		myStack2= new MyStack<>();
		
	}
	
	public void enqueue(E item){
		
		while(!myStack1.isEmpty()){
			myStack2.push(myStack1.pop());
		}
		myStack1.push(new Link<E>(item));
		
		while(!myStack2.isEmpty()){
			myStack1.push(myStack2.pop());
		}
	}
	
	public Link<E> dequeue(){
		return myStack1.pop();
		
	}
	

}
