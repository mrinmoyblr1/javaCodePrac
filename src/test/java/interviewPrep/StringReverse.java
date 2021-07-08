package interviewPrep;
public class StringReverse {
	public static void main(String[] args) {
		String a = "madam";
		String b="";
		for (int i = a.length() - 1; i >= 0; i--) {
			b=b+a.charAt(i);
			//System.out.print(a.charAt(i));
		}
		System.out.println("The original String was: "+a);
		System.out.println("The reverse String is: "+b);
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		
	}
}