package duongpham26;

import java.util.Scanner;

public class Bai_02 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu rong: ");
		float rong = scanner.nextFloat();
		System.out.println("Nhap chieu dai: ");
		float dai = scanner.nextFloat();
		float chuVi = (dai + rong) * 2;
		float dienTich = dai * rong;
		System.out.printf("Dien tich %.0f, chu vi %f, canh nho %f", dienTich, chuVi, Math.min(dai, rong));
	}
}
