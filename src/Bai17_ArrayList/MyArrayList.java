package Bai17_ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;

	public MyArrayList() {
		System.out.println("Khoi tao MyArrayList co kich thuoc la 10");
		elements = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		if (capacity > 0) {
			System.out.println("Khoi tao thanh cong voi kich thuoc la : " + capacity);
			elements = new Object[capacity];
		} else {
			System.out.println("Loi tham so khoi tao");
			throw new IllegalArgumentException("Capacity : " + capacity);
		}
	}

	public void ensureCapacity(int minCapacity) {
		if (minCapacity >= 0) {
			int newSize = this.elements.length + minCapacity;
			elements = Arrays.copyOf(elements, newSize);
			System.out.println("Tao thanh cong voi newSize : " + newSize);
		} else {
			System.out.println("Loi tham so khoi tao");
			throw new IllegalArgumentException("Error minCapacity : " + minCapacity);
		}
	}

	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) elements[index];
	}

	public boolean add(E o) {
		if (size == elements.length) {
			ensureCapacity(1);
		}
		elements[size] = o;
		size++;
		return true;
	}

	public void add(int index, E o) {
		if (index > elements.length) {
			throw new IllegalArgumentException("Error index : " + index);
		} else if (elements.length == index) {
			ensureCapacity(1);
		}

		if (elements[index] == null) {
			size++;
			elements[index] = o;
		} else {
			if (size == elements.length) {
				ensureCapacity(1);
			}
			System.arraycopy(elements, index, elements, index + 1, size - index);
			elements[index] = o;
			size++;
		}
	}

	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Error minCapacity : " + index);
		}
		@SuppressWarnings("unchecked")
		E element = (E) elements[index];

		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		size--;
		return element;
	}

	public MyArrayList<E> clone() {
		MyArrayList<E> newMyArrayList = new MyArrayList<>();
		newMyArrayList.elements = Arrays.copyOf(this.elements, size);
		newMyArrayList.size = this.size;
		return newMyArrayList;
	}

	public int indexOf(E o) {
		int index = -1;
		for (int i = 0; i < this.size; i++) {
			if (this.elements[i].equals(o)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public boolean contains(E o) {
		return indexOf(o) >= 0;
	};
}
