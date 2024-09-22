package Bai41_String;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
		String str1 = null;
		System.out.println("Nhap vao chuoi : ");
		str1 = "Pham Thanh Duong";

		System.out.println(str1.length()); // lấy độ dài của chuỗi
		System.out.println(str1.charAt(0)); // = str1[index]; index = {0-> length - 1}

		// getChars(vị trí đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu
		// mảng)
		char[] arrayChar = new char[100];
		str1.getChars(0, 4, arrayChar, 0);
		System.out.println("3 : " + arrayChar[0] + arrayChar[1] + arrayChar[2] + arrayChar[3]);

		// getBytes() => trả về mảng số nguyên của kí tự

		String str2 = "Pham Thanh Duong";
		String str3 = "pham Thanh Duong";

		// equals() =>so sánh phân biệt hoa thường
		System.out.println("4 : " + str1.equals(str2));
		System.out.println("5 : " + str1.equals(str3));

		// equalsIgnoreCase() => so sánh không phân biệt hoa thường
		System.out.println("6 : " + str1.equalsIgnoreCase(str2));
		System.out.println("7 : " + str1.equalsIgnoreCase(str3));

		// compareTo() => so sánh > , < , = return khoảng cách 2 kí tự
		String sv1 = "Nguyen B";
		String sv2 = "Nguyen A";
		String sv3 = "Nguyen C";
		String sv4 = "Nguyen A";
		System.out.println("8 : " + sv2.compareTo(sv1));
		System.out.println("9 : " + sv2.compareTo(sv3));
		System.out.println("10 : " + sv2.compareTo(sv4));

		// compareToIgnoreCase() tương tự compareTo() nhưng không phân biệt hoa thường

		// str1.regionMacths(option({0 or 1}: bỏ qua viết hoa hay không),kí tự thứ mấy
		// r1, str2, từ kí tự thứ mấy r2, số kí tự) :so
		// sánh môt đoạn

		// str1.startsWith("string") : chuỗi str1 có bắt đầu với string

		// endWith("string") => kiển cha loại file .jpg = .jpg

		// indexOf("string") => tìm vị trí string trong chuỗi
		// indexOf("string", vị trí xuất hiện thứ mấy muốn tìm)

		// lastIndexOf("string", option) => tìm từ cuối chuỗi đến đầu

		// str3 = str1.concat(str2); => nối chuỗi

		// str3 = str1.replaceAll("Tung", "TVTV");

		// str3 = str1.toUpperCase();

		// s9.trim() => cắt khoảng trắng ban đầu

		// str2 = str1.subString(from, to);
		scanner.close();
	}
}
