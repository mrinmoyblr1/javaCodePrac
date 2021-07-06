package randomTestPack;
public class FinallyExample {
	public static void main(String[] args) {
		try {
			int a=300/0;
			System.out.println("The Value is: "+a);
		} catch (Exception e) {
			System.out.println("The exception is: "+e);
		}
		finally {
			System.out.println("finally block is executed");
		}
	}
}
