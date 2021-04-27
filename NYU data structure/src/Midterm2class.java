
	class Node 
	{
	    int data;
	    Node left, right;
	   
	    public Node(int item) 
	    {
	        data = item;
	        left = right = null;
	    }
	}
	   
	public class Midterm2class 
	{
	    //Root of the Binary Tree
	    Node root;
	       
	    /* Function to get the count of leaf nodes in a binary tree*/
	    int getLeafCount() 
	    {
	        return getLeafCount(root);
	    }
	   
//	    int getLeafCount(Node node) 
//	    {
//	        if (node == null)
//	            return 0;
//	        if (node.left == null && node.right == null)
//	            return 1;
//	        else
//	            return getLeafCount(node.left) + getLeafCount(node.right);
//	    }
	    int getLeafCount(Node node) 
	    {
	        if (node == null)
	            return 0;
	        else {
	        if (node.left == null && node.right == null)
	            return 1;
	        else
	            return getLeafCount(node.left) + getLeafCount(node.right);
	        }
	    }
	    
	    public static int maxPathSum(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        // root node must be included
	        int lMax = maxHalfPath(root.left);
	        int rMax = maxHalfPath(root.right);
	        int p1 = root.data + lMax + rMax;
	        int p2 = root.data + Math.max(lMax, rMax);
	        int p3 = root.data;
	        int maxVal = Math.max(p1, Math.max(p2, p3));

	        if (root.left != null) {
	            maxVal = Math.max(maxVal, maxPathSum(root.left));
	        }if (root.right != null) {
	            maxVal = Math.max(maxVal, maxPathSum(root.right));
	        }return maxVal;
	    }

	    public static int maxHalfPath(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int lMax = maxHalfPath(root.left);
	        int rMax = maxHalfPath(root.right);
	        int p1 = root.data + lMax;
	        int p2 = root.data + rMax;
	        int p3 = root.data;
	        return Math.max(p1, Math.max(p2, p3));
	    }
	    
	    public static int nodesSmallerThanX(Node node, int k) {
	        if (node == null) {
	            return 0;
	        }
	        else {
	       
	        int countLeft = nodesSmallerThanX(node.left, k);
	        int countRight = nodesSmallerThanX(node.right, k);
	        int a;
	        
	        if(node.data <= k) {
	        	a = 1;
	        }
	        else {
	        	a = 0;
	        }
	        
	        //(node.data <= k ? 1 : 0)
	      
	        return a + countLeft + countRight;
	        }
	    }
	    
//	    else {
//	    	if(n.data <= k){
//	    		return n.left.subtreeSize + 1;
//	}
//	    else {
//	    	return lessThanK(v.right, k);
//	    }
//	    }
	    
////	    public void inOrderTraverse(Node root,UserNode n){
////	        if(root != null&&root.compareTo(n)<0){
////	            inOrderTraverse(root.getLeft());
////	            System.out.print("  "+root.getData());
////	            inOrderTraverse(root.getRight());
////	        }
////
////	    }
//	    
	    public static void inOrderTraverse(Node root, int k){
	    	if (root == null || root.data > k) {
	    		return;
	    	}
	    	else {
	            inOrderTraverse(root.left, k);
	            System.out.print("  " + root.data);
	            inOrderTraverse(root.right, k);
	        }

	    }
	    
//	    private void beforeNum(int num, Node n){
//	        if (n != null){
//	            beforeNum(num, n.left);
//	            int nodeValue = n.data;
//	            if (num<nodeValue){
//	                usersInOrder.add(n.data);
//	                beforeNum(num, n.right);
//	            }
//	        }
//	    }

	    
	   
	    /* Driver program to test above functions */
	    public static void main(String args[]) 
	    {
	        /* create a tree */
	    	Midterm2class tree = new Midterm2class();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
//	        tree.root.right.right = new Node(6);
//	        tree.root.right.left = new Node(5);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	           
	        /* get leaf count of the abve tree */
	        System.out.println("The leaf count of binary tree is : " 
	                             + tree.getLeafCount());
	        
	        System.out.println(maxPathSum(tree.root));
	        System.out.println(nodesSmallerThanX(tree.root, 3));
	        inOrderTraverse(tree.root, 3);
	    }
	}
	  

