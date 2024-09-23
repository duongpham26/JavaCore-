package Bai16_LinkedList;

import java.util.LinkedList;

public class LT {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<>();
		cars.add("BWM");
		cars.add("Audi");
		cars.add("Mercedes");
//		cars.clear();
		LinkedList cars2 = (LinkedList) cars.clone();
		System.out.println(cars2);
	}
}
