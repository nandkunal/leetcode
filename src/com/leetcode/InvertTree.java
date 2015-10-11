package com.leetcode;

public class InvertTree {
	

	public static void main(String[] args) {
		TreeNode root =new TreeNode(7);
		TreeNode left =new TreeNode(6);
		TreeNode right =new TreeNode(9);
		root.left=left;
		root.right=right;
		TreeNode i = new InvertTree().invertTree(root);
		System.out.println(i.left.val);
		
		

		
	}
	
	  public TreeNode invertTree(TreeNode root) {
	       
		  if(root==null)
		  {
			  return root;
		  }
		  invertTree(root.left);
		  invertTree(root.right);
		  TreeNode temp=null;
		  temp=root.left;
		  root.left=root.right;
		  root.right=temp;
		  return root;
		  
	        
	    }

}
