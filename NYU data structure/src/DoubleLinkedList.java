public class DoubleLinkedList {

 private static class Node {
 private String element; 
 private Node prev; 
 private Node next; 
 
 public Node(String e, Node p, Node n) {
 element = e;
 prev = p;
 next = n;
 }
 
 public String getElement( ) { 
	 return element; 
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
 
 public DoubleLinkedList( ) {
 header = new Node(null, null, null); 
 tail = new Node(null, header, null); 
 header.setNext(tail);
 }
 
 public void add(String e) {
 addBetween(e, tail.getPrev( ), tail); 
 }

 private void addBetween(String e, Node predecessor, Node successor) {
 Node newest = new Node(e, predecessor, successor);
 predecessor.setNext(newest);
 successor.setPrev(newest);
 size++;
 }
 
 public Node get(String s) {
	 Node current = header;
	 Node previous = current;
	 while(current != null && current.element !=s) {
	 previous = current;
	 current = current.next;
	 }
	 if (current.element == s) {
	 return current;
	 }
	 else {
	 return null;
	 }
	 }
 
public void remove(String oldItem) {
	 Node v = get(oldItem);
	 removeDef(v);
	   }

 private String removeDef(Node node) {
 Node predecessor = node.getPrev( );
 Node successor = node.getNext( );
 predecessor.setNext(successor);
 successor.setPrev(predecessor);
 size--;
 return node.getElement( );
 }
 
 public void print() {
	  Node current = header.next;
	  while (current != null)
     {
        System.out.print(current.element + "---->");
        current = current.next;
     }
     System.out.println(" ");
     System.out.println("Number of items: " + numItem());
     
 }

 public int numItem() {
	  return this.size;
 }
 
 
 public static void main(String[] args) {
	  
		DoubleLinkedList list = new DoubleLinkedList();
		list.print();
		list.add("pepper");
		list.print();
		list.add("onions");
		list.print();
		list.add("macaroni");
		list.print();
		list.add("water");
		list.print();
		list.remove("pepper");
		list.print();
	}

}