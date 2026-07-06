package com.hccs;
import java.util.Scanner;
public class Building {
private String siding;
private double squareFeet;

public String getSiding() {
	return siding;
}
public void setSiding(String siding){
	this.siding = siding;
	
}
public double getSquareFeet() {
	return squareFeet;
	
}
public void setsquareFeet(double SquareFeet) {
	this.squareFeet = SquareFeet;
	
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	House myHouse = new House();
	myHouse.getInput(input);
	
	Commercial myCommercial = new Commercial();
	myCommercial.getInput(input);
	
	System.out.println(" RESULTS");
	System.out.println("House total square feet:" + myHouse.getSquareFeet());
	System.out.println("Commercial total square feet:" + myCommercial.getSquareFeet());
	
}
}
