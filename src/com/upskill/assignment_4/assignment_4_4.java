package com.upskill.assignment_4;

//Write a method to check leap year

public class assignment_4_4 {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
			/*
			 * if (year % 100 == 0) { return year % 400 == 0; } else
			 */{
                return true;
            }
        } else {
            return false;
        }
    }

    // Main method to test the isLeapYear method
    public static void main(String[] args) {
        int year = 2000;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
