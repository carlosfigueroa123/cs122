package com.cs122.classlabs.chap13;

public class QueueListDriver {

	public static void main(String[] args) {
		
		QueueList queue = new QueueList();
		
		queue.enqueue("Carlos");
		queue.enqueue("David");
		queue.print();
		queue.enqueue("Mack");
		queue.print();
		System.out.println(queue.dequeue());
		queue.print();
		System.out.println(queue.isEmpty());

	}

}
