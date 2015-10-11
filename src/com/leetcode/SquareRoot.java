package com.leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println(mySqrt5(2147395599));
		long end=System.currentTimeMillis();
		long diff = (end-start)/1000;
		System.out.println(diff+" seconds");
		
		
		

	}
	
	public static int mySqrt(int x) {
		
		if(x==0) return x;
		if(x==1) return x;
       
        	for(int i=2;i<=x/2;i++)
        	{
        		if(i*i==x) return i;
        		else if(i*i>x) return 1;
        	}
          return 1;
	}
	
	
	public static int mySqrt1(int x) {
		
		if(x==0) return x;
		if(x==1) return x;
       
        	for(int i=2;i<=x/2;i++)
        	{
        		if(i*i==x) return i;
        		
        	}
          return 1;
	}
	public static int mySqrt2(int x) {
		
		if(x==0) return x;
		if(x==1) return x;
		int lo=2;
		int hi=x;
		while(lo<=hi){
		int mid=(lo+hi)/2;
		if(mid*mid==x) return mid;
		else if(mid*mid>x) hi=mid-1;
		else if(mid*mid<x) lo=mid+1;
		}
		return 1;
         
        	
	}
	
	public static int mySqrt3(int x) {
		
		if(x==0) return x;
		if(x==1) return x;
		int count=0;
		int sum=0;
		for(int i=1;i<=x;i=i+2)
		{
			sum+=i;
			if(sum==x)
			{
				return ++count;
			}
			count=count+1;
		
		}
	  return 1;
		
         
        	
	}
	
	public static int mySqrt4(int x)
	{
        if(x <= 0) return 0;
        int l = 1, r = x, res = 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(mid > x/mid) {
                r = mid;
            } else {
                res = mid;
                l = mid + 1;
            }
        }
        return res;
	    	
	
	}
	/*
	 * Recursive call got Stack Overflow Exception
	 * with input = 2147395599
	 */
	public static int mySqrt5(int x)
	{
		if(x<=0) return 0;
		return calSqrt(x,1,x);
	}
	public static int calSqrt(int x,int lo,int hi)
	{   
		if(lo>hi) return 1;
		int mid=(lo+hi)/2;
		if(mid==x/mid) return mid;
		if(mid>x/mid) hi=mid;
		if(mid<x/mid) lo=mid+1;
		return calSqrt(x, lo, hi);
		
	}

}
