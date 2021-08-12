package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
	//	demo1();
		treeSetDemo();
	}

	private static void treeSetDemo() {
		// TODO Auto-generated method stub
		
	}

	private static void demo1() {
		Set<User> users = createSet();
		System.out.println(users);
		User userWithSameAge = new User();
		userWithSameAge.setAge(10);
		users.add(userWithSameAge);
		System.out.println(users);
	}

	private static Set<User> createSet() {
		// TODO Auto-generated method stub
		Set<User> users = new HashSet<User>();
		for(int i=0;i<20;i++) {
			User user = new User();
			user.setAge(10+i); //set does not maintain insertion order //When order is not important use set
			users.add(user);
		}
		return users;
	}
}
