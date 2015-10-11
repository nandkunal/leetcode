package com.leetcode;

public class LCA {
	
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		  
		  if(root==null){
			  return null;
		  }
		 if(root.val==p.val||root.val==q.val){
			 return root;
		 }
		 if((root.val<p.val&&root.val>q.val)||(root.val>p.val&&root.val<q.val))
		 {
			 return root;
		 }
		  if(root.val<p.val&& root.val<q.val)
		  {
			  return lowestCommonAncestor(root.right, p, q);
		  }else if(root.val>p.val&& root.val>q.val)
		  {
			  return lowestCommonAncestor(root.left, p, q);
		  }
		 return null;
	        
	    }
	  
	  public static void main(String[] args) {
		  
		TreeNode root = new TreeNode(6);
		root.left=new TreeNode(2);
		root.right=new TreeNode(8);
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(4);
		TreeNode res = new LCA().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));
		System.out.println(res.val);
		
		
	}

}



 
