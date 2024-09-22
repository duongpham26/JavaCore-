package Lab_07;

public class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return price * tax;
	}

	public void info() {
		System.out.println("From parent");
		;
	}
}
