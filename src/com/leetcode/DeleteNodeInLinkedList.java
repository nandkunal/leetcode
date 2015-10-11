package com.leetcode;

public class DeleteNodeInLinkedList {
	
public void deleteNode(ListNode node) {
	
	if(node==null) return;
	if(node.next==null)
	{
		node=null;
	}
	node.val=node.next.val;
	node.next=node.next.next;
        
    }

public static void main(String[] args) {
	ListNode node = new ListNode(1);
	ListNode node1= new ListNode(2);
	ListNode node2 = new ListNode(3);
	ListNode node3= new ListNode(4);
	node.next=node1;
	node1.next=node2;
	node2.next=node3;
	
}

}


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

