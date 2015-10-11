package com.leetcode;

public class MovingZeros {
	
	 public void moveZeroes(int[] nums) {
		 
	  int count=0;
	  for(int i=0;i<nums.length;i++)
	  {
		  if(nums[i]!=0){
			  nums[count]=nums[i];
			  ++count;
		  }
	  }
	  while(count<nums.length)
	  {
		  nums[count]=0;
		  ++count;
	  }
		 
	
		 for(int j :nums)
		 {
			System.out.println(j); 
		 }
	        
	    }
	
	public static void main(String[] args) {
		int[] nums = new int[]{0, 1, 0, 3, 12};
		new MovingZeros().moveZeroes(nums);
		
		
	}

}
