package com.capgemini.day3;

class learner{
	
	private int rollno;
	public int age;
	private String name;
	
	learner(){
		super();
		System.out.println("learner default constructor");
	}
	
	public learner(int rollno, int age, String name) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


public class encapsulation {

	public static void main(String[] args) 
	{
		learner s = new learner(1,17,"ram");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		System.out.println(s.age);
		
		learner s2 = new learner(2,16,"raj");
		int a = s2.getRollno();
		String b = s2.getName();
		int c = s2.getAge();
		
		System.out.println(a+"\n"+b+"\n"+c);
	}

}
