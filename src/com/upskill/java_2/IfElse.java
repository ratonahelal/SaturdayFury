package com.upskill.java_2;

public class IfElse {

	public static void main(String[] args) {

		int age = 105;

		if (age <= 13) {
			System.out.println("You are children");
		} 
		else if (age > 13 && age < 18) {
			System.out.println("You are teenager");
		}
		else if (age > 60) {
			if(age >100) {
				System.out.println("You are champion");
			}
			else
			System.out.println("You are sinor");
		}

		else {
			System.err.println("You are adult");
		}

	}

}
