import BalancedTree.Node;

public class BalancedTree1 {

	
	Node root;
	
	public BalancedTree1(Node r) {
	       this.root = r;
	   }
    
    public BalancedTree1(int[] input) {
    	
    	
    	
    }
    
    public Node sortedArrayToBST(int arr[], int start, int end) {
 	   
        /* Base Case */
        if (start > end) {
            return null;
        }
  
        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
  
        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);
  
        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);
          
        return node;
    }
    

    private int calculateHeight(Node node)
    {
        if (node.left == null && node.right == null || node == null) {
            return 0;
        }
        else {
        return 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
        }
    }

    public int calculateHeight() {
        return calculateHeight(this.root);
    }
    
    public int getBalance(Node n) {
        return (n == null) ? 0 : getHeight(n.right) - getHeight(n.left);
    }

    // O(1) updateHeight function used to update only after rotations
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

    // Helper funciton to get the height of any TreeNode if exists, otherwise return -1
    public int getHeight(Node root) {
        if(root == null) {
            return -1;
        }
        return root.height;
    }

  
    private boolean isBalanced(Node root)
    {
        int lh, rh; 
  
     
        if (root == null) {
            return true; //base case for an empty tree
        }
  
        
        lh = calculateHeight(root.left);
        rh = calculateHeight(root.right);
  
        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        
        else {
        return false;
        }
    }

    public boolean isBalanced() {
        return isBalanced(this.root);
    }
    
    Node  insert(Node node, int key) {
 	    if (node == null) {
 	        return new Node (key);
 	    } else if (node.key > key) {
 	        node.left = insert(node.left, key);
 	    } else if (node.key < key) {
 	        node.right = insert(node.right, key);
 	    } else {
 	        throw new RuntimeException("duplicate Key!");
 	    }
 	    return rebalance(node);
 	}
    

    // takes in a root, rotates the subtree, and returns a new root
    public Node rotateRight(Node root) {
 	   Node x = root.left;
 	   Node z = x.right;
 	    x.right = root;
 	    root.left = z;
 	    updateHeight(root);
 	    updateHeight(x);
 		return x;
    }

    public Node rotateLeft(Node root) {
 	   Node  x = root.right;
 	   Node  z = x.left;
 	    x.left = root;
 	    root.right = z;
 	    updateHeight(root);
 	    updateHeight(x);
 	    return x;
    }
    
    Node find(int value) {
 	    Node current = root;
 	    while (current != null) {
 	        if (current.key == value) {
 	            break;
 	        }
 	        current = current.key < value ? current.right : current.left;
 	    }
 	    return current;
 	}
    
    Node rebalance(Node z) {
 	    updateHeight(z);
 	    int balance = getBalance(z);
 	    if (balance > 1) {
 	        if (getHeight(z.right.right) > getHeight(z.right.left)) {
 	            z = rotateLeft(z);
 	        } else {
 	            z.right = rotateRight(z.right);
 	            z = rotateLeft(z);
 	        }
 	    } else if (balance < -1) {
 	        if (getHeight(z.left.left) > getHeight(z.left.right))
 	            z = rotateRight(z);
 	        else {
 	            z.left = rotateLeft(z.left);
 	            z = rotateRight(z);
 	        }
 	    }
 	    return z;
 	}
    
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.println("Value: " + root.key + ", Height: " + root.height);
        inorder(root.right);
    }
    
    public class Node {
	    int key;
	    Node left, right, parent;
	    int height;
	 
	    public Node(int item)
	    {
	        this.key = item;
	        this.height = 0;
	        left = right = parent = null;
	    }
	}
    
    
    
	public static void main(String[] args) {
		
		Node root = new Node(6);
	       root.left = new Node(3);
	       root.left.left = new Node(1);
	       root.left.right = new Node(5);
	       root.left.right.left = new Node(4);

	       root.right = new Node(10);
	       root.right.left = new Node(7);
	       root.right.right = new Node(15);
	       root.right.right.right = new Node(100);

	       // Make the root a root of an AVL Tree
	       BalancedTree1 avl = new BalancedTree1(root);

	       // Print the tree inorder
	       System.out.println("Inorder traversal of tree:");
	       inorder(avl.root);

	       // Update the height of our AVL Tree
	       avl.calculateHeight();

	       // Print the tree inorder again and see if the heights are correct
	       System.out.println("\nInorder traversal of tree:");
	       inorder(avl.root);

	       // Ensure your function says this tree is balanced
	       System.out.println("Balanced? - " + avl.isBalanced());

	       // Remove node '1' to make node 4 unbalanced. Make sure the avl tree says the entire tree is unbalanced
	       root.left.left = null;
	       System.out.println("Balanced after removing 1? - " + avl.isBalanced());

	       // Make a new dummy tree to test rotate functions
	       root = new Node(6);
	       root.left = new Node(4);
	       root.left.left = new Node(3);
	       avl = new BalancedTree1(root);
	       avl.calculateHeight();

	       // Print out unbalanced tree
	       System.out.println("\nInorder traversal of tree:");
	       inorder(avl.root);
	       System.out.println("Balanced? - " + avl.isBalanced());

	       // Rotate the tree and reprint
	       avl.root = avl.rotateRight(avl.root);
	       System.out.println("\nInorder traversal of tree:");
	       inorder(avl.root);
	       System.out.println("Balanced? - " + avl.isBalanced());

	       // Make a new dummy tree to left rotate
	     
	       // Print out unbalanced tree
	       System.out.println("\nInorder traversal of tree:");
	       inorder(avl.root);
	       System.out.println("Balanced? - " + avl.isBalanced());

	       // Rotate the tree and reprint
	       avl.root = avl.rotateLeft(avl.root);
	       System.out.println("\nInorder traversal of tree:");
	       inorder(avl.root);
	       System.out.println("Balanced? - " + avl.isBalanced());

	}

}
