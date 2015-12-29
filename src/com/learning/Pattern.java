package com.learning;



public class Pattern {

/**
* @param args
*/
public static void main(String[] args) {

	printStars(9);
  }
	static void display(int count){
		int mid = (count + 1)/2;
	for(int i=0;i<mid;i++){
		double currLevel = Math.pow(2, i);
		for(int j=0;j<currLevel;j++){
			System.out.print('*');
		}
		System.out.println();
	}
	for(int i=mid-2;i>=0;i--){
		double currLevel = Math.pow(2, i);
		for(int j=0;j<currLevel;j++){
			System.out.print('*');
		}
		System.out.println();
}

}
 
// Other way 

  static void printOddNumberPattern (int x){
      if(x%2 != 0){
          for(int i=0;i<x;i++){
              for(int j=0;j<x;j++){
              if((i<x/2 && i>=j) || (i>=x/2 && i<=j) ) 
                  System.out.print("*");
              }
              if(i == x/2){
                System.out.print("*");
              }
            System.out.print("\n");
          }
      }
  
  }
  
 // other Way
  
  public static void printStars(int n) {
    if(n % 2 != 0){
         int mid = n/2;
          for(int i=1;i <=n;i++){
             for(int j=1;j <= n ;j++){
            	 if((i <= mid && i >=j)){
                System.out.print("*");
            	 }
            	if ((i > mid && i<=j )){
            		
            		  System.out.print("*");	
            		
            	}
             }
             
           if (i == mid+1)
            System.out.print("*");
            System.out.println();
      
      }
   }
 }

}
