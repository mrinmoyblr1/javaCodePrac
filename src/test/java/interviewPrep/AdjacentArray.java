package interviewPrep;
public class AdjacentArray {
	public static void main(String[] args) {
		int[] a= {1,4,8,15,17};
		// Max difference between two array elements
		int dif=0;
		for(int i=0;i<a.length-1;i++)
		{
			if((a[i+1]-a[i])>dif)
			{
				dif=a[i+1]-a[i];
			}
		}
		System.out.println(dif);
	}
}