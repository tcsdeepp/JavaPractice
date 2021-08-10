package com.tcs.entity;

public class StringDemo {
	public static void main(String[] args) {
	String s1 = "TCS";//pool
		String s2 =new String( "TCS");//no
		System.out.println(s1==s2);
		String s3 = s1+s2;//heap
		System.out.println(s3);
		StringBuilder sb = new StringBuilder("TCS");
		sb.append(", Mumbai");
		System.out.println(sb);
	}

}
