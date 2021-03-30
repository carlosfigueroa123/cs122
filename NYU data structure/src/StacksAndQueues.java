import java.util.*;

public class StacksAndQueues <T>{


	class Node {
		public int val;
		public Node next;
		
		public Node(int v) {
			val = v;
			next = null;
		}
	}

	public static class Stack <T> {
		
		public LinkedList <T>l;//so we just rename methods of linkedlist

			
		public Stack() {
			l = new LinkedList<T>();
		}
		
		public void push(T o) {
			 l.addFirst(o);
		}
		
		public T peek() {
			return l.get(0);
		}
		
//		public void peek(){  //returns first element of the list
//		
//		System.out.println(l.get(0));
//	}
		
		public T pop() {
			return l.removeFirst();
		}
		
		public int size() {
			return l.size();
		}
		
//		public void size(){ //does it has to be int or could it be void for my implementation
//	 
//			System.out.println(l.size());
//
//		}
		
		public boolean isEmpty() {
			return l.isEmpty();
		}
	}

	public static class Queue <T> {
		
		public LinkedList <T>m ;
		
		
		public void enqueue(T o)
	    {
			m.addLast(o);//not even by switching
	    }
		
		public T dequeue() {
			return m.removeFirst();//switched too
		}
		
		public T peek() {
			return m.peek();
		}
		
//		public void peek(){  //returns first element of the list
//			
//			System.out.println(l.get(0));
//		}

		
		public int size() {
			return m.size();
		}
		

//		public void size(){ //does it has to be int or could it be void for my implementation
//	 
//			System.out.println(l.size());
//
//		}

		
		public boolean isEmpty() {
			return m.isEmpty();
		}
	}

	public static class StacksAndQueues1 {

		public static void main(String args[]) 
	    { 
	
			//StacksAndQueues<Integer> a = new StacksAndQueues<Integer>();
			Stack s = new Stack();
			
			for(int i = 0; i < 5; i++) {
				s.push(i);
			}
			System.out.println(s.peek()); //Should print 4
			while(s.size() > 0) { //Should print 4,3,2,1,0,
				System.out.print(s.pop() + ",");
			}
			System.out.println("\n");
			
			// Test your Queue
			
			Queue<Integer> q = new Queue<Integer>();
			
			for(int i = 0; i < 5; i++) {
				q.enqueue(i);
			}
			
			System.out.println(q.peek()); //Should print 0
			
			while(q.size() > 0) { //Should print 0,1,2,3,4
				System.out.print(q.dequeue() + ",");
			}
			System.out.println();
	    }
	}

}
