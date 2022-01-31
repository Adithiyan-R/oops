package com.capgemini.day3;

class one{
	
	public float a = 1.34f;
	
	public void printOne()
	{
		System.out.println("inside class one");
	}
	
}

class two extends one{
	
	public float b = 1.43f;
	
	public void printTwo() 
	{
		System.out.println("inside class two");
	}
	
}


public class inheritance {

	public static void main(String[] args) {
		
		one first = new one();
		two second = new two();
        second.printTwo();
		second.printOne();
		System.out.println(second.a);
		System.out.println(second.b);

	}

}
