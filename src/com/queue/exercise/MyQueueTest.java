package com.queue.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	
	
	@Test
	public void test1(){
	MyQueue<Integer> mq= new MyQueue<>();
	Integer i1=1;
	Integer i2=2;
    mq.enqueue(i1);
    mq.enqueue(i2);
    assertEquals(1, mq.dequeue().item.intValue());
    
	}
	@Test
	public void test2(){
		MyQueue<String> mq= new MyQueue<>();
		String s1="Chandan";
		String s2="Mishra";
	    mq.enqueue(s1);
	    mq.enqueue(s2);
	    assertEquals("Chandan", mq.dequeue().item);
	}

}
