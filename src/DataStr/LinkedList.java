package DataStr;

public class LinkedList {
	Node head;

	public class Node {
		int value;
		Node next;
		
		public Node(int val, Node next) {
			this.value = val;
			this.next = next;
		}
	}
	
	public void insert(int data) {
		Node node = new Node(data, null);
		
		if (head == null) {
			head = node;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
		last.next = node;
		}
		
	}
	
	public void show() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public void delete(int data) {
		while (head != null && head.value == data) {
			head = head.next;
		}
		
		if (head == null) {
			return;
		}
		
		Node node = head;
		
		while (node.next != null) {
			if (node.next.value == data) {
				node.next = node.next.next;
			} else {
			node = node.next;
			}
		}
		if (node != null && node.value == data) {
			node = node.next;
		}
	}
}
