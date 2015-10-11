package com.leetcode;

import java.util.Stack;

class MyQueue {
	
	private Stack<Integer> pushStack;
	private Stack<Integer>popStack;
	private int size;
	private int front;
	
	public MyQueue()
	{
		pushStack = new Stack<Integer>();
		popStack =  new Stack<Integer>();
		size=0;
	}
    // Push element x to the back of queue.
    public void push(int x) {
    	if(size==0){
    		front=x;
    	}
        pushStack.push(x);
      size=size+1;
    }

    // Removes the element from in front of queue.
    public void pop() {
    	int temp=0;
    	if(popStack.isEmpty()){
    		while(!pushStack.isEmpty()){
    			int elem = pushStack.pop();
    			if(elem!=front)
    			{
    				popStack.push(elem);
    				temp=elem;
    			}
    		}
    		front=temp;
    	}else{
    		
    		popStack.pop();
    		if(popStack.isEmpty())
    		 {
    			if(!pushStack.empty()){
    				front=pushStack.elementAt(0);
    			}else{
    	        front=0;
    			}
    		 }else{
    			front= popStack.peek();
    		 }
    		
    	}
    	size=size-1;
    }

    // Get the front element.
    public int peek() {
        return front;
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return (size==0)?true:false;
        
    }
}