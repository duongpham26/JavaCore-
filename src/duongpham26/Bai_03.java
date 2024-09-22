package duongpham26;

import java.util.Scanner;

public class Bai_03 {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao chieu dai canh lap phuong: ");
		float d = scanner.nextFloat();
		System.out.printf("The tich: %.2f", Math.pow(d, 3));
		scanner.close();
	}
}
