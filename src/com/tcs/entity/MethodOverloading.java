package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
User1 user1 = new Employee1();
user1.work();
user1.work(4);

}}
class User1{//super class
	public void work() {
		System.out.println("user is working");
	}
	public void work(int duration) {
		System.out.println("user is working for " +duration+ "hours");
	}
}

class Employee1 extends User1{  //IS-A relationship = inheritance, //subclass
	@Override
	public void work() {
		System.out.println("Employee is working");
	}
}