package Bai14_Interface;

public class iter {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		System.out.println("pig.x = " + Pig.x);
		Animal.test1();
	}
}
