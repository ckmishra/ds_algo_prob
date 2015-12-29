package com.tree.exercise;

import java.util.HashMap;

class TrieNode{
	
	private char value;
    private HashMap<Character,TrieNode> children ;
    private boolean bIsEnd;
	 public TrieNode(char ch) {
		// TODO Auto-generated constructor stub
		 value=ch;
		 children=new HashMap<Character,TrieNode>();
		 bIsEnd=false;
	}
		
	    
	    
	    public char getValue(){return value;}
	    public HashMap<Character,TrieNode> getChildren(){return children;}
	    public void setIsEnd(boolean flag) { bIsEnd=flag;}
	    public boolean IsEnd(){return bIsEnd;}
		
}

class Trie{
	private TrieNode root;
	public Trie(){
	root=new TrieNode((char)0);
	}
	
	//Method to insert in trie
	public  void insert(String Word){
	
		int length=Word.length();
		TrieNode tracker= root;
		
		for(int level=0;level <length;level++){
			
			char ch=Word.charAt(level);
			HashMap<Character, TrieNode> child = tracker.getChildren();
            
			if(child.containsKey(ch)){
				tracker=child.get(ch);
			}
			else{
				TrieNode temp= new TrieNode(ch);
				child.put(ch, temp);
				tracker=temp;
			}
		
		}
		tracker.setIsEnd(true);
	
}

	// Get Prefix match of word
		public String getPrefixMatch(String word){
			
			int length=word.length();
			TrieNode tracker= root;
			int height=0;
			String result="";
			for(int level=0;level<length;level++){
				char ch=word.charAt(level);
				HashMap<Character, TrieNode> child = tracker.getChildren();
				
				if(child.containsKey(ch)){
					result+=ch;
					tracker=child.get(ch);
					 if(tracker.IsEnd()) 
						 height = level + 1;	
				}
				
				else{
					
					break;
				}
				
				
			}
			
			if(!tracker.IsEnd()){
				return (result.substring(0,height));
			}
			else 
				return result;
			
			
 
			
			
		}
	}
	public class TrieDemo {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub

			Trie newTrie= new Trie();
			newTrie.insert("chan");
			newTrie.insert("chart");
			newTrie.insert("ckmishra");
			
			newTrie.insert("are");
			newTrie.insert("area");
			newTrie.insert("base");
			newTrie.insert("cat");
			newTrie.insert("cater");        
			newTrie.insert("basement");
			
			
			String res=newTrie.getPrefixMatch("basemen");
			System.out.println(res);
			
			
		}

	}
