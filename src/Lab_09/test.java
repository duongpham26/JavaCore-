package Lab_09;

public class test {
	public static void main(String[] args) {
		int[] myNumbers = { 1, 2, 3 };
		try {
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}