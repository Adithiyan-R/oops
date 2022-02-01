package com.capgemini.day3;

class teacher{
	
	public char a='A';
	
	public void printTeacher() {
		
		System.out.println("inside class teacher");
		
	}
	
}

class student1 extends teacher{
	
	public char b = 'B';
	
	public void printstudent1(){
		
		System.out.println("inside class student1");
		
	}
}

class student2 extends teacher{
	
	public char c ='C';
	
	public void printstudent2(){
		
		System.out.println("inside class student2");
		
	}
}
 
public class moreOnInheritence {

	public static void main(String[] args) {
		
		student1 s1 = new student1();
		student2 s2 = new student2();
		
		System.out.println(s1.a);
		s1.printTeacher();
		System.out.println(s1.b);
		s1.printstudent1();
		System.out.println(s2.a);
		s2.printTeacher();
		System.out.println(s2.c);
		s2.printstudent2();
		

	}

}
