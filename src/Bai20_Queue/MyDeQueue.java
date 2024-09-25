package Bai20_Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeQueue {
	public static void main(String[] args) {
		/*
		 * implements cua deQueu: LinkedList, ArrayDeQueue;
		 */
		Deque<Integer> myDeque = new LinkedList<Integer>();
//		add(), addLast() return void, offerLast() return boolean; -> them cuoi danh sach
		System.out.println(myDeque.add(1)); // return boolean
		myDeque.addLast(2); // return void
		System.out.println(myDeque.offerLast(3)); // return boolean

//		push(), addFirst(), offerFirst(); -> them dau danh sach
		myDeque.push(4); // return void
		myDeque.addFirst(5); // return oid
		myDeque.offerFirst(6); // boolean

//		peek(), peekFirst(), getFirst(); -> truy xuat phan tu dau danh sach
		System.out.println(myDeque.peek());
//		peekLast(), getLast() -> truy cap phan tu cuoi danh sanh;
//		remove(), poll(), removeFirst(), pollFirst(): xoa phan tu dau sanh sach
//		removeLast(), pollLast() -> xoa phan tu cuoi danh sach
//		contains()

		// Duyet
		Iterator<Integer> iterator = myDeque.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
