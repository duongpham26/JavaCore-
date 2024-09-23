package Bai16_LinkedList;

public class MyLinkedList<E> {
	private class Node {
		private Node next;
		private Object data;

		public Node(Object data) {
			this.data = data;
		}

		public Object getData() {
			return this.data;
		}

	}

	private Node head;
	private int numNodes = 0;

	public MyLinkedList() {
	}

	public int size() {
		return this.numNodes;
	}

	public Object get(int index) {
		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.getData();
	}

	public boolean contains(E element) {
		Node temp = this.head;
		while (temp.next != null) {
			if (temp.data.equals(element))
				return true;
			temp = temp.next;
		}
		if (temp.data.equals(element))
			return true;
		return false;
	}

	public int indexOf(E element) {
		Node temp = this.head;
		int index = 0;
		while (temp != null) {
			if (temp.data.equals(element))
				return index;
			temp = temp.next;
			index++;
		}
		return -1;
	}

	public void addLast(E e) {
		Node temp = this.head;
		if (temp == null) {
			head = new Node(e);
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(e);
		}
		this.numNodes++;
	}

	public void addFirst(E e) {
		Node temp = this.head;
		if (this.head == null) {
			head = new Node(e);
		} else {
			head = new Node(e);
			head.next = temp;
		}
		this.numNodes++;
	}

	public void add(int index, E e) {
		Node temp = this.head;
		for (int i = 0; (i < index - 1) && (temp.next != null); i++, temp = temp.next) {
		}
		Node newNode = new Node(e);
		newNode.next = temp.next;
		temp.next = newNode;
		this.numNodes++;
	}

	@SuppressWarnings("unchecked")
	public E remove(int index) {
		Object data;
		if (index < 0 || index >= this.numNodes)
			throw new IndexOutOfBoundsException();
		Node temp = head;
		if (index == 0) {
			data = temp.data;
			head = temp.next;
		} else {
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			data = temp.next.data;
			temp.next = temp.next.next;
		}
		this.numNodes--;
		return (E) data;
	}

	public boolean remove(E e) {
		if (head.data.equals(e)) {
			remove(0);
			return true;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				if (temp.next.data.equals(e)) {
					temp.next = temp.next.next;
					this.numNodes--;
					return true;
				}
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public MyLinkedList<E> clone() {
		if (this.numNodes == 0) {
			throw new NullPointerException();
		}
		MyLinkedList<E> newLinkedList = new MyLinkedList<E>();
		Node temp = this.head;
		while (temp != null) {
			newLinkedList.addFirst((E) temp.getData());
			temp = temp.next;
		}
		return newLinkedList;
	}
}
