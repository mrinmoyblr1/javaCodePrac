package interviewPrep;
public class CountStringOccurence {
	public static void main(String[] args) {
		// Code to count the number of occurrence if a given character
		String s1 = "aaanjdawawawa";
		int count = countOccurence("aaanjdawawawa", 'a');
		System.out.println(count);	}
	
	private static int countOccurence(String word, char c) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
