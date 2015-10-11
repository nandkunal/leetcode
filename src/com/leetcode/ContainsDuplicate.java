package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	
	
	  public boolean containsDuplicate(int[] nums) {
		 Set<Integer> set = new HashSet<Integer>();
		 for(int n:nums){
			 if(set.contains(n)){
				 return true;
			 }else{
				 set.add(n);
			 }
		 }
	       return false;   
	    }
	
  public static void main(String[] args) {
	System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{9,16,1,4}));
}
}
