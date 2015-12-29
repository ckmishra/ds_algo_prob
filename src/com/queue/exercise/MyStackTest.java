package com.queue.exercise;

import static org.junit.Assert.*;


import org.junit.Test;

public class MyStackTest {
	

	@Test
	public void test1() {
	MyStack<Integer> ms= new MyStack<>();
	Link<Integer> l1= new Link<>(10);
	Link<Integer> l2= new Link<>(20);
    ms.push(l1);
    ms.push(l2);
    assertEquals(20, ms.pop().item.intValue());
    
	}
	@Test
	public void test2(){
		MyStack<String> ms= new MyStack<>();
		Link<String> l1= new Link<>("Chandan");
		Link<String> l2= new Link<>("Mishra");
	    ms.push(l1);
	    ms.push(l2);
	    assertEquals("Mishra", ms.pop().item);
	}

}
