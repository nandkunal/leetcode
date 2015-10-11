package com.leetcode;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	
	private Integer peekElement;
	private Integer currentElement;
	private Iterator<Integer> iterator;

	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator = iterator;
	    peekElement=iterator.next();
	    currentElement=peekElement;
	   
	    
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		
		return peekElement;
        
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(iterator.hasNext()){
		peekElement=iterator.next();
		}else{
			peekElement=null;
		}
		return currentElement;
		
	    
	}

	@Override
	public boolean hasNext() {
	    currentElement=peekElement;
		return (currentElement==null)?false:true;
	    
	}
}
