package Bai36_Generic;

public class LT<K, V> {
	private K key;
	private V value;
//	private V[] x; // x = new T[10] error

	public LT(K key, V value) {
		this.key = key;
		this.value = value;
//		this.x = t;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "LT [key=" + key + ", value=" + value + "]";
	}

	public static void main(String[] args) {
		LT<Integer, String> myMap1 = new LT<>(1, "Duong");
		LT<String, Integer> myMap2 = new LT<>("Duong 2", 2);
		System.out.println(myMap1);
		System.out.println(myMap2);

	}
}
