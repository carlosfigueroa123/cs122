package com.cs122.classlabs.chap13;


public class QueueList {
	private Node list;
	
	public QueueList() {
		list = null;
	}
//	
//	public void enqueue(String x)//this method adds them at the beginning, but couldnt solve to dequeue at the end
//    {
//	    Node oldtop = list;
//	    list = new Node(x);
//	    list.data = x;
//	    list.link = oldtop;
//    }
	public void enqueue(String x)
    {
        Node newNode = new Node(x);
        Node current;//pointer for the beginning to search for the end of the list

        if (list == null)
            list = newNode;
        else
        {
            current = list;
            while (current.link != null)
                current = current.link;//going forward
            current.link = newNode;//assigning, this is where we add node, the new magazine introduced
        }
    }
	
	public String dequeue() {//this will dequeue the first one, not the last one. Do I have to iterate through it?
		String data = list.data;
	    list = list.link;
	    return data;
	}
	
	public void print() {
		
		 Node current = list;
		 

	        while (current != null)
	        {
	           System.out.print(current.data + "<-----");//we use data since it comes from intnode class (object)
	           current = current.link;// as in the last while loop, for it to keep running
	        }
	        System.out.println(" ");
	        
	      
	}
	
	public boolean isEmpty(){ 
	    if (list == null) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	  }
	
	private class Node {
		public String data;//this is to store the data of the node
		public Node link;
		
		public Node(String x1)
	    {
	        data = x1;
	        link = null;
	    }
		
	}
}
