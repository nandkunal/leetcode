package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPeekingIterator {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		Iterator<Integer> it = l.iterator();
		PeekingIterator itr = new PeekingIterator(it);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		

	}

}
