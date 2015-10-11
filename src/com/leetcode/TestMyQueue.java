package com.leetcode;

public class TestMyQueue {
	
	public static void main(String[] args) {
		MyQueue queue =  new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.pop();
		queue.push(3);
		queue.push(4);
		queue.pop();
		System.out.println(queue.peek());
		
		
	
	}

}
