package test;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.learning.*;
import com.learning.BaseTest.*;
public class dummy {

	/**
	 * @param args
	 */
	static public  void main(String[] args) {
		// TODO Auto-generated method stub

BaseTest bt = new BaseTest();
Object obj= new int[]{1,2,3};
int[] someArray=(int[])obj;
Set s = new TreeSet();

s.add(1);s.add(2);
System.out.println(s);
	}
	


}
