package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	private Queue<Integer> pushQueue;
	private Queue<Integer> popQueue;
	private int top;
	
	public MyStack()
	{
		pushQueue = new LinkedList<Integer>();
		popQueue = new LinkedList<Integer>();
		
	}
	
	  // Push element x onto stack.
    public void push(int x) {
    	Queue<Integer> queueToPush=(pushQueue.isEmpty())?popQueue:pushQueue;
    	queueToPush.add(x);
    	top=x;
        
    }
    
    // Removes the element on top of the stack.
    public void pop() {
    	
      Queue<Integer> queueToPop=(pushQueue.isEmpty())?popQueue:pushQueue;
      Queue<Integer> queueToPush=(pushQueue.isEmpty())?pushQueue:popQueue;
      int newtop=0;
      while(!queueToPop.isEmpty())
      {
    	  int element=queueToPop.poll();
    	  if(element!=top)
    	  {
    		  queueToPush.add(element);
    		  newtop=element;
    	  }
      }
      top=newtop;
    }
    
    // Get the top element.
    public int top() {
        return top;
    }
    
    // Return whether the stack is empty.
    public boolean empty() {
    	
    	return (pushQueue.isEmpty()&& popQueue.isEmpty());
        
    }


}
