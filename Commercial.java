package com.hccs;
import java.util.Scanner;
// commercial is a building
public class Commercial extends Building{
// asks for 3 room sizes, totals, stores
	public void getInput(Scanner input) {
		System.out.println(" COMMERCIAL ");
		
		
		double total = 0;
		
		// Commercial has 3 rooms, so loop 3 times.
		for(int i = 0; i <= 3; i++) {
			System.out.print("Enter size of room " + i + ": ");
			total += input.nextDouble();
			setsquareFeet(total); 
			
		}
		
	}
	
}
