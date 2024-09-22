package Bai17_ArrayList;

import java.util.ArrayList;

public class LT {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("AUDI");
		cars.add("Mercedes");
		cars.add(1, "Volo");
		System.out.println(cars);
	}
}
