package interviewPrep;
public class SumArrayElements {
	public static void main(String[] args) {		
		// Create a methods which accept array and return sum of all the array elements
		int[] a= {1,2,3,4,5};
		int sum=sumArray(a);
		System.out.println(sum);		
	}
	private static int sumArray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}