
public class IntList {

	private IntNode list;
	
	public IntList()
    {
        list = null;
    }
	
	public void add(String x)
    {
        IntNode newNode = new IntNode(x);
        IntNode current;//pointer for the beginning to search for the end of the list

        if (list == null)
            list = newNode;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;//going forward
            current.next = newNode;//assigning, this is where we add node, the new magazine introduced
    }
    }
	

	public void delete(String y) {
		IntNode current = list;
		IntNode previous = current;
		while(current != null && current.data !=y) {
			previous = current;
			current = current.next;
		}
		if(current.data == y) {//THIS IS THE BRIDGE
			previous.next = current.next;
			current.next = null;
		}
	}
	
	public void print() {
		
		 IntNode current = list;
		 

	        while (current != null)
	        {
	           System.out.print(current.data + "---->");//we use data since it comes from intnode class (object)
	           current = current.next;// as in the last while loop, for it to keep running
	        }
	        System.out.println(" ");
	        
	      
	}
	
	private class IntNode {
		public String data;//this is to store the data of the node
		public IntNode next;
		
		public IntNode(String x1)
        {
            data = x1; 
            next = null;
        }
		
	}
}
