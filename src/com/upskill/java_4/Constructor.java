package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	
	public Constructor(String name) {
		studentName = name;
	}
	public Constructor(int age) {
		studentAge = age;
	}
	public Constructor(int age,String name) {
		studentAge = age;
		studentName = name;
	}
	
	
	public static void main(String[]args) {	
		Constructor obj = new Constructor("Raton");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor(32);
		System.out.println(obj2.studentAge);
		
		Constructor obj3 = new Constructor(32,"Raton");
		System.out.println(obj3.studentAge);
		System.out.println(obj3.studentName);
		
	}
}
