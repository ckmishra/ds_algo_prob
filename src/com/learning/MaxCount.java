    package com.learning;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Scanner;
    public class MaxCount {
    	
    	
    private static Scanner in;

	public static void main(String []args) throws IOException
    {
    ArrayList<Integer> myList = new ArrayList<Integer>();
    
    in = new Scanner(System.in);
    int T = in.nextInt();
    if(T < 1 || T > 100)
    {
    System.exit(0);
    }
    else
    {
    while(T!=0)
    {
    int N= in.nextInt();
    if(N<1 || N>100)
    {
    System.exit(0);
    }
    else
    {
    for(int i=0;i<N; i++)
    {
    int s = in.nextInt();
    if(s>10000 || s<1)
    {
    System.exit(0);
    }
    else
    myList.add(s);
    }
    int value=10000;
    int count=0;
    for(int i=0;i < myList.size();i++)
    {
    int m= Collections.frequency(myList,myList.get(i));
    if(m >= count && value >= myList.get(i))
    {
    count=m;
    value=myList.get(i);
    }
    }
    System.out.print(value+" "+count+"\n");
    myList.clear();
    T--;
    }
    }
    }
    }
    } 