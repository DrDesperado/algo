package Algo;
import java.util.Random;
import java.util.Scanner;

public class Massive {
	
	public int length;
	public int[] nums;
	
	public Massive(int n) {
		this.length = n;
		Random rd = new Random();
		this.nums = new int[n];
		for (int i = 0; i < this.length; i++) {
			this.nums[i] = rd.nextInt(10000);
		}	
	}
	
	public void minimal() {
		int min = this.nums[0];
		int ind = 0;
		for (int i=1; i < this.length; i++) {
			if (this.nums[i] <= min) {
				min = this.nums[i];
				ind = i;
			}
		}
		System.out.println(min);
		System.out.println(ind);
	}
	
	public void elements() {
		for (int i = 0; i < this.length; i++) {
			System.out.print(this.nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			Massive m = new Massive(num);
			m.elements();
			m.minimal();
		}
	}
