package com.leetcode;

public class PowerOfTwo {

	 public boolean isPowerOfTwo(int n) {
		
		 if(n<=0) return false;
		 int lo = 0;
		 int hi=n;
		 while(lo<hi)
		 {
		 int mid = (lo+hi)/2;
		 if(2==(n/Math.pow(2, mid-1))) return true;
		 if(2<(n/Math.pow(2, mid-1))) lo=mid+1;
		 if(2>(n/Math.pow(2, mid-1))) hi=mid;
		 }
		 return false;
	
	    }
	 
	 public static void main(String[] args) {
		System.out.println(new PowerOfTwo().isPowerOfTwo(2147483646));
	}
	
}
