package interviewPrep;
import java.util.ArrayList;
public class RemoveDuplicateNumberCollection {
	public static void main(String[] args) {
		// Print unique number from the list
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k == 1) {
					System.out.println("The unique number is: " + a[i]);
				}
			}
		}
	}
}
