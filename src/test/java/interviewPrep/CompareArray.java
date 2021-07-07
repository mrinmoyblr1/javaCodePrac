package interviewPrep;
import java.util.ArrayList;
public class CompareArray {
	public static void main(String[] args) {
		// Compare two different Array and create new Array with the matching values
		int[] a= {1,4,5,7};
		int[] b= {6,4,3,7};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		System.out.println(al);		
		Object[] c=al.toArray();
		//This is extended form of for loop
		for(Object obj : c)
		{
			System.out.println(obj);
		}
	}
}
