package DataStr;

import DataStr.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(17);
		list.insert(34);
		list.insert(34);
		list.show();
		list.delete(35);
		list.show();
		
	}
}
