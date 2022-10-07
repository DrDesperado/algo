package DataStr;

import DataStr.BST;

public class Main {
	public static void main(String[] args) {
		BST Tree = new BST();
		Tree.AddNode(50);
		Tree.AddNode(25);
		Tree.AddNode(15);
		Tree.AddNode(30);
		Tree.AddNode(75);
		Tree.AddNode(85);
		
		Tree.FindNode(15);
		Tree.InOrder(Tree.root);
		
		
	}
}
