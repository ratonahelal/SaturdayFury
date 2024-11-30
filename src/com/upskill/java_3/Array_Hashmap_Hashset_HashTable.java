package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 28;										// variable
		int [] ageFury = new int [] {25,28,30,32,21}; 		// Array

		// Array Index 				[0] [1] [2][3][4]
		
		
		System.out.println("Student Age " + ageFury [3]);
		System.out.println("Total Age " + ageFury.length);
		
		String [] Raton = new String[] {"Hi","Hello","Good after noon","Md","Upskill"};
		
		System.out.println("Trump say : " + Raton [2] );
		System.out.println("Trump say : " + Raton.length );
		
		// Muti_Dimentional array
		
		int[][] ageFury2D = {{25,28,30,32,21},		// [0][1] [0][2] [0][2]
				             { 24,34,32}};
		
			System.out.println("Student Age 2D : " + ageFury2D[1][1]);	
			
			String [][] name = {{"Hi","Hello","Rasel vi","Raton","Zia"},
								{"Trump","Jackson","usa","NY"}};
			
			System.out.println("Student Name : " + name [1][3]);
				
			// Hashmap store multipul data using key-value pair, Implementation of Map interface
			
			HashMap<String,Integer> Student = new HashMap<String,Integer> ();
			
			Student.put("Protik", 29);
			Student.put("RaTON", 29);
			Student.put("ZIA", 31);
			Student.put("RASEL", 30);
			
			System.out.println("HashMap Student Age : " + Student.get("RASEL"));
			System.out.println("HashMap Student Age : " + Student.get("ZIA"));
			
			HashMap<String,String> Capital = new HashMap<String,String> ();
			Capital.put("Bangladesh", "Dhaka");
			Capital.put("Usa", "Washington");
			Capital.put("Indai", "Mombai");
			
			System.out.println("Capital Name :"  + Capital.get("Bangladesh"));
			
			// HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
			Hashtable<String,String> Region = new Hashtable<String,String>();
			
			Region.put("Bangladesh", "Dhaka");
			Region.put("Usa", "Washington");
			
			System.out.println("Region Name :"  + Region.get("Bangladesh"));
			
			//Hashset store unordered collection containing unique value, Implementation of Set interface
			
			HashSet<String> Car = new HashSet<String>();
			Car.add("BMW");
			Car.add("audi");
			Car.add("Tesla");
			Car.add("Toyata");
			
			System.out.println("Car : " + Car);
			
			
			
			
			
			
			
			
			
			}

	}



