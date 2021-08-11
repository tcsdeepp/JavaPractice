package com.tcs.exceptionsdemo;

public class Exceptionsdemo {
	public static void main(String[] args) {
		try {
			demo2();
		} catch (MyCheckExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		demo1();
	}

	private static void demo2() throws MyCheckExceptions {
		throw new MyCheckExceptions();
	}

	private static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("division by zero is not allowed.");
		}
	}
}