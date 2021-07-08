package stringTestPack;

public class StringDemo {
	public static void main(String[] args) {
		String a = "Hello"; // String literal is Immutable
		String b = "Hello";
		b.concat("World");
		System.out.println(b);
		String s = new String("Hello"); // String class
		// String in StringBuffer StringBuilder are mutable. We can alter the String
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" ");
		sb.append("World");
		System.out.println(sb);
		sb.insert(2, "She");
		System.out.println(sb);
		sb.replace(2, 4, "MRINMOY");
		System.out.println(sb);
		sb.delete(3, 4);
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuilder sbr = new StringBuilder("Mrinmoy");
		System.out.println(sbr.reverse());
		System.out.println(a == b);
		System.out.println(a.equals(s));
		System.out.println(a == s);
		// Here a==b will compare the reference of String "Hello". Here both are
		// pointing to same reference then a==b will return true
		// a==s will return false because both the String objects are pointing to
		// different references.
	}
}
