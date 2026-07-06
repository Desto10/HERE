package com.hccs;
import java.util.Scanner;
// House IS a building so it inherits it.
public class House extends Building {
// ask user for sizes, totals them, stores them.
	public void getInput(Scanner input) {
		System.out.println("House");
		System.out.print("Enter siding type");
		setSiding(input.next());
		
		System.out.print("Enter size of Living Room:");
		double living = input.nextDouble();
		
		System.out.print("Enter size of Kitchen");
		double kitchen = input.nextDouble();
		
		System.out.print("Enter size of Dining Room");
		double dining = input.nextDouble();
		
		System.out.print("Enter size of Bed Room");
		double bed = input.nextDouble();
		
		// total 
		double total = living + kitchen + dining + bed;
		setsquareFeet(total);
		
		
	}
}
