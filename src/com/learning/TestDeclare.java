package com.learning;
import com.learning.BaseTest;
 interface DeclareStuff {
 public static final int EASY = 3;
 void doStuff(int t); }
 public class TestDeclare implements DeclareStuff {
 public static void main(String [] args) {
 int x = 5;
BaseTest bt = new BaseTest();
bt.s= "Chandan";
 try{ 
 new TestDeclare().doStuff(++x);
 }catch (IllegalMonitorStateException e)

 {
	 }
 }
public void doStuff(int s) {
 s += EASY + ++s;
 System.out.println("s " + s);
 try {
		new Object().wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

 }
void waitForSignal(){
	
	 
		try {
			new Object().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

 }