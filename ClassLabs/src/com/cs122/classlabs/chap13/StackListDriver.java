package com.cs122.classlabs.chap13;

public class StackListDriver {

	public static void main(String[] args) {
		
		StackList stacklist = new StackList();
		stacklist.push("nyu.com");
		stacklist.print();
		stacklist.push("google.com");
		stacklist.print();
		stacklist.push("yahoo.com");
		stacklist.print();
		System.out.println(stacklist.pop());
		stacklist.print();
		System.out.println("ahhhhhh");
		System.out.println(stacklist.peek());
		stacklist.print();
		System.out.println(stacklist.isEmpty());
	}

}
