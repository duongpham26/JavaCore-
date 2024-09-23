package Bai16_LinkedList;

public class Test {
	public static void main(String[] args) {
		MyLinkedList<String> cars = new MyLinkedList<String>();
		cars.addLast("mot");
		cars.addLast("hai");
		cars.remove("mot");

		System.out.println(cars.get(0));
	}
}
