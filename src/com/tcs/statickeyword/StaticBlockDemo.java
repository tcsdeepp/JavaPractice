package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age=10;
	int price = 20; //caanot be accessed//referred inside static block methods.
	public void StsticBlockDemo() {
		System.out.println("in a constructor..");
	}

	static {// called first. It can only be called once.Loaded during startup.
		final int localVariable = 40;
		System.out.println("this is a static block"+age);
	}

	public static void main(String[] args) {
		// StaticBlockDemo blockDemo = new StaticBlockDemo();
		// new StaticBlockDemo();
	
	}
	
	void work() {
//		static int time=45;//local variable cannot be static
	}
}
