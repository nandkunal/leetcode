package com.leetcode;

public class AddDigits {

	public static void main(String[] args) {
		
     int s =new AddDigits().addDigits(38);
     System.out.println(s);
	}

/**
* @arg : num
* @return : integer
**/	
	 public int addDigits(int num) {
		 if(num<10)
		 {
			 return num;
		 }else{
			 int sum= addDigits(num/10)+num%10;
			 if(sum<10) return sum;
			 else
				return addDigits(sum/10)+sum%10; 
		 }
	    
}
	 
}
