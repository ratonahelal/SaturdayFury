package com.upskill.assignment_2;

//3. Write two java functions which will return two different integer values, write a program to compare those numbers
//		and send message that one number is bigger than other. (hints: using if..else)


public class assignment_2_3 {


	    // Function to return the first integer
	    public static int getFirstNumber() {
	        return 30; // Example number
	    }

	    // Function to return the second integer
	    public static int getSecondNumber() {
	        return 50; // Example number
	    }

	    public static void main(String[] args) {
	        int firstNumber = getFirstNumber();
	        int secondNumber = getSecondNumber();

	        if (firstNumber > secondNumber) {
	            System.out.println("First number (" + firstNumber + ") is bigger than second number (" + secondNumber + ").");
	        }
	        else if (secondNumber > firstNumber) {
	            System.out.println("Second number (" + secondNumber + ") is bigger than first number (" + firstNumber + ").");
	        } 
			
			  else {
			   System.out.println("Both numbers are equal."); }
			 
	    }
	}


	
	