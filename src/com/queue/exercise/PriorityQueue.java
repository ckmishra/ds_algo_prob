package com.queue.exercise;




import java.util.LinkedList;
import java.util.Queue;
import java.util.TimerTask;

class PQElement{
	int value;
	int priority;
	long insertTime;
	public PQElement(int v,int p) {
		// TODO Auto-generated constructor stub
	value=v;
	priority=p;
	insertTime=System.currentTimeMillis();
	}
	
	
	
}

public class PriorityQueue  extends TimerTask{
	
	static Queue<PQElement> QwithPrirotyOne= new LinkedList<PQElement>();
	static Queue<PQElement> QwithPrirotyTwo= new LinkedList<PQElement>();
	static Queue<PQElement> QwithPrirotyThree= new LinkedList<PQElement>();
	static Queue<PQElement> QwithPrirotyFour= new LinkedList<PQElement>();
	static Queue<PQElement> QwithPrirotyFive= new LinkedList<PQElement>();
	
	int resetTime;
	public PriorityQueue(int time) {
		
		resetTime=time;
		
			}
	public PriorityQueue(){
		
	}
	
	
public void enqueue(PQElement pqe){
	
	switch(pqe.priority)
	{
	case 1:QwithPrirotyOne.add(pqe);
	break;
	case 2:QwithPrirotyTwo.add(pqe);
	break;
	case 3:QwithPrirotyThree.add(pqe);
	break;
	case 4:QwithPrirotyFour.add(pqe);
	break;
	case 5:QwithPrirotyFive.add(pqe);
	}
	
}

public PQElement dequeue(){
	
	//resetPriority();
	
	if(!QwithPrirotyOne.isEmpty())
		return QwithPrirotyOne.remove();
	else if(!QwithPrirotyTwo.isEmpty())
		return QwithPrirotyTwo.remove();
	else if(!QwithPrirotyThree.isEmpty())
		return QwithPrirotyThree.remove();
	else if(!QwithPrirotyFour.isEmpty())
		return QwithPrirotyFour.remove();
	else if(!QwithPrirotyFive.isEmpty())
	{
		
		return QwithPrirotyFive.remove();
	}
	else return null;
	
	}



public  void  resetPriority(){
	long currentTime=System.currentTimeMillis();
	
	if(!QwithPrirotyFive.isEmpty())
	{
		for (int i = 0; i < QwithPrirotyFive.size(); i++) {
		
			if(currentTime >= QwithPrirotyFive.poll().insertTime + resetTime/1000)
	       	{
	       		QwithPrirotyFour.add(QwithPrirotyFive.remove());
	       	}
			
			else
				break;
		
			}
          	
	}
	else if(!QwithPrirotyFour.isEmpty())
	{
		for (int i = 0; i < QwithPrirotyFour.size(); i++) {
		
			if(currentTime >= QwithPrirotyFour.poll().insertTime + resetTime/1000)
	       	{
	       		QwithPrirotyThree.add(QwithPrirotyFour.remove());
	       	}
			
			else
				break;
		
	}
	}
	else if(!QwithPrirotyThree.isEmpty())
	{
		for (int i = 0; i < QwithPrirotyThree.size(); i++) {
		
			if(currentTime >= QwithPrirotyThree.poll().insertTime + resetTime/1000)
	       	{
	       		QwithPrirotyTwo.add(QwithPrirotyThree.remove());
	       	}
			
			else
				break;
		
	}
	}
	else if(!QwithPrirotyTwo.isEmpty())
	{
		for (int i = 0; i < QwithPrirotyTwo.size(); i++) {
		
			if(currentTime >= QwithPrirotyTwo.poll().insertTime + resetTime/1000)
	       	{
	       		QwithPrirotyOne.add(QwithPrirotyTwo.remove());
	       	}
			
			else
				break;
		
	}
	}

}

public void run()
{
  
	resetPriority();
}
/*public static void main(String[] args){

}*/

}
