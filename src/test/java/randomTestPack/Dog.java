package randomTestPack;

public class Dog extends Animal {
	String color="Black";
	
	void printColor()
	{
		System.out.println("This is from Child Class "+color);
		System.out.println("This is from Parent Class "+super.color);
	}

}
