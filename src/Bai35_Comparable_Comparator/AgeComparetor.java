package Bai35_Comparable_Comparator;

import java.util.Comparator;

public class AgeComparetor implements Comparator<SinhVien> {

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

}
