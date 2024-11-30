package com.upskill.assignment_2;

public class assignment_2_6a {
	
//	6.  Write a java program to find the prime number from 1 to 100 and print them.
	
	public static void main(String[] args) {
		   System.out.println("Prime numbers from 1 to 100 are:");
	        
	        for (int number = 2; number <= 100; number++) {
	            boolean isPrime = true;

	            // Check divisors from 2 up to number-1
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            // Print the number if it's prime
	            if (isPrime) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	}

	


