package com.cs122.classlabs.chap13;


public class StackList {
	
private stackNode top;

public StackList(){
	top = null;
}

public void push (int x) {
  
     stackNode oldtop = top;
     top = new stackNode(x);
     top.data = x;
     top.next = oldtop;
}

public int pop() {
	
	    int data = top.data;
	    top = top.next;
	    return data;
}
public int peek() {
	int data = top.data;
    return data;
}

public boolean isEmpty(){ 
    if (top == null) {
    	return true;
    }
    else {
    	return false;
    }
  }

public void print() {
	
	 stackNode current = top;
	 

       while (current != null)
       {
          System.out.print(current.data + "---->");//we use data since it comes from intnode class (object)
          current = current.next;// as in the last while loop, for it to keep running
       }
       System.out.println(" ");
       
}

private class stackNode {
	public int data;//this is to store the data of the node
	public stackNode next;
	
	public stackNode(int x1)
    {
        data = x1;
        next = null;
    }
	
}
}
