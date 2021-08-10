package com.tcs.entity;
import java.util.List;
import java.util.ArrayList;

public class Gymnasism {
	static List<User> users = new ArrayList<User>();
	public static void main(String[] args) {

		createUsers();
	}
	private static void createUsers() {
		for (int i = 0; i < 10; i++) {
			User u1 = new User("Deep",3333L,(byte)(10*i));
		//	u1.setName("Deep" + i);
		//	u1.setAge((byte)(10 * i));
			users.add(u1);
		}
		System.out.println(users);
		users.get(0).workout();
	
	}
}