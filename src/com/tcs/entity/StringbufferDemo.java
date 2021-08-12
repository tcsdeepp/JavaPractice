package com.tcs.entity;

public class StringbufferDemo {
	public static void main(String[] args) {
		String literal ="TCS";//stringpool
		String newKeyWord  = new String("TCS");//heap,immutable
		StringBuilder strBuilder = new StringBuilder("TCS");//heap,mutable, not thread-safe
		StringBuffer sreBuilder = new StringBuffer("TCS");//heap,thread-safe,mutable
		
	}

}




