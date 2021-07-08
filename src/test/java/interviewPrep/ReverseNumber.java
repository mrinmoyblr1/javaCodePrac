package interviewPrep;
public class ReverseNumber {
	public static void main(String[] args) {
		//Reverse digits of an Integer without converting to String
		int a = 1234;
		int reverse = 0;
		int lastDigit = 0;
		while (a >= 1) {
			lastDigit = a % 10;
			reverse = reverse * 10 + lastDigit;
			a = a / 10;
		}
		System.out.println(reverse);
	}
}
