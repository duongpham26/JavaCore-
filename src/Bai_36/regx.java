package Bai_36;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regx {
	public static void main(String[] args) {
		String str;
		System.out.println("Nhap string: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		Pattern pattern = Pattern.compile("[A-Za-z0-9]+@[a-z]+.[a-z]+");
		Matcher matcher = pattern.matcher(str);
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		scanner.close();
	}
}
