package com.cs122.classlabs.chap13;


public class StackList {
	
private stackNode top;

public StackList(){
	top = null;
}

public void push (int x) {
	//adds a node to the beginning of the list
	//exactly as add method
}

public int pop() {
	//it deletes the first element of the list. and it is int because of int data, not objects of magazine
	//exactly as delete method
}

public int peek() {
	//it returns the last element of the list, so it is like pop method but it doesnt deletes it
}

public boolean empty() {
	//if the first item is empty, returns true. If there are elements there, returns false
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
