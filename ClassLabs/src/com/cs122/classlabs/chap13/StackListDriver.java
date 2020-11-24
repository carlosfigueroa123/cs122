package com.cs122.classlabs.chap13;

public class StackListDriver {

	public static void main(String[] args) {
		
		StackList stacklist = new StackList();
		stacklist.push(1);
		stacklist.print();
		stacklist.push(2);
		stacklist.print();
		stacklist.push(3);
		stacklist.print();
		System.out.println(stacklist.pop());
		System.out.println(stacklist.peek());
		stacklist.print();
	}

}
