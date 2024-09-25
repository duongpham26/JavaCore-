package Bai44_Lambda;

interface StringFunction {
	String run(String str);
}

public class Lambda {
	public static void main(String[] args) {
		Cat cat = new Cat();
//		cat.print();
//		printThing(cat);

		Printable lambdaPrint = (name, age) -> {
			System.out.println(name + " lambda " + age);
			return name;
		};
		lambdaPrint.print("Cho", 2);

		StringFunction sf1 = (str) -> str + "!";
		StringFunction sf2 = (str) -> str + "?";

		printFormatted(sf1, "Hello");
		printFormatted(sf2, "Hello");

	}

	public static void printThing(Printable thing) {
		thing.print("Cho", 2);
	}

	public static void printFormatted(StringFunction sf, String str) {
		String result = sf.run(str);
		System.out.println(result);
	}
}
