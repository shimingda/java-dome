package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;

public class Dome0003
{

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack=new Stack<Integer>();
		while (null!=listNode){
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		while(!stack.isEmpty())
		{
			arrayList.add(stack.pop());
		}
		return arrayList;
	}
}
 class ListNode {
      int val;
       ListNode next = null;
       ListNode(int val) {
           this.val = val;
      }
}
