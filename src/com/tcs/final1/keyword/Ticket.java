package com.tcs.final1.keyword;

public final class Ticket {   //immutable when I don't want anyone to create subclass of it.
	private final String movie="Sholay"; //Mark variables 
	private float price;
	
	
	public final void sell(float price) {  //final method cannot be overriden.It can be overloaded but not override.
		
	}
}


//class IllegalTicket extends Ticket{
	
//}