package com.sfu.practice;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation<T> {
	static int INIT_CAPACITY = 4;
	// generic array
	T[] internal_array = (T[]) new Object[INIT_CAPACITY];

	public void insert(T value) {
		int i;
		for (i = 0; i < internal_array.length; i++) {
			if (value.equals(internal_array[i])) {
				break;
			}
			if (internal_array[i] == null) {
				internal_array[i] = value;
				break;
			}
		}
		if (i == INIT_CAPACITY - 1) {
			expandInternalArray();
		}
	}

	private void expandInternalArray() {
		INIT_CAPACITY = INIT_CAPACITY * 2;
		T[] expandedArray = (T[]) new Object[INIT_CAPACITY];
		for (int i = 0; i < internal_array.length; i++) {
			expandedArray[i] = internal_array[i];
		}
		internal_array = expandedArray;
	}

	public T remove() {
		T value =(T) new Object();
		for (int i = 0; i < internal_array.length; i++) {
			if (internal_array[i] != null) {
				value = internal_array[i];
				internal_array[i] = null;
				break;
			}

		}
		shrinkArray();

		return value;
	}

	private void shrinkArray() {
		int size = 0;
		for (int i = 0; i < internal_array.length; i++) {
			if (internal_array[i] != null) {
				size = size + 1;
			}
		}
		if (size <= INIT_CAPACITY / 2) {
			INIT_CAPACITY = INIT_CAPACITY / 2;
			T[] shrinkedArray = (T[]) new Object[INIT_CAPACITY];
			for (int i = 0, j = 0; i < internal_array.length; j++, i++) {
				if (internal_array[i] != null)
					shrinkedArray[j] = internal_array[i];
			}
			internal_array = shrinkedArray;
		}
	}

	public int size() {
		return internal_array.length;
	}

	public static void main(String[] args) {
		SetImplementation<Integer> set = new SetImplementation<>();
		set.insert(5);
		set.insert(15);
		set.insert(25);
		set.insert(35);
		set.insert(45);
		set.insert(55);
		set.insert(45);
		System.out.println(set.size());
		System.out.println(set.remove());
		System.out.println(set.remove());
		System.out.println(set.remove());
		System.out.println(set.remove());
		System.out.println(set.remove());
		System.out.println(set.size());

	}
}


