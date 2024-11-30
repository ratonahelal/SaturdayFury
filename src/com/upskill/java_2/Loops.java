package com.upskill.java_2;

public class Loops {

	/*
	 * Type of Loop :
	 	for Loop
	  	While Loop
	  	Do while Loop
	  	Infinite Loop
	 */

	public static void main(String[] args)
	{	
		practiceLoop();
	//	praticeWhileLoop();
	//	praticeDoWhileLoop();
	// practiceInfiniteLoop();
	//	praticeNastedForLoop();

	}

	public static void practiceLoop() 
	{
		
		for(int i =1;i<=10;i+=1) {
			System.out.println("For Loops number = " + i);
		}
	}
		public static void praticeWhileLoop() {             // while loop - do again and agin upto condition match
			
			int i =1;
			while (i<=10) {
				System.out.println(" While loops number = " + i);
				i++;											// increment or decrement
			}				
	}
		public static void praticeDoWhileLoop() {  				// do while loop - do action then match condition
			
			int i = 6;
			do {
				System.out.println("do while loops number = " + i);
				i++;
				
			}while(i<5);										// checking condition
			
			
			
		}
		
		
		public static void practiceInfiniteLoop(){				//Infinite Loop - never ending loop
			int i;												//Initialize the variable
			for(i=1; ; i++){									//Setting lower limit, No Upper limit, Increment or Decrement
				System.out.println("Infinite Loops number = " + i);	//Statement
			}
		}
		
		public static void praticeNastedForLoop() { 
			
			int i;
			int j ;
			for (i=1;i<=10;i++) {
				for(j=1;j<10;j++) {
					int mutipicationTable = i*j;
					System.out.print(mutipicationTable + " \t");	
				}	
				System.out.println(" ");
			}	
		}		
}
