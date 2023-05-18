package Lab12;

import java.util.Scanner;

public class BSTWithNumberOfLeaves extends BST{
	/** Returns the number of leaf nodes */
	public int getNumberOfLeaves() {
		return getNumberOfLeaves(root);
	}

	/** Returns the number of leaf nodes */
	public int getNumberOfLeaves(TreeNode root) {
		if (root == null) return 0;
		
		// If node has no children return 1 
		// else return the sum of all the leaves
		return root.left == null && root.right == null ? 1 : 
			getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right);
	}
	
}
