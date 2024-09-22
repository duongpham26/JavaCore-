package Lab04;

import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		this.name = scanner.nextLine();
		System.out.print("Nhap price: ");
		this.price = scanner.nextDouble();
		System.out.println("Nhap tax: ");
		this.tax = scanner.nextDouble();
		scanner.close();
	}

	public void xuatThongTin() {
		System.out.printf("name = %s, price = %f, tax = %f", this.name, this.price, this.tax);
	}

	public double getTaxPrice() {
		return price * tax;
	}
}
