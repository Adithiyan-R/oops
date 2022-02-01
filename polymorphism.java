package com.capgemini.day3;

class parent{
	
	public void getColor() {
		System.out.println("red");
	}
	
}

class student extends parent{
	
	public void getColor() {
		System.out.println("green");
	}
	
}

public class polymorphism {

	public static void main(String[] args) {
		
		parent p = new student();
		p.getColor();

	}

}
