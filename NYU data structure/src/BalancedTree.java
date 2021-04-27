
public class BalancedTree {
	
	private class Node { // We create Node class 
	    int key;
	    int height;
	    Node left, right;
	 
	    public Node(int item) // We create the node constructor to get the key of each entry from the array
	    {
	        this.key = item;
	        this.height = 0;
	        left = right = null;
	    }
	}
	
	public static Node root;
	 
    BalancedTree() { //we create the default constructor of BalancedTree class
    	root = null; 
    	}
    
    public BalancedTree(int[] arr) { //We create the constructor that takes the sorted array, generates a balanced tree with it, and updates the root
 
    	int n = arr.length; //we need this argument to create the binary tree
    	    	
    	root = sortedArrayToBST(arr, 0, n - 1);
  
    	//preOrder(root); //if we delete the comment, it will print the ascending order
    	         
    }
    

   public Node sortedArrayToBST(int arr[], int start, int end) { //Now that we have the array, we just create a binary tree
	   
	   //While assuming that the array is sorted, this method will end up creating a balanced tree as well
	   
       if (start > end) {
           return null;
       }
 
       int mid = (start + end) / 2;
       Node node = new Node(arr[mid]);
 
       node.left = sortedArrayToBST(arr, start, mid - 1);
 
       node.right = sortedArrayToBST(arr, mid + 1, end);
         
       return node;
   }
   
   public int[] inorderTraverse() { //Now we create the function which will return an array of the keys in ascending order
	   
	   if(root == null) {
		   return null;
	   }
	   else {
		   
		   return inorder(root);
	   }
   }
   
    private int[] array = new int[Height()]; //or you can put an arbitrary number to debug
    private int index = 0; 
   
   public int[] inorder(Node node) { 
   	if (node == null) 
   		return null;
   	else {
   		array[index++] = node.key; 
   	inorder(node.left); 
   	inorder(node.right); 
   	return array;
   	
   	}
   } 
   
   void preOrder(Node node) {//this recursive method print the ascending order as strings, since its return type is system.out.println
       if (node == null) {
           return;
       }
       System.out.print(node.key + " ");
       preOrder(node.left);
       preOrder(node.right);
   }
   
   
   public int Height(Node node)//this method calculates the height of the tree
   {
       if (node.left == null && node.right == null || node == null) {
           return 0;
       }
       else {
       return 1 + Math.max(Height(node.left), Height(node.right));
       }
   }

   public int Height() {
       return Height(this.root);
   }
   
   public void updateHeight(Node root) {
       if(root == null) {
           return;
       }
       int leftHeight = -1;
       if(root.left != null) {
           leftHeight = root.left.height;
       }
       int rightHeight = -1;
       if(root.right != null) {
           rightHeight = root.right.height;
       }
       root.height = Math.max(leftHeight, rightHeight) + 1;
   }


	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		BalancedTree tree = new BalancedTree(arr);
		
		 int b[] = tree.inorderTraverse().clone();
		
		for(int i=0; i< b.length; i++){
		    System.out.print(b[i]);
		}
		
        
		
	}

}

