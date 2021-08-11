package com.tcs.day3;

public abstract class Staff {
//	public static void main(String[]// ) {
		private String name;
		
		public void fillTimesheet() {   //partial info
			System.out.println(name+"has filled timesheet");
			
		}
	public abstract void work();

}

class HR extends Staff{
	
	@Override
	public void work() {
		System.out.println("HR is working");
	}
}



class Guard extends Staff{
	@Override
	public void work() {
		System.out.println("Staff is working");
	}
}