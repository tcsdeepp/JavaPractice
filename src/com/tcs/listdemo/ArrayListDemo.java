package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() { // oomparator to do sorting in Ascending or Descending
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;// For Ascending
			//	return o2 - o1; //For descending
			}

		});
		System.out.println("After Sorting=" +numbers);
	}

	private static List<Integer> createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();// Generics
		numbers.add(1);// autoboxing
		// number.add("Ram"); String is not allowed.Only Integers. Create Collections of
		// only similar types.
		// System.out.println(numbers.get(0));

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
