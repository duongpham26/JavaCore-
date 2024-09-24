package Bai19_List_ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LT {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
//		add();
//		addAll(Collection);
//		get() ; set();indexOf(str); lastIndexOf(str); remove(index); clear(); contains(str)
//		subList(); toArray() -> chuyen than array; asList();-> chuyen thanh arrayList;
		myList.add("1");
		myList.add("2");
		myList.add("4");
		myList.add("3");
		myList.add("6");
		myList.add("5");
		Collections.sort(myList);
		List<String> sublist = myList.subList(1, 6);

		for (String e : myList) {
			System.out.println(e);
		}
	}
}
