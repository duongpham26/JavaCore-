package Bai30_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LT {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(9);
		list1.add(19);
		list1.add(10);

		Iterator<Integer> it = list1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			it.hasNext();
//			if (it.next() > 10) {
//				System.out.println(it.next());
//			}
		}
		System.out.println(list1);
	}

}
