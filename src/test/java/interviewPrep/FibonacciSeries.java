package interviewPrep;
public class FibonacciSeries {
	public static void main(String[] args) {
		// Printing the Fibonacci Series
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a+" ");
		for (int i = 0; i < 10; i++) 
		{
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(b+" ");
		}
	}
}
