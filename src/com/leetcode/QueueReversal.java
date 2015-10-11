package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReversal {
	
	public void reverse(Queue<Integer> q)
	{
		if(q.isEmpty()) return;
		int temp=q.poll();
		reverse(q);
		q.add(temp);
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("Before Reversal "+queue);
		new QueueReversal().reverse(queue);
		System.out.println("After Reversal "+queue);
	}

}
