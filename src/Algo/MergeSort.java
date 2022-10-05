package Algo;

import Algo.Massive;
import java.util.Scanner;

public class MergeSort extends Algo.Massive{
	public MergeSort(int num) {
		super(num);
	}
	
	public static void mergeList(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int index = -1;
		
		while (i < a.length && j < b.length) {
			if ( a[i] <= b[j] ) {
				index++;
				c[index] = a[i];
				i++;
			} else {
				index++;
				c[index] = b[j];
				j++;
			}
		}
		for (int ind = 0; ind <  c.length; ind++) {
			System.out.println(c[ind]);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {6, 24, 67, 25, 678};
		int[] b = {54, 1, 10};
		mergeList(a, b);
		
	}
}
