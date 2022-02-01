package com.capgemini.day3;

abstract class laptop{
	
	abstract public void displaysize();
	abstract public void graphicCard();
	abstract public void battery();
	
	public void os(){
		
		System.out.println("Windows 11");
		
	}
	
}

class asus extends laptop{
	
	public void displaysize()
	{
		System.out.println("17.2 inch");
	}
	public void graphicCard()
	{
		System.out.println("gtx 1660");
	}
	public void battery()
	{
		System.out.println("85 Wh");
	}
	
}

class hp extends laptop{
	
	public void displaysize()
	{
		System.out.println("15.6 inch");
	}
	public void graphicCard()
	{
		System.out.println("gtx 1060");
	}
	public void battery()
	{
		System.out.println("75 Wh");
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		 asus a = new asus();
		 hp h = new hp(); 
		 a.displaysize();
		 a.graphicCard();
		 a.battery();
		 a.os();
		 h.displaysize();
		 h.graphicCard();
		 h.battery();
		 h.os();

	}

}
