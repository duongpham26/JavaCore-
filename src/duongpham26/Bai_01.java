package duongpham26;

import java.util.Scanner;

public class Bai_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = scanner.nextLine();
		System.out.println("Nhap diem: ");
		int Diem = scanner.nextInt();
		System.out.printf("%s co diem %d", name, Diem);
	}
}
