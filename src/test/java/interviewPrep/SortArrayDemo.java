package interviewPrep;
public class SortArrayDemo {
	public static void main(String[] args) {
		// Swap 2 variable without using 3rd variable
		int a = 4, b = 5;
		a = a + b;
		b = a - b;
		a = a - b;		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
