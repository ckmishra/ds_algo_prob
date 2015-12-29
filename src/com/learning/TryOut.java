package com.learning;

public class TryOut {
	static int value=1;
	
	public int getValue()
	{
		try{
			value=value+1;
			return value;
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		finally{
			value=value+1;
		}
	}
	
	public static void main(String []args) {
		
		TryOut t =new TryOut();
		System.out.println(t.getValue());
		System.out.println(TryOut.value);

		
	}

}
