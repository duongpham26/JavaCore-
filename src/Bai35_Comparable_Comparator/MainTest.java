package Bai35_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest {
	public static void main(String[] args) {
		List<SinhVien> ListSV = new ArrayList<>();

		ListSV.add(new SinhVien("Pham A", 19));
		ListSV.add(new SinhVien("Pham C", 50));
		ListSV.add(new SinhVien("Pham B", 18));

//		Collections.sort(ListSV, new AgeComparetor()); // => viet thuong
		Collections.sort(ListSV, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return o1.getAge() - o2.getAge();
			}
		}); // => anonimute

		for (Object sv : ListSV) {
			System.out.println(sv);
		}
	}
}
