package DataStr;

import DataStr.Queue;

public class Main {
	public static void main(String[] args) {
		Queue list = new Queue();
		list.push(17);
		list.push(34);
		list.push(28);
		list.show();
		list.pop();
		list.show();
		list.pop();
		list.show();
		list.pop();
		list.show();
		
	}
}
