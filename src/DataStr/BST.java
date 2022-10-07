package DataStr;

public class BST {
	Node root;
	
	public static int i = 0;
	
	public class Node{
		int value;
		int number;
		Node left;
		Node right;
		
		public Node(int val, int number, Node left, Node right) {
			this.value = val;
			this.number = number;
			this.left = left;
			this.right = right;
		}
	}
	
	
	
	public void AddNode(int val) {
		Node node = new Node(val,0, null, null);
		if (root == null) {
			root = node;
			i++;
		} else {
			Node focus = root;
			Node parent;
			
			while (focus != null) {
				parent = focus;
				if (node.value < parent.value) {
					focus = focus.left;
					if (focus == null) {
						parent.left = node;
						parent.left.number = i++;
						return;
					}
				} else {
					focus = focus.right;
					if (focus == null) {
						parent.right = node;
						parent.right.number = i++;
						return;
					}
				}
			}
		}
	}
	
	public void PreOrder(Node focus) {
		if (focus == null) {
			return;
		} else {
			System.out.println(focus.value + " " + focus.number);
			PreOrder(focus.left);
			PreOrder(focus.right);
		}
	}
	
	public void InOrder(Node focus) {
		if (focus == null) {
			return;
		} else {
			InOrder(focus.left);	
			System.out.println(focus.value + " " + focus.number);
			InOrder(focus.right);
		}
	}
	
	public void PostOrder(Node focus) {
		if (focus == null) {
			return;
		} else {
			PostOrder(focus.left);			
			PostOrder(focus.right);
			System.out.println(focus.value + " " + focus.number);
		}
	}
	
	public void FindNode(int data) {
		Node node = new Node(data, 0, null, null);
		Node focus = root;
		Node parent;
		while (focus != null) {
			parent = focus;
			if (node.value <= parent.value) {
				if (node.value < parent.value) {
					focus = focus.left;
				} else {
					System.out.println(parent.number);
					return;
				}
			}
			if (node.value >= parent.value) {
				if (node.value > parent.value) {
					focus = focus.right;
				} else {
					System.out.println(parent.number);
					return;
				}
			}
		}
		System.out.println("Not exist");
	}
}
