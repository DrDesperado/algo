package DataStr;

import DataStr.LinkedList.Node;

public class Queue {
	Node head;
	Node last;

	public class Node {
		int value;
		Node next;
		Node previous;
		
		public Node(int val, Node next, Node previous) {
			this.value = val;
			this.next = next;
			this.previous = previous;
		}
	}
		
	public void push(int data) {
		Node node = new Node(data, null, null);
			if (head == null) {
				head = node;
				last = node;
			} else {
				if (head.next == null) {
					last = node;
					head.next = last;
					last.previous = head;
				} else {
					last.next = node;
					node.previous = last;
					last = node;
				}
			}	
	}
		
	public void pop() {
		if (head == null) {
			return;
		}
		head = head.next;
	}
		
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}

