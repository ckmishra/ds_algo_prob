package com.queue.exercise;

import java.util.Stack;

//import java.util.Queue;

public class QueueOpUsingStack {
	Stack<Integer> s2;
	public QueueOpUsingStack(){
		s2= new Stack<Integer>();	
	}
	 
    
	public void enqueue(Stack<Integer> s1){
		
	while(!s1.empty())
	{
		if(s1.peek()!=null)
			s2.push(s1.pop());
	}
		
	}
	
	public void dequeue(){
		
	
		if(s2.peek()!=null)
		System.out.println(s2.pop());
	
	
	
	}
	
	public static void main(String []args){
		
		Stack<Integer> s1  = new Stack<Integer>();	
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(2);
		s1.push(3);
		s1.push(20);
	    QueueOpUsingStack qs = new  QueueOpUsingStack();
		qs.enqueue(s1);
		qs.dequeue();
		
		qs.dequeue();
	}
}
