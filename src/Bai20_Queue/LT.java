package Bai20_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LT {
	public static void main(String[] args) {
		/*
		 * implement cua queue: LinkedList PriorityQueue ArrayList
		 */
		Queue<String> MyQueue = new LinkedList<String>();

		// thêm phần tử
		// add() ->trả ra true / ngoại lệ
		// offer(); -> trả ra true / flase
//		MyQueue.add("a");
//		MyQueue.offer("b");
//		MyQueue.add("c");
		MyQueue.add("d");

		// Lấy phần tử ở đầu hàng đợi
		// peek();
		// element()
//		System.out.println(MyQueue.peek()); // tra ve null neu empty
//		System.out.println(MyQueue.element());// if emptythrow exception NoSuchElementException

		// lấy ra và xóa khỏi hàng đợi
		// poll() -> return null if empty / string
		// remove() -> throw exception NoSuchElementException if empty // return true
		// false

//		System.out.println(MyQueue.poll());
//		System.out.println(MyQueue.poll());

		System.out.println(MyQueue.remove());

//		clear() -> xoa tat ca Queue
//		isEmpty() -> 
//		contains() 
//		size();

		// duyet
//		for (String s : MyQueue) {
//			System.out.println(s);
//		}

	}
}
