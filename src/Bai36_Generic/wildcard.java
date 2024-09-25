package Bai36_Generic;

import java.util.ArrayList;
import java.util.List;

public class wildcard {

	public static void printList(List<? extends Number> l) {
		for (Object o : l) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add("Mot");
		list1.add("Hai");
		list1.add("Ba");
		list2.add(1);
		list2.add(2);
		list2.add(3);
//		printList(list1); // ? la extends Number
		printList(list2);
	}
}
