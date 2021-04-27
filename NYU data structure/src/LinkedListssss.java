
public class LinkedListssss {
	
	public LinkedListssss( ) {
		 header = new Node(0, null, null); 
		 tail = new Node(0, header, null); 
		 header.setNext(tail);
		 }
	
	public static class Node {
		 public int element; 
		 public Node prev; 
		 public Node next; 
		 
		 public Node(int e, Node p, Node n) {
		 element = e;
		 prev = p;
		 next = n;
		 }
		 public Node getPrev( ) { 
			 return prev; 
			 }
		 public Node getNext( ) { 
			 return next; 
			 }
		 public void setPrev(Node p) { 
			 prev = p; 
			 }
		 public void setNext(Node n) { 
			 next = n; 
			 }
		 
}
	
	private Node header; 
	 private Node tail; 
	 private int size = 0; 
	 
	 
	public void add(int e){
		 addBetween(e, tail.getPrev( ), tail); 
		 }

		 private void addBetween(int e, Node predecessor, Node successor) {
		 Node newest = new Node(e, predecessor, successor);
		 predecessor.setNext(newest);
		 successor.setPrev(newest);
		 size++;
		 }
	
	
}
