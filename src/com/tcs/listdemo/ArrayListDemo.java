package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		//filterList(numbers);
		//add(numbers);
		otherOps(numbers);
	}
	private static void otherOps(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.remove(11);
		numbers.add(50);//adds at the end
		numbers.add(1,50);
		System.out.println(numbers);
		
	}
	/**
	 * Method to Filter the elements
	 * @param numbers
	 */
	private static void add(List<Integer> numbers) {
		Optional<Integer> sum1=numbers.stream().reduce((Integer sum, Integer number )->{ System.out.println(sum+", "+number);return sum+number;});
		System.out.println(sum1.get());
	}
	
	private static void filterList(List<Integer>numbers) {
		// TODO Auto-generated method stub
		numbers.forEach((number) -> {
			System.out.println(number % 2 ==0);
			//break;
		});
		List<Integer> filtered = numbers.stream().filter((number)->number % 2==0).collect(Collectors.toList()); //lambda function
		System.out.println(filtered);
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
