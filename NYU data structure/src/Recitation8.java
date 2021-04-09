import java.util.ArrayList;

class TreeNode {
   TreeNode left;
   TreeNode right;
   int value;

   public TreeNode(int v) {
       this.value = v;
   }
}
public class Recitation8 {
	
   public static void inorder(TreeNode root) {
       if(root == null) {
           return;
       }
       inorder(root.left);
       System.out.println(root.value);
       inorder(root.right);
   }

   public static void treeToList(TreeNode root, ArrayList<Integer> list) {
	   
	   if(root == null) {
           return;
       }
	   treeToList(root.left, list);
       list.add(root.value);
       treeToList(root.right, list);

   }
   
   public static boolean isValidBST(TreeNode root, TreeNode l ,TreeNode r) {
	  
	   if (root == null)
	        return true;
	 
	    if (l != null && root.value <= l.value)
	        return false;
	 
	    if (r != null && root.value >= r.value)
	        return false;
	 
	    return (isValidBST(root.left, l, root) && isValidBST(root.right, root, r));
   }

//   if (root.left == null && root.right == null) {
// return true;
//}
//
//if (root.value < root.left.value || root.value > root.right.value) {
// return false;
//}
//
//return (isValidBST(root.left) && isValidBST(root.right));

   public static TreeNode listToTree(ArrayList<Integer> list, int low, int high) {
	   
	   if (low > high) {
           return null;
       }

       int mid = (low + high) / 2;
       TreeNode root = new TreeNode(list.get(mid));
 
       root.left = listToTree(list, low, mid - 1);

       root.right = listToTree(list, mid + 1, high);
         
       return root;
	   
   }

   public static void main(String[] args) {

       // Set up tree
       TreeNode root = new TreeNode(25);
       root.left = new TreeNode(20);
       root.left.left = new TreeNode(10);
       root.left.left.left = new TreeNode(5);
       root.left.left.left.left = new TreeNode(1);
       root.left.left.left.right = new TreeNode(8);
       root.left.left.right = new TreeNode(12);
       root.left.left.right.right = new TreeNode(15);
       root.left.right = new TreeNode(22);

       root.right = new TreeNode(36);
       root.right.left = new TreeNode(30);
       root.right.left.left = new TreeNode(28);
       root.right.right = new TreeNode(40);
       root.right.right.left = new TreeNode(38);
       root.right.right.right = new TreeNode(48);
       root.right.right.right.left = new TreeNode(45);
       root.right.right.right.right = new TreeNode(50);

       // Print the tree inorder
       System.out.println("Inorder traversal of tree:");
       inorder(root);

       // Convert the tree to an ArrayList
       ArrayList<Integer> list = new ArrayList<>();
       treeToList(root, list);

       // Print the list to make sure it looks good
       System.out.println("\nThe Tree converted to List:");
       for(int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i) + ", ");
       }

       // Convert the list back to a tree
       TreeNode newRoot = listToTree(list, 0, list.size() - 1);

       // Print out new tree inorder to make sure it matches the first inorder
       System.out.println("\nInorder traversal of tree:");
       inorder(newRoot);
       
       System.out.println();
       
       System.out.println(isValidBST(root, null, null));
   }
}

