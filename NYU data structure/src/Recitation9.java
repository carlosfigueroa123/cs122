import java.util.ArrayList;
import java.lang.*;

class TreeNode{
   TreeNode left;
   TreeNode right;
   int value;
   int height;

   public TreeNode(int v) {
       this.value = v;
       this.height = 0;
   }
}

class AVLTree {
   TreeNode root;

   public AVLTree(TreeNode r) {
       this.root = r;
   }

   
   private int calculateHeight(TreeNode node)
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
   
   public int getBalance(TreeNode n) {
       return (n == null) ? 0 : getHeight(n.right) - getHeight(n.left);
   }

   // O(1) updateHeight function used to update only after rotations
   public void updateHeight(TreeNode root) {
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
   public int getHeight(TreeNode root) {
       if(root == null) {
           return -1;
       }
       return root.height;
   }

 
   private boolean isBalanced(TreeNode root)
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
   
   TreeNode  insert(TreeNode node, int key) {
	    if (node == null) {
	        return new TreeNode (key);
	    } else if (node.value > key) {
	        node.left = insert(node.left, key);
	    } else if (node.value < key) {
	        node.right = insert(node.right, key);
	    } else {
	        throw new RuntimeException("duplicate Key!");
	    }
	    return rebalance(node);
	}
   

   // takes in a root, rotates the subtree, and returns a new root
   public TreeNode rotateRight(TreeNode root) {
	   TreeNode x = root.left;
	   TreeNode z = x.right;
	    x.right = root;
	    root.left = z;
	    updateHeight(root);
	    updateHeight(x);
		return x;
   }

   public TreeNode rotateLeft(TreeNode root) {
	   TreeNode  x = root.right;
	   TreeNode  z = x.left;
	    x.left = root;
	    root.right = z;
	    updateHeight(root);
	    updateHeight(x);
	    return x;
   }
   
   TreeNode find(int value) {
	    TreeNode current = root;
	    while (current != null) {
	        if (current.value == value) {
	            break;
	        }
	        current = current.value < value ? current.right : current.left;
	    }
	    return current;
	}
   
   TreeNode rebalance(TreeNode z) {
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
}

public class Recitation9 {
	
   public static void inorder(TreeNode root) {
       if(root == null) {
           return;
       }
       inorder(root.left);
       System.out.println("Value: " + root.value + ", Height: " + root.height);
       inorder(root.right);
   }

   public static void main(String[] args) {

       // Set up tree
       TreeNode root = new TreeNode(6);
       root.left = new TreeNode(3);
       root.left.left = new TreeNode(1);
       root.left.right = new TreeNode(5);
       root.left.right.left = new TreeNode(4);

       root.right = new TreeNode(10);
       root.right.left = new TreeNode(7);
       root.right.right = new TreeNode(15);
       root.right.right.right = new TreeNode(100);

       // Make the root a root of an AVL Tree
       AVLTree avl = new AVLTree(root);

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
       root = new TreeNode(6);
       root.left = new TreeNode(4);
       root.left.left = new TreeNode(3);
       avl = new AVLTree(root);
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
       root = new TreeNode(2);
       root.right = new TreeNode(4);
       root.right.left = new TreeNode(3);
       root.right.right = new TreeNode(6);
       avl = new AVLTree(root);
       avl.calculateHeight();

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
