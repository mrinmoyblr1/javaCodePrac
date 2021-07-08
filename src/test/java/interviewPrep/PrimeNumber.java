package interviewPrep;

public class PrimeNumber {
	public static void main(String[] args) {
		// Prime Number
		int a = 101;
		boolean flag = true;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
