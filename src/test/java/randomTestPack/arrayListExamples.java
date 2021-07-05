package randomTestPack;
import java.util.ArrayList;
public class arrayListExamples {
	public static void main(String[] args) {
		ArrayList<Integer>integerList=new ArrayList<Integer>();
		integerList.add(11);
		integerList.add(12);
		integerList.add(13);
		integerList.add(14);
		integerList.add(15);		
		System.out.println(integerList);
		
		
		int[] integerArray=new int[4];
		integerArray[0]=1;
		integerArray[1]=2;
		integerArray[2]=3;
		integerArray[3]=4;
		for(int i=0; i<integerArray.length; i++)
		{
			System.out.println(integerArray[i]);
		}
	}
}
