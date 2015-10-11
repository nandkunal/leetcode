package com.leetcode;

public class SameTree {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(0);
		TreeNode q = new TreeNode(0);
		System.out.println(new SameTree().isSameTree(p, q));

	}





 

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        return true;
        else if(p!=null && q!=null)
        return(p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        else return false;
        
    
}
    }
    