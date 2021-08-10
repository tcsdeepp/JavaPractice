package com.tcs.entity;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		EnchancedForLoopDemo();
	}

	private static void EnchancedForLoopDemo() {
		// TODO Auto-generated method stub
		int[] numbers = { 3, 4, -1, 2, 6 };
		for (int number : numbers) {
			if (number % 2 == 0) {

				System.out.println(number);
			}
		}
	}

	private static void demo1() {
		int[] numbers = new int[10];
		numbers[0] = 3;
		numbers[4] = 5;
		Arrays.sort(numbers, 0, numbers.length);
		for (int count = 0; count < numbers.length; count++) {
			System.out.println(numbers[count]);
		}

	}

}
