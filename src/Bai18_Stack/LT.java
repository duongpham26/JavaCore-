package Bai18_Stack;

import java.util.Stack;

public class LT {

	public boolean check(char a, char b) {
		if ((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')'))
			return true;
		return false;
	}

	public boolean kiemKhop(String chuoi) {
		Stack<Character> nums = new Stack<Character>();
		for (int i = 0; i < chuoi.length(); i++) {
			char kyTu = chuoi.charAt(i);

			if (kyTu == '(' || kyTu == '[' || kyTu == '{') {
				nums.push(kyTu);
			} else if (kyTu == ')' || kyTu == ']' || kyTu == '}') {
				if (nums.isEmpty()) {
					return false;
				}
				char moNgoac = nums.pop();
				if (!check(moNgoac, kyTu)) {
					return false;
				}
			}
		}
		return nums.isEmpty();
	}

	public static void main(String[] args) {
		LT lt = new LT();
		String str = "{{[](){}}}";
		if (lt.kiemKhop(str)) {
			System.out.println("Chuoi dung");
		} else {
			System.out.println("Chuoi sai");
		}
	}
}
