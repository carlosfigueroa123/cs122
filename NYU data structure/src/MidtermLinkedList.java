
public class MidtermLinkedList {
	

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
	 
	 public MidtermLinkedList( ) {
	 header = new Node(0, null, null); 
	 tail = new Node(0, header, null); 
	 header.next = tail;
	 }
	 
	 public void add(int e) {
	 addBetween(e, tail.getPrev( ), tail); 
	 }

	 private void addBetween(int e, Node predecessor, Node successor) {
	 Node newest = new Node(e, predecessor, successor);
	 predecessor.setNext(newest);
	 successor.setPrev(newest);
	 size++;
	 }
	 
	 public Node get(int s) {
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
	 
	public void remove(int oldItem) {
		try{
		 Node v = get(oldItem);
		 removeDef(v);
		  }
		catch(Exception e) {
			System.out.println("The element you are trying to delete does not exists. Try again");
			System.out.println(" ");
		}
	}
		

	 private void removeDef(Node node) {
	 Node predecessor = node.getPrev( );
	 Node successor = node.getNext( );
	 predecessor.setNext(successor);
	 successor.setPrev(predecessor);
	 size--;
	 }
	 
	 public void print() {
		  Node current = header.next;
		  while (current != null)
	     {
			  if(current.element == 0) {
				  break;
			  }
	        System.out.print("[" + current.element + "]");
	        current = current.next;
	     }
	     System.out.println(" ");
	     
	     
	     System.out.println("Number of items: " + numItem());

	     
	 }
	 public void print1() {
		  Node current = header.next;
		  System.out.println(" ");
		  System.out.println("This is print1");
		  while (current != null)
	     {
			  if(current.element == 0) {
				  break;
			  }
	        System.out.print("[" + current.element + "]");
	        current = current.next;
	     }
	     System.out.println(" ");
	     
	     
	     System.out.println("Number of items: " + numItem());
	     System.out.println(" ");
	     System.out.println("This is the index: ");
		 System.out.println(indexPartialSum(header.next, 5));//header.next on trash

	     
	 }
	 
//		int a = current.element + current.prev.element + current.next.element;//next cementery
//		index++;
//		if(a > target || a == target) {
//			
//			return index; //return index of this a!
//		}
//		
//		else {
//			index++;
//			return indexPartialSum(current.next, target);
//		}
	 
	 public int numItem() {
		  return this.size;
	 }
	 
	 public static int indexPartialSum(Node current, int target) {
		 if(current.next == null) {
				return 0;
			}

			else {
				if(current.element >= target) {
					return 1;
				}
				else {
					return 1 + indexPartialSum(current.next, target - current.element);
				}
				}
		}

	 public static void main(String[] args) {
		  
		 	MidtermLinkedList list = new MidtermLinkedList();
			list.print();
			list.add(1);
			list.print();
			list.add(0);
			list.print();
			list.add(4);
			list.print();
			list.add(1);
			list.print1();
		}

}
