package com.learning;
 
 public class PepperoniPizza {
	  public enum Dogs {collie, harrier, shepherd};
	  public static void main(String [] args) {
	  Dogs myDog = Dogs.shepherd;
	
	  switch (myDog) {
	  case collie:
	  System.out.print("collie ");
	 
	  case harrier:
	  System.out.print("harrier ");
	default:
		break;
	  
	  }
	  
	   
}  
	   
	  
 }