package Algo;

import Algo.Massive;
import java.util.Scanner;

public class QuickSort extends Algo.Massive{
	public QuickSort(int num) {
		super(num);
	}
	
	public static void sort(QuickSort arr, int low,int high) {
		if (low > high) {
			return;
		}
		int left = low;
		int right = high;
		int middle = (left + right)/2;
		int base = arr.nums[middle];
		
		while (low <= high) {
			if (arr.nums[low] <= base) {
				low++;
			} else if (arr.nums[high] >= base) {
				high--;
			} else {
				int temp = arr.nums[low];
				arr.nums[low] = arr.nums[high];
				arr.nums[high] = temp;
			low++;
			high--;

			if (high < middle) {
				int temp_1 = arr.nums[low];
				arr.nums[low] = arr.nums[middle];
				arr.nums[middle] = temp;
				middle = high;
			} else if (low > middle) {
				int temp_2 = arr.nums[low];
				arr.nums[low] = arr.nums[middle];
				arr.nums[middle] = temp;
				middle = low;
			}
			}
		}
		sort(arr, left, middle);
		sort(arr, middle + 1, right);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		QuickSort m = new QuickSort(n);
		m.elements();
		sort(m, 0, m.length-1);
		m.elements();
		
	}
}

