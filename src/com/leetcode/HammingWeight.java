package com.leetcode;

public class HammingWeight {
	
	 public int hammingWeight(int n) {
	       if(n==0) return 0;
	       if(n%2==0)
	    	   return hammingWeight(n/2);
	       else if(n%2==1)
	    	   return 1+hammingWeight(n/2);
	       else 
	    	   return 0;
	        
	    }
	 
	 public static void main(String[] args) {
		System.out.println(new HammingWeight().hammingWeight( 147483648));
		
		//  2147483648
	}

}
