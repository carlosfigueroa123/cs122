package com.cs122.classlabs.chap13;
import java.util.*;

public class StacksLL <T>{
	
	public LinkedList <T>l;//so we just rename methods of linkedlist
	
	public StacksLL() {
		l = new LinkedList<T>();
	}
		 
	public void push(T o){  //adds at the beginning of the list
		
		//if you use push (addEnd) to add the T o to the end, it becomes a queue link list style
			l.addFirst(o);
	}

	
	public T pop(){   //deletes at the beginning of the list and returns the deleted element 
		
		return l.removeFirst();
		
	}
	
	public void peek(){  //returns first element of the list
		
		System.out.println(l.get(0));
	}
	
	public String toString() {  //the name of this method is case sensitive
		
		return l.toString();
	}
	
	public void size(){ //does it has to be int or could it be void for my implementation
 
		System.out.println(l.size());

	}

	public boolean isEmpty(){

		return l.isEmpty();

		}

}
