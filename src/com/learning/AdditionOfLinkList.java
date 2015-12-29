package com.learning;
class Link{
	int data;
	Link next;
	public Link(int value){
		data=value;
		
	}
	public int getData()
	{
		return data;
	}
	
	
}
//End Of Link Class

class MyLinkList{
public Link first;
public MyLinkList() {
	first=null;
	
}

public void insertElement(int value)
{
	Link newLink = new Link(value);
	newLink.next=first;
	first=newLink;
	
	
}

public boolean isEmpty(){
	return first==null;
}
public void displayList()
{
Link current = first;

while(current !=null)
{
	System.out.print(current.getData()+" ");
	current=current.next;
}
}
}

//End of Linklist Class

public class AdditionOfLinkList {

public static void main(String []args){
	MyLinkList L1=new MyLinkList();
	MyLinkList L2=new MyLinkList();
	L1.insertElement(5);
	L1.insertElement(1);
	L1.insertElement(1);
	
	L2.insertElement(3);
	L2.insertElement(9);
	L2.insertElement(1);
	L1.displayList();
	System.out.println();
	L2.displayList();
	System.out.println();
	MyLinkList L3= additionOflinkList(L1, L2);
	L3.displayList();
}
//end of main

static MyLinkList additionOflinkList(MyLinkList l1,MyLinkList l2){
	
	MyLinkList resultList = new MyLinkList();
	int carry=0;
	int put;
	while(l1.first!=null && l2.first!=null){
	int sum =carry+l1.first.getData() + l2.first.getData();
	put =sum%10;
	carry=sum/10;
	resultList.insertElement(put);
	l1.first=l1.first.next;
	l2.first=l2.first.next;
	
	}	
	 return resultList;
	
}
}
