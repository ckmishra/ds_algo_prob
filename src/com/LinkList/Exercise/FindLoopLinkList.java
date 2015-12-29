package com.LinkList.Exercise;
public class FindLoopLinkList {
	

public static void main(String[] args) {
	
			LinkList list= LinkListCRUD.createCircularLinkList(new int []{1,2,6,4,5,7,8,7});
		
			Link result =findBeginingLoop(list);
		    if(result==null)
		     	 System.out.println(0);
		     else
	          {
		    	 System.out.println(result.data);
	          }
//			findBeginingLoop(list);
}
	
	
public static Link findBeginingLoop(LinkList list){
	
			Link slower = list.first;
			Link faster = list.first;
			while(faster.next!=null){
				slower=slower.next;
				faster=faster.next.next;
			
				if(faster==null){
					return null;
				}
				if(slower==faster){
				break;
			}	
			}
			if(faster.next==null){
				return null;
			}
		
		// Bring Slower Back to Original
			
			slower=list.first;
			
			 while(slower!=faster){
				 slower=slower.next;
				 faster=faster.next;
				 
			 }
			 
			 return faster;
	
	
   }

/*public static void findBeginingLoop(LinkList list){
	
	Link slower = list.first;
	Link faster = list.first;
	int totalLoopLen=0;
	int beforeLoopLen=0;
	
	while(faster.next!=null){
		slower=slower.next;
		faster=faster.next.next;
	    totalLoopLen++;
		if(faster==null){
			return ;
		}
		if(slower==faster){
		break;
	}	
	}
	if(faster.next==null){
		return ;
	}

// Bring Slower Back to Original
	
	slower=list.first;
	
	 while(slower!=faster){
		 slower=slower.next;
		 faster=faster.next;
		 beforeLoopLen++;
		 
	 }
	 System.out.println(beforeLoopLen);
	 System.out.println(totalLoopLen);
	 
	 return;


}*/
}
