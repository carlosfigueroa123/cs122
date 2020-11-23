package com.cs122.classlabs.chap13;

public class StacksLLDriver {

	public static void main(String[] args) {
		
		StacksLL<Integer> intList = new StacksLL<Integer>();
		intList.push(0);
		System.out.println(intList);
		intList.push(1);
		System.out.println(intList);
		intList.push(2);
		System.out.println(intList);
		intList.pop();
		System.out.println(intList);
		intList.push(3);
		System.out.println(intList);
		
		StacksLL<String> sList = new StacksLL<String>();
		sList.push("Pace");
		System.out.println(sList);
		sList.push("Seidenberg");
		System.out.println(sList);
		sList.push("Computer Science");
		System.out.println(sList);
		sList.pop();
		System.out.println(sList);
		sList.push("CS122");
		System.out.println(sList);
	}

}
