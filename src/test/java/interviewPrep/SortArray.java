package interviewPrep;

import java.util.ArrayList;

//Sort an Array in ascending and descending order
public class SortArray {
	public static void main(String[] args) {
		int a[] = { 11, 2, 6, 1, 4, 9 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		int num = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					num = a[j];
					a[j] = a[i];
					a[i] = num;
				}
			}
		}
		for (int a1 : a) {
			System.out.println(a1);
		}
	}
}
