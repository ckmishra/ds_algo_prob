package com.queue.exercise;

import static org.junit.Assert.*;

import java.util.Timer;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	PQElement pqe1= new PQElement(10, 5);
	PQElement pqe2= new PQElement(20, 4);
	PQElement pqe3= new PQElement(30, 5);
	PQElement pqe4= new PQElement(50, 2);
	PQElement pqe5= new PQElement(100, 1);
	PQElement pqe6= new PQElement(100, 2);
	PQElement pqe7= new PQElement(100, 1);
	PQElement pqe8= new PQElement(15, 3);
	PriorityQueue PQ = new PriorityQueue(30);
	Timer schedular = new Timer();
	@Before
	public void setup(){
		schedular.scheduleAtFixedRate(PQ, 0, 25000);
	}
	@Test
	public void test1PriorityQueue() {
	
	PQ.enqueue(pqe1);
	PQ.enqueue(pqe2);
	PQ.enqueue(pqe3);
	PQ.enqueue(pqe4);
	PQ.enqueue(pqe5);
	PQ.enqueue(pqe6);
	PQ.enqueue(pqe7);
	PQ.enqueue(pqe8);
	System.out.println("Before");
	System.out.print(PriorityQueue.QwithPrirotyFive.size());
	System.out.print(PriorityQueue.QwithPrirotyFour.size());
	System.out.print(PriorityQueue.QwithPrirotyThree.size());
	System.out.print(PriorityQueue.QwithPrirotyTwo.size());
	System.out.print(PriorityQueue.QwithPrirotyOne.size());
	
	
	assertEquals(100, PQ.dequeue().value);
	assertEquals(100, PQ.dequeue().value);
	
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("after");	
	System.out.print(PriorityQueue.QwithPrirotyFive.size());
	System.out.print(PriorityQueue.QwithPrirotyFour.size());
	System.out.print(PriorityQueue.QwithPrirotyThree.size());
	System.out.print(PriorityQueue.QwithPrirotyTwo.size());
	System.out.print(PriorityQueue.QwithPrirotyOne.size());

	}

	@Test
	public void test2PriorityQueue() {

		PQ.enqueue(pqe1);
		System.out.println("Before");
		System.out.print(PriorityQueue.QwithPrirotyFive.size());
		System.out.print(PriorityQueue.QwithPrirotyFour.size());
		System.out.print(PriorityQueue.QwithPrirotyThree.size());
		System.out.print(PriorityQueue.QwithPrirotyTwo.size());
		System.out.print(PriorityQueue.QwithPrirotyOne.size());

		
		assertEquals(5,PQ.dequeue().value);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after");
	
		System.out.print(PriorityQueue.QwithPrirotyFive.size());
		System.out.print(PriorityQueue.QwithPrirotyFour.size());
		System.out.print(PriorityQueue.QwithPrirotyThree.size());
		System.out.print(PriorityQueue.QwithPrirotyTwo.size());
		System.out.print(PriorityQueue.QwithPrirotyOne.size());

			}
	
	@Test
	public void test3PriorityQueue(){
		PQElement ele = new PQElement(2,1);
		PQ.enqueue(ele);
		System.out.println("Before");
		System.out.print(PriorityQueue.QwithPrirotyFive.size());
		System.out.print(PriorityQueue.QwithPrirotyFour.size());
		System.out.print(PriorityQueue.QwithPrirotyThree.size());
		System.out.print(PriorityQueue.QwithPrirotyTwo.size());
		System.out.print(PriorityQueue.QwithPrirotyOne.size());
		
		assertEquals(2, PQ.dequeue().value);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after");
		System.out.print(PriorityQueue.QwithPrirotyFive.size());
		System.out.print(PriorityQueue.QwithPrirotyFour.size());
		System.out.print(PriorityQueue.QwithPrirotyThree.size());
		System.out.print(PriorityQueue.QwithPrirotyTwo.size());
		System.out.print(PriorityQueue.QwithPrirotyOne.size());

	}
	
}
