package com.leetcode;

import java.util.Stack;

public class StackReversal {
	
 public void reverse(Stack<Integer> s)
 {
	 if(s.isEmpty())
	 {
		 return;
	 }else{
		 int temp = s.pop();
		 reverse(s);
		 insertAtBotton(s,temp);
		 
	 }
 }

private void insertAtBotton(Stack<Integer> s, int data) {
	if(s.isEmpty())
	{
		s.push(data);
		return;
	}else
	{
		int temp=s.pop();
		insertAtBotton(s, data);
		s.push(temp);
	}
	
}

public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	System.out.println("Before Reversal "+st);
	new StackReversal().reverse(st);
	System.out.println("After Reversal "+st);
	
}

}
