package interviewPrep;
public class MultipleTwoNumbers {
	public static void main(String[] args) {
		int multi=multiTwoNumbers(4,8);
		System.out.println(multi);
		System.out.println("Mrinmoy");
	
	}
	private static int multiTwoNumbers(int x, int y) {
		int mul=0;
		for(int i=1;i<=y;i++)
		{
			mul=mul+x;
		}
		return mul;
	}
}
