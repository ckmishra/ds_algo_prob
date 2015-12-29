package com.learning;
class Queue{
	
	private int []valueArray;
	private int rear;
	private int front;
	private int maxsize;
	int nItems;
	public Queue(int s)
	{
		maxsize=s;
		valueArray=new int[maxsize];
		rear=-1;
		front=0;
		nItems=0;
	}
	
	public void add(int value){
		if(rear==maxsize-1)
			rear=-1;
		valueArray[++rear]=value;
		nItems++;
	}
	
	public int remove(){
		int temp=valueArray[front++];
		if(front==maxsize)
			front=0;
		nItems--;
		return temp;
	}
	public boolean isEmpty()
	{
		return (maxsize!=nItems);
	}
	
	public boolean isQueueVacant(){
		return (nItems==0);
	}
	
	public void displayValue(Queue q){
		int t=0;
		for(int i=front;t<q.nItems;i++,t++){
		System.out.print(valueArray[i]+" ");
		}
	}
	
}
public class QueueWithThread implements Runnable {
	
	

	@Override
	public void run() {
		Queue q1 = new Queue(10);
		if(q1.isEmpty())
		{
		q1.add(1);
		q1.add(4);
		q1.add(3);
        q1.add(5); 
		}
		q1.displayValue(q1);
		if(!q1.isQueueVacant()){
			q1.remove();
			q1.remove();
		}
		q1.displayValue(q1);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueWithThread qt = new QueueWithThread();
		Thread t1= new Thread(qt);
		Thread t2 =new Thread(qt);
		t1.start();
		t2.start();
		//t1.run();
		//t2.run();
		
	}

}
